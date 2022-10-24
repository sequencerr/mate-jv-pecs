package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> trucks = new LinkedList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            trucks.add(new Excavator());
        }
        return trucks;
    }
}
