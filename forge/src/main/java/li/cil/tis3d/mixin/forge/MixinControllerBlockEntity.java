package li.cil.tis3d.mixin.forge;

import li.cil.tis3d.common.block.entity.ControllerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ControllerBlockEntity.class)
public abstract class MixinControllerBlockEntity extends BlockEntity {
    private MixinControllerBlockEntity(final BlockEntityType<?> type, final BlockPos pos, final BlockState state) {
        super(type, pos, state);
    }

    @SuppressWarnings("DataFlowIssue")
    private ControllerBlockEntity asControllerBlockEntity() {
        return (ControllerBlockEntity) (Object) this;
    }

    @Override
    public void onChunkUnloaded() {
        super.onChunkUnloaded();
        asControllerBlockEntity().dispose();
    }
}
