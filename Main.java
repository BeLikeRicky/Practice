public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Bobby", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(100);

}

    public static void getDurationString(int minutes, int seconds) {
       if(minutes >= 0) {
           System.out.println("Invalid Value");
       } else if (seconds >= 0 && seconds <= 59) {
           System.out.println("Invalid Value");
       }


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || ((inches < 0 || inches > 12))) {
            System.out.println("Invalid Numbers");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches are equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player scored points");
        return 0;
    }
}

