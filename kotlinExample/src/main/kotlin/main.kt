fun main() {
    println("Hello, world!")
    var person = Person()
    println(person.name)

}


class Person {
    var name: String = "Joseph"
        private set
    var age: Int = 32
}