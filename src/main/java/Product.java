

public class Product {
    String nom;
    int ventas;
    double preu;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }

    @Override
    public String toString() {
        return "Productes{" +
                "nom='" + nom + '\'' +
                ", codi=" + ventas +
                ", preu=" + preu +
                '}';
    }
}
