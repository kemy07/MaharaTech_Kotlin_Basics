fun main(args: Array<String>)
{
    val array : Array <Int> = arrayOf(1 , 2 , 3 , 4 )
    println (array.joinToString())
    val list : MutableList <Int> = mutableListOf<Int>(1 , 2 , 3 )
    list.add(3 , 5)
    list [3] = 6
    println(list)
}