package emir.yilmaz.intro.service.impl;

import emir.yilmaz.intro.exception.ResourceNotFoundException;
import emir.yilmaz.intro.model.Product;
import emir.yilmaz.intro.repository.ProductRepository;
import emir.yilmaz.intro.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        super();
        this.productRepository=productRepository;
    }
    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
    }

    @Override
    public Product updateProduct(Product product, long id) {
        Product existingProduct=productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));

        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setProductQuantity(product.getProductQuantity());

        productRepository.save(existingProduct);

        return  existingProduct;
    }

    @Override
    public void deleteProduct(long id) {

        productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
        productRepository.deleteById(id);

    }
}
