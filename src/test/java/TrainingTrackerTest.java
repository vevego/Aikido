import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTrackerTest {
    TrainingTracker trainingTracker;

    @BeforeEach
    void setUp() {
        trainingTracker = new TrainingTracker();
    }

    @Test
    void testAddTrainingSession() {
        trainingTracker.addTrainingSession(10);
        assertEquals(10, trainingTracker.getTotalTrainingTime());
    }

    @Test
    void testGetTotalTrainingTime() {
        trainingTracker.addTrainingSession(10);
        trainingTracker.addTrainingSession(20);
        assertEquals(30, trainingTracker.getTotalTrainingTime());
    }

    @Test
    void testCheckGraduationEligibility() {
        trainingTracker.addTrainingSession(100);
        assertTrue(trainingTracker.checkGraduationEligibility());
    }

}