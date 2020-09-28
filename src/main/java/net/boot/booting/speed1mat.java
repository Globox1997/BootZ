package net.boot.booting;

import net.boot.speed;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class speed1mat implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] { speed.CONFIG.iron_durability, 1, 1, 1 };
    private static final int[] PROTECTION_AMOUNTS = new int[] { speed.CONFIG.iron_protection, 2, 3, 1 };

    @Override
    public int getDurability(EquipmentSlot equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 15;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot) {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }

    @Override
    public String getName() {
        return "boots1";
    }

    @Override
    public float getToughness() {
        return 0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0F;
    }

}