package com.ben.realmelee.item;

import com.ben.realmelee.RealMelee;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RealMelee.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REAL_MELEE_TAB = CREATIVE_TABS.register("real_melee_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.COMBAT_KNIFE.get()))
                    .title(Component.translatable("creativetab.realmelee_tab"))
                    .displayItems((parameters, output) -> {
                        // Weapons
                        output.accept(ModItems.COMBAT_KNIFE.get());
                        output.accept(ModItems.BUTTERFLY_KNIFE.get());
                        output.accept(ModItems.BAYONET.get());
                        output.accept(ModItems.TRENCH_KNIFE.get());
                        output.accept(ModItems.MACHETE.get());
                        output.accept(ModItems.TOMAHAWK.get());
                        output.accept(ModItems.CROWBAR.get());
                        output.accept(ModItems.NIGHTSTICK.get());
                        output.accept(ModItems.CLEAVER.get());
                        output.accept(ModItems.SPEAR.get());
                        output.accept(ModItems.BASEBALL_BAT.get());
                        output.accept(ModItems.FIRE_AXE.get());
                        output.accept(ModItems.KATANA.get());
                        output.accept(ModItems.TACTICAL_AXE.get());
                        output.accept(ModItems.WAR_HAMMER.get());
                        output.accept(ModItems.SLEDGEHAMMER.get());

                        // Armor - Tactical
                        output.accept(ModItems.TACTICAL_HELMET.get());
                        output.accept(ModItems.TACTICAL_CHESTPLATE.get());
                        output.accept(ModItems.TACTICAL_LEGGINGS.get());
                        output.accept(ModItems.TACTICAL_BOOTS.get());

                        // Armor - Scout
                        output.accept(ModItems.SCOUT_HELMET.get());
                        output.accept(ModItems.SCOUT_CHESTPLATE.get());
                        output.accept(ModItems.SCOUT_LEGGINGS.get());
                        output.accept(ModItems.SCOUT_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
