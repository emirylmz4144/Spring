package emir.yilmaz.intro.service;

import emir.yilmaz.intro.model.Product;

import java.util.List;

public interface ProductService {
    //Crud Operations interface methods
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
    Product updateProduct(Product product,long id);
    void deleteProduct(long id);
}
