package innerClass;

public class Collection {
    private static Number[] array;

    public Collection(Number[] array) {
        this.array = new Number[]{1, 2, 3, 4, 5};
    }


    static class ToZero implements Iterator {


        @Override
        public void hasNext() {
//            System.out.println(Number.toString(array));
        }

        @Override
        public void next() {

            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    i = 0;
                }
                System.out.println(array[i]);
            }

        }

        @Override
        public java.util.Iterator iterator() {
            return null;
        }
    }
}
