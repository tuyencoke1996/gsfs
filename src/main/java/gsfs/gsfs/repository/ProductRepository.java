package gsfs.gsfs.repository;

import gsfs.gsfs.mapper.ProductMapper;
import gsfs.gsfs.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    private final ProductMapper productMapper;
    public ProductRepository(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public void save(Product product) {
        productMapper.insert(product);
    }

    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    public List<Product> findAll() {
        return productMapper.findAll();
    }

    public void update(Product product) {
        productMapper.update(product);
    }

    public void delete(Long id) {
        productMapper.delete(id);
    }
}
