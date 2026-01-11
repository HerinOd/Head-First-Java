package breaking.the.surface.exercises.be.the.compiler;
//Page 21

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x += 1; //break the loop
        }
    }
}
