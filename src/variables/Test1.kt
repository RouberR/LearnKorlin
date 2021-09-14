package variables

fun main() {

    val x = 5
    val c: Int = 10

    var d = x + c

    val name = "Rouber"

    println("Hi $name")

    var i = 0
    while (i < 10){
        println(i)
        i++
    }
println()
    for(x in 1..10){
        println(x)
    }
    println()
    for(x in 1 until 100){ //от 1 до 99
        print("$x ")
    }
    println()
    for(x in 15 downTo 1) print("$x ") //обратный порядок
    println()
    for(x in 1 .. 10 step 2) print("$x ") //step-шаг

}