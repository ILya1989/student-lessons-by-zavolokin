/**
 * Created by ISS on 23.01.2017.
 */
public class Point {




        public static void main(String args[]) {
            double x1 = 16;
            double x2 = 22;
            System.out.println("Растояние равно=" + distans( x1,  x2));
           }



            public static double distans( double x1, double x2) {
                double c = Math.sqrt(x1 * x1 + x2 * x2);
                System.out.println(c);
                double distans = (Math.round((c)));
                System.out.println("Растояние равно=" + distans);
                return c;
            }






        }








