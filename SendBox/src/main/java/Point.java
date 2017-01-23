import ru.src.main.java.Distans;

/**
 * Created by ISS on 23.01.2017.
 */
public class Point {




        public static void main(String args[]) {
            Distans a = new Distans(16,22);



            System.out.println("Растояние равно=" + Distans(16,22));
           }



            public static double Distans(double x1, double x2) {
                double c = Math.sqrt(x1 * x1 + x2 * x2);
                System.out.println("Растояние равно=" + Math.round(c));
                return c;
            }






        }








