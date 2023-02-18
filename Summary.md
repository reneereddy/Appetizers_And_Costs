# SUMMARY

Answer all the questions. Please put your answers _after_ the
italicized instructions.

## Planning questions

### Partial solutions

During recursive backtracking, there is a partial solution that is passed
forward. For the N Queens Problem, it was a partly completed board. For
the Anagram Solver, it was words that were had been applied to the input
string. For example, if the input string was "husky bear", a partial solution
might be ["hub", "sky"].

**What is the partial solution for this assignment?**

_State both the general answer, and provide a specific example for the
situation in the cartoon (like I did for the anagram solver)._ [5 points]

### Legal moves

For the N Queens problem, legal moves were found by iterating over row numbers
and determining if a queen could be placed in that row of the current column
without threatening a placed queen. For the Anagram Solver, we iterated over
all the words in the dictionary and rejected words that could not be formed
from letters in the initial string that had not yet been matched. To continue
the example of finding an anagram for "husky bear", after adding "hub" and "sky"
to the partial solution, the remaining letters were "ear". Consequently, the
word "acre" would not be a legal move, but "ear" would be.

**How is a legal move determined for this assignment?**

_State both the general answer, and provide a specific example._ [5 points]

### Termination condition

Recursive backtracking requires a termination condition to know when we
have found a solution. For the N Queens Problem, it is when the column number
is off the edge of the board (implying that all of the columns on the board have
been filled). For the Anagram Solver, it is when all the words in the initial
string have been matched.

**What is the termination condition for this assignment?**

_How do we know when a partial solution is complete?_ [5 points]

## Summary questions

### Did you successfully implement everything that was requested?

_Either answer "Yes" or describe what you were and were not able to
implement._ [1 point]

### Does everything work, to the best of your knowledge?

_Answer "Yes", or state here which parts did not work or
which tests did not pass._ [1 point]

### What was the total amount of time you spent on the assignment?

_Rather than giving a range, if you are unsure, give the average of the range._
[1 point]

### Who did you work with and how?

_Discussing the assignment with people not on your team is fine as long as you
don't share code._ [1 points]

### What resources did you use?

_Please give **specific URLs (not just "Stack Overflow" or "Baeldung")** and
**state which ones were particularly helpful**._ [2 point]

### Reflections

_Give **several sentences** reflecting on your experience with the assignment.
Suggestions for improving assignments, office hours, and lecture are
always welcome. If you have something nice to say about a TA,
I will share it with them without your name._ [4 points]
