public class RationalNumber extends Number {
  //instance variables
  private int numerator, denominator;
  //constructor
  public RationalNumber(int nume, int deno) {
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
    if (denominator == 1) {
      return "" + numerator;
    }
    return (numerator + "/" + denominator);
  }

  private static int gcd(int a, int b) {
    if (a == 0) {
      return b;
    } if (b == 0) {
      return a;
    }
    int dividend = Math.max(a, b);
    int divisor = Math.min(a, b);
    int moddy = 0;
    while (dividend % divisor != 0) {
      moddy = dividend % divisor;
      dividend = divisor;
      divisor = moddy;
    }
    return divisor;
  }

  private void reduce() {
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
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
    reduce();
    return answer;
  }
}
