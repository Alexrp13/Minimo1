//Fem que la classe sigui abstracta per a que pugui accedir//
//al ProductManager sense problemes//
public abstract class ProductManagerImpl implements ProductManager {
    private static ProductManager instance;
    protected List<Product> products;
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);

    private ProductManagerImpl() {
        this.products = new LinkedList<>();
    }


}
