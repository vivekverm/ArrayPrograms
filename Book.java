//Create class name Book of three instances variable. Print Expensive Book name and cheapest Book name

import java.util.Scanner;

public class Book
{
    int B_Id;
    String B_name;
    int B_Page;
    double Price;
    Book()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Book ID");
        B_Id= sc.nextInt();
        System.out.println("Enter the Book name ");
        B_name=sc.next();
        System.out.println("Number of Page in the Book");
        B_Page=sc.nextInt();
        System.out.println("Enter the Price of the Book");
        Price=sc.nextDouble();
    }
    public static void main(String[] args)
    {
        int pos = 0,obj=0;
        Book arr[]=new Book[4];
        for (var i = 0; i <arr.length ; i++)
        {
            arr[i]=new Book();
        }
        double max=arr[0].Price;
        double min=arr[0].Price;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].Price>max)
            {
                max=arr[i].Price;
                pos=i;
            }
           if(arr[i].Price<min)
           {
               min=arr[i].Price;
               obj=i;

           }
        }
        System.out.println("Expensive Book:------ ");
        System.out.println("Book ID: "+arr[pos].B_Id);
        System.out.println("Book name: "+arr[pos].B_name);
        System.out.println("No. of pages in the Book: "+arr[pos].B_Page);
        System.out.println("Price of Book: "+arr[pos].Price);
        System.out.println("_____________---------___________");
        System.out.println("Cheapest Book:------- ");
        System.out.println("Book ID: "+arr[obj].B_Id);
        System.out.println("Name of the Book: "+arr[obj].B_name);
        System.out.println("Number of the Page in the book: "+arr[obj].B_Page);
        System.out.println("Price of the book: "+arr[obj].Price);
    }

}
