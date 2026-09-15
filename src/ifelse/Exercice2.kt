package ifelse

fun main() {
    var t: Int = 29;

    if (t < 0){
        println("Gel")
    } else if (t >= 0 && t < 15){
        println("Froid")
    } else if (t >=15 && t < 25){
        println("Doux")
    } else {
        println("Chaud")
    }

}