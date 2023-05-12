

class Generique {

  /**
   * Mise en oeuvre de la généricité
   */

  public static void main(String[] agrs) {

    Box<String> el = new Box<String>("Max");
    System.out.println("contenu : " + el.getElement());



  }
}

// petit classe générique
class Box<T> {

  private T element;

  public Box(T element) {
    this.setValue(element);
  }

  public void setValue(T elem) {
    if (elem == null) {
      throw new NullPointerException();
    }
    this.element = elem;
  }

  public T getElement() {
    return this.element;
  }

}

  
}