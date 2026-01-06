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
        public static final RegistryObject<Block> DEEPSLATE_PANEL = registerBlock("deepslate_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
        public static final RegistryObject<Block> COBBLESTONE_PANEL = registerBlock("cobblestone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_PANEL = registerBlock("polished_deepslate_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
        public static final RegistryObject<Block> POLISHED_DIORITE_PANEL = registerBlock("polished_diorite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
        public static final RegistryObject<Block> POLISHED_GRANITE_PANEL = registerBlock("polished_granite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
        public static final RegistryObject<Block> POLISHED_ANDESITE_PANEL = registerBlock("polished_andesite_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
        public static final RegistryObject<Block> SANDSTONE_PANEL = registerBlock("sandstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
        public static final RegistryObject<Block> RED_SANDSTONE_PANEL = registerBlock("red_sandstone_panel",
                () -> new PanelBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));


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
