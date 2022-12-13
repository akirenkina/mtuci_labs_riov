public class Main {
    public static void main(String[] msi) {
        Student student = new Student("Аля", "Киренкина", "БУТ1901", 4.6);
        Aspirant aspirant = new Aspirant("Макс", "Морозов", "БУТ1851", 4, "дрон");
        Student stud = new Aspirant("Антон", "Назаров", "БАП1901", 5, "система");
        Student[] students = { student, aspirant, stud }; //создаём массив из объектов раннее созданных классов

        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i].getScholarship());
        }
    }
}
