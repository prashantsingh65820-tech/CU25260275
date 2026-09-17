public class AverageMarks {
    public static void main(String[] args) {

        int[][] marks = {
            {70, 80, 90},
            {60, 75, 85},
            {80, 85, 95}
        };

        int sum = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                sum += mark;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average Marks = " + average);
    }
}