package archivist.panels.datagen;

import archivist.panels.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        panelRecipe(pWriter, ModBlocks.AMETHYST_PANEL.get(), Blocks.AMETHYST_BLOCK);
        panelRecipe(pWriter, ModBlocks.ANDESITE_PANEL.get(), Blocks.ANDESITE);
        panelRecipe(pWriter, ModBlocks.BASALT_PANEL.get(), Blocks.BASALT);
        panelRecipe(pWriter, ModBlocks.POLISHED_BASALT_PANEL.get(), Blocks.POLISHED_BASALT);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_BASALT_PANEL.get(), Blocks.BASALT);
        panelRecipe(pWriter, ModBlocks.BLACKSTONE_PANEL.get(), Blocks.BLACKSTONE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_BLACKSTONE_PANEL.get(), Blocks.BLACKSTONE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.get(), Blocks.BLACKSTONE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.get(), Blocks.POLISHED_BLACKSTONE);
        panelRecipe(pWriter, ModBlocks.POLISHED_BLACKSTONE_PANEL.get(), Blocks.POLISHED_BLACKSTONE);
        panelRecipe(pWriter, ModBlocks.POLISHED_BLACKSTONE_BRICK_PANEL.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        panelRecipe(pWriter, ModBlocks.CALCITE_PANEL.get(), Blocks.CALCITE);
        panelRecipe(pWriter, ModBlocks.COAL_PANEL.get(), Blocks.COAL_BLOCK);
        panelRecipe(pWriter, ModBlocks.COBBLESTONE_PANEL.get(), Blocks.COBBLESTONE);
        panelRecipe(pWriter, ModBlocks.DEEPSLATE_PANEL.get(), Blocks.COBBLED_DEEPSLATE);
        panelRecipe(pWriter, ModBlocks.DEEPSLATE_BRICK_PANEL.get(), Blocks.DEEPSLATE_BRICKS);
        panelRecipeStonecutter(pWriter, ModBlocks.DEEPSLATE_BRICK_PANEL.get(), Blocks.DEEPSLATE);
        panelRecipeStonecutter(pWriter, ModBlocks.DEEPSLATE_BRICK_PANEL.get(), Blocks.COBBLED_DEEPSLATE);
        panelRecipeStonecutter(pWriter, ModBlocks.DEEPSLATE_PANEL.get(), Blocks.DEEPSLATE);
        panelRecipe(pWriter, ModBlocks.DIAMOND_PANEL.get(), Blocks.DIAMOND_BLOCK);
        panelRecipe(pWriter, ModBlocks.DIORITE_PANEL.get(), Blocks.DIORITE);
        panelRecipe(pWriter, ModBlocks.DRIPSTONE_PANEL.get(), Blocks.DRIPSTONE_BLOCK);
        panelRecipe(pWriter, ModBlocks.EMERALD_PANEL.get(), Blocks.EMERALD_BLOCK);
        panelRecipe(pWriter, ModBlocks.ENDSTONE_BRICK_PANEL.get(), Blocks.END_STONE_BRICKS);
        panelRecipe(pWriter, ModBlocks.ENDSTONE_PANEL.get(), Blocks.END_STONE);
        panelRecipeStonecutter(pWriter, ModBlocks.ENDSTONE_BRICK_PANEL.get(), Blocks.END_STONE);
        panelRecipe(pWriter, ModBlocks.GOLD_PANEL.get(), Blocks.GOLD_BLOCK);
        panelRecipe(pWriter, ModBlocks.GRANITE_PANEL.get(), Blocks.GRANITE);
        panelRecipe(pWriter, ModBlocks.IRON_PANEL.get(), Blocks.IRON_BLOCK);
        panelRecipe(pWriter, ModBlocks.LAPIS_PANEL.get(), Blocks.LAPIS_BLOCK);
        panelRecipe(pWriter, ModBlocks.MOSSY_COBBLESTONE_PANEL.get(), Blocks.MOSSY_COBBLESTONE);
        panelRecipe(pWriter, ModBlocks.MOSSY_STONE_BRICK_PANEL.get(), Blocks.MOSSY_STONE_BRICKS);
        panelRecipeStonecutter(pWriter, ModBlocks.MOSSY_STONE_BRICK_PANEL.get(), Blocks.MOSSY_COBBLESTONE);
        panelRecipe(pWriter, ModBlocks.NETHERITE_PANEL.get(), Blocks.NETHERITE_BLOCK);
        panelRecipe(pWriter, ModBlocks.POLISHED_ANDESITE_PANEL.get(), Blocks.POLISHED_ANDESITE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_ANDESITE_PANEL.get(), Blocks.ANDESITE);
        panelRecipe(pWriter, ModBlocks.POLISHED_DEEPSLATE_PANEL.get(), Blocks.POLISHED_DEEPSLATE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_DEEPSLATE_PANEL.get(), Blocks.DEEPSLATE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_DEEPSLATE_PANEL.get(), Blocks.COBBLED_DEEPSLATE);
        panelRecipe(pWriter, ModBlocks.POLISHED_DIORITE_PANEL.get(), Blocks.POLISHED_DIORITE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_DIORITE_PANEL.get(), Blocks.DIORITE);
        panelRecipe(pWriter, ModBlocks.POLISHED_GRANITE_PANEL.get(), Blocks.POLISHED_GRANITE);
        panelRecipeStonecutter(pWriter, ModBlocks.POLISHED_GRANITE_PANEL.get(), Blocks.GRANITE);
        panelRecipe(pWriter, ModBlocks.QUARTZ_BRICK_PANEL.get(), Blocks.QUARTZ_BRICKS);
        panelRecipeStonecutter(pWriter, ModBlocks.QUARTZ_BRICK_PANEL.get(), Blocks.QUARTZ_BLOCK);
        panelRecipe(pWriter, ModBlocks.QUARTZ_PANEL.get(), Blocks.QUARTZ_BLOCK);
        panelRecipe(pWriter, ModBlocks.RED_SANDSTONE_PANEL.get(), Blocks.RED_SANDSTONE);
        panelRecipe(pWriter, ModBlocks.REDSTONE_PANEL.get(), Blocks.REDSTONE_BLOCK);
        panelRecipe(pWriter, ModBlocks.SANDSTONE_PANEL.get(), Blocks.SANDSTONE);
        panelRecipe(pWriter, ModBlocks.SMOOTH_BASALT_PANEL.get(), Blocks.SMOOTH_BASALT);
        panelRecipeStonecutter(pWriter, ModBlocks.SMOOTH_BASALT_PANEL.get(), Blocks.BASALT);
        panelRecipe(pWriter, ModBlocks.SMOOTH_STONE_PANEL.get(), Blocks.SMOOTH_STONE);
        panelRecipe(pWriter, ModBlocks.STONE_BRICK_PANEL.get(), Blocks.STONE_BRICKS);
        panelRecipeStonecutter(pWriter, ModBlocks.STONE_BRICK_PANEL.get(), Blocks.STONE);
        panelRecipe(pWriter, ModBlocks.STONE_PANEL.get(), Blocks.STONE);
        panelRecipe(pWriter, ModBlocks.TUFF_PANEL.get(), Blocks.TUFF);
    }

    private void panelRecipe(Consumer<FinishedRecipe> pWriter, Block panel, Block base) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, panel, 3)
                .pattern("#  ")
                .pattern("#  ")
                .pattern("#  ")
                .define('#', base)
                .unlockedBy(getHasName(base), has(base))
                .save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.DECORATIONS, panel, base);
    }

    private void panelRecipeStonecutter(Consumer<FinishedRecipe> pWriter, Block panel, Block base) {
        stonecutterResultFromBase(pWriter, RecipeCategory.DECORATIONS, panel, base);
    }

}
