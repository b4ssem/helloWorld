package dowhile
import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)
    do {
        val line: Int = scanner.nextInt()
        print(line)
    } while (line <= 0 || line >= 20)
}