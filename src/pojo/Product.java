package pojo;

public class Product {
    String ProductName;
    double price;
    int StockNumber;
    double originalPrice;
    double discount;
    String category;

    public Product() {

    }

    public Product(String category, String productName, int stockNumber, double Originalprice, double discount, double price) {
        super();
        this.category = category;
        this.ProductName = productName;
        StockNumber = stockNumber;
        this.originalPrice = Originalprice;
        this.discount = discount;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getStockNumber() {
        return StockNumber;
    }

    public void setStockNumber(int stockNumber) {
        StockNumber = stockNumber;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "category=" + category + ", ProductName=" + ProductName + ", StockNumber=" + StockNumber
                + ", originalPrice=" + originalPrice + ", discount=" + discount + ", price=" + price;
    }


}
