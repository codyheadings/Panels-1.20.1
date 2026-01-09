package archivist.panels.block;

import archivist.panels.Panels;
import archivist.panels.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

    public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, Panels.MODID);

        public static final RegistryObject<Block> ANDESITE_PANEL = registerBlock("andesite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
        public static final RegistryObject<Block> BASALT_PANEL = registerBlock("basalt_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)));
        public static final RegistryObject<Block> DEEPSLATE_PANEL = registerBlock("deepslate_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
        public static final RegistryObject<Block> COBBLESTONE_PANEL = registerBlock("cobblestone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_PANEL = registerBlock("mossy_cobblestone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_PANEL = registerBlock("polished_deepslate_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
        public static final RegistryObject<Block> POLISHED_DIORITE_PANEL = registerBlock("polished_diorite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
        public static final RegistryObject<Block> POLISHED_GRANITE_PANEL = registerBlock("polished_granite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
        public static final RegistryObject<Block> GRANITE_PANEL = registerBlock("granite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
        public static final RegistryObject<Block> POLISHED_ANDESITE_PANEL = registerBlock("polished_andesite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
        public static final RegistryObject<Block> SANDSTONE_PANEL = registerBlock("sandstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
        public static final RegistryObject<Block> RED_SANDSTONE_PANEL = registerBlock("red_sandstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
        public static final RegistryObject<Block> STONE_PANEL = registerBlock("stone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
        public static final RegistryObject<Block> STONE_BRICK_PANEL = registerBlock("stone_brick_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
        public static final RegistryObject<Block> MOSSY_STONE_BRICK_PANEL = registerBlock("mossy_stone_brick_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
        public static final RegistryObject<Block> SMOOTH_STONE_PANEL = registerBlock("smooth_stone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
        public static final RegistryObject<Block> TUFF_PANEL = registerBlock("tuff_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
        public static final RegistryObject<Block> CALCITE_PANEL = registerBlock("calcite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
        public static final RegistryObject<Block> DIORITE_PANEL = registerBlock("diorite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
        public static final RegistryObject<Block> DRIPSTONE_PANEL = registerBlock("dripstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
        public static final RegistryObject<Block> ENDSTONE_PANEL = registerBlock("endstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
        public static final RegistryObject<Block> ENDSTONE_BRICK_PANEL = registerBlock("endstone_brick_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
        public static final RegistryObject<Block> QUARTZ_PANEL = registerBlock("quartz_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
        public static final RegistryObject<Block> QUARTZ_BRICK_PANEL = registerBlock("quartz_brick_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
        public static final RegistryObject<Block> AMETHYST_PANEL = registerBlock("amethyst_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
        public static final RegistryObject<Block> COAL_PANEL = registerBlock("coal_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
        public static final RegistryObject<Block> DIAMOND_PANEL = registerBlock("diamond_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
        public static final RegistryObject<Block> EMERALD_PANEL = registerBlock("emerald_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
        public static final RegistryObject<Block> GOLD_PANEL = registerBlock("gold_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
        public static final RegistryObject<Block> IRON_PANEL = registerBlock("iron_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
        public static final RegistryObject<Block> NETHERITE_PANEL = registerBlock("netherite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
        public static final RegistryObject<Block> REDSTONE_PANEL = registerBlock("redstone_panel",
                () -> new PoweredPanelBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
        public static final RegistryObject<Block> LAPIS_PANEL = registerBlock("lapis_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));


        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        }

        public static void register(IEventBus eventBus){
            BLOCKS.register(eventBus);
        }

    }
