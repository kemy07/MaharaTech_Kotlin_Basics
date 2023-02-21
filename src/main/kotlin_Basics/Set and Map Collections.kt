
fun main ()
{
    val set:MutableList <Int> = mutableListOf<Int>(1 , 2 , 3 , 1)
    println(set.joinToString())

    val map : Map <Int , String > = mutableMapOf(Pair(1 , "kotlin") , Pair(2 , "java") , Pair(3 , "Android"))
    println(map)
    // Another way
    val map2 : MutableMap <Int , String > = mutableMapOf(1 to "Kotlin" , 2 to "java" , 3 to "Android")
    map2 [4] = "Test"
    println(map2)
}