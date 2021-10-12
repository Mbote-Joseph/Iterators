 //FrogMoistComparator.java

import java.util.Comparator;

public class FrogMoistComparator implements Comparator<Frog> {

        @Override
        public int compare(Frog o1, Frog o2) {
                if (o1.getHumidity() > o2.getHumidity()) {
                        return 1;
                } else if (o1.getHumidity() < o2.getHumidity()) {
                        return -1;
                } else {
                        return 0;
                }
        }

}