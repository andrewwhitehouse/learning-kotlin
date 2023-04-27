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

