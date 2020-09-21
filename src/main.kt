object Singleton {
    init {
        println("Singleton initialized")
    }

    var message = "kotlin in amazing"

    fun showMessage() {
        println(message)
    }
}

class Test {
    init {
        Singleton.showMessage()
    }
}

fun main() {
    Singleton.showMessage()
    Singleton.message = "Kotlin is cool"

    val test = Test()
}