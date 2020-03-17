open class OperationsA() {

    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperationsA : OperationsA {
    

    constructor():super(){

    }

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 * 3
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }
}

fun main(args: Array<String>) {
    var op = OperationsA()
    var sum = op.sum(10, 15)
    println("sum=$sum")
    var div = op.div(12, 11)
    println("div=$div")

    //second
    var op2 = MultiOperationsA() as OperationsA
    sum = op2.sum(10, 15)
    println("sum=$sum")
    div = op2.div(12, 11)
    println("div=$div")
}