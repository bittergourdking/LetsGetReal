public class RationalNumber extends RealNumber {
  //instance variables
  private int numerator, denominator;
  //constructor
  public RationalNumber(int nume, int deno) {
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }
  //methods
  public double getValue() {
    return ((double)numerator / (double)denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber answer = new RationalNumber(denominator, numerator);
    return answer;
  }

  public boolean equals(RationalNumber other) {
    if (numerator == getNumerator() && denominator == other.getDenominator()) {
      return true;
    }
    return false;
  }

  public String toString() {
    if (numerator == 0) {
      return "0";
    }
    return (numerator + "/" + denominator);
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b) {
    int answer = 1;


    /*use euclids method or a better one*/
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    return answer;
  }

  private void reduce() {
    numerator = numerator / gcd(numerator, denominator);
    denominator = denominator / gcd(numerator, denominator);
    if (denominator < 0) {
      numerator *= -1;
      denominator *= -1;
    }
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber answer = new RationalNumber(numerator * other.getNumerator(),
                                          denominator * other.getDenominator());
    answer.reduce();
    return answer;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber answer = new RationalNumber(numerator * other.getDenominator(),
                                          denominator * other.getNumerator());
    answer.reduce();
    return answer;
  }

  public RationalNumber add(RationalNumber other) {
    int lcm = (denominator * other.getDenominator()) / gcd(denominator, other.getDenominator());
    int a = lcm / denominator;
    int b = lcm / other.getDenominator();
    int nume = (numerator * a) + (other.getNumerator() * b);
    RationalNumber answer = new RationalNumber(nume, lcm);
    answer.reduce();
    return answer;
  }

  public RationalNumber subtract(RationalNumber other) {
    int lcm = (denominator * other.getDenominator()) / gcd(denominator, other.getDenominator());
    int a = lcm / denominator;
    int b = lcm / other.getDenominator();
    int nume = (numerator * a) - (other.getNumerator() * b);
    RationalNumber answer = new RationalNumber(nume, lcm);
    answer.reduce();
    return answer;
  }
}
