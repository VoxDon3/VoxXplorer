package ax.Zd;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class n implements ax.Xd.a {
    volatile boolean a = false;
    final Map<String, m> b = new ConcurrentHashMap();
    final LinkedBlockingQueue<ax.Yd.d> c = new LinkedBlockingQueue<>();

    @Override // ax.Xd.a
    public synchronized ax.Xd.d a(String str) {
        m mVar;
        mVar = this.b.get(str);
        if (mVar == null) {
            mVar = new m(str, this.c, this.a);
            this.b.put(str, mVar);
        }
        return mVar;
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue<ax.Yd.d> c() {
        return this.c;
    }

    public List<m> d() {
        return new ArrayList(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}
