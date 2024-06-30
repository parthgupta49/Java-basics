package arrays.Basics;

public class PatternsPrac {

    public static void main(String[] args) {
//        System.out.println("new Pattern : ");
//        pattern1(4);
//        System.out.println("new Pattern : ");
//        pattern2(5);
//        System.out.println("new Pattern : ");
//        pattern3(4);
//        System.out.println("new Pattern : ");
//        pattern4(4);
//        System.out.println("new Pattern : ");
//        pattern5(5);
//        System.out.println("new Pattern 6 : ");
//        pattern6(5);
//        System.out.println("new Pattern : ");
//        pattern7(5);
//        System.out.println("new Pattern : ");
//        pattern8(5);
//        System.out.println("new Pattern : ");
//        pattern9(5);
//        System.out.println("Pattern 10 : ");
//        pattern10(5);
//        System.out.println("Pattern 11");
//        pattern11(5);
        System.out.println("Pattern 12");
        pattern12(5);

    }
    static void pattern1(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int col = 0; col < n-rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int rows = 1; rows <= 2*n-1; rows++) {
            int columns = rows>n ? 2 * n - rows : rows ;
            for (int j = 1;j<=columns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 0; spaces < n - rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * rows - 1; col++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces < n - rows; spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 0; spaces < rows-1; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - rows; col++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int col = 0; col < n - rows; col++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < rows-1; spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }





}

