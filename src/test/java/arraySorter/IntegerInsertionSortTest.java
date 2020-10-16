package arraySorter;

public class IntegerInsertionSortTest extends IntegerSortTest {
    @Override
    public ArraySort<Integer> getSorter() {
        return new InsertionSort<Integer>();
    }
}
