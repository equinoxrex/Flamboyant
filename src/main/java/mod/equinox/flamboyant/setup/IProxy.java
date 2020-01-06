package mod.equinox.flamboyant.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
