package `when`

fun main() {

    var t: Int = 15
    when {
        t < 0 -> println("Gel")
        t < 15 -> println("Froid")
        t < 25 -> println("Doux")
        else -> println("Chaud")
    }

}