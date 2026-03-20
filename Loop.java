public class Loop {
    public static void main(String[] args) {
// FOR LOOP
        System.out.println("\n=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // WHILE LOOP
        System.out.println("\n\n=== While Loop ===");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // DO-WHILE LOOP
        System.out.println("\n\n=== Do-While Loop ===");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);

        // FOR-EACH LOOP
        System.out.println("\n\n=== For-Each Loop ===");
        int arr[] = {10, 20, 30, 40};

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}