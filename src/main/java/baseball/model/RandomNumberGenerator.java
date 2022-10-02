package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public List<Integer> generate() {
        return Randoms.pickUniqueNumbersInRange(1,9, 3);
    }
}
