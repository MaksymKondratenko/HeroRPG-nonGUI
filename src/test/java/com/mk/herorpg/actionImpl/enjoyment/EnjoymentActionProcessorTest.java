package com.mk.herorpg.actionimpl.enjoyment;

import com.mk.herorpg.config.AnnotationConfig;
import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.logic.ActionProcessor;
import com.mk.herorpg.utils.Time;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnnotationConfig.class})
public class EnjoymentActionProcessorTest {
    @Autowired
    @Qualifier("hero")
    private Hero hero;

    @Autowired
    @Qualifier("dance")
    private Action action;

    @Autowired
    @Qualifier("time")
    private Time time;

    @Autowired
    @Qualifier("actionProcessor")
    private ActionProcessor processor;

    @After
    public void tearDown() throws Exception {
        hero.setXp(0);
        hero.setHunger(0);
        hero.setRest(0);
        hero.setExcitement(0);
        time.setDate(0);
    }

    @Test
    public void xpProcessing() {
        int init = hero.getXp();
        processor.process(action, hero);
        assertEquals(1, hero.getXp() - init);
    }

    @Test
    public void hungerProcessing() {
        int init = hero.getHunger();
        processor.process(action, hero);
        assertEquals(-10, hero.getHunger() - init);
    }

    @Test
    public void restProcessing() {
        int init = hero.getRest();
        processor.process(action, hero);
        assertEquals(5, hero.getRest() - init);
    }

    @Test
    public void excitementProcessing() {
        int init = hero.getExcitement();
        processor.process(action, hero);
        assertEquals(30, hero.getExcitement() - init);
    }

    @Test
    public void timeProcessing() {

        assertNotNull("Oups!", time.getDate());
    }
}