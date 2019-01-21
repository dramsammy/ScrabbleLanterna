import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Board{
  private Pieces[][] board= new Pieces[15][15];
  private Player Turn;
  public static ArrayList<Character> pile = new ArrayList<Character>();
  public static ArrayList<String> words = new ArrayList<String>(267751);
  private static char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  //Constructor of Board. Prompts set up board method as well as scanfile and addng proper pieces
  public Board(){
    scanfile();
    setupboard();
    pile.add('X');
   pile.add('Z');
   pile.add('Q');
   pile.add('K');
   pile.add('J');
   for(int i=0;i<2;i++){
     pile.add('Y');
     pile.add('W');
     pile.add('V');
     pile.add('P');
     pile.add('M');
     pile.add('H');
     pile.add('F');
     pile.add('C');
     pile.add('B');
   }
   for(int i=0;i<3;i++){
     pile.add('G');
   }
   for(int i=0;i<4;i++){
     pile.add('U');
     pile.add('S');
     pile.add('L');
     pile.add('D');
   }
   for(int i=0;i<2;i++){
     pile.add('Y');
     pile.add('W');
     pile.add('V');
     pile.add('P');
     pile.add('M');
     pile.add('H');
     pile.add('F');
     pile.add('C');
     pile.add('B');
   }
   for(int i=0;i<6;i++){
     pile.add('T');
     pile.add('R');
     pile.add('N');
   }
   for(int i=0;i<8;i++){
     pile.add('O');
   }
   for(int i=0;i<9;i++){
     pile.add('I');
     pile.add('A');
   }
   for(int i=0;i<12;i++){
     pile.add('E');
   }
  }

  public Boolean scanfile(){
    try{
	    FileReader reader = new FileReader("words.txt");
	    Scanner scanner = new Scanner(reader);
	    for(int x = 0; scanner.hasNextLine(); x++){
		  words.add(scanner.nextLine());
	    }
	    scanner.close();
      return true;
	}
	  catch(FileNotFoundException e){
	    return false;
	}
}
  public static int getX(char x){
    int xvalue = 0;
    for (int i = 0; i < 26; i++){
      if (xvalue == letters[i]){
        xvalue = i;
      }
    }
    return xvalue;
  }


  public int getpilelength(){
  return pile.size();
}
  public char getpile(int index){
  return pile.get(index);
}
  public void removeFromPile(int index){
  pile.remove(index);
}
  //imputs coordinates and a char and changes the board to display that char
  public boolean modifyBoard(int xcor, int ycor,char newval){//will start from zero
    if(board[xcor][ycor].getPieceChar()!=' ' && board[xcor][ycor].getPieceChar()!=newval){
      return false;
    }
    else{
      board[xcor][ycor].setLetter(newval);
      return true;
    }
  }

  //accesor method for piece at a coordinate
  public Pieces getPieces(int xcor, int ycor){
    return board[xcor][ycor];
  }
  public Pieces coordtoPiece(char x, int y){
    int position = 0;
    for (int i = 0; i < 26; i++){
      if (x == letters[i]){
        position = i;
      }
    }
    return board[position][y];
  }
  //creates a 15 by 15 2D array of Pieces with the correct multipliers
  public void setupboard(){
      for (int i = 0; i < 15; i++){
        for(int l = 0; l < 15; l++){
          board[i][l]= new Pieces();
        }
      }

      board[0][0].setWordMultiplier(3);
      board[0][3].setLetterMultiplier(2);
      board[0][7].setWordMultiplier(3);
      board[0][11].setLetterMultiplier(2);
      board[0][14].setWordMultiplier(3);
      board[1][1].setWordMultiplier(2);
      board[1][5].setLetterMultiplier(3);
      board[1][9].setLetterMultiplier(3);
      board[1][13].setWordMultiplier(2);
      board[2][2].setWordMultiplier(2);
      board[2][6].setLetterMultiplier(2);
      board[2][8].setLetterMultiplier(2);
      board[2][12].setWordMultiplier(2);
      board[3][0].setLetterMultiplier(2);
      board[3][3].setWordMultiplier(2);
      board[3][7].setLetterMultiplier(2);
      board[3][11].setWordMultiplier(2);
      board[3][14].setLetterMultiplier(2);
      board[4][4].setWordMultiplier(2);
      board[4][10].setWordMultiplier(2);
      board[5][1].setLetterMultiplier(3);
      board[5][5].setLetterMultiplier(3);
      board[5][9].setLetterMultiplier(3);
      board[5][13].setLetterMultiplier(3);
      board[6][2].setLetterMultiplier(2);
      board[6][6].setLetterMultiplier(2);
      board[6][8].setLetterMultiplier(2);
      board[6][12].setLetterMultiplier(2);
      board[7][0].setWordMultiplier(3);
      board[7][3].setLetterMultiplier(2);
      board[7][7].setLetterMultiplier(2);
      board[7][11].setLetterMultiplier(2);
      board[7][14].setWordMultiplier(3);
      board[8][2].setLetterMultiplier(2);
      board[8][6].setLetterMultiplier(2);
      board[8][8].setLetterMultiplier(2);
      board[8][12].setLetterMultiplier(2);
      board[9][1].setLetterMultiplier(3);
      board[9][5].setLetterMultiplier(3);
      board[9][9].setLetterMultiplier(3);
      board[9][13].setLetterMultiplier(3);
      board[10][4].setWordMultiplier(2);
      board[10][10].setWordMultiplier(2);
      board[11][0].setLetterMultiplier(2);
      board[11][3].setWordMultiplier(2);
      board[11][7].setLetterMultiplier(2);
      board[11][11].setWordMultiplier(2);
      board[11][14].setLetterMultiplier(2);
      board[12][2].setWordMultiplier(2);
      board[12][6].setLetterMultiplier(2);
      board[12][8].setLetterMultiplier(2);
      board[12][12].setWordMultiplier(2);
      board[13][1].setWordMultiplier(2);
      board[13][5].setLetterMultiplier(3);
      board[13][9].setLetterMultiplier(3);
      board[13][13].setWordMultiplier(2);
      board[14][0].setWordMultiplier(3);
      board[14][3].setLetterMultiplier(2);
      board[14][7].setWordMultiplier(3);
      board[14][11].setLetterMultiplier(2);
      board[14][14].setWordMultiplier(3);

  }
  //mutator methods
    public void setTurn(Player p){
      Turn=p;
    }
    public Player getTurn(){
      return Turn;
    }

/*  public boolean checkAllWords(){
    //checks all words on board using isValidWord
  }*/
  public String toString(){
    String str ="";
    //str+= "          SCRABBLE 2.0       \n";
    //str+= "_______________________________\n";*/
     for (int i = 0; i < board.length; i++){
       str+="|)";
       for (int a = 0; a < board[0].length; a++){
         str+=board[i][a].toString();
       }
       if(i<board.length-1){
       }
       str+="\n";
     }
     //str+= "-------------------------------";
     return str;
  }
  public boolean hasValue(Pieces p){
    if(p.getPieceChar()!=' '){
      return false;
    }
    return true;
  }

  public boolean isTouching(int xcor, int ycor){
    if (hasValue(getPieces(xcor+1,ycor))){
      return true;
    }
    if (hasValue(getPieces(xcor, ycor+1))){
      return true;
    }
    if (hasValue(getPieces(xcor-1, ycor))){
      return true;
    }
    if (hasValue(getPieces(xcor, ycor-1))){
      return true;
    }
    return false;
  }

  public boolean isWordTouching(int xcor, int ycor, int direction, int length){
    if(direction==-1){
      for(int i=0;i<length;i++){
      if(isTouching(xcor,ycor-i)){
        return true;
      }
    }
    return false;
  }
    if(direction==1){
      for(int i=0;i<length;i++){
        if(isTouching(xcor+i,ycor)){
          return true;
    }
  }
    return false;
  }
  return false;
}


  public int playScore(Pieces[] p, int xcor, int ycor, int direction){
    boolean d = false;
    boolean t = false;
    int s=0;
    if(direction==1){
      for(int i=0;i<p.length;i++){
        if(getPieces(xcor+i,ycor).getWordMultiplier()==2){
          d=true;
      }
        if(getPieces(xcor+i,ycor).getWordMultiplier()==3){
          t=true;
      }
        s+=(getPieces(xcor+i,ycor).getLetterMultiplier())*(p[i].getValue());
    }
  }
    else if(direction==-1){
      for(int i=0;i<p.length;i++){
        if(getPieces(xcor,ycor+i).getWordMultiplier()==2){
          d=true;
      }
        if(getPieces(xcor,ycor+i).getWordMultiplier()==3){
          t=true;
      }
        s+=(getPieces(xcor,ycor+i).getLetterMultiplier())*(p[i].getValue());
    }
  }
    if(d){
      s=s*2;
    }
    if(t){
      s=s*3;
    }
    return s;
  }





  public boolean isValidWord(Pieces[] p){
  String word = "";
  for (int i = 0; i < p.length; i++){
    word += p[i].getPieceChar();
  }
  word=word.toUpperCase();
 	int middle;
 	int highest = words.size();
 	int first = 0;
 	middle = highest/2;
 	while(first < highest){
 	    if(words.get(middle).compareTo(word)>0){
 		highest = middle;
 		middle = (first+highest)/2;
 	    }
 	    else if (words.get(middle).compareTo(word)<0){
 		first = middle + 1;
 		middle = (first+highest)/2;
 	    }
 	    else{
 		return true;
 	    }
 	}
 	return false;
}

public ArrayList<Integer> touchingDirection(int xcor, int ycor){
  ArrayList<Integer> dir = new ArrayList<Integer>();
  if (hasValue(getPieces(xcor+1,ycor))){
    dir.add(3);
  }
  if (hasValue(getPieces(xcor, ycor+1))){
    dir.add(4);
  }
  if(xcor>0){
    if (hasValue(getPieces(xcor-1, ycor))){
      dir.add(1);
    }
  }
  if(ycor>1){
    if(hasValue(getPieces(xcor, ycor-1))){
    dir.add(2);
  }
  }
  return dir;
}
public char getPieceChar(int x,int y){
  return (board[x][y]).getPieceChar();
}

/*public boolean isValidPlay(Pieces[] p, int xcor, int ycor, int direction){
  if(isValidWord(p) && isWordTouching(xcor,ycor,direction, p.length) && xcor>=0 && xcor<15 && ycor>=0 && ycor<15){
    if(direction==1){
      if((xcor+p.length)>14){
        return false;
      }
      for(int i=0;i < p.length;i++){
        if(getPieceChar(xcor+i,ycor)!=' ' && getPieceChar(xcor+i,ycor)!=p[i].getPieceChar()){
          return false;
        }
        else if(isTouching(xcor+i,ycor)){
          if(touchingDirection(xcor+i,ycor).contains(2)){
            int l=ycor-1;
            int topY=l;
            boolean notTop=true;
            while(l>-1 && notTop){
              if(touchingDirection(xcor+i,l).contains(2)){
                l--;
              }
              if(l==0){
                topY=0;
                notTop=false;
              }
              else{
                topY=l;
                notTop=false;
              }
            }
            boolean hasNext=true;
            ArrayList<Pieces> n = new ArrayList<Pieces>();
            int currY=topY;
            while(hasNext){
              if(touchingDirection(xcor+i,currY).contains(4) && currY>0){
                n.add(getPieces(xcor+i,currY));
                currY--;
              }
              else{
                hasNext=false;
              }
            }
            Pieces[] nArray = listToArray(n);
            if(isValidWord(nArray)==false){
              return false;
            }
          }
          else{
            if(touchingDirection(xcor+i,ycor).contains(4)){
              boolean hasNext=true;
              ArrayList<Pieces> n = new ArrayList<Pieces>();
              int currY=ycor;
              while(hasNext){
                if(touchingDirection(xcor+i,currY).contains(4) && currY>0){
                  n.add(getPieces(xcor+i,currY));
                  currY--;
                }
                else{
                  hasNext=false;
                }
              }
              Pieces[] nArray = listToArray(n);
              if(isValidWord(nArray)==false){
                return false;
              }
            }
          }
        }
    }
      return true;
}
    if(direction==-1){
      if((ycor+p.length)>14){
        return false;
      }
      for(int i=0;i < p.length;i++){
        if(getPieceChar(xcor,ycor+i)!=' ' && getPieceChar(xcor,ycor+i)!=p[i].getPieceChar()){
          return false;
        }
        else if(isTouching(xcor,ycor+i)){
          if(touchingDirection(xcor,ycor+i).contains(1)){
            int l=xcor-1;
            int topX=l;
            boolean notTop=true;
            while(l>-1 && notTop){
              if(touchingDirection(l,ycor+i).contains(1)){
                l--;
              }
              if(l==0){
                topX=0;
                notTop=false;
              }
              else{
                topX=l;
                notTop=false;
              }
            }
            boolean hasNext=true;
            ArrayList<Pieces> n = new ArrayList<Pieces>();
            int currX=topX;
            while(hasNext){
              if(touchingDirection(currX,ycor+i).contains(3)){
                n.add(getPieces(currX,ycor+i));
                currX--;
              }
              else{
                hasNext=false;
              }
            }
            Pieces[] nArray = listToArray(n);
            if(isValidWord(nArray)==false){
              return false;
            }
          }
          else{
            if(touchingDirection(xcor,ycor+i).contains(3)){
              boolean hasNext=true;
              ArrayList<Pieces> n = new ArrayList<Pieces>();
              int currX=xcor;
              while(hasNext){
                if(touchingDirection(currX,ycor+i).contains(3)){
                  n.add(getPieces(currX,ycor+i));
                  currX--;
                }
                else{
                  hasNext=false;
                }
              }
              Pieces[] nArray = listToArray(n);
              if(isValidWord(nArray)==false){
                return false;
              }
            }
          }
        }
    }
      return true;
}
    }

  return false;
}*/
public boolean makePlay(Pieces[] p,int xcor,int ycor, int direction, Player l){
  if(isValidPlay(p,xcor,ycor,direction)){
    if(direction==1){
      l.addScore(playScore(p,xcor,ycor,1));
      for(int i=0;i<p.length;i++){
        modifyBoard(xcor+i,ycor,p[i].getPieceChar());
        }
    return true;
  }
  if(direction==-1){
    l.addScore(playScore(p,xcor,ycor,-1));
    for(int i=0;i<p.length;i++){
      modifyBoard(xcor,ycor=i,p[i].getPieceChar());
      }
  return true;
}
}
  return false;
}
public boolean isValidPlay(Pieces[] p,int xcor,int ycor, int direction){
  if(isValidWord(p)==false){
    return false;
  }

  else if(direction==1){
    if((xcor+p.length)>14){
      return false;
    }
    for(int i=0;i<p.length;i++){
      if(getPieces(xcor+i,ycor).getPieceChar()!=' '|| getPieces(xcor+i,ycor).getPieceChar()!=p[i].getPieceChar()){
        return false;
      }
    }
    return true;
  }
  else if(direction==-1){
    if((ycor+p.length)>14){
      return false;
    }
    for(int i=0;i<p.length;i++){
      if(getPieces(xcor,ycor+i).getPieceChar()!=' '|| getPieces(xcor,ycor+i).getPieceChar()!=p[i].getPieceChar()){
        return false;
      }
    }
    return true;
  }
  return false;
}


public Pieces[] listToArray(ArrayList<Pieces> p ){
  Pieces[] n = new Pieces[p.size()];
  for(int i=0;i<p.size();i++){
    n[i]=p.get(i);
  }
  return n;


}
/*public boolean isValidWord(Pieces[] p){
    //p = toBePlayed;
    String word = "";
    for (int i = 0; i < p.length; i++){
      word += p[i].getPieceChar();
    }
    word=word.toUpperCase();
    System.out.println(word);
    Scanner wordCheck = new Scanner("words.txt");
    while (wordCheck.hasNextLine()){
      if (word.equals(wordCheck.next().toUpperCase())){
        return true;
      }
    }
    return false;
  }
*/
}
