public class ejercicio61 {
    
    public static void main(String[] args)
    {

        byte b = 127;
        short s = 32456;
        long ln = 1000000l;
        int i = 13;
        int j = 23;
        float f = 3.3f;
        double d = 19.4;
        char c = 'c';

        //a
        System.out.println(i + c);
        //b
        System.out.println(b + c);
        //c
        System.out.println(j + 4L);
        //d
        System.out.println(f - c);
        //e
        System.out.println(b / c + s);
        //f
        System.out.println(j -4L * 2.5F);
        //g
        System.out.println(d + f);
        //h
        System.out.println(c + c);
        //i
        System.out.println(ln + c);
        //j
        System.out.println('a' + c);
        //k
        System.out.println(s + j);
        //l
        System.out.println(s * c);
        //m
        System.out.println(i * f * 2.5);
        //n
        System.out.println(2 / i + 2.0 / j);
        
    }
}
