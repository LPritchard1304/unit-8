package timer.arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;
import scope.CharacterScope;
import timer.timer.Timer;

public class CharacterInsertionSortTimer extends InsertionSortTimer<Character> {
    @Override
    public Timer getTimer(int size) {
        ArrayGenerator<Character> generator = new CharacterArrayGenerator(new CharacterScope());
        setArray(generator.getArray(size));
        return this;
    }

    public static void main(String[] args) {
        InsertionSortTimer timer = new CharacterInsertionSortTimer();
        timer.timingSequence();
    }
}
