package archivist.panels.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PoweredPanelBlock extends PanelBlock {
    public PoweredPanelBlock(Properties properties) {
        super(properties);
    }

    public boolean isSignalSource(BlockState context) {
        return true;
    }

    public int getSignal(BlockState p_55208_, BlockGetter p_55209_, BlockPos p_55210_, Direction p_55211_) {
        return 15;
    }
}
