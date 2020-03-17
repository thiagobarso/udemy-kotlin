fun show(name: String): Unit {
    println("name: " + name)
}

fun show(number: Int): Unit {
    println("number: " + number)
}

fun show(numberD: Double): Unit {
    println("numberD: " + numberD)
}

fun main(args: Array<String>) {
    show("Thiago")
    show(10.2)
    show(1)
}