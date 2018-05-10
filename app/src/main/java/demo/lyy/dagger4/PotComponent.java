package demo.lyy.dagger4;

import dagger.Component;

@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
public interface PotComponent {

    @RosePot
    FlowerPot getRosePot();

    @LilyPot
    FlowerPot getLilyPot();
}
