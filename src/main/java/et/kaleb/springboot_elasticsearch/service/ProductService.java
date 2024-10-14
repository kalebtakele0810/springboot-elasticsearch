package et.kaleb.springboot_elasticsearch.service;

import et.kaleb.springboot_elasticsearch.entity.Product;
import et.kaleb.springboot_elasticsearch.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product insertProducts(Product product) {
        return productRepo.save(product);
    }

    public Product updateProducts(Product product, int id) {
        Product pr = productRepo.findById(id).get();
        pr.setPrice(product.getPrice());
        pr.setDescription(product.getDescription());
        pr.setQuantity(product.getQuantity());
        pr.setName(product.getName());
        return productRepo.save(pr);
    }

    public void deleteProducts(int id) {
        productRepo.deleteById(id);
    }
}
