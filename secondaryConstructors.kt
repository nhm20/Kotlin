
class Person {
    var name: String
    var age: Int

    constructor(x: String, y: Int) {
        this.name = x;
        this.age = y;
    }

    constructor(x: String) {
        this.name = x;
        this.age = 0;
    }

    constructor() {
        this.name = "Rahul";
        this.age = 24;
    }
    fun intro() {
        println("name is $name and age is $age");
    }
}
fun main(){
    var a=Person("Riya",32)
    a.intro()
    var b=Person()
    b.intro()
    var c=Person("Hema")
    c.intro()
}
