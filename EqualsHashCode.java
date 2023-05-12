import java.util.Objects;

class EqualsHashCode {

  // run => java EqualsHashCode.java

  // voir
  // https://gayerie.dev/epsi-b3-java/langage_java/la_classe_object.html#la-methode-equals

  /**
   * La classe Object définit à la fois les méthodes equals() et hashCode()
   * equal compare les valeurs
   * l'opérateur == comparer les références.
   * 
   * NB : on entend que deux objets sont considérés comme égaux si leur contenu ou
   * leur
   * signification est le même, indépendamment de leur adresse mémoire.
   */

  public static void main(String[] agr) {
    Money income = new Money(55, "USD");
    Money expenses = new Money(55, "USD");
    boolean balanced = Objects.equals(income, expenses);

    System.out.println("Value is : " + balanced);
  }

  /**
   * La méthode hashCode() en Java retourne un entier (int) qui représente une
   * valeur de hachage (hash code) pour l'objet sur lequel elle est appelée
   */

}

class Money {
  public int amount;
  public String currencyCode;

  public Money(int amount, String currencyCode) {
    this.amount = amount;
    this.currencyCode = currencyCode;

  }

  @Override
  public boolean equals(Object ob) {

    // Vérifier si l'objet n'est pas null ou qu'il sont de la méme classe
    if (ob == null || getClass() != ob.getClass()) {
      return false;
    }

    // Si référence identique
    if (this == ob) {
      return true;
    }

    // Test le contenu de l'objet (les valeurs de ses attributs)
    Money money = (Money) ob;
    return this.amount == money.amount && Objects.equals(this.currencyCode, money.currencyCode);

  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

}