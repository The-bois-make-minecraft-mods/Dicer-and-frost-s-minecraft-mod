// Made with Blockbench 3.6.3

public static class Modelmccrab extends AnimatedEntityModel<Entity> {

	private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer lefteye;
	private final AnimatedModelRenderer righteye;
	private final AnimatedModelRenderer leftleg;
	private final AnimatedModelRenderer leg1;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer bone3;
	private final AnimatedModelRenderer leg2;
	private final AnimatedModelRenderer bone4;
	private final AnimatedModelRenderer bone5;
	private final AnimatedModelRenderer bone6;
	private final AnimatedModelRenderer leg3;
	private final AnimatedModelRenderer bone7;
	private final AnimatedModelRenderer bone8;
	private final AnimatedModelRenderer bone9;
	private final AnimatedModelRenderer rightleg;
	private final AnimatedModelRenderer leg4;
	private final AnimatedModelRenderer bone13;
	private final AnimatedModelRenderer bone14;
	private final AnimatedModelRenderer bone15;
	private final AnimatedModelRenderer leg5;
	private final AnimatedModelRenderer bone10;
	private final AnimatedModelRenderer bone11;
	private final AnimatedModelRenderer bone12;
	private final AnimatedModelRenderer leg6;
	private final AnimatedModelRenderer bone16;
	private final AnimatedModelRenderer bone17;
	private final AnimatedModelRenderer bone18;
	private final AnimatedModelRenderer rightpincer;
	private final AnimatedModelRenderer bone19;
	private final AnimatedModelRenderer bone20;
	private final AnimatedModelRenderer bone21;
	private final AnimatedModelRenderer bone22;
	private final AnimatedModelRenderer bone23;
	private final AnimatedModelRenderer bone24;
	private final AnimatedModelRenderer leftpincer2;
	private final AnimatedModelRenderer bone25;
	private final AnimatedModelRenderer bone26;
	private final AnimatedModelRenderer bone27;
	private final AnimatedModelRenderer bone28;
	private final AnimatedModelRenderer bone29;
	private final AnimatedModelRenderer bone30;

	public Modelmccrab() {
		textureWidth = 32;
		textureHeight = 32;
		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.5F, -3.0F, -2.5F, 7.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 6).addBox(-2.5F, -4.0F, -1.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		lefteye = new AnimatedModelRenderer(this);
		lefteye.setRotationPoint(-1.5F, -2.0F, -2.5F);
		body.addChild(lefteye);
		lefteye.setTextureOffset(0, 2).addBox(3.0F, -2.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lefteye.setModelRendererName("lefteye");
		this.registerModelRenderer(lefteye);

		righteye = new AnimatedModelRenderer(this);
		righteye.setRotationPoint(-1.5F, -2.0F, -2.5F);
		body.addChild(righteye);
		setRotationAngle(righteye, 0.0F, -0.0436F, 0.0F);
		righteye.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		righteye.setModelRendererName("righteye");
		this.registerModelRenderer(righteye);

		leftleg = new AnimatedModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);

		leftleg.setModelRendererName("leftleg");
		this.registerModelRenderer(leftleg);

		leg1 = new AnimatedModelRenderer(this);
		leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.addChild(leg1);

		leg1.setModelRendererName("leg1");
		this.registerModelRenderer(leg1);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(bone);
		bone.setTextureOffset(4, 16).addBox(3.5F, -2.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(4.5F, -1.5F, -2.0F);
		leg1.addChild(bone2);
		bone2.setTextureOffset(14, 12).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		bone3 = new AnimatedModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(bone3);
		bone3.setTextureOffset(14, 10).addBox(5.5F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setModelRendererName("bone3");
		this.registerModelRenderer(bone3);

		leg2 = new AnimatedModelRenderer(this);
		leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.addChild(leg2);

		leg2.setModelRendererName("leg2");
		this.registerModelRenderer(leg2);

		bone4 = new AnimatedModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(bone4);
		bone4.setTextureOffset(0, 16).addBox(3.5F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setModelRendererName("bone4");
		this.registerModelRenderer(bone4);

		bone5 = new AnimatedModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(bone5);
		bone5.setTextureOffset(14, 14).addBox(4.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setModelRendererName("bone5");
		this.registerModelRenderer(bone5);

		bone6 = new AnimatedModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(bone6);
		bone6.setTextureOffset(8, 14).addBox(5.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setModelRendererName("bone6");
		this.registerModelRenderer(bone6);

		leg3 = new AnimatedModelRenderer(this);
		leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.addChild(leg3);

		leg3.setModelRendererName("leg3");
		this.registerModelRenderer(leg3);

		bone7 = new AnimatedModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(bone7);
		bone7.setTextureOffset(11, 15).addBox(3.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setModelRendererName("bone7");
		this.registerModelRenderer(bone7);

		bone8 = new AnimatedModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(bone8);
		bone8.setTextureOffset(4, 14).addBox(4.5F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setModelRendererName("bone8");
		this.registerModelRenderer(bone8);

		bone9 = new AnimatedModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(bone9);
		bone9.setTextureOffset(0, 14).addBox(5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setModelRendererName("bone9");
		this.registerModelRenderer(bone9);

		rightleg = new AnimatedModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(rightleg, 0.0F, 3.1416F, 0.0F);

		rightleg.setModelRendererName("rightleg");
		this.registerModelRenderer(rightleg);

		leg4 = new AnimatedModelRenderer(this);
		leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.addChild(leg4);

		leg4.setModelRendererName("leg4");
		this.registerModelRenderer(leg4);

		bone13 = new AnimatedModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4.addChild(bone13);
		bone13.setTextureOffset(8, 10).addBox(3.5F, -2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.setModelRendererName("bone13");
		this.registerModelRenderer(bone13);

		bone14 = new AnimatedModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4.addChild(bone14);
		bone14.setTextureOffset(4, 10).addBox(4.5F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.setModelRendererName("bone14");
		this.registerModelRenderer(bone14);

		bone15 = new AnimatedModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4.addChild(bone15);
		bone15.setTextureOffset(0, 10).addBox(5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.setModelRendererName("bone15");
		this.registerModelRenderer(bone15);

		leg5 = new AnimatedModelRenderer(this);
		leg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.addChild(leg5);

		leg5.setModelRendererName("leg5");
		this.registerModelRenderer(leg5);

		bone10 = new AnimatedModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg5.addChild(bone10);
		bone10.setTextureOffset(4, 12).addBox(3.5F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.setModelRendererName("bone10");
		this.registerModelRenderer(bone10);

		bone11 = new AnimatedModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg5.addChild(bone11);
		bone11.setTextureOffset(0, 12).addBox(4.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.setModelRendererName("bone11");
		this.registerModelRenderer(bone11);

		bone12 = new AnimatedModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg5.addChild(bone12);
		bone12.setTextureOffset(11, 11).addBox(5.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setModelRendererName("bone12");
		this.registerModelRenderer(bone12);

		leg6 = new AnimatedModelRenderer(this);
		leg6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.addChild(leg6);

		leg6.setModelRendererName("leg6");
		this.registerModelRenderer(leg6);

		bone16 = new AnimatedModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg6.addChild(bone16);
		bone16.setTextureOffset(13, 6).addBox(3.5F, -2.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.setModelRendererName("bone16");
		this.registerModelRenderer(bone16);

		bone17 = new AnimatedModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg6.addChild(bone17);
		bone17.setTextureOffset(11, 13).addBox(4.5F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone17.setModelRendererName("bone17");
		this.registerModelRenderer(bone17);

		bone18 = new AnimatedModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg6.addChild(bone18);
		bone18.setTextureOffset(8, 12).addBox(5.5F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone18.setModelRendererName("bone18");
		this.registerModelRenderer(bone18);

		rightpincer = new AnimatedModelRenderer(this);
		rightpincer.setRotationPoint(0.0F, 24.0F, 0.0F);

		rightpincer.setModelRendererName("rightpincer");
		this.registerModelRenderer(rightpincer);

		bone19 = new AnimatedModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone19);
		bone19.setTextureOffset(20, 0).addBox(-4.0F, -3.6F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone19.setModelRendererName("bone19");
		this.registerModelRenderer(bone19);

		bone20 = new AnimatedModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone20);
		bone20.setTextureOffset(20, 0).addBox(-5.0F, -3.6F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone20.setModelRendererName("bone20");
		this.registerModelRenderer(bone20);

		bone21 = new AnimatedModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone21);
		bone21.setTextureOffset(20, 0).addBox(-6.0F, -3.6F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone21.setModelRendererName("bone21");
		this.registerModelRenderer(bone21);

		bone22 = new AnimatedModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone22);
		bone22.setTextureOffset(20, 0).addBox(-4.0F, -3.6F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone22.setModelRendererName("bone22");
		this.registerModelRenderer(bone22);

		bone23 = new AnimatedModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone23);
		bone23.setTextureOffset(20, 0).addBox(-4.0F, -3.6F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone23.setModelRendererName("bone23");
		this.registerModelRenderer(bone23);

		bone24 = new AnimatedModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightpincer.addChild(bone24);
		bone24.setTextureOffset(20, 0).addBox(-6.0F, -3.6F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone24.setModelRendererName("bone24");
		this.registerModelRenderer(bone24);

		leftpincer2 = new AnimatedModelRenderer(this);
		leftpincer2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(leftpincer2, 0.0F, 0.0F, -3.1416F);

		leftpincer2.setModelRendererName("leftpincer2");
		this.registerModelRenderer(leftpincer2);

		bone25 = new AnimatedModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone25);
		bone25.setTextureOffset(20, 0).addBox(-4.0F, 2.4F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone25.setModelRendererName("bone25");
		this.registerModelRenderer(bone25);

		bone26 = new AnimatedModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone26);
		bone26.setTextureOffset(20, 0).addBox(-5.0F, 2.4F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone26.setModelRendererName("bone26");
		this.registerModelRenderer(bone26);

		bone27 = new AnimatedModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone27);
		bone27.setTextureOffset(20, 0).addBox(-6.0F, 2.4F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone27.setModelRendererName("bone27");
		this.registerModelRenderer(bone27);

		bone28 = new AnimatedModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone28);
		bone28.setTextureOffset(20, 0).addBox(-4.0F, 2.4F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone28.setModelRendererName("bone28");
		this.registerModelRenderer(bone28);

		bone29 = new AnimatedModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone29);
		bone29.setTextureOffset(20, 0).addBox(-4.0F, 2.4F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone29.setModelRendererName("bone29");
		this.registerModelRenderer(bone29);

		bone30 = new AnimatedModelRenderer(this);
		bone30.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftpincer2.addChild(bone30);
		bone30.setTextureOffset(20, 0).addBox(-6.0F, 2.4F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone30.setModelRendererName("bone30");
		this.registerModelRenderer(bone30);

		this.rootBones.add(body);
		this.rootBones.add(leftleg);
		this.rootBones.add(rightleg);
		this.rootBones.add(rightpincer);
		this.rootBones.add(leftpincer2);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation("MODID", "animations/ANIMATIONFILE.json");
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}