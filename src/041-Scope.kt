var fullname = "hussein alrubave" //global Var

fun display():Unit{
    println(fullname)
}

fun main(args:Array<String>){

    var name = "hussein" //local var
    display()
    println("name: " + name)
}