package gameRockPaperScissors

fun main() {

    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(options)
    val userChoise = getUsersChoice(options)
    printResult(userChoise, gameChoice)
}

fun getGameChoice(options: Array<String>) = options[(Math.random() * options.size).toInt()]


fun getUsersChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoise = ""
    while (!isValidChoice) {
        println("Выбирай! ")
        for (item in options) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in options){
            isValidChoice = true
            userChoise = userInput
        } else println("Такого нет, попробуй еще раз")

    }
    return userChoise
}

fun printResult(userChoise: String, gameChoice: String){
    val result: String
    if(userChoise == gameChoice) result = ("Ничья")
    else if((userChoise == "Камень" && gameChoice == "Ножницы") ||
        (userChoise == "Бумага" && gameChoice == "Камень")||
        (userChoise == "Ножницы" && gameChoice == "Бумага"))
        result = ("Ты победитель!")
        else result = ("Получается ты лузер, тебя обыграл ИИ")
        println("Ты выбрал $userChoise, а я выбрал $gameChoice. $result")
}

