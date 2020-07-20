
package net.mcreator.frostanddicersvanillaenhanced.world.biome;

import net.minecraft.block.material.Material;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class BeachgetaywaysBiome extends FrostAndDicersVanillaenhancedModElements.ModElement {

	@ObjectHolder("frost_and_dicers_vanillaenhanced:beachgetayways")
	public static final CustomBiome biome = null;

	public BeachgetaywaysBiome(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
	}

	static class CustomBiome extends Biome {

		public CustomBiome() {
			super(new Biome.Builder().downfall(0.4f).depth(0.1f).scale(0.2f).temperature(0.7f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.BEACH).waterColor(-14368565).waterFogColor(-14368565).parent("ocean")
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(),
							Blocks.SANDSTONE.getDefaultState(), Blocks.SANDSTONE.getDefaultState())));

			setRegistryName("beachgetayways");

			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);

			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_SELECTOR
							.withConfiguration(new MultipleRandomFeatureConfig(
									ImmutableList.of(Feature.MEGA_SPRUCE_TREE.withConfiguration(DefaultBiomeFeatures.MEGA_PINE_TREE_CONFIG)
											.withChance(0.30769232F)),
									Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.SPRUCE_TREE_CONFIG)))
							.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(double posX, double posZ) {
			return -13261999;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor() {
			return -13261999;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -5916161;
		}

	}

}
