
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaji
 */
public class SellingPrice {//create public class method of SellingPrice

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//create the main method
        Scanner in = new Scanner(System.in);//enable scanner input to ask the user
        
        int year = 1;//initialize year to 1
        int salesrevenue = 0;//initialize salesrevenue to 0
        int products = 0;//initialize products to 0
        int revenue = 0;//initialize revenue to 0
        int totalsalesrevenue = 0;//initialize totalsalesrevenue to 0
        int totalproducts = 0;//initialize totalproducts to 0
        
        System.out.printf("%d. year sales revenue? (-1 to quit): ", year);
        //print a statement to ask the user to enter sales revenue
        revenue = in.nextInt();//enable the input for revenue to ask the user 
        
        while(revenue != -1){//use while loop to iterate revenue unless to stop by entering -1
            
            System.out.printf("%d. year number of products sold?: ", year);
            //print the statement to ask the user to enter the products
            products = in.nextInt();//enable the input for products to ask the user
            
            double sellingprice = revenue/products;//calculate price and use double
            
            System.out.printf("%d. year product selling price is: %.2f\n", year, sellingprice);
            //print the statement to show the selling price
            
            totalsalesrevenue += revenue;//calculate totalsalesrevenue with revenue
            totalproducts += products;//calculate totalproducts with products
            year++;//iterate year
            
            System.out.printf("%d. year sales revenue? (-1 to quit): ", year);
            //print the same statement after year iteration
            revenue = in.nextInt();//enable the input for revenue to ask the user
        }
        
        year -= 1;//subtract year by 1 before exiting the loop
        double combinedsellingprice = totalsalesrevenue/totalproducts;
        //calculate combinedsellingprice with total sales revenue anf total products
        
        System.out.printf("%d-year total sales revenue is: %d", year, totalsalesrevenue);
        //print the statement to display total sales revenue
        System.out.printf("\n%d-year total number of products sold is: %d", year, totalproducts);
        //print the statement to display total products
        System.out.printf("\n%d-year combined selling price is: %.2f\n", year, combinedsellingprice);
        //print the statement to display combined selling price
    }
    
}
