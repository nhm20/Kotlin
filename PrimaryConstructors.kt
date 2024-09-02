class Person2(var name:String,var age:Int) {

    constructor(x: String):this() {
        this.name = x;
        this.age = 0;
    }
    constructor():this("Rahul",30)
    fun intro() {
        println("name is $name and age is $age");
    }
}
fun main(){
    var a=Person2("Riya",32)
    a.intro()
    var b=Person2()
    b.intro()
    var c=Person2("Hema")
    c.intro()
}
