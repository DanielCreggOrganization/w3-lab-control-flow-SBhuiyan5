package ie.atu.controlflow;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // Exit the loop when i is 4
            }
            System.out.println("Iteration: " + i);
        }
    }
}
