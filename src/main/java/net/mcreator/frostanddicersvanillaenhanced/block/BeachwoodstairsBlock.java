
package net.mcreator.frostanddicersvanillaenhanced.block;

import net.minecraft.block.material.Material;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class BeachwoodstairsBlock extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:beachwoodstairs")
	public static final Block block = null;

	public BeachwoodstairsBlock(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 40);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK)).getDefaultState(),

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.5f, 10f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.AXE).notSolid());

			setRegistryName("beachwoodstairs");
		}

		@Override
		public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return false;
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
