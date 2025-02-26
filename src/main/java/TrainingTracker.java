import java.util.ArrayList;
import java.util.List;

public class TrainingTracker {
    private List<TrainingSession> trainingSessions;

    public TrainingTracker() {
        trainingSessions = new ArrayList<>();
    }
    public void addTrainingSession(int duration) {
        TrainingSession trainingSession = new TrainingSession(duration);
        trainingSessions.add(trainingSession);
    }

    public int getTotalTrainingTime() {
        int totalTrainingTime = 0;
        for (TrainingSession trainingSession : trainingSessions) {
            totalTrainingTime += trainingSession.getDuration();
        }
        return totalTrainingTime;
    }

    public boolean checkGraduationEligibility() {
        return getTotalTrainingTime() >= 100;
    }
}
