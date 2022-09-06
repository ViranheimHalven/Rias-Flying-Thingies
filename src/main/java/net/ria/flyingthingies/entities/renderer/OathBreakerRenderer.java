package net.ria.flyingthingies.entities.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.ria.flyingthingies.FlyingThingies;
import net.ria.flyingthingies.entities.custom.OathBreakerEntity;
import net.ria.flyingthingies.entities.model.OathBreakerModel;
import org.jetbrains.annotations.NotNull;

public class OathBreakerRenderer extends MobRenderer<OathBreakerEntity, OathBreakerModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(FlyingThingies.MOD_ID, "textures/entities/oathbreakermc.png");

    public OathBreakerRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new OathBreakerModel(ctx.bakeLayer(OathBreakerModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull OathBreakerEntity entity) {
        return TEXTURE;
    }

}
