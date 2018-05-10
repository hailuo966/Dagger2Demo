package demo.lyy.dagger4;

import dagger.Component;

@Component(modules = {FlowerModule.class}, dependencies = PotComponent.class)
public interface Test4Component {
    void inject(Test4 test4);
}
