package vintage.mods.gtcompanion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import vintage.mods.gtcompanion.load.GT_ItemsLoader;
import vintage.mods.gtcompanion.load.GT_RecipesLoader;

@Mod(modid = Refs.ID, name = Refs.NAME, dependencies = Refs.DEPS, useMetadata = true)
public class GTCompanion {

    public GTCompanion() {}

    @Mod.Init
    public void init(FMLInitializationEvent e) {
        GT_ItemsLoader.INSTANCE.init();
    }

    @Mod.PostInit
    public void postInit(FMLPostInitializationEvent e) {
        GT_RecipesLoader.INSTANCE.init();
        GT_RecipesLoader.INSTANCE.initRemovals();
    }
}
