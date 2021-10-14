public class lesson4_task1 {
    private static int countAvarage(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum+= a[i];
        }
        int avarage = sum / a.length;
        return avarage;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 15, 17, 18, 1};
        int result = countAvarage(arr);
        System.out.println(result);
    }
}
