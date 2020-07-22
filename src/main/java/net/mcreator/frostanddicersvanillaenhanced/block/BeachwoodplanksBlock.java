
package net.mcreator.frostanddicersvanillaenhanced.block;

import net.minecraft.block.material.Material;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class BeachwoodplanksBlock extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:beachwoodplanks")
	public static final Block block = null;

	public BeachwoodplanksBlock(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 38);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.5f, 10f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.AXE));

			setRegistryName("beachwoodplanks");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
