
package net.mcreator.frostanddicersvanillaenhanced.fuel;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class AshfuelFuel extends FrostAndDicersVanillaenhancedModElements.ModElement {

	public AshfuelFuel(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 23);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AshItem.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}

}
