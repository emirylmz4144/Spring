package emir.yilmaz.intro.controller;

import emir.yilmaz.intro.model.Product;
import emir.yilmaz.intro.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;











@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        super();
        this.productService=productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        return  new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);//201
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId){
        return new ResponseEntity<Product>(productService.getProductById(productId),HttpStatus.OK);//200
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") long id,@RequestBody Product product){
        return  new ResponseEntity<Product>(productService.updateProduct(product,id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") long id){
        productService.deleteProduct(id);

        return new ResponseEntity<String>("Product delete succesfully... !",HttpStatus.OK);
    }
}
