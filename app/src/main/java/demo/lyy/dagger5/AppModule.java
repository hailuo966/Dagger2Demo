package demo.lyy.dagger5;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    App getApp() {
        return new App();
    }
}
