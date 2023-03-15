package net.asodev.islandutils.mixins.accessors;

import net.minecraft.world.entity.WalkAnimationState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(WalkAnimationState.class)
public interface WalkAnimStateAccessor {

    @Accessor("position")
    public void setPosition(float position);

    @Accessor("speed")
    public void setSpeed(float position);

}
