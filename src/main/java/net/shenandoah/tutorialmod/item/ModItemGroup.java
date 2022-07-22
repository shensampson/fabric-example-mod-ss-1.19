package net.shenandoah.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shenandoah.tutorialmod.TutorialMod;

public class  ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));

    public static final ItemGroup POKEMON = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "pokemon"), () -> new ItemStack(ModItems.PIKACHU));

    public static final ItemGroup FAMILY = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "family"), () -> new ItemStack(ModItems.MAPLE));

    public static final ItemGroup WEAPONS = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "weapons"), () -> new ItemStack(ModItems.GALAXY_PIERCER));


    // Identifier(TutorialMod.MOD_ID, path: X) determines the name of the item group
    // It looks for the itemGroup.tutorialmod.X in the .json
    // ItemStack(ModItems.X) determines the image of the item group (so here PIKACHU (or another specific Pokemon must be used, not 'POKEMON')
}
