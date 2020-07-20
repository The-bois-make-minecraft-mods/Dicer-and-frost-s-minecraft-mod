package net.mcreator.frostanddicersvanillaenhanced.procedures;

@FrostAndDicersVanillaenhancedModElements.ModElement.Tag
public class CoconutitemLivingEntityIsHitWithItemProcedure extends FrostAndDicersVanillaenhancedModElements.ModElement {

	public CoconutitemLivingEntityIsHitWithItemProcedure(FrostAndDicersVanillaenhancedModElements instance) {
		super(instance, 5);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CoconutitemLivingEntityIsHitWithItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(CrackedcoconutItem.block, (int) (1));
			_setstack.setCount((int) 2);
			((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}

	}

}
