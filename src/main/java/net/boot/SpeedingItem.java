package net.boot;

import net.boot.booting.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpeedingItem {
        public static final ArmorMaterial SPEED1 = new speed1mat();
        public static final ArmorMaterial SPEED2 = new speed2mat();
        public static final ArmorMaterial SPEED3 = new speed3mat();

        public static final Item boots1 = register("boots1", new speedboots1(SPEED1, EquipmentSlot.FEET));
        public static final Item boots2 = register("boots2",
                        new speedboots2(SPEED2, EquipmentSlot.FEET));
        public static final Item boots3 = register("boots3",
                        new speedboots3(SPEED3, EquipmentSlot.FEET));

        private static Item register(String id, Item item) {
                return register(new Identifier("boot", id), item);
        }

        private static Item register(Identifier id, Item item) {
                if (item instanceof BlockItem) {
                        ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
                }

                return Registry.register(Registry.ITEM, id, item);
        }

        public static void init() {
        }
}