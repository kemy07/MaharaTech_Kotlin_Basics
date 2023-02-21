fun main ()
{
    for ( i in 1 .. 10 step 2)
        println("Number = $i")
    val string = "KOTLIN"
    for (i in string)
        println("$i ")
    for ( i in 10 downTo 0 step 2)
        println("Number = $i")
    val  list = listOf("Kotlin" , "java" , "Android")
    for (i in list)
        println(i)
}