package quest.remember;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KillEmAllItem extends Item {
    public KillEmAllItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if (!world.isClient && state.getBlock() instanceof StairsBlock) {
            BlockState newState = state.cycle(StairsBlock.HALF); // Toggle top ↔ bottom
            world.setBlockState(pos, newState);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
