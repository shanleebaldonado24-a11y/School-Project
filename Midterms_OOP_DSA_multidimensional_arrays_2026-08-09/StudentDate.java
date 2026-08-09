public class StudentData {

    // Multidimensional array
    private int[][] grades;

    // Constructor
    public StudentData(int[][] grades) {
        this.grades = grades;
    }

    // Getter
    public int[][] getGrades() {
        return grades;
    }

    // Setter
    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    // Display function
    public void displayGrades() {

        System.out.println("======================================");
        System.out.println("          STUDENT GRADES");
        System.out.println("======================================");

        System.out.println("Student\tMath\tEnglish\tScience");
        System.out.println("--------------------------------------");

        String[] students = {"Shanlee", "John", "Maria"};

        for (int i = 0; i < grades.length; i++) {
            System.out.print(students[i] + "\t");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("======================================");
    }
}