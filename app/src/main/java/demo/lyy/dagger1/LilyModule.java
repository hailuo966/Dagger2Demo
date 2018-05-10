package demo.lyy.dagger1;

import dagger.Module;
import dagger.Provides;

@Module
public class LilyModule {

    @Provides
    Flower provideLily() {
        return new Lily();
    }

}
