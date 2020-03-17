abstract class CreditCard(){
    fun CreditID():String{
        return "123456";
    }
    abstract fun newCredit()

}
class UserInfo():CreditCard(){

    fun getInfo():String{
        return CreditID();
    }

    override fun newCredit() {
        println("new Cart Created")
    }
}

fun main(args:Array<String>) {

//    val creditCard = CreditCard()
//    println(creditCard.CreditID())

    val x = UserInfo()
    println(x.getInfo())
    x.newCredit()



}