fun fibo(a: Int): Int {
    if (a <= 0) return 0
    if (a == 1) return 1
    val ans = fibo(a - 1) + fibo(a - 2)
    print("$ans ")
    return ans
}

fun main(args: Array<String>) {
    val a = readln().toIntOrNull()
    if (a != null) {
        print("0 ")
        fibo(a)
    } else {
        println("Invalid Input")
    }
}
