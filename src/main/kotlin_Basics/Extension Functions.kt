fun main ()
{
    println(5.isEven())
    println(6.isEven())

    println(5 addAndCheckEven 7)
}
fun Int.isEven () =  this % 2 == 0


// infix must be an extension method
// has only one parameter
infix fun Int.addAndCheckEven (number: Int) = (this + number) .isEven()
