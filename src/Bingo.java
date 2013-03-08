//application driver for code unit 10, for testing remove method.
//==============================================
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet.add(ball);
//		}
//		
//		System.out.println("Size: " + bingoSet.size());
//		System.out.println();
//		
//		ball = new BingoBall(1);
//		System.out.println("A new bingo ball with value " + ball + " is created.");
//		System.out.println("Trying to remove the new Bingo ball from the set");
//		bingoSet.remove(ball);
//		System.out.println("The size after remove operation: " + bingoSet.size());
//	}
//}

//application driver for code unit 11, for testing size method.
//======================================================
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		final  int NUM_BALLS2 = 30;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet.add(ball);
//		}
//
//		System.out.println("Size: " + bingoSet.size());
//		System.out.println();
//
//		ArraySet<BingoBall> bingoSet2 = new ArraySet<BingoBall>();
//		System.out.println("Ten Bingo balls have been added.");
//		
//		for(int num=21; num <= NUM_BALLS2; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet2.add(ball);
//		}
//
//		System.out.println("Size: " + bingoSet2.size());
//		System.out.println("Done!");
//	}
//}

//application driver for code unit 12, for testing isEmpty method.
//======================================================
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet.add(ball);
//		}
//
//		System.out.println("Is Empty? " + bingoSet.isEmpty());
//		System.out.println();
//
//		ball = new BingoBall(1);
//		bingoSet.remove(ball);
//		ball = new BingoBall(2);
//		bingoSet.remove(ball);
//		ball = new BingoBall(3);
//		bingoSet.remove(ball);
//		ball = new BingoBall(4);
//		bingoSet.remove(ball);
//		System.out.println("Is Empty? " + bingoSet.isEmpty());
//		System.out.println("Done!");
//	}
//}

//application driver for code unit 13, test for the iterator method and for the ArrayIterator class.
//======================================================
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			bingoSet.add(ball);
//		}
//
//		ArrayIterator<BingoBall>  scan = (ArrayIterator<BingoBall>)bingoSet.iterator();
//		
//		while(scan.hasNext())
//			System.out.println(scan.next());
//		
//		System.out.println("Done!");
//	}
//}

//application driver for code unit 14, test for the toString method.
//======================================================
//
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet.add(ball);
//		}
//
//		System.out.println(bingoSet);
//		System.out.println("Done!");
//	}
//}

//application driver for code unit 15, test for the equals method.
//======================================================
//
//public class  Bingo {
//
//	public  static void  main(String[] args) {
//		final  int NUM_BALLS = 4;
//		ArraySet<BingoBall> bingoSet = new ArraySet<BingoBall>();
//		BingoBall ball;
//		System.out.println("Four Bingo balls have been added.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet.add(ball);
//		}
//
//		ArraySet<BingoBall> bingoSet2 = new ArraySet<BingoBall>();
//		System.out.println("Same four Bingo balls have been added to bingo2.");
//		
//		for(int num=1; num <= NUM_BALLS; num++) { 
//			ball = new BingoBall(num);
//			System.out.println(ball);
//			bingoSet2.add(ball);
//		}
//    	
//		System.out.println("Test if bingoSet is equal to bingoSet2 :");
//		System.out.println("The result is: " + bingoSet.equals(bingoSet2));
//		ArraySet<BingoBall> bingoSet3 = new ArraySet<BingoBall>();
//		System.out.println("One Bingo ball has been added to bingo3.");
//		ball = new BingoBall(2);
//		System.out.println(ball);
//		bingoSet3.add(ball);
//		System.out.println("Test if bingoSet is equal to bingoSet3 :");
//		System.out.println("The result is: " + bingoSet.equals(bingoSet3));
//		System.out.println("Done!");
//	}
//}

