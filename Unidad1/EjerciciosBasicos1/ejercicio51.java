public class ejercicio51 {
    
    public static void main(String[] args)
    {

        int i = 8;
        int j = 5;
        float x = 0.005f;
        float y = -0.01f;
        char c = 'c';
        char d = 'd';

        //a
        System.out.println(! (c == 99));
        //b
        System.out.println(! (x > 0));
        //c
        System.out.println(c > d || c > 0);
        //d
        System.out.println(i > 0 && i >= c);
        //e
        System.out.println(i > 0 && j < 5);
        //f
        System.out.println(i > 0 || j < 5);
        //g
        System.out.println(x > y && i > 0 || j < 5);

    }
}
