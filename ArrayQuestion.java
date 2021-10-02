import java.util.Scanner;
public class Neeraj {
        int rollno;
        String name;
        int marks;
        static String U_name;

    public Neeraj() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the RollNo");
        rollno = s.nextInt();
        System.out.println("Enter the name");
        name = s.next();
        System.out.println("enter the marks");
        marks = s.nextInt();
    }

    public static void main(String[] args) {

        Neeraj arr[]= new Neeraj[2];
        for(int i=0;i<arr.length;i++) {
            arr[i] = new Neeraj();
        }
            int x;
        int max=0;
       int m=0;
        for (x=0;x< arr.length;x++){
            if(arr[x].marks>max){
                max=arr[x].marks;
                m=x;
            }



        }
        String g=arr[m].name;

        System.out.println("Highest marks ");
        System.out.println(max);
        System.out.println("Topper");
        System.out.println(g);



        }}
