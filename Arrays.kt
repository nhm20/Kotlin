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

    println("Two D Array")
    var twoD= arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9));
    println(twoD[0][2]);

    var matrix:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9));
    println(matrix[0][2]);


//    3*3 matrix
      var homeWork:Array<Array<Array<Int>>>  = arrayOf(arrayOf(arrayOf(1,2,3,4), arrayOf(10,20,30,40)),arrayOf(arrayOf(5,6,7,8), arrayOf(50,60,70,80)))
    for (row in homeWork){
        for(arr in row){
            for(num in arr){
                print(" ${num}");
            }
            println("     ")
        }
        println("\n")
    }
}
