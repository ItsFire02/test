package its.fire.test.item;

import its.fire.test.util.ModTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraft.world.item.Tier;

public class ModToolTiers {
    public static final Tier SAPPHIRE = new ForgeTier(2500,10,7.5f,20,
            ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get()),
            ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL);


}
