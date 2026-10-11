/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.a9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class g<V>
extends a<List<V>> {
    private List<Future<V>> q;

    public g(List<Future<V>> list) {
        this.q = list;
    }

    public List<V> a() throws InterruptedException, ExecutionException {
        ArrayList<V> arrayList = new ArrayList<V>();
        Iterator<Future<V>> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().get());
        }
        return arrayList;
    }

    public List<V> b(long l8, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        ArrayList<V> arrayList = new ArrayList<V>();
        Iterator<Future<V>> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().get(l8, timeUnit));
        }
        return arrayList;
    }

    @Override
    public boolean cancel(boolean bl) {
        boolean bl2;
        Iterator<Future<V>> iterator = this.q.iterator();
        block0: while (true) {
            bl2 = true;
            while (iterator.hasNext()) {
                Future<V> future = iterator.next();
                if (bl2 && future.cancel(bl)) continue block0;
                bl2 = false;
            }
            break;
        }
        return bl2;
    }

    @Override
    public boolean isCancelled() {
        Iterator<Future<V>> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isCancelled()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isDone() {
        Iterator<Future<V>> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isDone()) continue;
            return false;
        }
        return true;
    }
}

