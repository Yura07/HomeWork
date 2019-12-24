package generics.task2;

public class MyEntry<K, V> {
    K k;
    V v;

    public MyEntry() {
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
