package demo.lyy.dagger3;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {

    @Provides
    @RosePot
    FlowerPot providePot(@RoseFlower Flower flower) {
        return new FlowerPot(flower);
    }

    @Provides
    @LilyPot
    FlowerPot providePot2(@LilyFlower Flower flower) {
        return new FlowerPot(flower);
    }


}
