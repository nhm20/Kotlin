    var temp=25;
    if(temp<50){
        println("its a warm day $temp");
    }
    var age=18;
    if(age<=18){
        println("you are minor");
    }
    else{
        println("you are major");
    }


    var score= 82
    if(score>=90){
        println("A")
    }
    else if(score>=85 && score<90){
        println("B")
    }
    else if(score>=70 && score<85){
        println("C")
    }
    else{
        println("D")
    }
    //create a cal with all arithmetic operators

    var sign='/'
    var a=100;
    var b=0;
    if(sign=='+'){
        println("${a+b}")
    }
    else if(sign=='*'){
        println("${a*b}")
    }
    else if(sign=='-'){
        println("${a-b}")
    }
    else if(sign=='/'){
        if(b==0)println("b should not be zero")
        else
            println("${a/b}")
    }
    else if(sign=='%'){
        println("${a%b}")
    }
    else{
        println("error")
    }


    age=13;
    if(age<13){
        println("child")
    }
    else if(age<19 && age>=13){
        println("teenage")
    }
    else{
        println("adult")
    }

    age=64;
    if(age<13){
        println("child")
    }
    else if(age in 13..19){
        println("teenage")
    }
    else if(age in 20..64){
        println("adult")
    }
    else{
        println("senior")
    }

    //when
    var day=3;
    val dayname=when(day){
        1->"Monday"
        2->"tuesday"
        3->"wednesday"
        4->"thursday"
        5->"friday"
        6->"saturday"
        7->"sunday"
        else -> "invalid"
    }
    println("day name : ${dayname}")

    //when as a statement
    val num=4
    when{
        num%2==0->println("$num is even")
        num%2!=0->println("$num is odd")
        else -> println("unexpected number")
    }
