package demo.lyy.dagger1;

import dagger.Module;
import dagger.Provides;

@Module
public class RoseModule {

    @Provides
    Flower provideRose() {
        return new Rose();
    }
}
