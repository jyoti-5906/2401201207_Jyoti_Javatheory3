public class Student {

    private int rollNumber;
    private String studentName;
    private int[] marks = new int[3];

    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Validate each subject mark
    public void validateMarks() throws InvalidMarksException {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks for subject " 
                                                 + (i + 1) + ": " + marks[i]);
            }
        }
    }

    public double calculateAverage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);

        System.out.print("Marks: ");
        for (int i : marks) {
            System.out.print(i + " ");
        }
        System.out.println();

        double avg = calculateAverage();
        System.out.println("Average: " + avg);

        String result = (marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
