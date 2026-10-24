package com.ben.realmelee.item;

import com.ben.realmelee.RealMelee;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealMelee.MOD_ID);

    // ==================== MELEE WEAPONS ====================

    public static final RegistryObject<Item> COMBAT_KNIFE = ITEMS.register("combat_knife",
            () -> new SwordItem(Tiers.IRON, 2, -1.8f, new Item.Properties().durability(250)));

    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete",
            () -> new SwordItem(Tiers.IRON, 4, -2.2f, new Item.Properties().durability(320)));

    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.4f, new Item.Properties().durability(480)));

    public static final RegistryObject<Item> BAYONET = ITEMS.register("bayonet",
            () -> new SwordItem(Tiers.IRON, 3, -2.0f, new Item.Properties().durability(280)));

    public static final RegistryObject<Item> TRENCH_KNIFE = ITEMS.register("trench_knife",
            () -> new SwordItem(Tiers.IRON, 3, -1.9f, new Item.Properties().durability(260)));

    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat",
            () -> new SwordItem(Tiers.WOOD, 5, -2.8f, new Item.Properties().durability(200)));

    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar",
            () -> new SwordItem(Tiers.IRON, 4, -2.5f, new Item.Properties().durability(350)));

    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe",
            () -> new SwordItem(Tiers.IRON, 6, -3.0f, new Item.Properties().durability(400)));

    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear",
            () -> new SwordItem(Tiers.IRON, 5, -2.7f, new Item.Properties().durability(300)));

    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk",
            () -> new SwordItem(Tiers.IRON, 4, -2.3f, new Item.Properties().durability(290)));

    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer",
            () -> new SwordItem(Tiers.IRON, 8, -3.4f, new Item.Properties().durability(450)));

    public static final RegistryObject<Item> NIGHTSTICK = ITEMS.register("nightstick",
            () -> new SwordItem(Tiers.WOOD, 3, -2.0f, new Item.Properties().durability(220)));

    public static final RegistryObject<Item> BUTTERFLY_KNIFE = ITEMS.register("butterfly_knife",
            () -> new SwordItem(Tiers.IRON, 2, -1.6f, new Item.Properties().durability(200)));

    public static final RegistryObject<Item> CLEAVER = ITEMS.register("cleaver",
            () -> new SwordItem(Tiers.IRON, 5, -2.6f, new Item.Properties().durability(310)));

    public static final RegistryObject<Item> WAR_HAMMER = ITEMS.register("war_hammer",
            () -> new SwordItem(Tiers.IRON, 7, -3.2f, new Item.Properties().durability(420)));

    public static final RegistryObject<Item> TACTICAL_AXE = ITEMS.register("tactical_axe",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.5f, new Item.Properties().durability(500)));

    // ==================== TACTICAL ARMOR ====================

    public static final RegistryObject<Item> TACTICAL_HELMET = ITEMS.register("tactical_helmet",
            () -> new ArmorItem(ModArmorMaterials.TACTICAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(280)));

    public static final RegistryObject<Item> TACTICAL_CHESTPLATE = ITEMS.register("tactical_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TACTICAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(400)));

    public static final RegistryObject<Item> TACTICAL_LEGGINGS = ITEMS.register("tactical_leggings",
            () -> new ArmorItem(ModArmorMaterials.TACTICAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(360)));

    public static final RegistryObject<Item> TACTICAL_BOOTS = ITEMS.register("tactical_boots",
            () -> new ArmorItem(ModArmorMaterials.TACTICAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(300)));

    // Scout armor (lighter)
    public static final RegistryObject<Item> SCOUT_HELMET = ITEMS.register("scout_helmet",
            () -> new ArmorItem(ModArmorMaterials.SCOUT, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(200)));

    public static final RegistryObject<Item> SCOUT_CHESTPLATE = ITEMS.register("scout_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SCOUT, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(280)));

    public static final RegistryObject<Item> SCOUT_LEGGINGS = ITEMS.register("scout_leggings",
            () -> new ArmorItem(ModArmorMaterials.SCOUT, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(250)));

    public static final RegistryObject<Item> SCOUT_BOOTS = ITEMS.register("scout_boots",
            () -> new ArmorItem(ModArmorMaterials.SCOUT, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(220)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
