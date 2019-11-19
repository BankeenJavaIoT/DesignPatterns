public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
      
      changeState(subject, 15);
      changeState(subject, 10);
   }
   
   private static void changeState(Subject subject, int newState) {
	   System.out.print("changing state to: ");	
	   System.out.println(newState);	
	   subject.setState(newState);
   }
}
