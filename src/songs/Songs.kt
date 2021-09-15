package songs


class Song(val title: String, val artist: String){
    fun play(){
        println("Песня: $title, исполняет: $artist")
    }
    fun stop(){
        println("Пауза: $title")
    }
}

fun main() {
    val songOne = Song("Даль", "Вася")
    val songTwo = Song("Космос", "Вася два")
    val SongThree = Song("Березка", "Народ")
    songOne.play()
    songOne.stop()
    songTwo.play()
}