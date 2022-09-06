package net.ria.flyingthingies.item;


import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ria.flyingthingies.FlyingThingies;
import net.minecraftforge.registries.RegistryObject;
import net.ria.flyingthingies.entities.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FlyingThingies.MOD_ID);
    //First Test Items
    public static final RegistryObject<Item> UKAENA_WINGS = ITEMS.register("ukaena_wings",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_RIAS_THINGIES)));

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_RIAS_THINGIES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

