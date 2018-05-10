package demo.lyy.dagger5;

import dagger.Subcomponent;

@Subcomponent(modules = HelperModule.class)
public interface HelperComponent {

    Test5Component plus();

}
