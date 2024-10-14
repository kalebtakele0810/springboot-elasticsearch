package et.kaleb.springboot_elasticsearch.repo;

import et.kaleb.springboot_elasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {

}
