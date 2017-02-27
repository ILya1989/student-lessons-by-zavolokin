package repid;

/**
 * Created by ISS on 02.02.2017.
 */
public class Povtor {
    public static void main(String[] args) {


        System.out.println("Hello,word");
        Square s = new Square(5);
        System.out.println("площпдь квадрата со стороной " + s.l + "=" + s.area() );

        Rectable r = new Rectable(4,6);

        System.out.println("площадь прямоугольника со сторонами " +r.a+ " и " + r.b+ " = "+ r.area () );


    }

}
