 public class NoBody
                 {
                    public static void main(String args[]) 
                       {
                           int i=100,j=200;


                              while(++i < --j); // no body in this loop
                                   System.out.println("Midpoint is " + i);
                       }
                 }