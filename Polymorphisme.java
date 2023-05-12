class Polymorphisme {

  public static void main(String[] agrs) {

    VehiculeTerrestre vehiculeNormale = new VehiculeTerrestre();
    Voiture superVehicule = new Voiture("lamborghini", 2);

    int distance = 100;

    vehiculeNormale.getAvancer(distance);
    superVehicule.getAvancer(distance);

    boolean test = vehiculeNormale.equals(superVehicule);

    System.out.println("Est-ce que ces 2 vehicules sont indentique : " + test);

  }
}

class Voiture extends VehiculeTerrestre {

  private String marque;
  private int nbPorte;

  public Voiture(String marque, int nbPorte) {
    this.setMarque(marque);
    this.setNbPorte(nbPorte);

  }

  @Override
  public void getAvancer(int distance) {
    System.out.println("J'avance de " + distance +
        " année lumière , normale avec ma "
        + this.marque);
  }

  // setter marque du vehicule
  public void setMarque(String marque) {

    if (marque == null) {
      throw new NullPointerException();
    }

    if (marque.isEmpty()) {
      throw new RuntimeException("Il n'y pas de noms !!!");
    }

    this.marque = marque;

  }

  // setter nombre de port
  public void setNbPorte(int nbPorte) {

    if (nbPorte <= 0) {
      throw new RuntimeException("Il n'y pas de porte !!!");
    }

    if (nbPorte > 5) {
      throw new RuntimeException(" Plus de 5 porte est impossible !!!");
    }

    this.nbPorte = nbPorte;

  }

  // les getter
  public String getMarque() {
    return this.marque;
  }

  public int getNbPorte() {
    return this.nbPorte;
  }

}

class VehiculeTerrestre {

  void getAvancer(int distance) {
    System.out.println("J'avance de " + distance + " km ");
  }

  void getReculer(int distance) {
    System.out.println("je recule de " + distance + " km ");
  }

}

class VehiculeVolant {

  void getDecoler(int distance) {
    System.out.println("Je décole");
  }

  void getAtterir(int distance) {
    System.out.println("J'attérir");
  }

}