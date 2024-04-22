import java.util.Scanner;
class BinarySearch
{
    Scanner sc=new Scanner(System.in);
    int []getArray()
    {
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<a.length;i++)
        {
            
            a[i]=sc.nextInt();
        }
        return a;
    }
    int getSearchElement()
    {
        System.out.println("Enter the element you want to search : ");
        int s=sc.nextInt();
        return s;
    }
    int BinarySearch(int ar[],int searchElement)
    {
        int lowerBound=0;
        int upperBound=ar.length;
        while(lowerBound<=upperBound)
        {
            int middle=(lowerBound+upperBound)/2;
            if(ar[middle]==searchElement)
            {
                return middle;
            }
            else if(searchElement>ar[middle])
            {
                lowerBound=middle+1;
            }
            else{
                upperBound=middle-1;
            }
            
        }
        return -1;
    }
    

        

    
    public static void main(String []args)
    {
        BinarySearch b1=new BinarySearch();
        int a[]=b1.getArray();
        int ele=b1.getSearchElement();
        int ans=b1.BinarySearch(a,ele);
        System.out.println("Index of the element "+ele+" is "+ans);
    }

}
    