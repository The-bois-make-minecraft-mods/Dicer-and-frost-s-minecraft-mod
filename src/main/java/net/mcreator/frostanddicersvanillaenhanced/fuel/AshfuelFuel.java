
package net.mcreator.frostanddicersvanillaenhanced.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.frostanddicersvanillaenhanced.item.AshItem;
import net.mcreator.frostanddicersvanillaenhanced.FrostAndDicersVanillaenhancedModElements;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class AshfuelFuel extends FrostAndDicersVanillaenhancedModElements.ModElement {
	public AshfuelFuel(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 23);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AshItem.block, (int) (1)).getItem())
			event.setBurnTime(800);
	}
}
