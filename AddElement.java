public class AddElement
{
    int arr[];
    int add=0;
    public void Add()
    {
        arr=new int[]{2,3,4,5,6,10};
        for(var i=0;i< arr.length;i++)
        {
            add=arr[i]+add;
        }
        System.out.println(add);
    }

    public static void main(String[] args) {
        AddElement obj=new AddElement();
        obj.Add();
    }
}
