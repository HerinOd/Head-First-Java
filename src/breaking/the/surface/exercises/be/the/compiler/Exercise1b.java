package breaking.the.surface.exercises.be.the.compiler;
//Page 21

class Exercise1b { //Wrap the code in a class
    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}
