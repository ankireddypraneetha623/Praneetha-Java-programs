import java.util.Scanner;
public class Arrayoperations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int size=10;
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int choice;
        do{
            System.out.println("\nArray Operations");
            System.out.println("1.Display");
            System.out.println("2.Insert");
            System.out.println("3.Delete");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Array elements:");
                    for(int i=0;i<size;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter position "+(size+1)+" ");
                    int pos=sc.nextInt();
                    System.out.print("Enter value:");
                    int value=sc.nextInt();
                    if(pos<1||pos>size+1){
                        System.out.println("Invalid position");
                    }
                    else
                    {
                        for(int i=size;i>=pos;i--){
                            arr[i]=arr[i-1];
                        }
                        arr[pos-1]=value;
                        size++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;
                case 3:
                    System.out.print("Enter position "+(size+1)+" ");
                    pos=sc.nextInt();
                    if(pos<1||pos>size+1){
                        System.out.println("Invalid position");
                    }
                    else {
                        for (int i = pos - 1; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted successfully.");
                    }
                case 4:
                    System.out.println("Enter an element to search:");
                    value=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<size;i++){
                        if(arr[i]==value){
                            System.out.println("Element found at position "+(i+1));
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Element not found");
                    }
                    break;
                case 5:
                    for(int i=0;i<size-1;i++){
                        for(int j=i+1;j<size;j++){
                            if(arr[i]>arr[j]){
                                int temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                            }
                        }
                    }
                    System.out.println("Array sorted in ascending order");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice try again");
            }
        }while(choice!=6);
        sc.close();
    }
}

