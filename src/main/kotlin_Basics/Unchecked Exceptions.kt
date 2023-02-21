import java.io.DataInputStream
import java.io.FileInputStream
import java.lang.Exception

fun main ()
{
    val input : String = try {
        DataInputStream ( FileInputStream ("")).readUTF()
    }catch (e:Exception)
    {
        println("")
        "Error Data"
    }
    finally {
        println("Inside Finally")
    }
    println(input)
}