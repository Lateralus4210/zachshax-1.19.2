package quest.remember;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
// import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class UniversalBreedingHandler {
    private static final Set<Item> universalBreedingItems = new HashSet<>();
    private static boolean initialized = false;

    public static void init() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!initialized && client.world != null) {
                gatherBreedingItems();
                initialized = true;
            }
        });
    }

    private static void gatherBreedingItems() {
        universalBreedingItems.add(Items.WHEAT);
        universalBreedingItems.add(Items.CARROT);
        universalBreedingItems.add(Items.BEETROOT);
        universalBreedingItems.add(Items.POTATO);
        universalBreedingItems.add(Items.WHEAT_SEEDS);
        universalBreedingItems.add(Items.MELON_SEEDS);
        universalBreedingItems.add(Items.PUMPKIN_SEEDS);
        universalBreedingItems.add(Items.BEETROOT_SEEDS);
        universalBreedingItems.add(Items.SWEET_BERRIES);
        universalBreedingItems.add(Items.GLOW_BERRIES);
        universalBreedingItems.add(Items.SLIME_BALL); // Frogs
        universalBreedingItems.add(Items.TROPICAL_FISH_BUCKET); // Axolotls

        ZachsHax.LOGGER.info("Collected {} universal breeding items: {}",
                universalBreedingItems.size(),
                universalBreedingItems.stream().map(Item::toString).toList());
    }

    public static boolean isUniversalBreedingItem(Item item) {
        return universalBreedingItems.contains(item);
    }
}
