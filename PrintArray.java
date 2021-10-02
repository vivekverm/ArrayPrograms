//import java.util.Scanner;
public class Array
{
    int arr[][];
    int i,j;
    public void array()
    {
        arr = new int[][]{{2,3,4},{5,6,7},{1,2,9}};
        for ( i = 0; i < arr.length; i++)
        {
            for ( j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array ojb=new Array();
        ojb.array();
    }
}
