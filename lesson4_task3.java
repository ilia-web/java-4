public class lesson4_task3 {
    private static int min(int[] a){
        int res = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i]<res)
                res = a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 10};
        System.out.println(min(arr));
    }
}
