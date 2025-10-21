package com.yurigobatto.tutorialmod.item;

import com.yurigobatto.tutorialmod.TutorialMod;
import com.yurigobatto.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());

                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_RUBY_BLOCK.get());

                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_RUBY_ORE.get());

                        pOutput.accept(ModItems.PINEAPPLE.get());
                        pOutput.accept(ModItems.PINEAPPLE_CROWN.get());
                        pOutput.accept(ModItems.PINEAPPLE_SEEDS.get());

                        pOutput.accept(ModItems.MAGNIFYING_GLASS.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.RUBY_STAIRS.get());
                        pOutput.accept(ModBlocks.RUBY_SLAB.get());
                        pOutput.accept(ModBlocks.RUBY_BUTTON.get());
                        pOutput.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.RUBY_FENCE.get());
                        pOutput.accept(ModBlocks.RUBY_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.RUBY_WALL.get());
                        pOutput.accept(ModBlocks.RUBY_DOOR.get());
                        pOutput.accept(ModBlocks.RUBY_TRAPDOOR.get());

                        pOutput.accept(ModItems.RUBY_HELMET.get());
                        pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                        pOutput.accept(ModItems.RUBY_BOOTS.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
