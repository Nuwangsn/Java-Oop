package OOP.Zoo;

public class Example {
    public static void main(String[] args) {
        int arr[] = {10,22,33,56,45};
        int tmp =0;
        for(int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                   tmp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=tmp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
