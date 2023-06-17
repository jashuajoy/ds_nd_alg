public class Bubble{
    public static void main(String[] args) {
        int[] arr = {9, 8, 4, 7, 5, 9, 1 , 0, 5, 3, 2, 5};
        boolean swaps;
        for(int i=0; i<arr.length-1; i++){
            swaps = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = true;
                }
            }
            if(swaps == false){
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}