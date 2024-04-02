package emir.yilmaz.intro.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="product_name",nullable = false)
    private String productName;

    @Column(name = "product_price",nullable = false)
    private String productPrice;

    @Column(name = "product_quantity",nullable = false)
    private String productQuantity;
}
