public class RealNumber {
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

  public boolean equals(RealNumber other) {
    if (value == 0.0 || other.getValue() == 0.0) {
      if (value == 0.0 && other.getValue() == 0.0) {
        return true;
      }
      return false;
    } else if (Math.abs((value / other.getValue())
                      - (other.getValue() / value)) <= .00001) {
       return true;
    }
    return false;
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
