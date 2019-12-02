package bouncing_balls.itemgroup;

import bouncing_balls.BouncingBallsItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BouncingBallsItemGroup extends ItemGroup {

	public BouncingBallsItemGroup(String name) {
		super(name);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(BouncingBallsItems.redBouncingBall);
	}
}
