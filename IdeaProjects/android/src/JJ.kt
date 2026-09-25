class Animal(
    val name: String,
    val age: Int,


){
    fun printInfo(){
        println("Name: $name, Age: $age")



    }
    fun eat(){
        println("$name:  кушает")
    }

}