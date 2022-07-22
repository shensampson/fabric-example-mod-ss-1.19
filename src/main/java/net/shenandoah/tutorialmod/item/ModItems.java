package net.shenandoah.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shenandoah.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE_SWORD = registerItem("tanzanite_sword",
            new SwordItem(ModToolMaterial.TANZANITE, 7, 1.6f,
                    new FabricItemSettings().group(ModItemGroup.WEAPONS)));
// NOTE: we should create a ModToolMaterial.TANZANITE class see fabric 1.17 kaupenjoe tutorial

    public static final Item GALAXY_PIERCER = registerItem("galaxy_piercer",
            new SwordItem(ModToolMaterial.TANZANITE, 500, 2f,
                    new FabricItemSettings().group(ModItemGroup.WEAPONS)));
    // NOTE: we should create a ModToolMaterial.TANZANITE class see fabric 1.17 kaupenjoe tutorial

    public static final Item PIKACHU = registerItem("pikachu",
            new Item(new FabricItemSettings().group(ModItemGroup.POKEMON)));

    public static final Item EEVEE = registerItem("eevee",
            new Item(new FabricItemSettings().group(ModItemGroup.POKEMON)));

    public static final Item MAPLE = registerItem("maple",
        new Item(new FabricItemSettings().group(ModItemGroup.FAMILY)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
