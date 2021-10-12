 //FrogInfo.java

import java.util.ArrayList;
import java.util.Collections;

public class FrogInfo {
        
        public ArrayList<Frog> sortByName(ArrayList<Frog> list){
                Collections.sort(list, new FrogNameComparator());
                return list;            
        }

}