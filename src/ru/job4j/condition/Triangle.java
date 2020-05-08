package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @return Периметр.
     */
    public double period(Triangle triangle) {
        double a = triangle.first.distance(second);
        double b = triangle.first.distance(third);
        double c = triangle.second.distance(third);
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(Triangle triangle) {
        double a = triangle.first.distance(second);
        double b = triangle.first.distance(third);
        double c = triangle.second.distance(third);
        double rsl = -1;
        double p = triangle.period(triangle);
        if (this.exist(triangle)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @return true/false
     */
    public boolean exist(Triangle triangle) {
        double a = triangle.first.distance(second);
        double b = triangle.first.distance(third);
        double c = triangle.second.distance(third);
        return a + b > c && a + c > b && b + c > a;
    }
}
