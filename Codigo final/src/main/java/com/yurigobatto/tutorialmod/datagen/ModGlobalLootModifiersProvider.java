package com.yurigobatto.tutorialmod.datagen;

import com.yurigobatto.tutorialmod.TutorialMod;
import com.yurigobatto.tutorialmod.item.ModItems;
import com.yurigobatto.tutorialmod.loot.AddItemModifier;
import com.yurigobatto.tutorialmod.loot.AddSusSandItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, TutorialMod.MOD_ID);
    }

    @Override
    protected void start() {

        add("pineapple_crown_from_grass", new AddItemModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                },
                ModItems.PINEAPPLE_CROWN.get()
        ));

        add("pineapple_crown_from_creeper", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.parse("entities/creeper")).build()
                },
                ModItems.PINEAPPLE_CROWN.get()
        ));

        add("magnifying_glass_from_jungle_temples", new AddItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.parse("chests/jungle_temple")).build()
                },
                ModItems.MAGNIFYING_GLASS.get()
        ));

        add("magnifying_glass_from_suspicious_sand", new AddSusSandItemModifier(
                new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.parse("archaeology/desert_pyramid")).build()
                },
                ModItems.MAGNIFYING_GLASS.get()
        ));

    }
}
