fun main ()
{
    var y : Int ? = null   // Null
    // println(y!!.dec())     // not recommended to put !!  لازم تكون متأكد 100%
    val z : Float = y?.toFloat()  ?: 7f
    println(z)
}