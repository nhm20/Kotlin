fun celToFah(celsius:Double):Double{
    return (9.0/5.0*celsius)+32
}
fun fahToCel(fahrenheit:Double):Double{
    return (fahrenheit-32)*5.0/9.0
}
fun main(args:Array<String>){
    var a= readln().toDoubleOrNull()
    println("Conversion of Celsius to Fahrenheit")
    if(a!=null)
    {
        println("$a celsius in fahrenheit is ${celToFah(a)}")
        println("$a fahrenheit in celsius is ${fahToCel(a)}")
    }
    else{
        println("Invalid Input")
    }
}
