package requirements.tracker;


import org.kie.api.KieBase;

import java.io.FileInputStream;

public class Main
{
    public static void main(String[] args)
    {
        Collector c = new Collector();
        c.connect();

        Transaction t = new Transaction();
        t.setScore(90);

        Filter f = new Filter();
        KieBase kb = f.loadRules();
        f.executeDroolsRules(kb,t);


    }
}

