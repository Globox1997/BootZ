package net.boot;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class bloot {

    public static final Identifier[] LONE = new Identifier[] { LootTables.VILLAGE_ARMORER_CHEST,
            LootTables.VILLAGE_FLETCHER_CHEST, LootTables.VILLAGE_TOOLSMITH_CHEST };

    private static boolean isone(Identifier lootTable) {
        for (Identifier id : LONE) {
            if (id.equals(lootTable)) {
                return true;
            }
        }
        return false;
    }

    public static void init() {

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .withRolls(new BinomialLootTableRange(1, 0.3f))
                        .withEntry(ItemEntry.builder(SpeedingItem.boots1));

                supplier.withPool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .withRolls(new BinomialLootTableRange(1, 0.15f))
                        .withEntry(ItemEntry.builder(SpeedingItem.boots2));

                supplier.withPool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .withRolls(new BinomialLootTableRange(1, 0.02f))
                        .withEntry(ItemEntry.builder(SpeedingItem.boots3));

                supplier.withPool(poolBuilder);
            }
        });

    }
}