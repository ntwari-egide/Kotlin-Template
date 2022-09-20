import java.util.Scanner

fun main(){
//    logginScreen();
//    store();

    println("Decision: ${choiceMake("1")}" )
}

fun receiveInput() {
    val reader = Scanner(System.`in`)

    var choice: String ?

    println("Enter your choice: ")
    choice = reader.next()


}

fun choiceMake(choice : Any) : Any =
    when(choice) {
        "1" -> receiveInput()
        else -> "Incorrect inputs"
    }


fun store() {

    val reader = Scanner(System.`in`)

    var fruits = mutableListOf<String>("banana", "avocado", "apple", "kiwifruit")

    println(" \t\t ADD NEW FRUITS")
    for ( index in 0  until 5) {
        println("Enter fruit ${index + 1} : ")
        fruits.add(reader.next())
    }

    println(" \t\t WHAT WE HAVE IN THE MARKET")
    for (index: Int in fruits.indices)  print( " ${fruits[index]}\t")
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