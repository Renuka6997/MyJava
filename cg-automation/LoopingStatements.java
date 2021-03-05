class LoopingStatements {
                public static void main(String[] args) {
               /* if(10==10) {
                     System.out.println("equal");
                     return;
                     } else {
                     System.out.println("not equal");
                     }   */
                for(int i=0;i<5;i++) {
                     if(i==1 || i==2) {
                     System.out.println("hello..");
                     continue;
                     }
                     System.out.println("hi..");  /* prints hi 5 times without usage of continue */
                     }   
                }
             }
 