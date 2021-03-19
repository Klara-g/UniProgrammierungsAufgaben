package b07a2;
public class Punkt2D {
  private static int a;
  private double x; // x-Koordinate
  private double y; // y-Koordinate
  public Punkt2D() {
    ++a;
  }
  public Punkt2D(double x, double y) {
    this();
    this.x = x;
    this.y = y;
  }
  public Punkt2D(Punkt2D p) {
    this(p.x, p.y);
  }
  public static int anzahl() {
    return a;
  }
  public double x() {
    return x;
  }
  public double y() {
    return y;
  }
  public boolean equals(Punkt2D o) {
    return this == o
           || Mathe.equals(x, o.x) // Rundungstoleranz!
           && Mathe.equals(y, o.y);
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }
  public Punkt2D verschiebe(double dx, double dy) {
    x += dx;
    y += dy;
    return this;
  }
  public double abstand(Punkt2D p) {
    double dx = x - p.x;
    double dy = y - p.y;
    return Math.sqrt(dx * dx + dy * dy); // Euklid
  }
}
