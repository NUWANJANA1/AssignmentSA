package Question_3;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        int width = 6; // width
        int height = 4; // height
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

