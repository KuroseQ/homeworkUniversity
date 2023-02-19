public class Teacher {
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
        students = new Student[] {student1, student2, student3};
    }
}
