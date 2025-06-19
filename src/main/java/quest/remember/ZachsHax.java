package quest.remember;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZachsHax implements ModInitializer {
	public static final String MOD_ID = "zachshax";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item METALLICA_STAR = new MetallicaStarItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CHAOS_CRYSTAL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CHAOS_CRYSTAL_PAINTING = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item ZORGS_ORB = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PLAYERS_HANDBOOK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item MONSTER_MANUAL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item DRAGON_QUEEN_TOOTH = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item BONG = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item GREEN_PARTY_HAT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item BLUE_PARTY_HAT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item OLD_SCROLL = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static final Item KILL_EM_ALL = new KillEmAllItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item RIDE_THE_LIGHTNING = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item MASTER_OF_PUPPETS = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item AND_JUSTICE_FOR_ALL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item BLACK_ALBUM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item LOAD = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item RELOAD = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item GARAGE_INC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item S_AND_M = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item ST_ANGER = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static final Item CRYSTALABRUM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CUPCAKE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item LEPRECHAUN = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item PATRICK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item SPONGEBOB = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item SQUIDWARD = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item WREATH = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello world from ZachsHax for 1.19.2!");
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "metallica_star"), METALLICA_STAR);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chaos_crystal"), CHAOS_CRYSTAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chaos_crystal_painting"), CHAOS_CRYSTAL_PAINTING);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "zorgs_orb"), ZORGS_ORB);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "players_handbook"), PLAYERS_HANDBOOK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "monster_manual"), MONSTER_MANUAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dragon_queen_tooth"), DRAGON_QUEEN_TOOTH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bong"), BONG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_party_hat"), GREEN_PARTY_HAT);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blue_party_hat"), BLUE_PARTY_HAT);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "old_scroll"), OLD_SCROLL);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "kill_em_all"), KILL_EM_ALL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ride_the_lightning"), RIDE_THE_LIGHTNING);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "master_of_puppets"), MASTER_OF_PUPPETS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "and_justice_for_all"), AND_JUSTICE_FOR_ALL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "black_album"), BLACK_ALBUM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "load"), LOAD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "reload"), RELOAD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "garage_inc"), GARAGE_INC);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "s_and_m"), S_AND_M);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "st_anger"), ST_ANGER);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crystalabrum"), CRYSTALABRUM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cupcake"), CUPCAKE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "leprechaun"), LEPRECHAUN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "patrick"), PATRICK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spongebob"), SPONGEBOB);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "squidward"), SQUIDWARD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wreath"), WREATH);
	}
}