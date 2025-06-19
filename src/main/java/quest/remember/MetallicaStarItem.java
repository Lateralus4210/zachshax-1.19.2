package quest.remember;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MetallicaStarItem extends Item {
    public MetallicaStarItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 1));
            user.getStackInHand(hand).decrement(1);
        }
        return TypedActionResult.success(user.getStackInHand(hand), world.isClient());
    }
}