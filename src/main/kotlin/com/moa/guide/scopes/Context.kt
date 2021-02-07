package com.moa.guide.scopes

/**
 * @author omar Feb 07, 2021
 */


/**
 * Inside the lambda of a scope function, the context object
 * is available by a short reference instead of its actual name.
 * Each scope function uses one of two ways to access the context
 * object: as a lambda receiver (this) or as a lambda argument (it).
 */
fun main() {
    val str = "Hello"

    // this
    str.run {
        // str is referenced in this scope by this
        println("The receiver string length: ${this.length}")
        // we can omit the this value and write directly :
        println("The receiver string length: $length")
    }

    // it
    str.let {
        // str is referenced in this scope by it
        println("The receiver string's length is ${it.length}")
    }
}

