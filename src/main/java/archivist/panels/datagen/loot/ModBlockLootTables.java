package archivist.panels.datagen.loot;

import archivist.panels.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AMETHYST_PANEL.get());
        this.dropSelf(ModBlocks.ANDESITE_PANEL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_PANEL.get());
        this.dropSelf(ModBlocks.CALCITE_PANEL.get());
        this.dropSelf(ModBlocks.COAL_PANEL.get());
        this.dropSelf(ModBlocks.COBBLESTONE_PANEL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_PANEL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.DIAMOND_PANEL.get());
        this.dropSelf(ModBlocks.DIORITE_PANEL.get());
        this.dropSelf(ModBlocks.DRIPSTONE_PANEL.get());
        this.dropSelf(ModBlocks.EMERALD_PANEL.get());
        this.dropSelf(ModBlocks.ENDSTONE_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.ENDSTONE_PANEL.get());
        this.dropSelf(ModBlocks.GOLD_PANEL.get());
        this.dropSelf(ModBlocks.GRANITE_PANEL.get());
        this.dropSelf(ModBlocks.IRON_PANEL.get());
        this.dropSelf(ModBlocks.LAPIS_PANEL.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_PANEL.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.NETHERITE_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_PANEL.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_PANEL.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.QUARTZ_PANEL.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_PANEL.get());
        this.dropSelf(ModBlocks.REDSTONE_PANEL.get());
        this.dropSelf(ModBlocks.SANDSTONE_PANEL.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_PANEL.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_PANEL.get());
        this.dropSelf(ModBlocks.STONE_BRICK_PANEL.get());
        this.dropSelf(ModBlocks.STONE_PANEL.get());
        this.dropSelf(ModBlocks.TUFF_PANEL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
