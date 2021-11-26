package lotto.model;

import java.util.Collections;
import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> getLottos() {
        return Collections.unmodifiableList(lottos);
    }

    public Result makeResult(Lotto target) {
        Result result = new Result();
        lottos.stream()
              .map(lotto -> lotto.match(target))
              .forEach(matchedCount -> result.add(matchedCount));
        return result;
    }
}
