
package net.mcreator.frostanddicersvanillaenhanced.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.block.Blocks;

import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

import com.google.common.collect.ImmutableList;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class BogpitsBiome extends FrostAndDicersVanillaenhancedModElements.ModElement {
	@ObjectHolder("frost_and_dicers_vanillaenhanced:bogpits")
	public static final CustomBiome biome = null;
	public BogpitsBiome(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 15));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.NONE).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(),
							Blocks.COARSE_DIRT.getDefaultState(), Blocks.COARSE_DIRT.getDefaultState())));
			setRegistryName("bogpits");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			DefaultBiomeFeatures.addLakes(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.DEFAULT_FLOWER_CONFIG)
					.withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(4))));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.GRASS_CONFIG)
					.withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(4))));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_SELECTOR
							.withConfiguration(new MultipleRandomFeatureConfig(
									ImmutableList.of(Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).withChance(0.2F),
											Feature.FANCY_TREE.withConfiguration(DefaultBiomeFeatures.field_230131_m_).withChance(0.1F)),
									Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230132_o_)))
							.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
		}
	}
}