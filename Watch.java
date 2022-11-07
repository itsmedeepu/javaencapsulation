package com.raj.Encapsulation;
import java.util.Scanner;
 class WatchDetails {
	private String name;
	private double price;
	private String color;
	
  public WatchDetails(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public void DisplayWatch() {
			System.out.println("WATCH NAME: "+name);
			System.out.println("WATCH PRICE: "+price);
			System.out.println("WATCH COLOR: "+color);
		}
		  
}
 public class Watch{
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WatchDetails w=null;
		boolean flag=true;
		 while(flag) {
			 
			 System.out.println("Enter options \n 1.Add watch \n 2.Display Watch \n 3.Display Price \n 4.Modify Color \n 5.Exit ");
			 int op = sc.nextInt();
			 switch(op) {
			 case 1:{
				 System.out.println("Enter Watch Name");
				 String name =sc.next();
				 System.out.println("Enter Watch Price");
				 Double price =sc.nextDouble();
				 System.out.println("Enter watch color");
				 String color=sc.next();
				w= new WatchDetails(name,price,color);
				System.out.println("Watch added sucessfully");
				 System.out.println("*******************");	 
			 }
			 break;
			 case 2:{
				 if(w==null) {
					 System.out.println("No watches found");
					 System.out.println("*************");
				 }
				 else {
					 w.DisplayWatch();
					 System.out.println("*************");
				 } 
			 }break;
			 case 3:{
				 
				 if(w==null) {
					 System.out.println("No watches found");
					 System.out.println("*************"); 
				 }
				 else {
				 System.out.println(w.getPrice());
					 System.out.println("*************");	 
				 }
			 }break;
			 case 4:{
				 if(w==null) {
					 System.out.println("No watches found");
					 System.out.println("*************");
					 
				 }
				 else {
					 System.out.println("Enter color");
					 String color=sc.next();
					 System.out.println("previous color");
					 System.out.println(w.getColor());
					 w.setColor(color);
					 System.out.println("modified color");
					 System.out.println(w.getColor());
					 System.out.println("*************");
				 } 
			 }break;
			 case 5:{
				 System.out.println("Thank you visit us again");
				 flag=false;
			 }break;
			 
			 default:
				 System.out.println("Enter correct options");
			 } 
		 }
	}
	 
 }
