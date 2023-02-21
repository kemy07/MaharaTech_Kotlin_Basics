fun main ()
{
    val x = 5
    var message : String? = if (x > 10 ) {
        ("Value is big")
    }
    else
    {
        ("value is small ")
    }
    println(message)
    val y : String ? = null
    if (y!= null) {
        y.length
        y.take(4)
    }
}