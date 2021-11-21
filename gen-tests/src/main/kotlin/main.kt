import kotlin.streams.asSequence

const val VARIABLE_NAME = "shiftDiagram"
const val CLASS_NAME = "ShiftDiagram"
const val METHOD_NAME = "apply"
const val ASSERTION_METHOD = "assertEquals"

val TEST_PREAMBLE = """
    var $VARIABLE_NAME = new $CLASS_NAME();
""".trimIndent()

class Test(private val line: String) {
    private val assertions = line.split(' ')
        .map {
            val (input, output) = it.split("/")
            input to output
        }

    fun genCode(id: Int) = """
        |// $line
        |@Test
        |void test$id() {
        |${TEST_PREAMBLE.prependIndent("    ")}
        |${genCodeForAssertions().prependIndent("    ")}
        |}
    """.trimMargin().prependIndent("    ")

    private fun genCodeForAssertions(): String = buildString {
        for ((input, output) in assertions) {
            append(ASSERTION_METHOD, "(", toEnum(output), ", ", VARIABLE_NAME, ".", METHOD_NAME, "(", toEnum(input), "))")
            appendLine(";")
        }
        deleteAt(length - 1)
    }

    private fun toEnum(number: String) = if (number == "0") "ZERO" else "ONE"
}

fun main() {
    val text = Test::class.java.getResourceAsStream("/tests.txt")
        .let { it ?: error("Cannot find tests.txt") }
        .bufferedReader()
        .lines()
        .asSequence()
        .map { Test(it) }
        .mapIndexed { index, test -> test.genCode(index + 1) }
        .joinToString(separator = "\n\n") { it }
    println(text)
}