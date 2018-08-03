package example

fun main(args: Array<String>) {
    console.log(hello("Kotlin"))
    console.log(hello("KotlinJs"))
}

fun hello(name: String) = "Hello, $name!"

