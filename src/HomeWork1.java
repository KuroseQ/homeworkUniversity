public class HomeWork1 {

    public static void main(String[] args) {

        Student vasya = new Student("Вася", 1, false);
        Student petya = new Student("Петя", 1, true);
        Student masha = new Student("Маша", 1, false);
        Student glasha = new Student("Глаша", 2, true);
        Student katya = new Student("Катя", 2, true);
        Student misha = new Student("Миша", 2, false);
        Student igor = new Student("Игорь", 3, true);
        Student yana = new Student("Яна", 3, false);

        Student vlad = new Student("Влад");
        vlad.setCourse(3);
        vlad.setOnLineLearning(false);

        Teacher teacher1 = new Teacher("Иван Иванович");
        Teacher teacher2 = new Teacher("Петр Пертович");
        Teacher teacher3 = new Teacher("Сергей Сергеевич");

        teacher1.addStudents(vasya, petya, masha);
        teacher2.addStudents(glasha, katya, misha);
        teacher3.addStudents(igor, yana, vlad);

        System.out.println(teacher1.studentsGroupInfo());
        System.out.println(teacher2.studentsGroupInfo());
        System.out.println(teacher3.studentsGroupInfo());

        teacher1.toTeachClasses(true);
        System.out.println(teacher1.studentsGroupInfo());

        teacher1.toTeachClasses(false);
        System.out.println(teacher1.studentsGroupInfo());
    }

    public static class Student {
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

    public static class Teacher {
        private String name;
        private Student[] students = new Student[3];

        public Teacher(String name) {
            this.name = name;
        }

        public String studentsGroupInfo() {
            String studentsGroupInfo = "Преподаватель: ".concat(name).concat("\nСтуденты:\n");
            for (Student student : students) {
                studentsGroupInfo = studentsGroupInfo.concat(student.toString());
            }
            return studentsGroupInfo;
        }

        public void toTeachClasses(boolean onLine) {
            System.out.println(name.concat(onLine ? " начал урок" : " закончил урок"));
            for (Student student : students) {
                if (onLine) {
                    student.startLearning();
                } else {
                    student.stopLearning();
                }
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student[] getStudents() {
            return students;
        }

        public void addStudents(Student student1, Student student2, Student student3) {
            students = new Student[]{student1, student2, student3};
        }
    }
}