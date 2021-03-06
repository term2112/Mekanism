package mekanism.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.client.render.MekanismRenderer;
import mekanism.client.render.MekanismRenderer.GlowInfo;
import mekanism.common.entity.EntityRobit;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelRobit extends EntityModel<EntityRobit> {

    private final ModelRenderer Body;
    private final ModelRenderer Bottom;
    private final ModelRenderer RightTrack;
    private final ModelRenderer LeftTrack;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Backpack;
    private final ModelRenderer headback;
    private final ModelRenderer rightarn;
    private final ModelRenderer leftarm;
    private final ModelRenderer righthand;
    private final ModelRenderer lefthand;
    private final ModelRenderer backLight;
    private final ModelRenderer eyeRight;
    private final ModelRenderer eyeLeft;

    public ModelRobit() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new ModelRenderer(this, 0, 0);
        Body.func_228304_a_(0F, 0F, 1F, 6, 4, 5, false);
        Body.setRotationPoint(-3F, 17F, -3F);
        Body.setTextureSize(64, 64);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Bottom = new ModelRenderer(this, 22, 0);
        Bottom.func_228304_a_(0F, 0F, 0F, 6, 2, 7, false);
        Bottom.setRotationPoint(-3F, 21F, -2.5F);
        Bottom.setTextureSize(64, 64);
        Bottom.mirror = true;
        setRotation(Bottom, 0F, 0F, 0F);
        RightTrack = new ModelRenderer(this, 26, 9);
        RightTrack.func_228304_a_(0F, 0F, 0F, 2, 3, 9, false);
        RightTrack.setRotationPoint(3F, 21F, -4F);
        RightTrack.setTextureSize(64, 64);
        RightTrack.mirror = true;
        setRotation(RightTrack, 0F, 0F, 0F);
        LeftTrack = new ModelRenderer(this, 0, 9);
        LeftTrack.func_228304_a_(0F, 0F, 0F, 2, 3, 9, false);
        LeftTrack.setRotationPoint(-5F, 21F, -4F);
        LeftTrack.setTextureSize(64, 64);
        LeftTrack.mirror = true;
        setRotation(LeftTrack, 0F, 0F, 0F);
        Neck = new ModelRenderer(this, 0, 26);
        Neck.func_228304_a_(0F, 0F, 0F, 3, 1, 2, false);
        Neck.setRotationPoint(-1.5F, 16F, -0.5F);
        Neck.setTextureSize(64, 64);
        Neck.mirror = true;
        setRotation(Neck, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 26, 21);
        Head.func_228304_a_(0F, 0F, 0F, 7, 3, 4, false);
        Head.setRotationPoint(-3.5F, 13.5F, -1.533333F);
        Head.setTextureSize(64, 64);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Backpack = new ModelRenderer(this, 14, 9);
        Backpack.func_228304_a_(0F, 0F, 0F, 4, 3, 6, false);
        Backpack.setRotationPoint(-2F, 16.8F, -4F);
        Backpack.setTextureSize(64, 64);
        Backpack.mirror = true;
        setRotation(Backpack, 0F, 0F, 0F);
        headback = new ModelRenderer(this, 17, 1);
        headback.func_228304_a_(0F, 0F, 0F, 5, 2, 1, false);
        headback.setRotationPoint(-2.5F, 14F, -2F);
        headback.setTextureSize(64, 64);
        headback.mirror = true;
        setRotation(headback, 0F, 0F, 0F);
        rightarn = new ModelRenderer(this, 0, 21);
        rightarn.func_228304_a_(0F, 0F, 0F, 1, 1, 4, false);
        rightarn.setRotationPoint(3F, 17.5F, 0F);
        rightarn.setTextureSize(64, 64);
        rightarn.mirror = true;
        setRotation(rightarn, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 12, 21);
        leftarm.func_228304_a_(0F, 0F, 0F, 1, 1, 4, false);
        leftarm.setRotationPoint(-4F, 17.5F, 0F);
        leftarm.setTextureSize(64, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        righthand = new ModelRenderer(this, 15, 28);
        righthand.func_228304_a_(0F, 0F, 0F, 1, 1, 0, false);
        righthand.setRotationPoint(2.5F, 17.5F, 4F);
        righthand.setTextureSize(64, 64);
        righthand.mirror = true;
        setRotation(righthand, 0F, 0F, 0F);
        lefthand = new ModelRenderer(this, 15, 28);
        lefthand.func_228304_a_(0F, 0F, 0F, 1, 1, 0, false);
        lefthand.setRotationPoint(-3.5F, 17.5F, 4F);
        lefthand.setTextureSize(64, 64);
        lefthand.mirror = true;
        setRotation(lefthand, 0F, 0F, 0F);
        backLight = new ModelRenderer(this, 20, 15);
        backLight.func_228304_a_(0F, 0F, 0F, 2, 1, 1, false);
        backLight.setRotationPoint(-1F, 17.8F, -4.001F);
        backLight.setTextureSize(64, 64);
        backLight.mirror = true;
        setRotation(backLight, 0F, 0F, 0F);
        eyeRight = new ModelRenderer(this, 43, 25);
        eyeRight.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        eyeRight.setRotationPoint(1.5F, 14.5F, 1.50001F);
        eyeRight.setTextureSize(64, 64);
        eyeRight.mirror = true;
        setRotation(eyeRight, 0F, 0F, 0F);
        eyeLeft = new ModelRenderer(this, 43, 25);
        eyeLeft.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        eyeLeft.setRotationPoint(-2.5F, 14.5F, 1.50001F);
        eyeLeft.setTextureSize(64, 64);
        eyeLeft.mirror = true;
        setRotation(eyeLeft, 0F, 0F, 0F);
    }

    @Override
    public void func_225597_a_(@Nonnull EntityRobit entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void func_225598_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue, float alpha) {
        Body.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        Bottom.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        RightTrack.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        LeftTrack.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        Neck.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        Head.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        Backpack.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        headback.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rightarn.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        leftarm.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        righthand.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        lefthand.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        GlowInfo glowInfo = MekanismRenderer.enableGlow();
        backLight.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        eyeRight.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        eyeLeft.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        MekanismRenderer.disableGlow(glowInfo);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}