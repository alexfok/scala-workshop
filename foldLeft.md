## foldLeft

`foldLeft` function folds over a collection taking a single element one at a time from left to right and executing a binary function that accepts an initial element or an earlier result and a next element from the collection.

```
// From Spark's code
preparations.foldLeft(plan) { case (sp, rule) => rule.apply(sp) }
```
