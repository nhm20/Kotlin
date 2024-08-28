fun main(){
    var num=arrayOf(1,2,3,4,5);
    var words:Array<String> =arrayOf("kotlin","java","array")
    var squares=Array(5){i->i*i}
    var secondWord=words[1];

    println("first Number :${num[0]}");
    println("second Word: $secondWord");
    println("second square: ${squares[4]}");

    num[4]=13;
    println("num4 :${num[4]}");
    words[2]="c++";
    println("word2 : ${words[2]}");

    println("Numbers in array using for loop")
    for(n in num){
        println(n);
    }
    for(i in 1..5){
        print("$i ")
    }
    println()
    for(i in 1 until 5){
        print("$i ")
    }
    println();

    for(i in 5 downTo 1){
        print("$i ")
    }
    println();

    for(i in 5 downTo 1 step 2){
        print("$i ")
    }
    println()

    //iterating over a list

    val fruits=listOf("Apple","Banana","Cherry")

    for(fruit in fruits){
        println("Fruit: $fruit")
    }

    //
    for(i in fruits.indices){
        println("Fruit: ${i} ${fruits[i]}")
    }
}
