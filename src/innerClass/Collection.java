package innerClass;

public class Collection {
    private static Number[] array = {1,2,3,4,5};

    public Collection(Number[] array) {
        this.array = array;
    }




    static class ToZero implements Iterator {


        @Override
        public boolean hasNext() {
            System.out.println(array);
            return false;
        }

        @Override
        public Object next() {

            for (int i = 0; i < array.length ; i++) {
                if (i % 2 != 0){
                    i=0;
                }
                System.out.println(i);
            }
            return null;
        }
    }
}
