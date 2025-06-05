package dto;

public class ProductDto {
    private String productid;
    private String productname;
    private String productprice;
    private String quantity;
    private String category;

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductid() {
        return productid;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productid='" + productid + '\'' +
                ", productname='" + productname + '\'' +
                ", productprice='" + productprice + '\'' +
                ", quantity='" + quantity + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
