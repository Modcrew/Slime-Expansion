// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Body;
	private final ModelPart Additions;

	public Modelcustom_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Additions = root.getChild("Additions");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -32.0F, 6.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-10.0F, -27.0F, 12.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Face = Body.addOrReplaceChild("Face",
				CubeListBuilder.create().texOffs(4, 119)
						.addBox(2.0F, 12.0F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 122)
						.addBox(10.0F, 23.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 109)
						.addBox(18.0F, 14.0F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, -36.0F, 8.0F));

		PartDefinition Additions = partdefinition.addOrReplaceChild("Additions", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Additions.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(86, 95).addBox(-4.0F, -20.0F, 1.0F, 6.0F, 23.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -29.0F, 7.0F, -0.0734F, 0.7573F, -0.3556F));

		PartDefinition cube_r2 = Additions.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -12.0F, 5.0F, 7.0F, 21.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -29.0F, 7.0F, 0.9985F, 0.5671F, 0.8772F));

		PartDefinition cube_r3 = Additions.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(90, 65).addBox(-6.0F, -12.0F, -2.0F, 8.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -29.0F, 7.0F, 0.3333F, 0.0847F, -0.8736F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Additions.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}