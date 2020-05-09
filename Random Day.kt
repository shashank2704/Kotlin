import java.util.*

fun main(args: Array<String>)
{
    feedTheFish()
}
fun feedTheFish(){
    val day=randomDay()
    val food="Patlets"

    println("Today is the $day and the fish eAat $food")
}
fun randomDay() : String{
    val week= listOf("Monday","Tuesday","WednesDay","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}