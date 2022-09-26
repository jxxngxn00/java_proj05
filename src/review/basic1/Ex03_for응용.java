package basic1;
public class Ex03_for응용 {
    
    
    public static void main(String[] args){

        //[1]
        for(int i = 0; i < 26; i++) {
            for(char a = 'A'; a <= 'A'+i; a++) {
            System.out.print(a);
        }
        System.out.println();
    }//for
    
        //[2]
        for(int i = 0; i < 26; i++) {
            for(char a = 'A'; a <= 'Z'-i; a++) {
                System.out.print(a);
            }//for
            System.out.println();
        }//for
    
        //[3]
        for(int i = 0; i < 26; i++) {
            for(char a = (char) ('A'+i); a <= 'Z'; a++) {
                System.out.print(a);
                }//for
            System.out.println();
        }//for
    
        //[4]
        for(int i = 0; i < 26; i++) {
            for(char a = 'Z'; a >= 'Z'-i; a--) {
                System.out.print(a);
                }//for
            System.out.println();
        }//for


        // [5]
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }//for
            for(char a = (char) ('A'+i); a <= 'Z'; a++) {
                System.out.print(a);
            }//for
            System.out.println();
            }//for

        }
    }
    