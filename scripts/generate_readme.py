#!/usr/bin/env python3
"""
Regenerates:
  1. Day0X/FEEDBACK.md  (one per day, from data/dayXX.json)
  2. The auto-generated stats + table section in the root README.md

Usage:
    python3 scripts/generate_readme.py

Run this after adding a new data/dayXX.json file for the day.
"""

import json
import os
import re
from datetime import datetime

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
DATA_DIR = os.path.join(ROOT, "data")
README_PATH = os.path.join(ROOT, "README.md")

TABLE_START = "<!-- TABLE:START -->"
TABLE_END = "<!-- TABLE:END -->"
STATS_START = "<!-- STATS:START -->"
STATS_END = "<!-- STATS:END -->"


def load_days():
    days = []
    for fname in sorted(os.listdir(DATA_DIR)):
        if fname.endswith(".json"):
            with open(os.path.join(DATA_DIR, fname)) as f:
                days.append(json.load(f))
    days.sort(key=lambda d: d["day"])
    return days


def write_feedback_file(day):
    day_num = day["day"]
    folder = os.path.join(ROOT, f"Day{day_num:02d}")
    os.makedirs(folder, exist_ok=True)
    path = os.path.join(folder, "FEEDBACK.md")

    lines = [f"# Day {day_num} — {day['date']}\n", "\n"]
    lines.append("| # | Problem | Topic | Difficulty | Score | Verdict |\n")
    lines.append("|---|---------|-------|------------|-------|---------|\n")
    for i, p in enumerate(day["problems"], start=1):
        lines.append(
            f"| {i} | {p['title']} | {p['topic']} | {p['difficulty']} "
            f"| {p['score']}/{p['max_score']} | {p['verdict']} |\n"
        )
    lines.append("\n## ChatGPT Feedback Detail\n\n")
    for i, p in enumerate(day["problems"], start=1):
        lines.append(f"**{i}. {p['title']}** (`{p['file']}`)\n\n")
        lines.append(f"> {p['feedback']}\n\n")

    with open(path, "w") as f:
        f.writelines(lines)


def build_table(days):
    rows = [
        "| Day | Date | Problems | Avg Score | Details |",
        "|-----|------|----------|-----------|---------|",
    ]
    for day in days:
        day_num = day["day"]
        scores = [p["score"] / p["max_score"] for p in day["problems"]]
        avg = round(sum(scores) / len(scores) * 10, 1) if scores else 0
        rows.append(
            f"| {day_num} | {day['date']} | {len(day['problems'])} "
            f"| {avg}/10 | [Day{day_num:02d}/FEEDBACK.md](Day{day_num:02d}/FEEDBACK.md) |"
        )
    return "\n".join(rows)


def build_stats(days):
    total_problems = sum(len(d["problems"]) for d in days)
    all_scores = [p["score"] / p["max_score"] for d in days for p in d["problems"]]
    avg_score = round(sum(all_scores) / len(all_scores) * 10, 2) if all_scores else 0
    streak = len(days)  # simple version: total days logged
    accepted = sum(
        1 for d in days for p in d["problems"] if p["verdict"].lower().startswith("accepted")
    )

    return (
        f"- **Days logged:** {streak}\n"
        f"- **Total problems solved:** {total_problems}\n"
        f"- **Fully accepted:** {accepted}/{total_problems}\n"
        f"- **Average score:** {avg_score}/10\n"
        f"- **Last updated:** {datetime.now().strftime('%Y-%m-%d')}\n"
    )


def update_readme(days):
    with open(README_PATH) as f:
        content = f.read()

    table_md = f"{TABLE_START}\n{build_table(days)}\n{TABLE_END}"
    stats_md = f"{STATS_START}\n{build_stats(days)}{STATS_END}"

    content = re.sub(
        f"{TABLE_START}.*?{TABLE_END}", table_md, content, flags=re.DOTALL
    )
    content = re.sub(
        f"{STATS_START}.*?{STATS_END}", stats_md, content, flags=re.DOTALL
    )

    with open(README_PATH, "w") as f:
        f.write(content)


def main():
    days = load_days()
    if not days:
        print("No data files found in /data. Add a dayXX.json first.")
        return

    for day in days:
        write_feedback_file(day)

    update_readme(days)
    print(f"Updated README.md and FEEDBACK.md for {len(days)} day(s).")


if __name__ == "__main__":
    main()
