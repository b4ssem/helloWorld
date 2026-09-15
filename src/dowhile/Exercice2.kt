package dowhile

fun main() {
    var de = 0
    do{
        de = (1..6).random()
        println("Tu as fait $de")
    } while (de != 6)
}