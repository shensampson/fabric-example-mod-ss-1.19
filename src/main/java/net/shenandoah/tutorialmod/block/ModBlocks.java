package net.shenandoah.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.shenandoah.tutorialmod.TutorialMod;
import net.shenandoah.tutorialmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().strength(5.0F, 5.0F)), ModItemGroup.TANZANITE);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);

    public static final Block DEEPLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);

    public static final Block KAI_BLOCK = registerBlock("kai_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.FAMILY);

    public static final Block TAJ_BLOCK = registerBlock("taj_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.FAMILY);

    public static final Block MAPLE_BLOCK = registerBlock("maple_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.FAMILY);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
        }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.debug(("Registering ModBlocks for " + TutorialMod.MOD_ID));
    }
}
