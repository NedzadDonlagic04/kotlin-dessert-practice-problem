fun main(args: Array<String>) {
    val dessert = Dessert("Apple Pie", 1.0, 2000)
    val cake = Cake("Fruitcake", 0.2, 1000, true, "regular")
    val iceCream = IceCream("Banana Boat", 0.5, 1500, "Chocolate, Banana, Vanilla", "yellowish brown")
    // ^ Making the instances of the classes to test the results

    println(dessert.toString())
    println(dessert.getDessertType())
    // ^ Testing the dessert class in practice

    println(cake.toString())
    println(cake.getDessertType())
    // ^ Testing the cake class in practice

    println(iceCream.toString())
    println(iceCream.getDessertType())
    // ^ Testing the ice cream class in practice
}