class ClassesDive {
}

fun main () {
    var mugisha = Person("mugisha jules", 32)
    mugisha.getMyDescription()

    var student1 = Student(78.0,"ntwali egide", 34)
    student1.getMyDescription();

    println("I have ${student1.getGrades()}")
}

open class Person (var name: String, var age: Int) {
    fun getMyDescription () {
        println(" My name: ${name}, I am ${age} years old")
    }
}

class Student ( var marks: Double, name: String, age: Int) : Person(name, age) {
    fun  getGrades() : String{
        if( marks > 70 ) return "Grade A"
        else if( marks > 50) return "Grade B"
        else return "Failed"
    }
}