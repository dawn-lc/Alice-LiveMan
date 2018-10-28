package site.alice.liveman.event;

import java.util.EventListener;

public interface DemandEventListener extends EventListener {

    void onAddDemand(DemandEvent demandEvent);

    void onDemandStart();
}