package breaking.the.surface.exercises.be.the.compiler;
//Page 21

class Exercise1c {
    public static void main(String[] args) { //Needs a main method
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
