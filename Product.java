package collectionBasic;
import java.io.*;
import java.lang.*;
import java.util.*;

class Product {
int pnum;
String pname;
int price;

public Product(int pnum, String pname, int price)
{
this.pnum = pnum;
this.pname = pname;
this.price = price;
}

public String toString()
{
return this.pnum+" "+this.pname+" "+this.price;
}
}

class Sortbynum implements Comparator<Product>
{
public int compare(Product a, Product b){
return a.pnum - b.pnum;
}
}

class Sortbyname implements Comparator<Product>
{
public int compare(Product a, Product b){
return a.pname.compareTo(b.pname);
}
}

class Sortbyprice implements Comparator<Product>
{
public int compare(Product a, Product b){
return a.price - b.price;
}
}

class Product_Details
{
public static void main(String[] args) {
List<Product> pr = new ArrayList<Product>();

pr.add(new Product(405,"TV",30000));
pr.add(new Product(449,"AC",65000));
pr.add(new Product(120,"Washing Machine",45000));
pr.add(new Product(101,"FAN",2000));

System.out.println("Unsorted ");
for (int i=0;i<pr.size() ;i++ ) {
System.out.println(pr.get(i));
}

Collections.sort(pr, new Sortbynum());
System.out.println("\n Sorted by Product Number ");

for (int i=0;i<pr.size() ;i++ ) {
System.out.println(pr.get(i));
}

Collections.sort(pr, new Sortbyname());
System.out.println("\n Sorted by Product Name ");

for (int i=0;i<pr.size() ;i++ ) {
System.out.println(pr.get(i));
}

Collections.sort(pr, new Sortbyprice());
System.out.println("\n Sorted by Product Price ");

for (int i=0;i<pr.size() ;i++ ) {
System.out.println(pr.get(i));
}
}
}
