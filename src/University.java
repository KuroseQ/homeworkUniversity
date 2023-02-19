public class University {

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
}