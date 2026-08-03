# Java DSA Daily Tracker

Daily Java DSA practice — 3 problems a day, solved and self-scored using a ChatGPT scheduled task that reviews each solution against the problem's constraints and gives a score + feedback.

This repo is the log: every day's problems, my Java solutions, and the actual scoring/feedback I got — kept as proof of consistent practice, not just a code dump.

## How it works

1. A ChatGPT scheduled task sends me 3 Java DSA problems every day.
2. I solve each one and paste my code back to ChatGPT.
3. ChatGPT checks it against the problem's constraints/edge cases and gives a score (out of 10) + written feedback.
4. I log the problems, my solutions, and the scores here — one folder per day.

## Stats

<!-- STATS:START -->
- **Days logged:** 3
- **Total problems solved:** 7
- **Fully accepted:** 6/7
- **Average score:** 9.29/10
- **Last updated:** 2026-08-03
<!-- STATS:END -->

## Daily Log

<!-- TABLE:START -->
| Day | Date | Problems | Avg Score | Details |
|-----|------|----------|-----------|---------|
| 1 | 2026-08-03 | 1 | 10.0/10 | [Day01/FEEDBACK.md](Day01/FEEDBACK.md) |
| 2 | 2026-08-03 | 3 | 9.7/10 | [Day02/FEEDBACK.md](Day02/FEEDBACK.md) |
| 3 | 2026-08-03 | 3 | 8.7/10 | [Day03/FEEDBACK.md](Day03/FEEDBACK.md) |
<!-- TABLE:END -->

## Folder structure

```
Java-DSA-Daily-Tracker/
├── data/                 # source of truth - one JSON per day (scores + feedback)
│   └── Day01.json
├── Day01/                # solutions + generated feedback for that day
│   ├── Solution1_....java
│   ├── Solution2_....java
│   ├── Solution3_....java
│   └── FEEDBACK.md
├── templates/            # copy these for a new day
│   ├── day_template.json
│   └── SolutionTemplate.java
└── scripts/
    └── generate_readme.py   # regenerates FEEDBACK.md + this README's table/stats
```

## Adding a new day

1. Copy `templates/day_template.json` → `data/day02.json` and fill in the problems, your scores, and ChatGPT's feedback for each.
2. Copy `templates/SolutionTemplate.java` into a new `Day02/` folder for each of the 3 problems, and write your solutions.
3. Run:
   ```
   python3 scripts/generate_readme.py
   ```
   This regenerates `Day02/FEEDBACK.md` and updates the stats + table above automatically.
4. Commit and push.

## Tech

Java (primary language for daily problems) · Python (repo automation script)
