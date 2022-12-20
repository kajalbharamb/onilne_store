package registerLogIn;

import pojo.User;
import productDetails.AddProduct;
import productDetails.BuyProduct;

import java.util.Scanner;

public class Register {
    static int flag = 0;

    public void user() {
        User r = new User();
        Scanner s = new Scanner(System.in);

        System.out.println("----Start Registration----");
        System.out.print("Enter Email => ");
        String mail = s.nextLine();
        r.setemail(mail);

        System.out.print("Enter Username => ");
        String name = s.nextLine();
        r.setUsername(name);

        System.out.print("Enter Password => ");
        String pass = s.nextLine();
        r.setPassword(pass);

        System.out.println("Registration succesfull.......");
        System.out.println();
        System.out.println();
        System.out.println("***Now user will be able to login***");

        System.out.print("Enter your Username =>");
        String username = s.nextLine();

        System.out.print("Enter your Password =>");
        String password = s.nextLine();

        if (username.equals(r.getUsername()) && password.equals(r.getPassword())) {
            flag = 1;
            System.out.println("User logged in Succesfully   " + r.getUsername());
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public void admin() {
        String adminusername = "Ksolves";
        String adminpassword = "kajal@2001";


        Scanner s = new Scanner(System.in);

        System.out.println("***login as  a admin***");
        System.out.print("Enter your Username =>");
        String username = s.nextLine();

        System.out.print("Enter your Password =>");
        String password = s.nextLine();


        if (username.equals(adminusername) && password.equals(adminpassword)) {
            flag = 1;
            System.out.println("User logged in Succesfully ");

        } else {
            System.out.println("Invalid username or password");
        }
    }


    public static void main(String[] args) {
        Register registerobj = new Register();
        Scanner s = new Scanner(System.in);

        System.out.println("Press 0 for the role of admin");
        System.out.println("Press 1 for the role of user");
        int role = s.nextInt();
        if (role == 1) {
            registerobj.user();
        }
        if (role == 0) {
            registerobj.admin();
        }
        if (role == 1) {
            if (flag == 1) {
                AddProduct.ProductDetail();
                while (true) {
                    System.out.println();
                    System.out.println("Press 1 for list of Products.........");
                    System.out.println("Press 2 for Category wise product list.........");
                    System.out.println("Press 3 to buy.......");
                    System.out.println("Press 4 for product purchase list.......");


                    int input = s.nextInt();
                    if (input == 1) {
                        AddProduct.print();
                    }
                    if (input == 2) {
                        AddProduct.printCategory();
                    }
                    if (input == 3) {
                        BuyProduct.buy();
                    }
                    if (input == 4) {
                        BuyProduct.printPurchaseList();
                    }

                    System.out.println();
                    System.out.println();

                }
            }
        }

        if (role == 0) {
            if (flag == 1) {
                System.out.println();
                while (true) {
                    System.out.println();
                    System.out.println();
                    System.out.println("Press 1 for list of Products........");
                    System.out.println("Press 2 for Category wise product list........");
                    System.out.println("Press 3 to add product in list.......");
                    System.out.println("Press 4 to see product purchase list...... ");
                    int input = s.nextInt();
                    AddProduct obj = new AddProduct();
                    if (input == 1) {
                        AddProduct.ProductDetail();
                        AddProduct.print();
                    }
                    if (input == 2) {
                        obj.printCategory();
                    }
                    if (input == 3) {
                        AddProduct.addProduct();
                    }
                    if (input == 4) {
                        BuyProduct.printPurchaseList();
                    }
                }
            }
        }
    }
}
