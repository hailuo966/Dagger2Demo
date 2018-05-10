package demo.lyy.dagger4;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface FlowerComponent {

    @RoseFlower
    Flower getRose();

    @LilyFlower
    Flower getLily();
}
