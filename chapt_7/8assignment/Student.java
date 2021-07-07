public class Student {
    int num_of_tests = 2;
    private String name = "";
    private char letter_grade = '0'; // based on average test score
    private double[] scores = new double[num_of_tests];
    
    private double average_score = 0.0;

    public Student() {}

    public Student(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
        calculate_average_score(scores);
    }

    
    public void set_name(String name) {
        this.name = name;
    }

    // Requirement: Return a specific student's name
    public String get_name(String name) {
        return this.name;
    }
    //////////
    public void set_letter_grade(double average_score) {
        int score = (int)average_score;

        if (score < 60) {
           this.letter_grade = 'F'; 
        }
        else if (score < 70) {
            this.letter_grade = 'D';
        }
        else if (score < 80) {
            this.letter_grade = 'C';
        }
        else if (score < 90) {
            this.letter_grade = 'B';
        }
        else if (score >= 90) {
            this.letter_grade = 'A';
        }
        else {
            this.letter_grade = '0';
        }
    }

    // Requirement: Return a letter grade based on the average
    public char get_letter_grade() {
        return this.letter_grade;
    }

    public void calculate_average_score(double[] scores) {
        double sum = 0;
        int num_of_items = scores.length;
        for (double score: scores) {
            sum += score;
        }
        this.average_score = sum / num_of_items;
        set_letter_grade(this.average_score);
    }

    // Requirement: Return average test score
    public double get_average_score() {
        return this.average_score;
    }

    public void set_scores(double[] scores) {
        this.scores = scores;
        calculate_average_score(scores);
    }

    public double[] get_scores() {
        return this.scores;
    }

    public void display_all_info() {
        System.out.println("_______________");
        System.out.printf("Student: %s\n" + 
        "Average Test Score: %.2f\n" + 
        "Letter Grade: %c\n", this.name, this.average_score, this.letter_grade);

    }

}