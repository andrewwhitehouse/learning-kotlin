# Learning Kotlin

## Exercism

### two-fer

27th April 2023

[Exercism](https://exercism.org/tracks/kotlin/exercises/two-fer)

Solution:

```
internal fun twofer(name: String = "you"): String {
    return "One for $name, one for me."
}
```

Note:
- function is identified by `fun` and type comes after (or is omitted if it's void)
- functions support default parameter values
- semi-colons aren't required (unless there are multiple statements on the same line)
- Test imports are: `import org.junit.Ignore, import org.junit.Test, import kotlin.test.assertEquals`

Questions:
- why does it specify `internal`?

### Hamming

Here is the initial function:

```
object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        TODO("Implement this function to complete the task")
    }
}
```

I Googled "iterate over string".

Here's what I came up with.

```
object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        var distance: Int = 0
        val leftLength = leftStrand.length
        val rightLength = rightStrand.length
        if (leftLength != rightLength) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        for (i in 0 until leftLength) {
            if (leftStrand[i] != rightStrand[i]) {
                distance++;
            }
        }
        return distance
    }
}
```

Note:

- use of `object`
- `var` and `val`
- no need to `new` objects
- different mechanism for iteration: `0 until value`

