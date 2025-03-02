package vintage.mods.gtcompanion.load;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_OreDictUnificator;
import gregtechmod.api.util.GT_Recipe;

public class GT_RecipesLoader {

    public static final GT_RecipesLoader INSTANCE = new GT_RecipesLoader();

    public void init() {
        // crafting
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get("dustKanthal", 3), "dustIron", "dustChrome", "dustAluminium");
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get("dustSmallCupronickel", 6), "dustCopper", "dustNickel");
        // smelting
        GT_ModHandler.addDustToIngotSmeltingRecipe(GT_OreDictUnificator.get("dustCupronickel", 1), GT_OreDictUnificator.get("ingotCupronickel", 1));

        // alloys
        GregTech_API.sRecipeAdder.addBlastRecipe(GT_OreDictUnificator.get("dustKanthal", 1), null, GT_OreDictUnificator.get("ingotKanthal", 1), null, 5100, 128, 2500);
        GregTech_API.sRecipeAdder.addAlloySmelterRecipe(GT_OreDictUnificator.get("ingotNickel", 4), GT_OreDictUnificator.get("ingotChrome", 1), GT_OreDictUnificator.get("ingotNichrome", 5), 250, 16);
        GregTech_API.sRecipeAdder.addAlloySmelterRecipe(GT_OreDictUnificator.get("ingotNickel", 1), GT_OreDictUnificator.get("ingotCopper", 1), GT_OreDictUnificator.get("ingotCupronickel", 2), 100, 16);
    }

    public void initRemovals() {
        // remove wrong GT recipe
        int recipeIndex = GT_Recipe.findEqualAlloySmelterRecipeIndex(GT_OreDictUnificator.get("ingotCopper", 1), GT_OreDictUnificator.get("ingotCopper", 1));
        if (recipeIndex != -1) {
            GT_Recipe.sAlloySmelterRecipes.remove(recipeIndex);
        }
    }
}
