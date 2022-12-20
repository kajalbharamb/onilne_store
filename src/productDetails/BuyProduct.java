package productDetails;

import pojo.Sales;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyProduct {
    static ArrayList<Sales> saleslist = new ArrayList<>();

    public static void buy() {
        Scanner s = new Scanner(System.in);

        boolean available = false;
        System.out.print("Enter you name => ");
        String customername = s.nextLine();
        System.out.print("Enter the product which you wants to buy => ");
        String buyproduct = s.nextLine();
        System.out.print("Enter the no of items you wants to buy => ");
        int stock = s.nextInt();


        for (int i = 0; i < AddProduct.list.size(); i++) {

            boolean n = AddProduct.list.get(i).getProductName().equals(buyproduct);

            if (n == true) {
                available = true;
                saleslist.add(new Sales(customername, buyproduct, stock));
                AddProduct.list.get(i).setStockNumber(AddProduct.list.get(i).getStockNumber() - stock);

            }
            if (n == false) {
                continue;
            }
        }

        if (available == true) {
            System.out.println("Product is added to cart");
            System.out.println();
            AddProduct.print();
        }

        if (available == false) {
            System.out.println(" Product not found........");
        }


        /*for(int i=0;i<saleslist.size();i++) {
            System.out.println("PRODUCT NAME = "+buyproduct);
            boolean check = saleslist.get(i).getProductName().equals(buyproduct) && saleslist.get(i).getCustomerName().equals(customername);

            if (check == true) {
                saleslist.get(i).setNoOfBuy(saleslist.get(i).getNoOfBuy()+ 1);
            }
            if (check == false) {
                saleslist.add(new SalesPojo(buyproduct, customername,1));
            }
        }*/
        printPurchaseList();
    }


    public static void printPurchaseList() {
        System.out.println("PURCHASED PRODUCT or ORDERED ITEMS");
        for (int i = 0; i < saleslist.size(); i++) {
            System.out.println(saleslist.get(i));
        }
    }
}



