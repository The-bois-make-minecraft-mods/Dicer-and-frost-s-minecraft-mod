
package net.mcreator.frostanddicersvanillaenhanced.item;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class DeathtoolsShovelItem extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:deathtools_shovel")
	public static final Item block = null;

	public DeathtoolsShovelItem(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
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
				return Ingredient.fromStacks(new ItemStack(DeathtoolsShovelItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("deathtools_shovel"));
	}

}
