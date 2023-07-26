import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float g = 9.81F;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj prędkość obiektu [m/s]: ");
        float velocity = scan.nextFloat();
        System.out.println("Podaj kąt [stopnie]: ");
        double angle = scan.nextFloat();
        double t = Time.Time(velocity, angle, g);
        System.out.println("Obiekt doleci na wysokość równą: "+ Ytrajectory.Ytrajectory(velocity,angle,g,t));
        System.out.println("Obiekt doleci na odległość równą: "+ Xtrajectory.Xtrajectory(velocity,angle,g,t));

    }
}