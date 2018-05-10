package demo.lyy.dagger4;

import javax.inject.Inject;

public class Rose extends Flower {

    @Inject
    public Rose() {
    }

    public String whisper() {
        return "热恋";
    }
}
