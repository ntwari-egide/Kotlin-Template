import java.util.Scanner

fun main(){
    logginScreen();
}

fun logginScreen () {

    var fullName: String ? = ""
    var age : Int

    // request users input
    print("Enter your full name: \t")
    fullName = readLine()!!

    // get integer from the user
    val reader = Scanner(System.`in`)

    print("Enter your age: \t")
    age = reader.nextInt();

    println(" My name is : ${fullName} , I am ${age} years old")

}