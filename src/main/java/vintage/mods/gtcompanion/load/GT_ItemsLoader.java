package vintage.mods.gtcompanion.load;

import gregtechmod.common.items.GT_MetaItem_Dust;
import gregtechmod.common.items.GT_MetaItem_Material;

public class GT_ItemsLoader {

    public static final GT_ItemsLoader INSTANCE = new GT_ItemsLoader();

    public void init() {
        // add kanthal Dust
        GT_MetaItem_Dust.addItem(67, "Kanthal Dust", "Kanthal", "FeCrAl", false);
        GT_MetaItem_Dust.addItem(68, "Cupronickel Dust", "Cupronickel", "CuNi", false);
        // Ingots
        GT_MetaItem_Material.addItem(43, "Kanthal Ingot", "ingotKanthal", "FeCrAl", false);
        GT_MetaItem_Material.addItem(44, "Nichrome Ingot", "ingotNichrome", "Ni4Cr", false);
        GT_MetaItem_Material.addItem(45, "Cupronickel Ingot", "ingotCupronickel", "CuNi", false);
    }
}
