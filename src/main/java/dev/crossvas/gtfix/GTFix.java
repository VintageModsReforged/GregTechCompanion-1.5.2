package dev.crossvas.gtfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import gregtechmod.api.GregTech_API;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_OreDictUnificator;
import gregtechmod.common.items.GT_MetaItem_Dust;
import gregtechmod.common.items.GT_MetaItem_Material;

@Mod(modid = "gtfix", name = "GT Fix", dependencies = "required-after:GregTech_Addon", version = "1.5.2-1.0.1")
public class GTFix {

    @Mod.Init
    public void init(FMLInitializationEvent e) {
        // add kanthal Dust
        GT_MetaItem_Dust.addItem(67, "Kanthal Dust", "Kanthal", "FeCrAl", false);
        GT_MetaItem_Dust.addItem(68, "Cupronickel Dust", "Cupronickel", "CuNi", false);
        // Ingots
        GT_MetaItem_Material.addItem(43, "Kanthal Ingot", "ingotKanthal", "FeCrAl", false);
        GT_MetaItem_Material.addItem(44, "Nichrome Ingot", "ingotNichrome", "Ni4Cr", false);
        GT_MetaItem_Material.addItem(45, "Cupronickel Ingot", "ingotCupronickel", "CuNi", false);

        // crafting
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get("dustKanthal", 3), "dustIron", "dustChrome", "dustAluminium");
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get("dustSmallCupronickel", 6), "dustCopper", "dustNickel");
        // smelting
        GT_ModHandler.addDustToIngotSmeltingRecipe(GT_OreDictUnificator.get("dustCupronickel", 1), GT_OreDictUnificator.get("ingotCupronickel", 1));

        GregTech_API.sRecipeAdder.addBlastRecipe(GT_OreDictUnificator.get("dustKanthal", 1), null, GT_OreDictUnificator.get("ingotKanthal", 1), null, 5100, 128, 2500);
        GregTech_API.sRecipeAdder.addAlloySmelterRecipe(GT_OreDictUnificator.get("ingotNickel", 4), GT_OreDictUnificator.get("ingotChrome", 1), GT_OreDictUnificator.get("ingotNichrome", 5), 250, 16);
        GregTech_API.sRecipeAdder.addAlloySmelterRecipe(GT_OreDictUnificator.get("ingotNickel", 1), GT_OreDictUnificator.get("ingotCopper", 1), GT_OreDictUnificator.get("ingotCupronickel", 2), 100, 16);
    }
}
