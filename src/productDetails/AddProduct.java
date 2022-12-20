package productDetails;

import pojo.Product;

import java.util.*;

public class AddProduct {

       static List<Product> list = new ArrayList<Product>();
       Scanner s = new Scanner(System.in);

       public static void ProductDetail() {

              list.add(new Product("Electronics", "mobile", 6, 20000, 15, 17000));
              list.add(new Product("fashion", "Shirts", 3, 450, 5, 429));
              list.add(new Product("Electronics", "Vivo Y15", 6, 15000, 10, 13500));
              list.add(new Product("Footwear", "Boots", 8, 560, 10, 504));
              list.add(new Product("Electronics", "NeckBands", 3, 2000, 20, 1600));
              list.add(new Product("Sports", "adidas Shoes", 9, 2500, 15, 2215));
              list.add(new Product("Electronics", "Monitor", 4, 2400, 25, 1800));
              list.add(new Product("Electronics", "Fastrack Watch", 23, 2500, 30, 1750));
       }

       public static void print() {
              int len = list.size();
              for (int i = 0; i < len; i++) {
                     System.out.println(list.get(i));
              }
       }

       public static void addProduct() {
              Scanner s = new Scanner(System.in);

              System.out.print("enter category =>");
              String cat = s.nextLine();
              System.out.print("enter productname =>");
              String name = s.nextLine();
              System.out.print("enter noInStocks =>");
              int stockAvailable = s.nextInt();
              System.out.print("enter originalPrice =>");
              double price = s.nextDouble();
              System.out.print("enter discount => ");
              double discount = s.nextDouble();
              System.out.print("enter sellingPrice =>");
              double sellingPrice = s.nextDouble();


              for (int i = 0; i < list.size(); i++) {
                     boolean a = list.get(i).getProductName().equals(name);
                     if (a == true) {
                            list.get(i).setStockNumber(list.get(i).getStockNumber() + stockAvailable);
                            break;
                     }
              }

              list.add(new Product(cat, name, stockAvailable, price, discount, sellingPrice));
              ProductDetail();
              print();

       }

       public static void printCategory() {
              Scanner s = new Scanner(System.in);
              System.out.print("Enter the Category => ");
              String input = s.nextLine();

              for (int i = 0; i < list.size(); i++) {
                     boolean n = list.get(i).getCategory().equals(input);
                     if (n == true) {
                            System.out.println(list.get(i));
                     }
              }
       }
}





