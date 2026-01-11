package breaking_the_surface.exercises.be_the_compiler;
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
