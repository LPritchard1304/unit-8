package arraySorter;

public class CharacterInsertionSortTest extends CharacterSortTest {
    @Override
    public ArraySort<Character> getSorter() {
        return new InsertionSort<Character>();
    }
}
