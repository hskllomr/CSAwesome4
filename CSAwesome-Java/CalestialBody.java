public class CelestialBody {
    private int orbitLength;
    private int daysSinceDiscovered;

    public CelestialBody(int orbitLength) {
        // There is an error in this function or in the header

        this.orbitLength=orbitLength;
        this.daysSinceDiscovered = 0;
    }

    public void orbit(int numberOfTimes)
    { // There is an error in this header
        this.daysSinceDiscovered+=numberOfTimes*orbitLength;

        // YOUR CODE HERE

    }

    public int getDaysSinceDiscovered() {
        return this.daysSinceDiscovered;
    }

    public static void main(String[] args) {
        CelestialBody moon = new CelestialBody(28);
        moon.orbit(5);
        System.out.println("If the moon has orbited five times, it was discovered " + moon.getDaysSinceDiscovered() + " days ago.");
    }

}