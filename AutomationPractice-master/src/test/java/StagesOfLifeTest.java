import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StagesOfLifeTest {

    private static Logger logger = Logger.getLogger(StagesOfLifeTest.class.getName());

        @Test
        void infantTest() {

            logger.info("The tests have started");
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Infant", StagesOfLife.determineStagesOfLife((int) 0.5));
        }

        @Test
        void toddlerTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Toddler", StagesOfLife.determineStagesOfLife(3));
        }

        @Test
        void childTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Child", StagesOfLife.determineStagesOfLife(10));
        }

        @Test
        void teenTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Teen", StagesOfLife.determineStagesOfLife(18));
        }

        @Test
        void adultTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Adult", StagesOfLife.determineStagesOfLife(30));
        }

        @Test
        void middleAgeAdultTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Middle Age Adult", StagesOfLife.determineStagesOfLife(51));
        }

        @Test
        void seniorAdultTest() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertEquals("Senior Adult", StagesOfLife.determineStagesOfLife(69));
        }

        @Test
        void negativeNumberShouldReturnException() {
            StagesOfLife StagesOfLife = new StagesOfLife();

            assertThrows(IllegalArgumentException.class,
                    () -> {
                        StagesOfLife.determineStagesOfLife(-1);
                    });
            logger.info("The tests have finished");
        }
}

