package net.ria.flyingthingies.entities.model;
// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.ria.flyingthingies.FlyingThingies;
import net.ria.flyingthingies.entities.custom.OathBreakerEntity;

import javax.swing.text.html.parser.Entity;

public class OathBreakerModel extends EntityModel<OathBreakerEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(FlyingThingies.MOD_ID, "oathbreakermc"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone5;

	public OathBreakerModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone5 = root.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.7385F, -14.9886F, -4.0F, 9.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-3.7385F, -15.9886F, -4.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(19, 16).addBox(-5.7385F, -13.9886F, -4.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(16, 43).addBox(-5.7385F, -8.9886F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 28).addBox(2.2615F, -15.9886F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-2.7385F, -12.9886F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 25).addBox(-1.7385F, -13.9886F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 50).addBox(-0.7385F, -12.9886F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 17).addBox(-3.7385F, -14.9886F, 3.0F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 0).addBox(-2.7385F, -8.9886F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 34).addBox(-1.7385F, -7.9886F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 50).addBox(4.2615F, -7.9886F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(49, 49).addBox(4.2615F, -9.9886F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 36).addBox(4.2615F, -10.9886F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 28).addBox(3.2615F, -11.9886F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 23).addBox(3.2615F, -11.9886F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 20).addBox(4.2615F, -12.9886F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 17).addBox(4.2615F, -12.9886F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(49, 13).addBox(4.2615F, -11.9886F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(35, 26).addBox(4.2615F, -8.9886F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 24).addBox(4.2615F, -13.9886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(4.2615F, -13.9886F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 24).addBox(4.2615F, -14.9886F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(27, 31).addBox(4.2615F, -8.9886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 23).addBox(4.2615F, -9.9886F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 4).addBox(-0.7385F, -6.9886F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 31).addBox(3.2615F, -6.9886F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 31).addBox(-0.7385F, -6.9886F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(4.2615F, -6.9886F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(3.2615F, -6.9886F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.2615F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.2615F, -7.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 2).addBox(-2.2615F, -8.9886F, 4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 36).addBox(-3.2615F, -14.9886F, 4.0F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 28).addBox(-2.2615F, -12.9886F, 5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 32).addBox(-2.2615F, -13.9886F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(0.7385F, -12.9886F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 38).addBox(-1.2615F, -7.9886F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(19, 20).addBox(0.0F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 3).addBox(0.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 27).addBox(1.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 10).addBox(3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 41).addBox(3.0F, -5.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(1.0F, -5.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 21).addBox(4.0F, -5.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 28).addBox(2.0F, -7.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(2.0F, -7.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 8).addBox(3.0F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -6.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition sabacak = bone5.addOrReplaceChild("sabacak", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = sabacak.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-2.3F, -8.0F, 2.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7754F, 0.0449F, -1.0263F, 0.0F, -0.2151F, 0.0F));

		PartDefinition cube_r3 = sabacak.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4627F, 0.0449F, 0.4982F, 0.0F, 0.2574F, 0.0F));

		PartDefinition cube_r4 = sabacak.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 24).addBox(-0.5804F, -4.9541F, 5.1838F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, -0.4114F, -0.0106F, -0.3313F, 0.3564F, -0.0326F));

		PartDefinition cube_r5 = sabacak.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0931F, 0.3564F, -0.0326F));

		PartDefinition cube_r6 = sabacak.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 36).addBox(-3.0304F, -4.9791F, 5.2338F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0908F, -0.385F, 0.1242F, -0.3202F, 0.0075F, 0.0F));

		PartDefinition cube_r7 = sabacak.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 9).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9379F, 0.0314F, 0.3669F, -0.082F, 0.0075F, 0.0F));

		PartDefinition cube_r8 = sabacak.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 8).addBox(-5.1018F, -5.3955F, 4.9911F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, 0.0866F, 1.5772F, -0.3202F, -0.4289F, 0.0F));

		PartDefinition cube_r9 = sabacak.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 28).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7086F, 0.0314F, -0.0118F, -0.082F, -0.4289F, 0.0F));

		PartDefinition cube_r10 = sabacak.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 45).addBox(-4.4F, -7.5F, 1.85F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0166F, -0.4551F, 0.0175F, 0.0F, -0.4289F, 0.0F));

		PartDefinition cube_r11 = sabacak.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 45).addBox(-2.95F, -7.7F, 0.675F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, -0.2551F, 0.0049F, 0.0F, 0.0075F, 0.0F));

		PartDefinition cube_r12 = sabacak.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -7.6F, 0.375F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0135F, -0.3824F, -0.0028F, 0.0F, 0.3564F, -0.0326F));

		PartDefinition solbacak = bone5.addOrReplaceChild("solbacak", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.175F));

		PartDefinition cube_r13 = solbacak.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4627F, 0.0449F, 5.3333F, 0.0F, -0.2574F, 0.0F));

		PartDefinition cube_r14 = solbacak.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 15).addBox(-2.3F, -8.0F, -4.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7754F, 0.0449F, 6.8578F, 0.0F, 0.2151F, 0.0F));

		PartDefinition cube_r15 = solbacak.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 48).addBox(-1.125F, -7.5F, -2.675F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0043F, -0.4828F, 6.1591F, 0.0F, -0.3564F, -0.0326F));

		PartDefinition cube_r16 = solbacak.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(47, 6).addBox(-2.95F, -7.7F, -3.025F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0069F, -0.2551F, 6.1766F, 0.0F, -0.0075F, 0.0F));

		PartDefinition cube_r17 = solbacak.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 43).addBox(-4.25F, -7.5F, -4.175F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0153F, -0.4551F, 6.172F, 0.0F, 0.4289F, 0.0F));

		PartDefinition cube_r18 = solbacak.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5804F, -4.9541F, -10.1838F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, -0.4114F, 5.8421F, 0.3313F, -0.3564F, -0.0326F));

		PartDefinition cube_r19 = solbacak.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.8315F, 0.0931F, -0.3564F, -0.0326F));

		PartDefinition cube_r20 = solbacak.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(41, 31).addBox(-3.0304F, -4.9791F, -10.2338F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0908F, -0.385F, 5.7074F, 0.3202F, -0.0075F, 0.0F));

		PartDefinition cube_r21 = solbacak.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9379F, 0.0314F, 5.4647F, 0.082F, -0.0075F, 0.0F));

		PartDefinition cube2_r1 = solbacak.addOrReplaceChild("cube2_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-5.1018F, -5.3955F, -9.9911F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, 0.0866F, 4.2543F, 0.3202F, 0.4289F, 0.0F));

		PartDefinition cube_r22 = solbacak.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7086F, 0.0314F, 5.8434F, 0.082F, 0.4289F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(OathBreakerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

}