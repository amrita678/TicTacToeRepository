
public class TicTacToeClass {

    String[] board=new String[9];
    
    //To initialize empty board
	public String populateEmptyBoard() {
		for(int i=0;i<9;i++) {
			board[i]=String.valueOf(i+1);
	     }
		String output=printBoard();
		return output;
	}
	
	//
	public String printBoard() {
		String output ="/---|---|---\\"
			    +"\n" + "| "+board[0]+" | "+board[1]+" | "+board[2]+" |"
			    +"\n"  +"|-----------|"
			    + "\n"+ "| "+board[3]+" | "+board[4]+" | "+board[5]+" |"
			     +"\n"+ "|-----------|" 
			     +"\n"+ "| "+board[6]+" | "+board[7]+" | "+board[8]+" |"
			     +"\n"+ "|-----------|";
		System.out.println(output);
		return output;
      }

      public static void main(String[] args){
	         TicTacToeClass obj=new TicTacToeClass();
	          obj.populateEmptyBoard();
	          
      }

	public String xTurnFirst() {
		return null;
	}

}
