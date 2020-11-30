public class RealNumber extends Number {
  //private variables
  private double value;
  //constructor
  public RealNumber(double v) {
    value = v;
  }
  //methods
  public double getValue() {
    return value;
  }

  public String toString() {
    return ""+getValue();
  }

  public RealNumber add(RealNumber other) {
    RealNumber answer = new RealNumber(value + other.getValue());
    return answer;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber answer = new RealNumber(value * other.getValue());
    return answer;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber answer = new RealNumber(value / other.getValue());
    return answer;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber answer = new RealNumber(value - other.getValue());
    return answer;
  }
}
