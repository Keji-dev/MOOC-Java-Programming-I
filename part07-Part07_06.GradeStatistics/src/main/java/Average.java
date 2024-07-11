import java.util.ArrayList;

public class Average {

    private ArrayList<Integer> numbers;

    public Average() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if(number >= 0 && number <= 100) {
            numbers.add(number);
        }
    }

    public void average() {

        int sum = 0;
        double avg;

        for (Integer num: this.numbers) {
            sum += num;
        }

        avg = (double) sum / this.numbers.size();
        System.out.println("Point average (all): " +  avg);
    }

    public void averageOfGradePoints() {

        int sum = 0;
        int numbersAbove50 = 0;
        double avg;

        for (Integer num: this.numbers) {
            if (num >= 50) {
                numbersAbove50++;
                sum += num;
            }
        }

        avg = (double) sum / numbersAbove50;

        if (numbersAbove50 != 0) {
            System.out.println("Point average (passing): " + avg);
        }

        else {
            System.out.println("Point average (passing): -" );
        }
    }

    public void passPercentage() {

        int numbersAbove50 = 0;
        int numbersInTotal = 0;
        double percentage;

        for (Integer num: this.numbers) {
            if (num >= 50) {
                numbersAbove50++;
            }
            numbersInTotal++;
        }

        percentage = (double) (100 * numbersAbove50) / numbersInTotal;

        System.out.println("Pass percentage: " + percentage);
    }

    public void gradeDistribution() {

        int[] gradeArray = new int[6];

        for (Integer grade : numbers) {

            if (grade >= 90) {
                gradeArray[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeArray[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeArray[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeArray[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeArray[4]++;
            } else if (grade <= 49) {
                gradeArray[5]++;
            }
        }
        System.out.println("Grade distribution:");

        int gradIndex = 5;

        for (Integer grade: gradeArray) {

            System.out.print(gradIndex + ": ");

                for (int i = 0; i < grade; i++) {
                    System.out.print("*");
                }

            System.out.println();
            gradIndex--;
        }
    }

    public void printStars(int grade, int totalPoints) {

        System.out.print(grade + ": ");

        for (int i = 0; i < totalPoints; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public void printGrades() {
        average();
        averageOfGradePoints();
        passPercentage();
        gradeDistribution();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
