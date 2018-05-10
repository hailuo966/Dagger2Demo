package demo.lyy.dagger5;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class HelperModule {

    @Provides
    @Named("T")
    ToastHelper getToastHelper(App app) {
        return new ToastHelper(app);
    }

    @Provides
    @Named("P")
    PreferenceHelper getPreferenceHelper(App app) {
        return new PreferenceHelper(app);
    }

}
