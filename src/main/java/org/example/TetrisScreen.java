package org.example;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TetrisScreen implements Screen {
    private Stage stage;
    private GameBoard gameBoard;

    public TetrisScreen() {
        stage = new Stage(new ScreenViewport());
        gameBoard = new GameBoard();
        stage.addActor(gameBoard.getTable());
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // Update game logic and render the stage
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    // Other screen methods (resize, pause, resume, etc.) go here
}