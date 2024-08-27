package Question_3;

public class Triangle implements Shape {
    @Override
    public void draw() {
        int height = 5; // height
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
