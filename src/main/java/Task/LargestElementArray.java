package Task;

public class LargestElementArray {
    public static void main(String[] args) {
        int arr[]={1,5,2,8,3};

        int largest=arr[0];

        for (int num:arr){
            if (num>largest){
                largest=num;
            }
        }

        System.out.println(largest);
    }
}
