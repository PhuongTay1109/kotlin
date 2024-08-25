import java.io.File

fun main() {
    val inputFile = File("src/resources/input.txt")
    val lines = inputFile.readLines()

    val outputFile = File("src/resources/output.txt")
    outputFile.printWriter().use { out ->
        for (line in lines) {
            val tokens = line.split(",").map { it.trim() }
            tokens.forEach { out.println(it) }
        }
    }
}