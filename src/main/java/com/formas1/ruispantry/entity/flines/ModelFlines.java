package com.formas1.ruispantry.entity.flines;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Flines - Formas1
 * Created using Tabula 7.1.0
 */
public class ModelFlines extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;

    public ModelFlines() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 12, 5);
        this.Body.setRotationPoint(-5.0F, 14.0F, -5.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-3.0F, 12.0F, -8.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 6, 8, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
