public class GradeCalculator {
    public static void main (String[] args) {
        double score1 = 5;
        double score2 = 90;
        double score3 = 78;
        double average = (score1 + score2 + score3) / 3;
        char grade;
        if (average >= 90) {
            grade ='A';
            } else if (average >= 80) {
                grade = 'B';
                } else if (average >= 70) {
                    grade = 'C';
                    } else if (average >= 60) {
                        grade = 'D';
                        } else {
                            grade = 'F';
                            }
                            System.out.println("The average score is " + average + " and the grade is " +
                            grade);
}
}
