
package net.mcreator.frostanddicersvanillaenhanced.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import net.mcreator.frostanddicersvanillaenhanced.block.ShadowstoneblockBlock;
import net.mcreator.frostanddicersvanillaenhanced.block.ShadowsandBlock;
import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class CorrupteddesertBiome extends FrostAndDicersVanillaenhancedModElements.ModElement {
	@ObjectHolder("frost_and_dicers_vanillaenhanced:corrupteddesert")
	public static final CustomBiome biome = null;
	public CorrupteddesertBiome(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0f).temperature(0.4f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.DESERT).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(ShadowsandBlock.block.getDefaultState(),
							ShadowstoneblockBlock.block.getDefaultState(), ShadowstoneblockBlock.block.getDefaultState())));
			setRegistryName("corrupteddesert");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
		}
	}
}
