package enumeration;

public class Demo2 {
    enum en {
        constants_A(),
        constants_B("hello"),
        constants_C(4, "hello"),
        constants_D(4, "hello");
        String description = "ABC";
        int i = 5;
        private en(){}
        private en(String description) {
            this.description = description;
        }
        private en(int i, String description) {
            this.i += i;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }

        @Override
        public String toString() {
            return "en{" +
                    "description='" + description + '\'' +
                    ", i=" + i +
                    '}';
        }
    }

    public static void main(String[] args) {
        en[] e = en.values();
        for (en x : e) {
            System.out.println(x);
        }
    }
}
