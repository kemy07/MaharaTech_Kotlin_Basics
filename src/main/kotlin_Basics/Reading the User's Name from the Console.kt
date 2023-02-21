fun main ()
{
    val guest = "Guest"
    val input = readln()
    val name = if (input.isEmpty())  guest else input
    println(name)

    val message = if (name == guest) "You are A Guest" else "Welcome $name"
    println(message)
}