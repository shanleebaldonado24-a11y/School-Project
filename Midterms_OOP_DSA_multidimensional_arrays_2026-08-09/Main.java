public class Main {

    public static void main(String[] args) {

        // Multidimensional array
        int[][] studentGrades = {
            {90, 92, 88},
            {85, 89, 91},
            {93, 90, 95}
        };

        // Create object
        StudentData data = new StudentData(studentGrades);

        // Use setter
        data.setGrades(studentGrades);

        // Use getter
        int[][] grades = data.getGrades();

        // Display grades
        data.displayGrades();
    }
}
