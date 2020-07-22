
package net.mcreator.frostanddicersvanillaenhanced.item;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class DeathtoolsSwordItem extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:deathtools_sword")
	public static final Item block = null;

	public DeathtoolsSwordItem(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(DeathtoolsSwordItem.block, (int) (1)));
			}
		}, 3, -1f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("deathtools_sword"));
	}

}
