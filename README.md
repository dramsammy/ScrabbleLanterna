# MKS21X-FinalProject

TEAM 41!--SCRABBLE--Oliver Ripps and Devin Ramsammy

GAME RULES AND INSTRUCTIONS!!!!!
WELCOME TO OUR SCRABBLE RECREATION!!!!
IN ORDER TO RUN OUR PROGRAM AND PLAY OUR WONDERFUL GAME, PLEASE FOLLOW OUR SIMPLE SPECIFICATIONS

1. In the terminal, run: bash run.sh
2. Assuming you have made it here...  WELCOME TO OUR GAME!!!!
   This is our menu screen, press 1 to play the game(DO THIS), 2 to view the instructions(what you are already reading!) or e to exit.
3. You will now be prompted to enter how many players are playing, press enter, and then type name of each player and enter.
4. You are now in the main screen hub!!!!! 
   To your upper left you will see each players and their score, at this point they are all 0.
   Just below that, you will see the piece to points key with how many points you will get from playing each tile. Followed by    the board color to multiplier key.
   On the right, you can see the board!!!!!
   The colors on the board can be interpretered from the previously mentioned color key.
   Below the board is your hand, 7 randomly drawn characters with their point values. The reason the point to key value and      this score are both valuable is because when pieces are on the board, they will no longer show their characters and you may    use them in overlapping words.
   In the bottom left, you will see the individual instructions of this menu. Each menu will specify directly what buttons to    press to do what; this screen prompts you to press s to make a move or e to escape the program.
   PRESS S!!!!!
5. You have now entered the hand menu!!!!
   Here you will see your hand as you did in the last screen,but this time with a position key. In order to create a word,        press the index of the position for the piece you want. As you select pieces, they will show up above your hand. You cannot    choose the same two pieces twice.
   Once you have selected all the pieces you want(ADRESS OVERLAP ISSUE), press s!!
   If you would like to go back, press enter.
6. 
   






Logs!!

1/3/19 - We both created all the java files and added in the basic framework of their instance varibales and methods. We started with the Pieces and Board files and went through coding and adding new methods as well as starting to create construtors.

1/4-6/19 - From friday through sunday(weekend's work), we spent a lot of time thinking critically about the function of our program and how we will need to adjust our original plan. After spending a lot of time figuring out how to print the board, we realized it would be most affective to have a pop up menu which we will adress after we finish the game mechanics. We also switched a lot of things behind the scenes including making every ArrayList into a 2D array for the board, reworking constructors to not take as many imputs, and creating accesor and modifier methods for Pieces.

1/7/19 - Oliver added a lot of manuel additions to the code, including programing the total pieces to start off with as well as the value assosiated with each one. We also changed the board constructor and set up the multipliers in the right place on the board. Devin worked on instance variables for each class, worked on player class, fixed dictionaries, fixed methods with player hand, setup word parsing, and worked on isvalidword boolean. Drew out a plan to continue working on the project

1/8/19 - Devin added some additions with the scoring methods in the Player class. Then we worked on the drawing mechanism for replacing the hands after a piece was played. We finalized the playing piece methods and worked on other instance variables for the game class. We finished the constructor and added name methods for the end of game and player. Oliver, in class, worked on functions to modify the board as well as creating a driver to test. He then went through each class we have been working on and "audited" them. This composed of debugging, deleting unneccesary functions, and making clear comments with purpose of functions and what we need to fix. LOT OF WORK DONE TODAY

1/9/19 - Today was a much less busy day. Oliver finished toString of the board and tested it. Overall we are fairly set for the basic parts of the game and now need to work with lanterna to create a physical image. Worked on adding imports for lanterna and testing basic terminal guis. Realized it would be best if we use screen. Fixed coords with some of the methods.

1/10/19 - In class, Oliver worked on the player functions of drawing pieces and Devin worked on figuring out how to use Laterna. Oliver took the night off to study for the APCS test tmr.

1/11-13/19 - Over the weekend, we did a lot of work to prepare for the demo on monday. On saturday,devin created the main for game with lanterna while Oliver polished off back end functions on friday. On sunday, Oliver worked on getting the board to print out properly with colors in one coordinate. He ran in to challenges with the color and new line. Ultimetely he had to split on \n and an inserted "exit key" to get it to the read the color correctly. After the board was up, both oliver and devin tried to add keys and fake score boards as well as the beggining of the turn mechanics to show for the demo.

1/14/19 - We both worked on the functionality of the game. Oliver edited the constructors and reconfigured the way players are initialized and constructed. He also fixed the hand and made it show up clearly with the position key under it. Devin worked on making the turn mechanic. He addded in being able to select postitions and having them show up. We also dealt with some minor formatting issues such as the color.

1/15/19 - Oliver worked on trying to figure out the try all words function, which checks if all possibly made words with the addition of one word work. In order to start this, he restructured and edited the current check word function. Also, he went through and fixed errors as well as deleted code that was no longer neccesary. 

1/16/19 - Oliver fixed the pick up piece and pick up hand methods. He incorperated random and fixed the pile system so it truley picks up a random set of letters. Also he readjusted the format of the display to look alittle neater. Devin add a new menu window and also more user functionality.

1/17/19 - Oliver worked on fixing the indexing methods and has value methods. Devin continued making the game more functional and adding new windows.

1/18-21/19 - We spent this time finishing our project and working on turns and logistics. We had a lot of work to be done in order to meet our minimum viable product. We had a lot of trouble getting an input from the user and altering the board. 
