
fun fact(a:Long):Long{
    if(a<=0)return 1;
    return a*fact(a-1);
}
fun main(){
    var x:Long=readln().toLong()
    var y=fact(x);
    print(y);
}
