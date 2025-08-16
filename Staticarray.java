import java.util.Scanner;
public class Staticarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
       for(int i=0;i<numbers.length-1;i++){
           for(int j=0;j<numbers.length-1;j++){
               if(numbers[j]>numbers[j+1]){
                   int temp=numbers[j];
                   numbers[j]=numbers[j+1];
                   numbers[j+1]=temp;
               }
           }
        }
       System.out.println("Sorted array(Bubble sort):");
       for(int num:numbers){
           System.out.print(num+" ");
       }
       System.out.println();
       System.out.print("Enter number to search:");
       int key=sc.nextInt();
       int low=0,high=numbers.length-1;
       boolean found=false;
       while(low<=high){
           int mid=(low+high)/2;
           if(numbers[mid]==key){
               System.out.println("Element found at index:"+mid);
               found=true;
               break;
           }
           else if(numbers[mid]<key){
               low=mid+1;
           }
           else{
               high=mid-1;
           }
       }
       if(!found){
           System.out.println("Element not found in the array");
       }
       System.out.println("Enter a number to search (linear):");
       int key2=sc.nextInt();
       boolean foundLinear=false;
       for(int i=0;i<numbers.length;i++){
           if(numbers[i]==key2){
               System.out.println("Linear Search:Element found at index:"+i);
               foundLinear=true;
               break;
           }
       }
       if(!foundLinear){
           System.out.println("Linear search element not found");
       }
       sc.close();
    }
}
