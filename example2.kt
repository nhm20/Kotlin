class Account{
    var balance:Int
    constructor(bal:Int){
        balance=bal;
    }
    fun withdraw(amount:Int){
        if(amount>balance){
            println("Insufficient balance");
        }
        else{
            balance-=amount;
            println("balance ${balance}")
        }
    }
}

fun main(){
    var p1=Account(100000);
    println("Do you want to withdraw ")
    var flag: String = readln();
    while (flag=="yes"){
        println("enter balance")
        var amount= readln().toIntOrNull();
        if (amount != null) {
            p1.withdraw(amount)
        }
        println("Do you want to withdraw again")
        flag= readln().toIntOrNull();
    }

    var bal=1000;
    var withdraw:Int
    var cont:String
    do{
        println("Your current balance is $bal");
    }
}

