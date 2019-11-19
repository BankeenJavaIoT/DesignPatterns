import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }

/*
	// when howManyStates = 0, go back to the last saved state
   public Memento goBack(int howManyStates = 0) {
		for (int i = 0; i < howManyStates; i++) {
		   Memento memento = mementoList.pop(); 
		   // process memonto or use mementoList.remove() instead
		}
		return get(0);
   }	
*/

}
