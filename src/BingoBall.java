/*
 * Code Unit 2: Java code for BingoBall
 * that represents a ball used in a Bingo game.
 */ 
// adapted from Lewis' book
public class  BingoBall {
        private  char  letter;
        private int number;

        public  BingoBall(int num) {
        	number = num;
        	
        	if(num <= 15)
        		letter = 'B';
        	else if (num <= 30) 
        		letter = 'I';
        	else if (num <= 45) 
        		letter = 'N';
        	else if (num <= 60) 
        		letter = 'G';
        	else
        		letter = 'O';
        }

        public boolean equals(BingoBall bingoBall) {
        	return (letter==bingoBall.getLetter() && 
        			number == bingoBall.getNumber());
        	}

        public char getLetter() {
        	return letter;
        }
    
        public int getNumber() {
        	return number;
        } 

        public  String toString() {
        	return (letter + "" + number);
        } 
} 