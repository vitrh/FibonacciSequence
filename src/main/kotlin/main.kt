fun main(args: Array<String>) {
    println("Type in your max Fibonacci Number:  ")
    var n: Long = readLine()!!.toLong()
    calculateFibonacciSequence(n)

    for (i in calculateFibonacciSequence(n)){
        println("$i, ")
    }
}

fun calculateFibonacciSequence(n : Long) : Array<Long>{
    
    val list = mutableListOf<Long>()
    var firstNumber: Long = 0;
    var secondNumber: Long = 1;

    if(n == firstNumber){
        list.add(firstNumber)
        return list.toTypedArray()
    }
    if(n < 2){
        list.add(n);
        return list.toTypedArray()
    }
    var result = firstNumber

    list.add(firstNumber)
    list.add(secondNumber)
    for(i in 2..n){
        result = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = result
        list.add(result)
    }
    return list.toTypedArray()
}
