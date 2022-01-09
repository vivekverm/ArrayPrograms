// Second largest marks of the student in class

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Stu {
    private String S_Name;
    private int Rollno;
    private int Marks;

    Stu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        S_Name = sc.next();
        System.out.println("Enter the rollno");
        Rollno = sc.nextInt();
        System.out.println("Enter the Marks");
        Marks = sc.nextInt();
    }

    public static void main(String[] args)
    {
        Stu arr[] = new Stu[3];

        int pos = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Stu();
        }
        for (int i = 0; i < arr.length; i++)
        {
            int max = arr[0].Marks;
            if (arr[i].Marks > max)
            {
                max = arr[i].Marks;
                pos = i;
            }
        }
        System.out.println("Maximum marks of "+arr[pos].S_Name+" is "+arr[pos].Marks);
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j =i+1; j < arr.length ; j++)
            {
                if(arr[i].Marks<arr[j].Marks)
                {
                    int temp;
                    temp=arr[i].Marks;
                    arr[i].Marks=arr[j].Marks;
                    arr[j].Marks=temp;
                }
            }
        }
        System.out.println("Second largest Mark of "+arr[1].S_Name+" is "+arr[1].Marks);
    }
}
