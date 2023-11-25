package PatternQuestions;

public class AdvancePattern {

   public static void main(String[] args) {

            // Butterfly
         
            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********
            // **********
            // ****  ****
            // ***    ***
            // **      **
            // *        *
             // first half
             
             int n = 5;
             for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
             System.out.print("*");
             }
          
            // 2nd part
             int spaces = 2 * (n - i);
              for (int j = 1; j <= spaces; j++) {
             System.out.print(" ");
             }
             for (int j = 1; j <= i; j++) {
             System.out.print("*");
             }
             System.out.println();
             }
             
             // Lower Half
             
             for (int i = n; i >= 1; i--) {
             for (int j = 1; j <= i; j++) {
             System.out.print("*");
             }
             // 2nd part
             int spaces = 2 * (n - i);
             for (int j = 1; j <= spaces; j++) {
             System.out.print(" ");
             }
              for (int j = 1; j <= i; j++) {
              System.out.print("*");
             }
             System.out.println();
             }
             
             
             
    
           
    //     *****
    //    *****
    //   *****
    //  *****
    // *****
            //  int n = 5;
           
            //   for (int i = 1; i <= n; i++) {
            //   // space
            //   for (int j = 1; j <= n - i; j++) {
            //   System.out.print(" ");
            //   }
            //   // star
            //   for (int k = 1; k <= n; k++) {
            //   System.out.print("*");
            //   }
            //   System.out.println();
            //   }
        
    
        //       1 
        //      2 2
        //     3 3 3
        //    4 4 4 4
        //   5 5 5 5 5 
            // int n = 5;
            // for (int i = 1; i <= n; i++) {
            // // space
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }
    
            // // number
            // for (int j = 1; j <= i; j++) {
            // System.out.print(i+" ");
            // }
            // System.out.println();
            // }
    
        //      1
        //     212
        //    32123
        //   4321234
        //  543212345
            // int n = 5;
            // for (int i = 1; i <= n; i++) {
            // // space
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }
            // // 1st half number
    
            // for (int j = i; j >= 1; j--) {
            // System.out.print(j);
            // }
            // for (int j = 2; j <= i; j++) {
            // System.out.print(j);
            // }
            // System.out.println();
            // }
    
    
    
    
    
    
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
    
    
    
    
    
    
    
    
    
    
    
    
            // int n = 4;
            // // upper half
            // for (int i = 1; i <= n; i++) {
            //     // spance
            //     for (int j = 1; j <= n - i; j++) {
            //         System.out.print(" ");
            //     }
            //     // star
            //     for (int j = 1; j <= 2 * i - 1; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
    
            // // Lower Half
    
            // for (int i = n; i >= 1; i--) {
            //     // spance
            //     for (int j = 1; j <= n - i; j++) {
            //         System.out.print(" ");
            //     }
            //     // star
            //     for (int j = 1; j <= 2 * i - 1; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
    
        }
  
}
