public class FindHighestAltitude {
    public static int largestAltitude(int gain[]) {
        int currentAltitude = 0;
        int highestAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude = currentAltitude + gain[i];
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        return highestAltitude;
    }

    public static void main(String args[]) {
        int gain[] = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println("The highest altitude is : " + largestAltitude(gain));
    }
}
