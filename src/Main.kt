class Person{
    var name:String="John Doe"
    var age:Int=20
    fun displayInfo(){
        println("Name : $name, Age:$age")
    }
}
fun main(){
    val person= Person()
    person.displayInfo()
}