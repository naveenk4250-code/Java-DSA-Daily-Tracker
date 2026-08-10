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
- **Days logged:** 10
- **Total problems solved:** 42
- **Fully accepted:** 38/42
- **Average score:** 9.21/10
- **Last updated:** 2026-08-10
<!-- STATS:END -->

## Daily Log

<!-- TABLE:START -->
| Day | Date | Problems | Avg Score | Details |
|-----|------|----------|-----------|---------|
| 1 | 2026-08-03 | 1 | 10.0/10 | [Day01/FEEDBACK.md](Day01/FEEDBACK.md) |
| 2 | 2026-08-03 | 3 | 9.7/10 | [Day02/FEEDBACK.md](Day02/FEEDBACK.md) |
| 3 | 2026-08-03 | 3 | 8.7/10 | [Day03/FEEDBACK.md](Day03/FEEDBACK.md) |
| 4 | 2026-08-04 | 3 | 9.7/10 | [Day04/FEEDBACK.md](Day04/FEEDBACK.md) |
| 5 | 2026-08-05 | 3 | 10.0/10 | [Day05/FEEDBACK.md](Day05/FEEDBACK.md) |
| 6 | 2026-08-06 | 3 | 10.0/10 | [Day06/FEEDBACK.md](Day06/FEEDBACK.md) |
| 7 | 2026-08-07 | 7 | 9.6/10 | [Day07/FEEDBACK.md](Day07/FEEDBACK.md) |
| 8 | 2026-08-08 | 5 | 9.4/10 | [Day08/FEEDBACK.md](Day08/FEEDBACK.md) |
| 9 | 2026-08-09 | 7 | 8.9/10 | [Day09/FEEDBACK.md](Day09/FEEDBACK.md) |
| 10 | 2026-08-09 | 7 | 8.1/10 | [Day10/FEEDBACK.md](Day10/FEEDBACK.md) |
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
