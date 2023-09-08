package org.example;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Block extends Image {
    private Texture texture;

    public Block() {
        // Load your block texture
        texture = new Texture("block.png");

        // Set the texture as the drawable for the Image
        setDrawable(texture);
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
    @Override
    public void dispose() {
        clearBlock();
        super.dispose();
    }
}