import kotlin.random.Random

fun main ()
{
    val array = IntArray (100)
    for (i in array.indices)
    {
        array[i] = Random.nextInt(0 , 100)
        println("${array[i]} ")
    }
    println()
    var index = 0
    while (index < array.size && array[0] > 10)
    {
        println("${array[index]} ")
        index++
    }
}