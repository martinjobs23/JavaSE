public class Search {
    public static void main(String args[]) {
        int[] arr = new int[]{10,16,20,22,30,41,56,65,72,77 };
        int i = search(arr,30);
        System.out.println(i);

    }
    public static int search(int[] arr,int num){
        int left = 0;
        int right = arr.length;
        int flag = -1;
        while(left <= right){
            if(num == arr[(left+right)/2]){
                flag = (left+right)/2;
                return flag;
            }else if(num < arr[(left+right)/2]){
                right = (left+right)/2-1;
            } else if (num > arr[(left+right)/2]) {
                left = (left+right)/2+1;
            }
        }
        return flag;
    }
}
