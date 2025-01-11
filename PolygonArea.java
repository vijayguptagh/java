import java.util.*;

public class PolygonArea {

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("The area of the polygon is: 0.00 (Not enough points to form a polygon)");
            return;
        }

        List<Point> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the vertices:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        // Step 1: Sort points by angle with respect to the origin (0, 0)
        points.sort((p1, p2) -> {
            double angle1 = Math.atan2(p1.y, p1.x);
            double angle2 = Math.atan2(p2.y, p2.x);
            return Double.compare(angle1, angle2);
        });

        // Step 2: Calculate area using the Shoelace formula
        double area = calculatePolygonArea(points);
        if (area == 0) {
            System.out.println("The area of the polygon is: 0.00 (Points do not form a valid closed polygon)");
        } else {
            System.out.printf("The area of the polygon is: %.2f\n", area);
        }

        sc.close();
    }

    public static double calculatePolygonArea(List<Point> points) {
        int n = points.size();

        // Apply Shoelace formula
        double area = 0;
        for (int i = 0; i < n; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % n); // Wrap around to the first point
            area += p1.x * p2.y - p1.y * p2.x;
        }

        return Math.abs(area) / 2.0;
    }
}
