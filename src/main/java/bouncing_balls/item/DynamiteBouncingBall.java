package bouncing_balls.item;

import java.util.List;

import bouncing_balls.BouncingBalls;
import bouncing_balls.api.item.BouncingBall;
import bouncing_balls.api.item.MultiBouncingBall;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class DynamiteBouncingBall extends MultiBouncingBall {

	public DynamiteBouncingBall() {
		super(new Item.Properties().tab(BouncingBalls.ITEMGROUP), new BouncingBall.Properties(0.7f, 0.7f, 16f, 0.2f), 3, Items.GUNPOWDER);
	}
	
	@Override
	public void bounce(LivingEntity entity, float motionY) {
		super.bounce(entity, motionY);
		entity.level.explode(entity, entity.getX(), entity.getY(), entity.getZ(), 0.75F, false, Explosion.Mode.BREAK);
	}
	
	@Override
	public void playBounceSound(World world, Entity entity) {
		entity.playSound(SoundEvents.GENERIC_EXPLODE, 1f, 1f);
	}
	
	@Override
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag) {
		list.add(new TranslationTextComponent("bouncing_balls.dynamite.tooltip").setStyle(Style.EMPTY.withColor(Color.fromRgb(0xAAAAAA))));
		list.add(new TranslationTextComponent("bouncing_balls.dynamite.warning").setStyle(Style.EMPTY.withColor(Color.fromRgb(0xAA0000))));
    }
}