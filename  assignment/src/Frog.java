 //Frog.java

import java.util.Comparator;

public class Frog implements Amphibia, Comparable<Frog> {



        private String name;
        private double humidity;
        private String voice;

        public Frog() {
                this.name = "Kermit";
                this.humidity = 10;
                this.voice = "Crock";
        }

        public String getName() {
                return name;
        }

        public double getHumidity() {
                return humidity;
        }

        public String getVoice() {
                return voice;
        }

        @Override
        public String sound() {
                return this.toString();
        }

        @Override
        public double environment() {
                return humidity * 100;
        }

        @Override
        public String toString() {
                return name + " " + voice;
        }

        @Override
        public int compareTo(Frog o) {
                return Comparator.comparing(Frog::getName).thenComparing(Frog::getVoice).thenComparing(Frog::getHumidity)
                                .compare(this, o);
        }
        public static void main(String args[]) {
                // Frog frog=new Frog();
                // System.out.println(frog.environment());
                // System.out.println(frog.toString());
}
}

 