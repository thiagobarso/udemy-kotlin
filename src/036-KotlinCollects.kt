fun main(args:Array<String>) {
    var map = hashMapOf(1 to "hussein", 2 to "jena")
    map.put(3, "laya")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,10,22,11)
    println(ar[0]);
    var list  = listOf(11,22,33,22) // imutavel
//    list[0]=10
    var list2  = mutableListOf(11,22,33,22) // mutavel - podemos alterar depois
    list2[0] = 10
    for (item in list){
        println(item)
    }
    for (item in list2){
        println(item)
    }

}

