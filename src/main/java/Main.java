import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrainingTracker trainingTracker = new TrainingTracker();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("4")) {
            System.out.println("Choose an option (1: add session, 2: view time, 3: view graduation, 4: exit):");
            input = scanner.nextLine();
            switch (input) {
                case "1" -> {
                    System.out.println("Enter the duration of the training session:");
                    int duration = Integer.parseInt(scanner.nextLine());
                    trainingTracker.addTrainingSession(duration);
                }
                case "2" -> System.out.println("Total training time: " + trainingTracker.getTotalTrainingTime());
                case "3" ->
                        System.out.println("Eligible for graduation: " + trainingTracker.checkGraduationEligibility());
            }
        }
    }
}
