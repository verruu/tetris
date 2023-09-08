package org.example;

import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Array;

class GameBoard {

    private static final int BOARD_WIDTH = 10; // Adjust the width as needed
    private static final int BOARD_HEIGHT = 20; // Adjust the height as needed
    private static final int BLOCK_SIZE = 30; // Size of each block in pixels

    private Table table;
    private Array<Block> blocks;

    public GameBoard() {
        table = new Table();
        table.setFillParent(true);

        blocks = new Array<>();

        // Initialize the game board
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int col = 0; col < BOARD_WIDTH; col++) {
                Block block = new Block();
                blocks.add(block);
                table.add(block).width(BLOCK_SIZE).height(BLOCK_SIZE);
            }
            table.row();
        }
    }

    public Table getTable() {
        return table;
    }

    public void clearBoard() {
        for (Block block : blocks) {
            block.clearBlock();
        }
    }
}