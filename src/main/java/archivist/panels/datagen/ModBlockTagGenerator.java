package archivist.panels.datagen;

import archivist.panels.Panels;
import archivist.panels.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Panels.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.AMETHYST_PANEL.get(),
                        ModBlocks.ANDESITE_PANEL.get(),
                        ModBlocks.BASALT_PANEL.get(),
                        ModBlocks.BLACKSTONE_PANEL.get(),
                        ModBlocks.CALCITE_PANEL.get(),
                        ModBlocks.COAL_PANEL.get(),
                        ModBlocks.COBBLESTONE_PANEL.get(),
                        ModBlocks.DEEPSLATE_PANEL.get(),
                        ModBlocks.DEEPSLATE_BRICK_PANEL.get(),
                        ModBlocks.DIAMOND_PANEL.get(),
                        ModBlocks.DIORITE_PANEL.get(),
                        ModBlocks.DRIPSTONE_PANEL.get(),
                        ModBlocks.EMERALD_PANEL.get(),
                        ModBlocks.ENDSTONE_BRICK_PANEL.get(),
                        ModBlocks.ENDSTONE_PANEL.get(),
                        ModBlocks.GOLD_PANEL.get(),
                        ModBlocks.GRANITE_PANEL.get(),
                        ModBlocks.IRON_PANEL.get(),
                        ModBlocks.LAPIS_PANEL.get(),
                        ModBlocks.MOSSY_COBBLESTONE_PANEL.get(),
                        ModBlocks.MOSSY_STONE_BRICK_PANEL.get(),
                        ModBlocks.NETHERITE_PANEL.get(),
                        ModBlocks.POLISHED_ANDESITE_PANEL.get(),
                        ModBlocks.POLISHED_BASALT_PANEL.get(),
                        ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.get(),
                        ModBlocks.POLISHED_BLACKSTONE_PANEL.get(),
                        ModBlocks.POLISHED_DEEPSLATE_PANEL.get(),
                        ModBlocks.POLISHED_DIORITE_PANEL.get(),
                        ModBlocks.POLISHED_GRANITE_PANEL.get(),
                        ModBlocks.QUARTZ_BRICK_PANEL.get(),
                        ModBlocks.QUARTZ_PANEL.get(),
                        ModBlocks.RED_SANDSTONE_PANEL.get(),
                        ModBlocks.REDSTONE_PANEL.get(),
                        ModBlocks.SANDSTONE_PANEL.get(),
                        ModBlocks.SMOOTH_BASALT_PANEL.get(),
                        ModBlocks.SMOOTH_STONE_PANEL.get(),
                        ModBlocks.TUFF_PANEL.get()
                );


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.DIAMOND_PANEL.get(),
                        ModBlocks.EMERALD_PANEL.get(),
                        ModBlocks.GOLD_PANEL.get(),
                        ModBlocks.REDSTONE_PANEL.get()
                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHERITE_PANEL.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.COAL_PANEL.get(),
                        ModBlocks.IRON_PANEL.get(),
                        ModBlocks.LAPIS_PANEL.get()
                );


    }
}