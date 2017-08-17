package hero;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Maksym on 14.02.2017.
 */

@Getter @Setter //lombok framework annotations
public class Hero {
    @Value("Sir Lancelot")
    private String name;
    @Value("0")
    private int xp;
    @Value("100")
    private int hunger;
    @Value("100")
    private int rest;
    @Value("100")
    private int excitement;
    @Value("0")
    private int appeal;
    @Value("10")
    private int money;
    @Value("0.0f")
    private float studyingProcess;
    @Value("0.0f")
    private float fitness;
    private Level level = new Level();
}