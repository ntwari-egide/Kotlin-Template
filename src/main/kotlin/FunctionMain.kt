fun main () {

    println("Hello Egide welcome back to kotlin world")

    println("It is already executing same as typescript: " + add(2,4))

    // calling the function that doesn't return anything to the user

    useOfCalling("Ntwali","Egide")

}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2;
}

fun useOfCalling( firstName: String, secondName: String)  {

    println("${firstName} and ${secondName} is : ${ firstName + " " + secondName}")
}