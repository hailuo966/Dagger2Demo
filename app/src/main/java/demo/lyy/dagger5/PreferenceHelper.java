package demo.lyy.dagger5;

import javax.inject.Inject;

public class PreferenceHelper implements Helper{

    App context;

    @Inject
    public PreferenceHelper(App context) {
        this.context = context;
    }

    @Override
    public String show() {
        return getClass().getName();
    }
}
