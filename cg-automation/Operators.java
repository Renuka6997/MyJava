class Operators {
        public static void main(String[] args) {
        byte a=10;
        System.out.println(a++); /* increement and decreement operators should be used with variables only */
        System.out.println(++a);
        byte b =20;
        b = b++;
        System.out.println("b value is "+b);
        int c=30;
        c=++c;
        System.out.println("c value is "+c);
        
        int d=40;
        int e=d++ + 10;
        System.out.println("e value is "+e);

        int x=10;
        x++;
        System.out.println("x value is "+x);

        int y=10;
        ++y;
        System.out.println("y value is "+y);
        }
}