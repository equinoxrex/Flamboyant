package mod.equinox.flamboyant.block;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    private static BlockProperties ICON_TYPE = BlockProperties.CONCRETE;
    private static DyeColors ICON_COLOR = DyeColors.MAROON;
    public static final Block ICON_BLOCK = ICON_TYPE.create(ICON_COLOR);

    private static Block[] blocks = null;

    public static Block[] getAll() {
        if(blocks != null) return blocks;

        List<Block> blockList = new ArrayList<>();

        for(BlockProperties type : BlockProperties.values()) {
            if(type.isParent()) continue;

            for(DyeColors color : DyeColors.values()) {
                if(type == ICON_TYPE && color == ICON_COLOR) continue;
                System.out.println(type.create(color));
                blockList.add(type.create(color));
            }
        }

        blocks = new Block[blockList.size()];
        for(int i = 0; i < blockList.size(); i++) {
            blocks[i] = blockList.get(i);
        }
        return blocks;
    }
}
