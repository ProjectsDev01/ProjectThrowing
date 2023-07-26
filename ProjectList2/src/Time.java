public class Time {
    public static double Time(float velocity, double angle, float g){
        double t = (double) ((2 * velocity * Math.sin(angle))/g);
        System.out.println("t: "+ t);
        return t;
    }
}
