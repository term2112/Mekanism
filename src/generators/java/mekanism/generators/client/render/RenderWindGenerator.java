package mekanism.generators.client.render;

import com.mojang.blaze3d.platform.GlStateManager;
import mekanism.client.render.MekanismRenderer;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import mekanism.generators.client.model.ModelWindGenerator;
import mekanism.generators.common.tile.TileEntityWindGenerator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;

public class RenderWindGenerator extends TileEntityRenderer<TileEntityWindGenerator> {

    private ModelWindGenerator model = new ModelWindGenerator();

    @Override
    public void render(TileEntityWindGenerator tileEntity, double x, double y, double z, float partialTick, int destroyStage) {
        GlStateManager.pushMatrix();
        GlStateManager.translatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        bindTexture(MekanismUtils.getResource(ResourceType.RENDER, "WindGenerator.png"));
        MekanismRenderer.rotate(tileEntity.getDirection(), 0, 180, 90, 270);
        GlStateManager.rotatef(180, 0, 0, 1);
        double angle = tileEntity.getAngle();
        if (tileEntity.getActive()) {
            angle = (tileEntity.getAngle() + ((tileEntity.getPos().getY() + 4F) / TileEntityWindGenerator.SPEED_SCALED) * partialTick) % 360;
        }
        model.render(0.0625F, angle);
        GlStateManager.popMatrix();
    }
}