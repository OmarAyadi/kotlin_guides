package com.moa.guide.scopes

/**
 * @author omar Feb 07, 2021
 */

// Used to mock a request from an url
fun requestFromExternalServer(): String? = "hello from external server"

fun main() {

    /* Convert value */

    val price: Int = 20
    // .let will reference the price param by `it
    // then we can apply any changes and return them
    val priceModified: Double = price.let {
        println("old value is $it")
        // the last instruction in let block is treated as return@let
        // this instruction will define the return type and value
        // of the let block
        it * 1.5
    }
    println(priceModified) // will print 30.0



    /* Nullability Check, Safe Calls */
    val message: String? = requestFromExternalServer()

    // ?.let will check if the value is not null
    // Then convert the message from String? to a String
    message?.let {
        println("we got a result from external server")
    }

    /* Elvis operator chaining */


    // So we can call `length` fully knowing the message cannot be null
    val nbChars = message?.let { it.length } ?: 0

    println(nbChars) // value printed : 6
}