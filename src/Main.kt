fun main() {
    //1
    println("---1---")
    var age: Int = 25
//    var age: Int? = null
    println("Age: $age")

    println("---2---")
    var city: String? = "Kuwait City" //2
    println("City: $city")
    city = null
    println("City: ${city}")
    city = "Kuwait City"
    println("---3---")
    val cityLength: Int? = city?.length   //3
    println("City name length: $cityLength")

    //4
    println("---4---")
    val cityLengthWithDefault: Int = city?.length ?: 0
    println("$cityLengthWithDefault")
    println("---5---")
    //5
    println(processScore(85.5))
    println(processScore(null))

}
    fun processScore(score: Double?): String {
        val finalScore = score ?: 0.0
        return "Score: $finalScore"
    }