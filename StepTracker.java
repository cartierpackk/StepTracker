public class StepTracker {
    private int min;
    private int activeDays;
    private int days;
    private int steps;

    public StepTracker(int minSteps) {
        min = minSteps;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) return 0.0;
        return steps/days;
    }

    public void addDailySteps(int steps) {
        if (steps >= min) activeDays++;
        this.steps += steps;
        days++;
    }
}
