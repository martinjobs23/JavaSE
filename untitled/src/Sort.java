public class Sort {
    public static void main(String args[]){
        int[] arr = new int[]{10,20,30,72,56,41,22,65,77,16};
        int i = 0;
//        for (i = 0;i < 10;i++){   //冒泡排序
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


//        for(i = 0;i < 10;i++){    //插入排序
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


//        for (i = 0; i < arr.length - 1; i++){   //  选择排序
//            int min = arr[i];
//            int min_dex = i;
//            for (int j = i;j < arr.length;j++){
//                if(arr[j] < min){
//                    min = arr[j];
//                    min_dex = j;
//                }
//            }
//            if (min_dex != i){
//                arr[min_dex] = arr[i];
//                arr[i] = min;
//            }
//        }
//
        quickSort(arr,0, arr.length-1);
        for(i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr,int start, int end){ //快速排序
        if(start>=end)return;      //此处为递归结束条件
        int left = start;
        int right = end;
        int base = arr[start];
        while (left < right){
            while(left < right && base <= arr[right]){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && base >= arr[left]){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = base;

        quickSort(arr,start,right-1);
        quickSort(arr,right+1,end);
    }
}
