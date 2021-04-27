//Capa Integració / Dades
public interface ProductManager {

   public Product addProduct(String nom, int ventas, double preu);
   public Product addProduct(Product p);
   public Product getProduct(String nom);
   public List<Product> findAll();
   public void deleteProduct(String nom);
   public Product updateProduct(Product p);

   public int size();
}
