import java.util.Scanner;
public class Search {
    int[] a = {90,10, 20, 30, 40, 50};
    static int maxi;
    boolean flag=false;
    public void search()
    {
        for (var i = 0; i < a.length; i++)
        {
            if (a[i] == maxi)
            {
                System.out.println("Element is found");
                flag=true;
                break;
            }
        }
        if(flag==false) 
        {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element which you want to search");
        maxi=s.nextInt();
        Search obj=new Search();
        obj.search();

    }

}
