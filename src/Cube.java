public class Cube {
    private double n;

    public Cube(double n) {
        this.n = n;
    }

    // Метод для знаходження сумарної площі граней куба
    public double getSurfaceArea() {
        return 6 * n * n;
    }

    // Метод для знаходження об'єму куба
    public double getVolume() {
        return Math.pow(n, 3);
    }

    // Метод для знаходження довжини великої діагоналі куба
    public double getLongDiagonal() {
        return n * Math.sqrt(3);
    }
}