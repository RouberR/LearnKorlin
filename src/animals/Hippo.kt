package animals

class Hippo : Animals(){
    override  val image = "hippo.jpg"
    override  val food = "grass"
    override val habitat = "water"

    override fun makeNoize() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }

}