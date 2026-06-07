<div align="center">

```
██╗     ███████╗███████╗████████╗ ██████╗ ██████╗ ██████╗ ███████╗
██║     ██╔════╝██╔════╝╚══██╔══╝██╔════╝██╔═══██╗██╔══██╗██╔════╝
██║     █████╗  █████╗     ██║   ██║     ██║   ██║██║  ██║█████╗  
██║     ██╔══╝  ██╔══╝     ██║   ██║     ██║   ██║██║  ██║██╔══╝  
███████╗███████╗███████╗   ██║   ╚██████╗╚██████╔╝██████╔╝███████╗
╚══════╝╚══════╝╚══════╝   ╚═╝    ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝
```

# 🧠 LeetCode Solutions

**Grinding DSA one problem at a time.**

[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-250%2B-brightgreen?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/Mohti_shakya)
[![Language](https://img.shields.io/badge/Language-Python%20%7C%20Java%20%7C%20C%2B%2B-blue?style=for-the-badge)](https://github.com/mahit8171)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)](LICENSE)
[![Stars](https://img.shields.io/github/stars/YOUR_USERNAME/leetcode-solutions?style=for-the-badge&color=orange)](https://github.com/mahit8171/leetcode-solutions/stargazers)

<a href="https://leetcode.com/Mohti_shakya">
  <img src="https://leetcard.jacoblin.cool/Mohti_shakya?theme=dark&font=Karma&ext=heatmap" alt="LeetCode Stats"/>
</a>

</div>

---

## 📊 Progress at a Glance

<div align="center">

| 🟢 Easy | 🟡 Medium | 🔴 Hard | 📁 Total |
|:-------:|:---------:|:-------:|:--------:|
| ![Easy](https://img.shields.io/badge/80-4CAF50?style=flat-square) | ![Medium](https://img.shields.io/badge/130-FFC107?style=flat-square) | ![Hard](https://img.shields.io/badge/40-F44336?style=flat-square) | ![Total](https://img.shields.io/badge/250-2196F3?style=flat-square) |

</div>

---

## 🗂️ Topics Covered

<div align="center">

| Topic | Problems | Progress |
|-------|----------|----------|
| 🔢 Arrays & Hashing | 40 | `████████████░░░` 75% |
| 🪟 Sliding Window | 15 | `██████████░░░░░` 65% |
| 🔁 Two Pointers | 18 | `████████████░░░` 80% |
| 📚 Stack & Queue | 20 | `████████░░░░░░░` 55% |
| 🌲 Trees & BST | 30 | `██████████░░░░░` 70% |
| 🕸️ Graphs & BFS/DFS | 25 | `████████░░░░░░░` 60% |
| 🔄 Dynamic Programming | 35 | `██████░░░░░░░░░` 45% |
| 🔍 Binary Search | 20 | `████████████░░░` 80% |
| 🔗 Linked Lists | 18 | `██████████████░` 90% |
| ⚡ Heap / Priority Queue | 15 | `████████░░░░░░░` 55% |
| 🔀 Backtracking | 14 | `██████░░░░░░░░░` 40% |
| 🧮 Math & Bit Manipulation | 10 | `████████░░░░░░░` 55% |

</div>

---

## 📁 Repository Structure

```
📦 leetcode-solutions
├── 📂 arrays-hashing/
│   ├── 0001-two-sum.py
│   ├── 0049-group-anagrams.py
│   └── ...
├── 📂 two-pointers/
│   ├── 0015-3sum.py
│   └── ...
├── 📂 sliding-window/
│   ├── 0121-best-time-to-buy-and-sell-stock.py
│   └── ...
├── 📂 trees/
│   ├── 0104-maximum-depth-of-binary-tree.py
│   └── ...
├── 📂 dynamic-programming/
│   ├── 0070-climbing-stairs.py
│   └── ...
└── 📂 graphs/
    ├── 0200-number-of-islands.py
    └── ...
```

---

## 🔥 Featured Solutions

> Hand-picked solutions with clean logic and optimal complexity.

### 🏆 Problem: Two Sum — `Easy`
```python
# Time: O(n) | Space: O(n)
def twoSum(nums: list[int], target: int) -> list[int]:
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i
```

### 🏆 Problem: Longest Substring Without Repeating — `Medium`
```python
# Time: O(n) | Space: O(min(n, m))
def lengthOfLongestSubstring(s: str) -> int:
    char_set = set()
    left = max_len = 0
    for right in range(len(s)):
        while s[right] in char_set:
            char_set.remove(s[left])
            left += 1
        char_set.add(s[right])
        max_len = max(max_len, right - left + 1)
    return max_len
```

### 🏆 Problem: Word Search — `Hard`
```python
# Time: O(m*n*4^L) | Space: O(L) where L = word length
def exist(board: list[list[str]], word: str) -> bool:
    rows, cols = len(board), len(board[0])
    path = set()

    def dfs(r, c, i):
        if i == len(word): return True
        if not (0 <= r < rows and 0 <= c < cols): return False
        if board[r][c] != word[i] or (r, c) in path: return False
        path.add((r, c))
        res = dfs(r+1,c,i+1) or dfs(r-1,c,i+1) or dfs(r,c+1,i+1) or dfs(r,c-1,i+1)
        path.remove((r, c))
        return res

    return any(dfs(r, c, 0) for r in range(rows) for c in range(cols))
```

---

## 🧩 How to Use This Repo

```bash
# Clone the repository
git clone https://github.com/mahit8171/MY-LEETCODE.git

# Navigate to a topic
cd leetcode-solutions/dynamic-programming

# Run a solution (Python)
python 0070-climbing-stairs.py
```

Each file includes:
- ✅ Problem statement (brief)
- ✅ Approach explanation
- ✅ Time & Space complexity
- ✅ Clean, readable solution

---

## 📈 Weekly Commitment

> "Consistency beats intensity. Solve daily, improve forever."

- 🗓️ **Goal**: 5 problems/week minimum
- 🎯 **Target**: NeetCode 150 + Blind 75 complete
- 🏁 **End Goal**: SDE roles at top product companies

---

## 🛠️ Languages Used

<div align="center">

![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)

</div>

---

## 🌐 Connect With Me

<div align="center">

[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/YOUR_USERNAME)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/Mohti_shakya)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mahit8171)
[![Portfolio](https://img.shields.io/badge/Portfolio-FF5722?style=for-the-badge&logo=google-chrome&logoColor=white)](https://yourportfolio.com)

</div>

---

<div align="center">

⭐ **If this helped you, drop a star — it keeps me motivated!** ⭐

*"First, solve the problem. Then, write the code."* — John Johnson

![Visitor Count](https://visitor-badge.laobi.icu/badge?page_id=Mohti_shakya.leetcode-solutions)

</div>
