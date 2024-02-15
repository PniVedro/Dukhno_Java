public class Task_3 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int temp : arr) {
            if (temp % 2 == 0)
                System.out.println(temp);
        }
    }
}
