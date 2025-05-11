package com.overlord.combat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommanderTest {

    private static Stream<Arguments> provideEnemyAndCounterUnits() {
        return Stream.of(
                Arguments.of(new Pikeman(), new Archer()),
                Arguments.of(new Horseman(), new Pikeman()),
                Arguments.of(new Archer(), new Horseman())
        );
    }

    @ParameterizedTest(name = "When enemy is {0}, commander should send {1}")
    @MethodSource("provideEnemyAndCounterUnits")
    void should_counter_enemy_unit_with_proper_unit(Unit enemyUnit, Unit expectedCounterUnit) {
        // given
        Commander yourCommander = new Commander();

        // when
        Unit counterUnit = yourCommander.sendUnitAgainst(enemyUnit);

        // then
        assertEquals(expectedCounterUnit.getClass(), counterUnit.getClass());
    }
}