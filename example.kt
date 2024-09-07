fun checkDiscount(totalBill:Int,member:Boolean){
    if(member) {
            if (totalBill>=1000){
                println("You have 20% discount");
            }
        else{
            println("You have 10% discount");
        }
    }
    else{
        println("No discount");
    }
}
fun main(){
    var member=true;
    var totalBill= readln().toIntOrNull();
    if(totalBill!=null){
        checkDiscount(totalBill,member);
    }
    else{
        println("Enter the correct inputs");
    }
}
