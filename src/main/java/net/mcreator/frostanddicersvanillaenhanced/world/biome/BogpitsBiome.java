
package net.mcreator.frostanddicersvanillaenhanced.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;

import net.mcreator.frostanddicersvanillaenhanced.block.MudBlock;
import net.mcreator.frostanddicersvanillaenhanced.block.HardenedmudBlock;
import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

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
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 20));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0f).scale(0.1f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.NONE).waterColor(-11716345).waterFogColor(-11716345).parent("swamp")
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MudBlock.block.getDefaultState(),
							HardenedmudBlock.block.getDefaultState(), HardenedmudBlock.block.getDefaultState())));
			setRegistryName("bogpits");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			DefaultBiomeFeatures.addLakes(this);
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.ZOMBIE, 15, 1, 5));
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
			return -9741779;
		}
	}
}
