package net.ria.flyingthingies.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ria.flyingthingies.FlyingThingies;
import net.ria.flyingthingies.entities.ModEntityTypes;
import net.ria.flyingthingies.entities.custom.OathBreakerEntity;

@Mod.EventBusSubscriber(modid = FlyingThingies.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.OATHBREAKER_ENTITY.get(), OathBreakerEntity.getOathBreakerAttributes().build());
    }
}
