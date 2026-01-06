package archivist.panels.item;

import archivist.panels.Panels;
import archivist.panels.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Panels.MODID);

    public static final RegistryObject<CreativeModeTab> PANELS_TAB = CREATIVE_MODE_TABS.register("panels_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_PANEL.get()))
                    .title(Component.translatable("creativetab.panels_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ANDESITE_PANEL.get());
                        pOutput.accept(ModBlocks.COBBLESTONE_PANEL.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PANEL.get());
                        pOutput.accept(ModBlocks.POLISHED_DEEPSLATE_PANEL.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
