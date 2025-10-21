package com.yurigobatto.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PINEAPPLE = new FoodProperties.Builder()
            .meat().nutrition(3).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 0.1F).build();

}
