package Task;

public class MaximumEleArray {
    public static void main(String[] args) {
        int arr[]={10,30,7,78,87,48};
        int size=arr.length;
        System.out.println(size);

        int maxxi;
        int j=0;
        maxxi=arr[j];
        for ( j=0;j<size;j++){
           if(arr[j]>maxxi){
               maxxi=arr[j];
           }
        }
        System.out.println("Maxii is "+maxxi);
    }
}
