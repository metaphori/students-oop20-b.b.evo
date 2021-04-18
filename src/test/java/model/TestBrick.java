package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.entities.Ball;
import model.entities.Brick;
import model.entities.GameBoard;
import model.entities.GameBoardImpl;
import model.entities.PowerUp;
import model.entities.Wall;
import model.utilities.Angle;
import model.utilities.Boundaries;
import model.utilities.BrickStatus;
import model.utilities.Difficulty;
import model.utilities.DirVector;
import model.utilities.ObjectInit;
import model.utilities.Pair;
import model.utilities.Position;
import view.graphics.BrickComponentGraphics;

public class TestBrick {
    private static final Position BRICK_POS = new Position(50, 50);
    private static final int WALL_DIM = 600;
    private static final int BRICK_WIDTH = 10;
    private static final int BRICK_HEIGHT = 10;
    private static final int BRICK_DURABILITY = 1;
    private static final String PATH = "Images/dropPowerup/marioDropPowerUp.png";
    private static final BrickStatus STATUS = BrickStatus.DESTRUCTIBLE;

    private GameBoard board;
    private Brick brick;

    /**
     * create a ball and check that the builder sets all the fields correctly.
     */
    @Test
    public void brickCreation() {
        final Brick brick = new Brick.Builder()
                .durability(BRICK_DURABILITY)
                .height(BRICK_HEIGHT)
                .width(BRICK_WIDTH)
                .pos(BRICK_POS)
                .status(STATUS)
                .texture(PATH)
                .build();
        assertEquals(BRICK_DURABILITY, brick.getDurability());
        assertEquals(BRICK_HEIGHT, brick.getHeight());
        assertEquals(BRICK_WIDTH, brick.getWidth());
        assertEquals(BRICK_POS, brick.getPos());
        assertEquals(STATUS, brick.getStatus());
        assertEquals(0, brick.getSpeed());
    }
}