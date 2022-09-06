package net.ria.flyingthingies.entities;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ria.flyingthingies.FlyingThingies;
import net.ria.flyingthingies.entities.custom.OathBreakerEntity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FlyingThingies.MOD_ID);

    public static final RegistryObject<EntityType<OathBreakerEntity>>
            OATHBREAKER_ENTITY = ENTITIES.register("oathbreaker", () -> EntityType.Builder.of(OathBreakerEntity::new, MobCategory.MONSTER).sized(1F, 1F)
                    .build(new ResourceLocation(FlyingThingies.MOD_ID, "oathbreaker").toString()));

}

