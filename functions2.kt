
fun sum(a:Int,b:Int):Int{
    return (a+b)
}
// celsius to farenheit
fun CtoF(a:Double,c:Int):Double{
    if(c==1){
        var res= a*(9/5)+32;
        return res;
    }
    else{
        return (a-32)*5/9;
    }
}
fun main(){
    val result=sum(50,0)
    println(result)
    //read and convert


}
