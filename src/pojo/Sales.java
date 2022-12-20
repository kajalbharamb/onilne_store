package pojo;

public class Sales {
    String customerName;
    String productName;

    int noOfBuy;

    public Sales() {

    }

    public Sales(String customerName, String productName, int noOfBuy) {
        this.customerName = customerName;
        this.productName = productName;
        this.noOfBuy = noOfBuy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public int getNoOfBuy() {
        return noOfBuy;
    }

    public void setNoOfBuy(int noOfBuy) {
        this.noOfBuy = noOfBuy;
    }

    @Override
    public String toString() {
        return "SalesPojo{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", noOfBuy=" + noOfBuy +
                '}';
    }
}
