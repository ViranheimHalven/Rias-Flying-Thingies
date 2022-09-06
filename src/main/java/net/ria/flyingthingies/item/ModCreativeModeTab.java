package net.ria.flyingthingies.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_RIAS_THINGIES = new CreativeModeTab("rias_thingies") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.UKAENA_WINGS.get());
        }
    };
}
