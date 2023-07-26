public class Xtrajectory {
    public static double Xtrajectory(float velocity, double angle, float g, double t){
        double xvel = Math.pow(velocity,2) * Math.cos(angle)/g;
        double dist = xvel;
        System.out.println( "X: "+ xvel + " Kat: "+ Math.cos(angle));
        return dist;
    }
}
