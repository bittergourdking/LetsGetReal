public class Tester {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(5.0);
    RealNumber b = new RealNumber(4.99999);
    RealNumber c = new RealNumber(0.5);
    RealNumber d = new RealNumber(10.0);
    RationalNumber e = new RationalNumber(1, 2);
    RationalNumber f = new RationalNumber(1, 4);
    RationalNumber g = new RationalNumber(210, 45);
    RationalNumber h = new RationalNumber(1, 3);

    System.out.println(a.subtract(b));
    System.out.println(a.equals(b));
    System.out.println(a.equals(d.multiply(c)));
    System.out.println(b.multiply(c));

    System.out.println(e.divide(f));
    System.out.println(e.multiply(f));
    System.out.println(g.multiply(h));
    System.out.println(g);
  }
}
