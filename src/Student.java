public class Student {
    private final String name;
    private int course;
    private boolean onLineLearning;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int course, boolean onLineLearning) {
        this.name = name;
        this.course = course;
        this.onLineLearning = onLineLearning;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isOnLineLearning() {
        return onLineLearning;
    }

    public void setOnLineLearning(boolean onLineLearning) {
        this.onLineLearning = onLineLearning;
    }

    public void startLearning() {
        onLineLearning = true;
    }

    public void stopLearning() {
        onLineLearning = false;
    }

    @Override
    public String toString() {
        return "Имя - " + name +
                ", Курс - " + course +
                ", Онлайн - " + onLineLearning +
                System.lineSeparator();
    }
}
