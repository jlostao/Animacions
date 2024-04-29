package com.badlogic.animacions;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player {
    private final Animation<TextureRegion> idleFrames, upFrames, leftFrames, downFrames, rightFrames;

    private Player(Texture walkSheet) {
        idleFrames = new Animation<>(0.10f,
                new TextureRegion(walkSheet, 560, 0, 56, 93));

        upFrames = new Animation<>(0.10f,
        new TextureRegion(walkSheet, 0, 279, 56, 93),
        new TextureRegion(walkSheet, 56, 279, 56, 93),
        new TextureRegion(walkSheet, 112, 279, 56, 93),
        new TextureRegion(walkSheet, 168, 279, 56, 93),
        new TextureRegion(walkSheet, 224, 279, 56, 93),
        new TextureRegion(walkSheet, 280, 279, 56, 93),
        new TextureRegion(walkSheet, 336, 279, 56, 93),
        new TextureRegion(walkSheet, 392, 279, 56, 93),
        new TextureRegion(walkSheet, 448, 279, 56, 93),
        new TextureRegion(walkSheet, 504, 279, 56, 93),
        new TextureRegion(walkSheet, 560, 279, 56, 93),
        new TextureRegion(walkSheet, 616, 279, 56, 93));

        leftFrames = new Animation<>(0.10f,
        new TextureRegion(walkSheet, 0, 93, 56, 93),
        new TextureRegion(walkSheet, 56, 93, 56, 93),
        new TextureRegion(walkSheet, 112, 93, 56, 93),
        new TextureRegion(walkSheet, 168, 93, 56, 93),
        new TextureRegion(walkSheet, 224, 93, 56, 93),
        new TextureRegion(walkSheet, 280, 93, 56, 93),
        new TextureRegion(walkSheet, 336, 93, 56, 93),
        new TextureRegion(walkSheet, 392, 93, 56, 93),
        new TextureRegion(walkSheet, 448, 93, 56, 93),
        new TextureRegion(walkSheet, 504, 93, 56, 93),
        new TextureRegion(walkSheet, 560, 93, 56, 93),
        new TextureRegion(walkSheet, 616, 93, 56, 93));

        downFrames = new Animation<>(0.10f,
        new TextureRegion(walkSheet, 0, 0, 56, 93),
        new TextureRegion(walkSheet, 56, 0, 56, 93),
        new TextureRegion(walkSheet, 112, 0, 56, 93),
        new TextureRegion(walkSheet, 168, 0, 56, 93),
        new TextureRegion(walkSheet, 224, 0, 56, 93),
        new TextureRegion(walkSheet, 280, 0, 56, 93),
        new TextureRegion(walkSheet, 336, 0, 56, 93),
        new TextureRegion(walkSheet, 392, 0, 56, 93),
        new TextureRegion(walkSheet, 448, 0, 56, 93),
        new TextureRegion(walkSheet, 504, 0, 56, 93),
        new TextureRegion(walkSheet, 560, 0, 56, 93),
        new TextureRegion(walkSheet, 616, 0, 56, 93));

        rightFrames = new Animation<>(0.10f,
        new TextureRegion(walkSheet, 0, 186, 56, 93),
        new TextureRegion(walkSheet, 56, 186, 56, 93),
        new TextureRegion(walkSheet, 112, 186, 56, 93),
        new TextureRegion(walkSheet, 168, 186, 56, 93),
        new TextureRegion(walkSheet, 224, 186, 56, 93),
        new TextureRegion(walkSheet, 280, 186, 56, 93),
        new TextureRegion(walkSheet, 336, 186, 56, 93),
        new TextureRegion(walkSheet, 392, 186, 56, 93),
        new TextureRegion(walkSheet, 448, 186, 56, 93),
        new TextureRegion(walkSheet, 504, 186, 56, 93),
        new TextureRegion(walkSheet, 560, 186, 56, 93),
        new TextureRegion(walkSheet, 616, 186, 56, 93));
    }
    public static Player fromTexture(Texture walkSheet) {
        return new Player(walkSheet);
    }

    public Animation<TextureRegion> getIdleFrames() {
        return idleFrames;
    }

    public Animation<TextureRegion> getUpFrames() {
        return upFrames;
    }

    public Animation<TextureRegion> getLeftFrames() {
        return leftFrames;
    }

    public Animation<TextureRegion> getDownFrames() {
        return downFrames;
    }

    public Animation<TextureRegion> getRightFrames() {
        return rightFrames;
    }
}
