public abstract class Number {
  public abstract double getValue();
  //methods
  public int compareTo(Number other) {
    if (this.equals(other)) {
      return 0;
    }
    if (this.getValue() < other.getValue()) {
      return -1;
    }
    return 1;
  }

  public boolean equals(Number other) {
    if (this.getValue() == 0.0 || other.getValue() == 0.0) {
      if (this.getValue() == 0.0 && other.getValue() == 0.0) {
        return true;
      }
      return false;
    } else if (Math.abs((this.getValue() / other.getValue())
                      - (other.getValue() / this.getValue())) <= .00001) {
       return true;
    }
    return false;
  }
}
