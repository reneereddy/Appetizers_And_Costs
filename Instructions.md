## Setup

Set checkstyle to
use [https://ellenspertus.com/northeastern/fundies2-checks3.xml](https://ellenspertus.com/northeastern/fundies2-checks3.xml).

## Planning

After watching the videos on Canvas, please fill in answers to the planning
questions on [Summary.md](Summary.md). (These are CodePath's Matching and
Planning stages.)

## Appetizer

First write the tests for, and then override, these `Appetizer` methods:

* `equals()`, where two appetizers are equal if and only if the have the
  same name and price
* `toString()`, where the return value for an `Appetizer` with the name "Hot
  Wings"
  and price 335 would be "Hot Wings ($3.35)"
* `compareTo(Appetizer other)`, which should return:
    * -1 if `this` is "earlier" than `other`
    * 0 if the `this` and `other` are equal
    * 1 if `this` is "later" than other

  One instance of `Appetizer` is less than another if:
    * its `name` is earlier lexicographically than the other's `name` (hint: use
      `String.compareTo()`), or
    * the `name` fields are the same but `price` is smaller

For example:

* `new Appetizer("Apple", 500).compareTo("Banana", 50)` would return
  -1 because `"Apple"` is before `"Banana"`
* `new Appetizer("Coconut", 50).compareTo("Coconut", 20)` would return
  +1 because the names are the same and `50 > 20`

See Canvas for helpful links.

## Solver: Find one solution (Milestone 1)

1. Complete the implementation of `getTotalPrice()` in `SolverTest`.
2. Run the tests. The provided tests should fail.
3. Implement `Solver.findOneSolution()` so it returns the first solution found
   for
   a given list of appetizers and price. If there are no solutions, it should
   return `null`. You may find it helpful to add simpler test cases than the
   one provided when debugging.

## Solver: Find all solutions (Milestone 2)

Implement `Solver.findAllSolutions()` (and any helper methods) so, instead of
just
returning the first solution, it returns a list of all solutions. The return
type
will be `List<List<Appetizer>>`.

Hint: Instead of directly adding a solution to the list of solutions, add a copy
of it. That way, if the solution data structure is modified, the list of
solutions won't be affected.

## Submission

Make a pass over your code, making sure it's properly formatted and there are
no checkstyle errors.

Complete `Summary.md` and submit:

* `Appetizer.java`
* `AppetizerTest.java`
* `Solver.java`
* `SolverTest.java`
* `Summary.md`
