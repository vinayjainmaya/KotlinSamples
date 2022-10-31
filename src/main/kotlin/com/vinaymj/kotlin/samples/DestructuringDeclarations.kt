package com.vinaymj.kotlin.samples

/**
 * Class to demonstrate the Destructuring declarations concept.
 */
fun main() {

    val normalPerson = NormalPerson().apply {
        name = "Robert"
        age = 35
        salary = "234534"
    }
    val (
        normalName,
        normalAge,
        normalSalary
    ) = normalPerson

    println("Normal Person Name: $normalName")
    println("Normal Person Age: $normalAge")
    println("Normal Person Salary: $normalSalary")


    val dataPerson = DataPerson(
        name = "Robert",
        age = 35,
        salary = "234534"
    )
    val (
        dataName,
        dataAge,
        dataSalary
    ) = dataPerson

    println("Data Person Name: $dataName")
    println("Data Person Age: $dataAge")
    println("Data Person Salary: $dataSalary")
}

// Normal class example
 class NormalPerson {
     lateinit var name: String
     var age: Int = 0
     lateinit var salary: String

     operator fun component1(): String {
        return name
     }

     operator fun component2(): Int {
         return age
     }

     operator fun component3(): String {
        return salary
     }

 }

// Data class example
data class DataPerson(
    val name: String,
    val age: Int,
    val salary: String
)
