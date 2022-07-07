package bouncing_balls.api.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public interface IBouncingBall {
	public boolean canBounce(LivingEntity entity);
	public void bounce(LivingEntity entity, float motionY);
	public float onFall(LivingEntity entity, ItemStack stack, float fallDistance);
}