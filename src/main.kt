fun main(){
var myself = Human("Josphine",27,57)
    myself.eat(10)
    println(myself.weight)

    myself.speak("I am currently studying at AkiraChix")

    myself.birthday()

    var indivual =User("Loveline","Joy","lovelinejoy@gmail.com","254768976432",5463)
    println(indivual.email+" "+indivual.password)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age+1)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int)