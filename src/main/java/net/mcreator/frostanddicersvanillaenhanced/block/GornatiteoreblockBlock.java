
package net.mcreator.frostanddicersvanillaenhanced.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

import java.util.List;
import java.util.Collections;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class GornatiteoreblockBlock extends FrostAndDicersVanillaenhancedModElements.ModElement {
	@ObjectHolder("frost_and_dicers_vanillaenhanced:gornatiteoreblock")
	public static final Block block = null;
	public GornatiteoreblockBlock(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3.1500000000000004f, 10f).lightValue(0)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE));
			setRegistryName("gornatiteoreblock");
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
