fun main ()
{
    val price = 10
    val message2 : String  =when (price){
        0 -> "For Free"
        in 1 .. 19 -> "on Sale"
        in 20 .. 29-> "Normal Price"
        else -> "over loaded"
    }
    println(message2)

    when
    {
        // the left hand side is the condition
        price == 0 -> println("For Free")
        price <= 19 -> println("on Sale")
        price <= 29 -> println("Normal Price")
        else -> println("over loaded")
    }
}