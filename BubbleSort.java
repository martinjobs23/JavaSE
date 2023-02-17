public class BubbleSort {
    public static void main(String args[]){
        int[] arr = new int[]{10,20,30,72,56,41,22,65,77,16};
        int i = 0;
//        for (i = 0;i < 10;i++){
//            int j = 0;
//            int flag = 0;
//            for (j = 0;j < 10-i-1;j++){
//                if(arr[j]<arr[j+1]){
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                    flag = 1;
//                }
//            }
//            if (flag == 0) break;
//        }


//        for(i = 0;i < 10;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for (i = 1; i < arr.length;i++){
//            int j = i - 1;
//            int tmp = arr[i];
//            while(tmp < arr[j] && j >= 0){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = tmp;
//
//        }


        for (i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int min_dex = i;
            for (int j = i;j < arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_dex = j;
                }
            }
            if (min_dex != i){
                arr[min_dex] = arr[i];
                arr[i] = min;
            }
        }

        for(i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
