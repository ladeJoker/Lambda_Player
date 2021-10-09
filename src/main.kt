import kotlin.random.Random

fun main() {



    //------------------------------------------------------------------------------------------------------------------
    val names = listOf<String>("Hassan" , "Salma" , "Ali" , "Ted", "Tom", "Fawaz", "Yara", "Gege","Ramy" , "Loii",
        "Diana" , "Mohammed", "Charlot", "Ani" , "Caily" , "Maroon", "Luffy", "Zoro", "Brock", "waad")

    val playerArray = ArrayList<Player>()

    for (i in 0..19){
        var hight = Random.nextInt(160,188)
        var age = Random.nextInt(20,31)
        var player = Player(names[i],age,hight.toString())
        playerArray.add(player)
    }

    //
    // val lambda = {sortedPlayers : ArrayList<Player> -> sortedPlayers.sortBy { it.height} }
    val lambda = {sortedPlayers : ArrayList<Player> ->
        sortedPlayers.sortBy { it.height}
        for (i in playerArray)
        println(i.height)}
    lambda(playerArray)
}