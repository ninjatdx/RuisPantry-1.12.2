package com.formas1.ruispantry.entity.milkshake;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Formas - Formas1
 * Created using Tabula 7.1.0
 */
public class ModelMilkshake extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;

    public ModelMilkshake() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-4.0F, 17.0F, -2.0F);
        this.Body.addBox(0.0F, 1.0F, -2.0F, 8, 6, 8, 0.0F);
        this.Head = new ModelRenderer(this, 0, 15);
        this.Head.setRotationPoint(-2.0F, 16.0F, -2.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
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
