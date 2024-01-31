public class ejercicio2 {

    public static void main(String[] args) {

        float a = 8.0f;
        int b = 3;
        char c = 'c';

        //a
        double resdouble = (a - b + c);
        System.out.println("El resultado es " + resdouble);
        int resint = (int) (a - b + c);
        System.out.println("El resultado es " + resint);
        //b
        double resdouble2 = (2 * b + 3 * (a - c));
        System.out.println("El resultado es " + resdouble2);
        int resint2 = (int) (2 * b + 3 * (a - c));
        System.out.println("El resultado es " + resint2);
        //c
        double resdouble3 = (a / b);
        System.out.println("El resultado es " + resdouble3);
        int resint3 = (int) (a / b);
        System.out.println("El resultado es " + resint3);
        //d
        double resdouble4 = (a % b);
        System.out.println("El resultado es " + resdouble4);
        int resint4 = (int) (a % b);
        System.out.println("El resultado es " + resint4);
        //e
        double resdouble5 = (a / c - 2);
        System.out.println("El resultado es " + resdouble5);
        int resint5 = (int) (a / c - 2);
        System.out.println("El resultado es " + resint5);
        //f
        double resdouble6 = (a * b / c);
        System.out.println("El resultado es " + resdouble6);
        int resint6 = (int) (a * b / c);
        System.out.println("El resultado es " + resint6);
        //g
        double resdouble7 = (a * (c % b));
        System.out.println("El resultado es " + resdouble7);
        int resint7 = (int) (a * (c % b));
        System.out.println("El resultado es " + resint7);
        //h
        double resdouble8 = (3 * a – 2 * b) % (2 * a – c);
        System.out.println("El resultado es " + resdouble8);
        int resint8 = (int) (3 * a – 2 * b) % (2 * a – c);
        System.out.println("El resultado es " + resint8);
        //i
        double resdouble9 = ((a - 3 * b) % (c + 2 * a) / (a – c));
        System.out.println("El resultado es " + resdouble9);
        int resint9 = (int) ((a - 3 * b) % (c + 2 * a) / (a – c));
        System.out.println("El resultado es " + resint9);
        //j
        double resdouble10 = (a - b - c * 2);
        System.out.println("El resultado es " + resdouble10);
        int resint10 = (int) (a - b - c * 2);
        System.out.println("El resultado es " + resint10);
    }

}