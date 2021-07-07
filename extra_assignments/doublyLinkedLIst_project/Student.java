public class Student {
    public String name;
    public int age;
    public int grade;

    public Student next;
    public Student previous;

    public Student() {
        this.name = null;
        this.age = 0;
        this.grade = 0;
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayPersonalInformation() {
        System.out.printf("* Name: %s  Age: %d  Grade: %dth.\n", name, age, grade);

        String next_person = (this.next == null)? "no one": this.next.name;
        String previous_person = (this.previous == null)? "No one": this.previous.name;
        System.out.printf("%s is standing in front of me and %s is standing behind me.\n", (previous_person), (next_person) );
        System.out.println();
    }
}