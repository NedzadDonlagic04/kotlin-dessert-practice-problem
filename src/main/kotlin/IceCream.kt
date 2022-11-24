// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Cake i IceCream koje nasljeduju Dessert. Kolac, uz
sve atribute iz klase Dessert ima i atribute containsGluten (boolean)
i cakeType (String, moze biti "birthday", "wedding", "regular" i sl.).
Sladoled ima dodatne atribute flavour (String) i color (String).
Napravite get i set metoda za svaki atribut, kao i metodu toString koja
vraca sve sto vraca i metoda toString iz klase Dessert, a dodatno jos i
atribute za izvedenu klasu. Napisite javnu metodu getDessertType u svakoj
od izvedenih klasa, koja ce za program s kojim cete testirati sve zadane
funkcionalnosti.
 */

class IceCream(private var name: String, private var weight: Double, private var calories: Int, private var flavour: String, private var color: String)
    : Dessert(name, weight, calories)  {
    fun setFlavour1(flavour: String): Unit {
        this.flavour = flavour
    }

    fun getFlavour1(): String = this.flavour

    fun setColor1(color: String): Unit {
        this.color = color
    }

    fun getColor1(): String = this.color

    override fun getDessertType() = "ice cream"

    override fun toString(): String = super.toString() + "\nFlavour: ${this.flavour}\nColor: ${this.color}"
}