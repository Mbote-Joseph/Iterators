//FrogNameComparator.java

import java.util.Comparator;

public class FrogNameComparator implements Comparator<Frog> {

        @Override
        public int compare(Frog o1, Frog o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                        return 1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                        return -1;
                } else {
                        return 0;
                }
        } 

}