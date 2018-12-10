package Components;

import com.sun.istack.internal.Nullable;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityCustomerQueue {

    // Comparator for customer priority
    protected static Comparator<Customer> customerComparator = (c1, c2) -> (int) (c2.vip_level - c1.vip_level);

    protected PriorityQueue<Customer> pq;

    public PriorityCustomerQueue() {
        pq = new PriorityQueue<>(customerComparator);
    }

    public void add(Customer customer) {
        pq.add(customer);
    }

    @Nullable
    public Customer getNextPrioritized() {
        return pq.poll();
    }

    public Integer getLength() {
        return this.pq.size();
    }
}
