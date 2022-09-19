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

    println("Your name is : ${fullName} , I am ${age} years old")

    // store the full name separately

    var firstName : String ?
    var lastName : String ?

    var names = fullName.split(" ")
    firstName = names[0]
    lastName = names[1];

    if(
        (firstName.lowercase() == "egide" && lastName.lowercase() == "ntwari") ||
        (lastName.lowercase() == "egide" && firstName.lowercase() == "ntwari")
    ) println("Welcome my big mn Egide ...")
    else {
        println("[UNAUTHORIZED]: Invalid Credentials, Please try again!")
    }
}