public class lesson4_task2 {
    private static int findIndex(int[] a, int toFind){
        for (int i = 0; i < a.length; i ++){
            if (a[i] == toFind){
                System.out.print("ვიპოვე " );
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 14, 15, 16, 17};
        int res = findIndex(arr, 17);
        System.out.println(res);
    }
}
