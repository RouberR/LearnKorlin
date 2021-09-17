package animals
//Наследование, полиморфизм, абстракция и интерфейсы
abstract class Animals : Roamable{
    abstract val image : String
    abstract val food : String
    abstract val habitat : String
     var hunger = 10


   abstract fun makeNoize()

    abstract fun eat()

   override fun roam(){
        println("Животное передвигается")
    }

    fun sleep(){
        println("Животное спит")
    }

}


fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)


    val roamable = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamable){
        item.roam()
        if (item is Animals){
            item.eat()
        }
    }
}
