package set3B;

public class TriangleArea_3B {
    public static int triArea(int base, int height) {
        if (base < 0 || height < 0) {
            return -1;
        }
        return ((base*height) / 2 );
    }
}

// return the area of a triangle
