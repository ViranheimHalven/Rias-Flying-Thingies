package net.ria.flyingthingies.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ria.flyingthingies.FlyingThingies;
import net.ria.flyingthingies.entities.ModEntityTypes;
import net.ria.flyingthingies.entities.model.OathBreakerModel;
import net.ria.flyingthingies.entities.renderer.OathBreakerRenderer;

@Mod.EventBusSubscriber(modid = FlyingThingies.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.OATHBREAKER_ENTITY.get(), OathBreakerRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(OathBreakerModel.LAYER_LOCATION, OathBreakerModel::createBodyLayer);
    }
}
