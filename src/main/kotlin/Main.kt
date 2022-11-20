import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите минимальное x: ")
    var x1 = reader.nextDouble()

    print("Введите максимальное x: ")
    val x2 = reader.nextDouble()

    print("Введите шаг: ")
    val u = reader.nextDouble()

    while (x1 <= x2) {
        val y = -0.23 * x1 * x1 + x1
        println("$x1 -> $y")
        x1 += u
    }
}