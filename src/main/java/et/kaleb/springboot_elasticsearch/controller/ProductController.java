package et.kaleb.springboot_elasticsearch.controller;

import et.kaleb.springboot_elasticsearch.entity.Product;
import et.kaleb.springboot_elasticsearch.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/findAll")
    public Iterable<Product> findAll() {
        return productService.getProducts();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.insertProducts(product);
    }
}
