fun main ()
{
    val list = listOf("Android" , "Java" , "Kotlin")
    println(concatList(list , ","))
    println(concatList(list))
    println(concatList(separator = "*" , list =  list))
}
fun concatList (list: List<String> , separator : String = ":") = list.joinToString(separator)