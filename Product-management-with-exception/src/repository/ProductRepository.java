package repository;

import dto.ProductDto;

public interface ProductRepository {
    boolean save(ProductDto productDto);
}
