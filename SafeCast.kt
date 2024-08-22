fun main(){
    val a="hello"
    val b:String= a as String
    println("Unsafe cast Result: $b")

    val c:Int?=a as? Int
    println("Safe Cast Result: $c")
}
