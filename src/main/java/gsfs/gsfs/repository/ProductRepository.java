package gsfs.gsfs.repository;

import gsfs.gsfs.mapper.ProductMapper;
import gsfs.gsfs.model.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductRepository {
    @Insert("INSERT INTO products(name, price, description, amount) " +
            "VALUES(#{name}, #{price}, #{description}, #{amount})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Product product);

    @Select("SELECT * FROM products WHERE id = #{id}")
    Product findById(Long id);

    @Update("UPDATE products SET name=#{name}, price=#{price}, description=#{description}, amount=#{amount} WHERE id=#{id}")
    void update(Product product);

    @Delete("DELETE FROM products WHERE id=#{id}")
    void delete(Long id);

    @Select("SELECT * FROM products")
    List<Product> findAll();
}
