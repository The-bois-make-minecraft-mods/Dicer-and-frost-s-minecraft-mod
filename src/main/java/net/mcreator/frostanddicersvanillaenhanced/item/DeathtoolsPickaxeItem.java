
package net.mcreator.frostanddicersvanillaenhanced.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class DeathtoolsPickaxeItem extends FrostAndDicersVanillaenhancedModElements.ModElement {
	@ObjectHolder("frost_and_dicers_vanillaenhanced:deathtools_pickaxe")
	public static final Item block = null;
	public DeathtoolsPickaxeItem(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2053;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 9;
			}

			public int getEnchantability() {
				return 63;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DeathtoolsPickaxeItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("deathtools_pickaxe"));
	}
}
