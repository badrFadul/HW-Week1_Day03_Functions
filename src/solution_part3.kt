fun main(){
//partII
//q4
//ch1
fun mathAdd(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
    val x = num1
    val y = num2
    println()
    println("add: "+ math0(x,y))


}

mathAdd(2,3) { n1, n2 -> n1 + n2 }

fun mathSub(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
    val x = num1
    val y = num2

    println("Subtract: "+ math0(x,y))


}
mathSub(2,3) { n1, n2 -> n1 - n2 }

fun mathMult(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
    val x = num1
    val y = num2

    println("Multiply: "+ math0(x,y))


}
mathMult(2,3) { n1, n2 -> n1 * n2 }

fun mathDiv(num1:Int, num2:Int, math0 :(n1:Int, n2:Int)-> Int) {
    val x = num1
    val y = num2

    println("Divide: "+ math0(x,y))

}
mathDiv(2,3) { n1, n2 -> n1 / n2 }


//q5
//ch2
var fuel = 50
fun castFireball(numFireballCast: Int):String {
    val maximum = 50
    val minimum = 1
    fuel -= numFireballCast
    if (fuel == maximum){
        return "$fuel at it maximum"
    }else if (fuel in 2..49){
        return "$fuel is the remaining fuel"
    }else if (fuel == minimum){
        return "$fuel at it minimum level"
    }else{
        return "out of range"
    }

}
    println()
println(castFireball(49))
}