package mod.equinox.flamboyant.setup;

import mod.equinox.flamboyant.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("flamboyant") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.MAROONCONCRETE);
        }
    };

    public void init() {

    }
}
