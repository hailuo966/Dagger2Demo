package demo.lyy.dagger4;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {

    @Provides
    @RosePot
    FlowerPot provideRosePot(@RoseFlower Flower flower) {
        return new FlowerPot(flower);
    }

    @Provides
    @LilyPot
    FlowerPot provideLilyPot(@LilyFlower Flower flower) {
        return new FlowerPot(flower);
    }

}
