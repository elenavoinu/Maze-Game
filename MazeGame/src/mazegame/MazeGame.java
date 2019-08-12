
package mazegame;

import java.util.Scanner;

/*
 * @author Elena Voinu
 */
public class MazeGame {

     static Scanner sc = new Scanner(System.in);
  // maze movements
  static char myMove = '\0';
  // cell position
  static int currentCell = 0;
  static int score = 0;
  static boolean advance = true;
  static boolean checkThis = false;
  public static void main(String args[])
  {
   // the local variables declared and initialized
   char answer = 'Y';
  
   displayMenu();  
      
   while(answer == 'Y' || answer == 'y') 
   {
	displayMovement();
	makeYourMove();
	checkThis = checkYourMove();
	mazeStatus();
      
	System.out.println("move again(Y or N)?");
      answer = sc.next().charAt(0);
      
  }
   System.out.println("***************************");
  
}// end main() method

static void displayMenu()
{
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----The Maze Strategy---");
   System.out.println("");
}// end method

static void displayMovement()
{
	if(currentCell == 0)
	{
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		currentCell = 1;
                score++;
		mazeStatus();
		advance = true;
	}
      System.out.println("make your move (W, A, S, D)");
      System.out.println("W = up, A = left, S = down, D = right)");
     
}// end method

static void makeYourMove()
{
	myMove = sc.next().charAt(0);
	
	switch(myMove)
	{
	  case 'W': { MoveUp(); break; }
	  case 'A': { MoveLeft(); break; }
	  case 'S': { MoveDown(); break; }
	  case 'D': { MoveRight(); break; }
	}
   // end program menu
 }// end method
static boolean checkYourMove()
{
	if(currentCell == 1 && advance == true)
	{
		if (myMove == 'W')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
                if (myMove == 'D')
		{
			currentCell = 2;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
                score++;
	}
	if(currentCell == 2 && advance == true)
	{
		if (myMove == 'W')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			currentCell = 5;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
                
             
	}
        if(currentCell == 5 && advance == true)
	{
            
		if (myMove == 'W')
		{
                        currentCell = 2;
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'A')
		{
                        currentCell = 5;
			advance = false;
			System.out.println("TRY AGAIN");
			return advance;
		}
		if (myMove == 'D')
		{
                        currentCell = 6;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			currentCell = 5;
			advance = true;
			System.out.println("try again");
			return advance;
		}
	}
 
	if(currentCell == 6 && advance == true)
	{
            if (myMove == 'W')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			currentCell = 9;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	
	}

	if(currentCell == 9 && advance == true)
	{
           if (myMove == 'W')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		}
		if (myMove == 'S')
		{
			if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		}
	  	
	}

	return advance;
	// end program menu
 }// end method
static void MoveLeft()
{
   System.out.println("you moved to the left");
   score++;
}//end method
static void MoveRight()
{
	 System.out.println("you moved to the right");
	
}//end method
static void MoveUp()
{
	System.out.println("you moved up (forward)");
score++;	
}//end method
static void MoveDown()
{
	System.out.println("you moved down (downward)");
score++;	
}//end method
static void mazeStatus()
{
	System.out.println("current position: cell " + currentCell);
        System.out.println("Moves: " + score);    
  
}//end method

}// end class



  
