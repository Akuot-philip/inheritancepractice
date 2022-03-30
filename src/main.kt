fun main(){
    var banker = Banker("Akuot",21)
    var farmer = Farmer("Effence",20)
    var doctor= Doctor("Philip",19)


    println(farmer is Person)
    println(doctor is Person)
    println(banker is Person)

    println(banker.countMoney(arrayOf(89,70)))
    farmer.cultivateLand()
    doctor.treatPatient("Akuot","malaria")


    banker.sleep()
    banker.eat()
    banker.introduction()
    banker.talk("hello baby gal")

    doctor.sleep()
    doctor.eat()
    doctor.introduction()
    doctor.talk("can i get some treatment")

    farmer.sleep()
    farmer.eat()
    farmer.introduction()
    farmer.talk("can i get som kales")


}
open class Person(var name: String, var age: Int){
    fun talk(words:String){
        println(words)
    }

    open fun eat(){
        println("yummy")

    }

    fun sleep(){
        println("ZZZ")

    }
    open fun introduction(){
        println("Hi my name is $name")
    }

}
class Banker(name:String,  age:Int):Person(name, age){


    fun countMoney(notes:Array<Int>):Int{
        var sum = 0
        notes.forEach { note->
            sum+=note
        }
        return sum
    }

}

class Doctor( name:String, age: Int):Person(name, age){


    fun treatPatient(patient:String, disease:String){
        println("Treating $patient for $disease")

    }

    override fun eat() {
        super.eat()
        println("i am swallowing all the food that i have grown")
    }

    override fun introduction() {
        //super.introduction()
        println("hi my name is Dr $name")
    }

}
class Farmer( name:String, age: Int):Person(name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()
        println("i am eating all the food that i have grown")
    }

}