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

class Cake(private var name: String, private var weight: Double, private var calories: Int, private var containsGluten: Boolean, private var cakeType: String)
    : Dessert(name, weight, calories) {
    fun setContainsGluten1(containsGluten: Boolean): Unit {
        this.containsGluten = containsGluten
    }

    fun getContainsGluten1(): Boolean = this.containsGluten

    fun setCakeType1(cakeType: String): Unit {
        this.cakeType = cakeType
    }

    override fun getDessertType() = "cake"

    override fun toString(): String = super.toString() + "\nContains Gluten: ${this.containsGluten}\nCake Type: ${this.cakeType}"
}