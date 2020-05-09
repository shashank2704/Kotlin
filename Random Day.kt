import java.util.*;
fun randomDay():String{
    val week= listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day:String) : String{
    return when(day){
        "Monday" -> "Flakes"
        "Wednesday" -> "RedWorms"
        "Friday" -> "Granules"
        "Sunday" -> "Mosquitoes"
        else -> "Nothing"
    }

}
fun feedTheFish(){
    val day=randomDay()
    val food=fishFood(day)
    println("Today is $day and the fish eat $food")

}
fun main(args:Array<String>){
    feedTheFish()
}