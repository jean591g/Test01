public class FigureItOut
{
    public static void main(String[] args)
    {
        Shape figure = new Shape();
        System.out.println(figure);

        // en form for override: figure defineret som shape først, og så sætter vi den som circle
        figure = new Circle();
        figure.getArea();

        // vi caster () vores objekt figure med Circle-objektet
        System.out.println(((Circle) figure).r);

        // test
        System.out.println(((Circle) figure));

        // fejltest:
        // figure.super.r;
    }
}





