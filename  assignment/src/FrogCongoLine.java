//FrogCongoLine.java

import java.util.NoSuchElementException;

public class FrogCongoLine {

        private Frog[] frogs;
 
        public FrogCongoLine(Frog[] frogs) {
                this.frogs = new Frog[frogs.length];
                for (int i = 0, j = 0; i < frogs.length; i++) {
                        if (frogs[i].getName().length() % 2 == 1 && frogs[i].getHumidity() > 0.7)
                                this.frogs[j++] = frogs[i];
                }
        }

        public Frog[] getFrogs() {
                return frogs;
        }

        public Frog getFrog(String name) {
                for (int i = 0; i < frogs.length; i++) {
                        if (frogs[i].getName().equals(name))
                                return frogs[i];
                }
                throw new NoSuchElementException();
        }

        public Frog getFrog(int index) {
                if (index >= frogs.length)
                        throw new NoSuchElementException();
                return frogs[index];
        }
        public static void main(String args[]) {
        }
}
