import java.util.*;
// HangMan Game

public class Arrays {
	
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	String prompt = "    H@Ng M@N \nChoose category: \n[1](NBA Player) \n[2](Famous Rapper) \n[3](Fruits) \n[4](Colors)";
		String errorMessage = "Invalid Selection!";
		
    	
    	hangMan(userInputHandler(console,prompt,errorMessage));
		
        
        
	}

    public static Integer userInputHandler(Scanner console, String prompt, String errorMessage) {
		int userNumber;
		do {
			System.out.print(prompt);
		
			while(!console.hasNextInt()) {
			System.out.print(errorMessage);
			console.next();
		}
		userNumber = console.nextInt();
		}
		while(userNumber >4 || userNumber <1); 
		
		return userNumber;
		
	}
    public static void hangMan(int userNumber) {
        
    	//Categories for HangMan
    	char[] nbaPlayer = {'K','O','B','E',}; //1
        char[] famousRapper = {'D','R','A','K','E'}; //2
        char[] fruits = {'A','P','P','L','E'}; //3
        char[] color = {'B','L','A','C','K'}; //4
        
        String gameOver = "Congratulation!";
        String prompt = "Category Selected: ";
      
        switch (userNumber) {
        case 1:
            prompt += "NBA Player";
           hangMan2(nbaPlayer,prompt);
            break;
        case 2:
            prompt += "Famous Rapper";
            hangMan2(famousRapper,prompt);
            break;
        case 3:
            prompt += "Fruits";
            hangMan2(fruits,prompt);
            break;
        case 4:
            prompt += "Color";
            hangMan2(color,prompt);
            break;
        default:
            prompt = "Error!";
          System.out.print(prompt);
            break;
    }
       System.out.print(gameOver);
         
    }
    
    public static void hangMan2(char[] userGame, String prompt ) {
    	Scanner console = new Scanner(System.in);
    	String intro = "Guess a letter: ";
    	String userGuess = "";
    	int userAttempts = 0;
    	boolean letterFound = false;
    	boolean gameOver = false;
    	char[] userWord = new char[userGame.length];
    	
    	
    	System.out.print(prompt + "\n Lets Begin! \n");
    	
    	while(userAttempts < 9&&gameOver==false) {
    		userGuess = userInputHandler(console,intro).toUpperCase();
    		for (int i=0; i<userGame.length;i++) {
                if (userGame[i] == userGuess.charAt(0)) {
                    letterFound = true;
                    userWord[i]=userGame[i];
                
              
                }
                
            }

            if (letterFound) {
            	gameOver= true;
            	for (char letter : userWord) {
                      System.out.print(letter + ", ");
                  if(letter == '\u0000'){
                	  gameOver = false;
                		  
            	  
            	  
            	  }
            	  }
            	  letterFound = false;
            	  System.out.println();
            	  
           
            }
            	  
               else {
            	   userAttempts++;
            	   
            	 System.out.println(userGuess+" is incorrect. You have "+ (9-userAttempts) +" attempts left.");
            
            }
            }
    	}
    
    
    public static String userInputHandler(Scanner console, String prompt ) {
		String userLetter;
		//System.out.print(prompt);
		do {
			//console.next();
			System.out.print(prompt);
	        userLetter = console.next();
		}
		while(userLetter.length()!=1 ); 
		
		return userLetter;
		
	}
    
}
