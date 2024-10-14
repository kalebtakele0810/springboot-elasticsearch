package et.kaleb.springboot_elasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "products")
public class Product {
    private int id;

    private String name;

    private String description;

    private int quantity;

    private double price;
}
