public class LunchLine {
    private static Student first_student;
    private static Student last_student;

    public LunchLine() {
        first_student = null;
        last_student = null;
    }
    
    public void insertFirst(Student new_kid) {
        if (isEmpty()) {
            // the "new kid" will get assigned to both first and last.
            first_student = new_kid;
            last_student = new_kid;
        }
        else {
            // the previous first student will get assigned to second place in line
            new_kid.next = first_student;
            first_student.previous = new_kid;
            first_student = new_kid;
        }
    }

    public void insertLast(Student new_kid) {
        if (isEmpty()) {
            // the "new kid" will get assigned to both first and last.
            first_student = new_kid;
            last_student = new_kid;
        }
        else {    
            // the previously last student will get assigned second-to-last
            new_kid.previous = last_student;
            last_student.next = new_kid;
            last_student = new_kid;
        }
    }

    public boolean isEmpty() {
        return first_student == null;
    }

    public void deleteFirstStudent() {
        Student temp = first_student;
        // reassign first student
        first_student = first_student.next;
        first_student.previous = null;

        // the old first student object no longer points to anything
        temp.next = temp.previous = null;

    }

    public void deleteLastStudent() {
        Student temp = last_student;
        // reassign last student
        last_student = last_student.previous;
        last_student.next = null;
        
        // the old last student object no longer points to anything
        temp.next = temp.previous = null;
    }

    public void displayEntireList() {
        Student current = first_student;
        System.out.println("LIST OF STUDENTS: {");
        while(current != null) {
            current.displayPersonalInformation();
            current = current.next;
        }
        System.out.println("}");

    }

}
