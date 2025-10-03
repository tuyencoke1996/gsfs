package gsfs.gsfs.mapper;

import gsfs.gsfs.model.Product;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;
import gsfs.gsfs.model.Product;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
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
