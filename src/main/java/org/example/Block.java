package org.example;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class Block extends Image {
    private Texture texture;
    private TextureRegion textureRegion;
    private TextureRegionDrawable textureRegionDrawable;

    public Block() {
        // Load your block texture
        texture = new Texture("resources/pattern.png");
        textureRegion = new TextureRegion(texture);
        textureRegionDrawable = new TextureRegionDrawable(textureRegion);

        // Set the texture as the drawable for the Image
        setDrawable(textureRegionDrawable);
    }

    public void clearBlock() {
        // Dispose of the texture when clearing the block
        if (texture != null) {
            texture.dispose();
            texture = null;
        }

        // Set the drawable to null to remove it from the stage
        setDrawable(null);
    }

    // If you override dispose, remember to call super.dispose() if you have other resources to dispose of.
//    @Override
//    public void dispose() {
//        clearBlock();
//        super.dispose();
//    }
}