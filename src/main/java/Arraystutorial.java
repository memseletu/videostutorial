import java.util.Arrays;

public class Arraystutorial {
    //an array is a bucket where you can define the size.
    public static void main(String[] args) {
        String[] colors = new String[5];//this is when you want a specifit length and don't really know what the elements are goung to be
        colors[0] = "purple";
        colors[1] = "blue";
        int[] numbers = {1, 2, 3, 4, 5};//this is when u know what your array elemets are going to be.

        System.out.println(colors[0]);
        colors[1] = "yellow";
        System.out.println(Arrays.toString(colors));
        //looping through arrays.
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //to get the loop in reverse
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        for(String color: colors){
            System.out.println(color);
        }
     //2D arrays, are dimensional. used when making applications that make use of a gride
        //first bracket is row and 2nd is columns.
        char [][] board = new char[3][3];
        for(int i= 0;i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j]= '-';
            }
        }
        char[][] boardTwo = new char [][]{
                new char[]{'0','-','-'},
                new char[]{'0','-','-'},
                new char[]{'0','-','-'}


        };
        System.out.println(Arrays.deepToString(boardTwo));
        board[0][0]= '0';
        board[1][0]= '0';
        board[2][0]= '0';
        System.out.println(Arrays.deepToString(board));
    }
}
