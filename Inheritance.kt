open class Rectangle(val a:Double,val b:Double){
    fun area():Double{
        return a*b;
    }
    open fun display() {
        println("rectangle with sides $a and $b is ${area()}")
    }
}
open class Square(side :Double):Rectangle(side,side){
    override fun display() {
        println("square with sides $a is ${area()}")
    }
}

fun main(){
    val rec=Rectangle(2.0,4.0);
    rec.display()
    val sq=Square(3.0);
    sq.display()
}
