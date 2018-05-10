package demo.lyy.dagger3;

import javax.inject.Inject;

public class Lily extends Flower {
    @Inject
    public Lily() {
    }

    public String whisper() {
        return "纯洁";
    }
}
