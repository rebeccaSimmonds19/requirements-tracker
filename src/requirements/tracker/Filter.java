package requirements.tracker;


import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.command.CommandFactory;

public class Filter {

    public KieBase loadRules() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.getKieBase();
    }

    public Transaction executeDroolsRules(KieBase base, Transaction t)
    {
        StatelessKieSession session = base.newStatelessKieSession();

        session.execute(CommandFactory.newInsert(t));
        return t;
    }
}
