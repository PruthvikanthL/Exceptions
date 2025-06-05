package service;

import dto.ProductDto;
import exceptions.*;
import repository.ProductRepository;
import repository.ProductRepositoryImplementation;

import java.util.Arrays;

public class ProductServiceImplementation implements ProductService{
    ProductRepository productRepository=new ProductRepositoryImplementation();
    @Override
    public boolean save(ProductDto productDto) {
        int productid = Integer.parseInt(productDto.getProductid());
        if(productid<=0){
            throw new InvalidProductIdException("Product ID must be Positive");
        }
        if(productDto.getProductname()==null||productDto.getProductname().length()<3||productDto.getProductname()==""){
            throw new InvalidProductNameException("Product name must be at least 3 characters");
        }
        int productprice=Integer.parseInt(productDto.getProductprice());
        if(productprice<=0||productprice>10000)
        {
            throw new InvalidPriceException("Price must be between 0 and 10,000");
        }
        int quantity=Integer.parseInt(productDto.getQuantity());
        if(quantity<0||quantity>10000){
            throw new InvalidQuantityException("Quantity must be between 0 and 1000");
        }
        if (!Arrays.asList("Electronics", "Clothing", "Books", "Home").contains(productDto.getCategory())) {
            throw new InvalidCategoryException("Invalid category.");
        }
        System.out.println("Product Data is valid");
        return productRepository.save(productDto);
    }
}
