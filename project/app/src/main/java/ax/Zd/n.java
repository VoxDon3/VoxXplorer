/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

import ax.Xd.a;
import ax.Yd.d;
import ax.Zd.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class n
implements a {
    volatile boolean a = false;
    final Map<String, m> b = new j.ConcurrentHashMap();
    final LinkedBlockingQueue<d> c = new LinkedBlockingQueue();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ax.Xd.d a(String string) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                m m8;
                block4: {
                    try {
                        m m9;
                        m8 = m9 = this.b.get(string);
                        if (m9 != null) break block4;
                        m8 = new m(string, this.c, this.a);
                        this.b.put(string, m8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return m8;
            }
            throw throwable2;
        }
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue<d> c() {
        return this.c;
    }

    public List<m> d() {
        return new ArrayList<m>(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}

