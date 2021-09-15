package animals
//Наследование и полиморфизм 
open class Animals{
    open val image = ""
    open val food = ""
    open val habitat = ""
     var hunger = 10


   open fun makeNoize(){
        println("Животное издает звук:")
    }

    open fun eat(){
        println("Животное есть")
    }

   open fun roam(){
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
}
