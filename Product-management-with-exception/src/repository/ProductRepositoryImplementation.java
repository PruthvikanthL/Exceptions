package repository;

import dto.ProductDto;

public class ProductRepositoryImplementation implements ProductRepository{
    @Override
    public boolean save(ProductDto productDto) {
        return true;
    }
}
