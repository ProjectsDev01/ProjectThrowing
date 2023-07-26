public class Ytrajectory {
    public static double Ytrajectory(float velocity, double angle, float g, double t){
        double yvel =  Math.pow(velocity,2) * Math.pow(Math.sin(angle),2) ;
        double High = yvel/2;
        System.out.println("Y: " + yvel + " " + Math.pow(t,2d) + " " + ((g * Math.pow(t,2d)) / 2));
        return High;
    }
}
