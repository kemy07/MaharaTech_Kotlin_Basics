fun main ()
{
    println(PermitAccess(10))
    println(PermitAccess(18 , 15 , 16 , 19))
}
fun PermitAccess(age:Int) =  age >= 18

fun PermitAccess(vararg ages : Int) : Boolean
{
    for ( age in ages )
    {
        if (age < 18 )
        {
            return false
        }
    }
    return true
}