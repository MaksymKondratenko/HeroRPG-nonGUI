package books;

import hero.Level;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public @Getter @Setter class Business extends Book {
    @Value("Get rich or die trying.")
    private String info;
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("2")
    private int xp;
    private Level level;
    @Value("-3")
    private int hunger;
    @Value("-3")
    private int rest;
    @Value("-1")
    private int excitement;

    @Override
    public String toString() {
        return "Business";
    }
}
