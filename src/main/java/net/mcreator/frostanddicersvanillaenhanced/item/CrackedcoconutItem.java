
package net.mcreator.frostanddicersvanillaenhanced.item;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class CrackedcoconutItem extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:crackedcoconut")
	public static final Item block = null;

	public CrackedcoconutItem(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(3).saturation(0.6f)

					.build()));
			setRegistryName("crackedcoconut");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 34;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("nutrision comes in all sorts including plant based milk."));
		}

	}

}
