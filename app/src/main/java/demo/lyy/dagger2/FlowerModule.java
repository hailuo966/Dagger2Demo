package demo.lyy.dagger2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

    @Provides
    @Named("rose")
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @Named("lily")
    Flower provideLily() {
        return new Lily();
    }

}
