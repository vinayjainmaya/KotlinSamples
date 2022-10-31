package com.vinaymj.kotlin.samples

/**
 * class to demonstrate Kotlin Delegation
 */
fun main() {
    val kotlinDelegation = KotlinDelegation()
    kotlinDelegation.doOperation()
}

interface IOOperation {

    fun read(file: String?)
    fun write(data: String?, file: String?)

}

class IOOperationImpl: IOOperation {

    override fun read(file: String?) {
       println("$file reading...!")
    }

    override fun write(data: String?, file: String?) {
        println("$data is writing to $file...!")
    }

}

class KotlinDelegation: IOOperation by IOOperationImpl() {
    fun doOperation() {
        read("KotlinFile")
        write("****", "KotlinFile")
    }

}

