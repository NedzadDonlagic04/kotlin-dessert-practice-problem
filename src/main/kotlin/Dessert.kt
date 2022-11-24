// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu Dessert koja ima sljedece privatne atribute: name(String),
weight(double) i calories(int). Dodajte klasi konstruktor koji prima kao
parametre vrijednosti za sva 3 atributa. Napravite get i set metode za svaki
atribut, te nadjacajte metodu toString. Napisite i javnu metodu getDessertType
koja nema argumenata a vraca string "dessert".
 */

open class Dessert(private var name: String, private var weight: Double, private var calories: Int) {
    fun setName1(name: String): Unit {
        this.name = name
    }

    fun getName1(): String = this.name

    fun setWeight1(weight: Double): Unit {
        this.weight = weight
    }

    fun getWeight1(): Double = this.weight

    fun setCalories1(calories: Int): Unit {
        this.calories = calories
    }

    fun getCalories1(): Int = this.calories

    open fun getDessertType(): String = "dessert"

    override fun toString(): String = "Name: ${this.name}\nWeight: ${this.weight} kg\nCalories: ${this.calories} kcal"
}