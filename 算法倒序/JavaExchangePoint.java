public class JavaExchangePoint {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8, 5, 3, 2, 9, 0, 3,};
        System.out.println("颠倒排序前的数组队列为");
        for (int num : arr) {
            System.out.print(num + " ");

        }
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;


            }
        }

        System.out.println();
        System.out.println("颠倒排序后的数组队列为");
        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}
