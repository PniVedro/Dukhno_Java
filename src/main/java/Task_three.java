public class Task_three {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i< a.length;i++){
            int temp = a[i];
            if (temp % 2 == 0)
                System.out.println(temp);
        }
    }
}
