
package charpyramidreverse;


public class CharPyramidReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ch=65;
        for(int i=1;i<=5;i++)
       {
           for(int j=5-i;j>=0;j--)
           {
               System.out.print((char)(ch+j) + " ");
           }
           System.out.println();
       }
    }
    
}
