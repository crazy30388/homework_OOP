package transport;

import java.util.Queue;

public class MaintenanceStation {
    private Transport auto;
    Queue<Transport> queue;

    public void addAuto(Transport auto){
        if (auto.getClass() != Bus.class) {
            queue.add(auto);
        }
    }
    public void check_up(){
        queue.remove();
    }

    public Transport getAuto() {
        return auto;
    }

    public void setAuto(Transport auto) {
        this.auto = auto;
    }
}
