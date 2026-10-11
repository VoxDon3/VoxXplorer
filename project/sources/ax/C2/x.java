package ax.C2;

import android.text.TextUtils;
import ax.L2.RunnableC0786c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class x extends ax.B2.q {
    private static final String j = ax.B2.i.i("WorkContinuationImpl");
    private final D a;
    private final String b;
    private final ax.B2.d c;
    private final List<? extends ax.B2.t> d;
    private final List<String> e;
    private final List<String> f;
    private final List<x> g;
    private boolean h;
    private ax.B2.l i;

    public x(D d, List<? extends ax.B2.t> list) {
        this(d, null, ax.B2.d.KEEP, list, null);
    }

    private static boolean i(x xVar, Set<String> set) {
        set.addAll(xVar.c());
        Set<String> l = l(xVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (l.contains(it.next())) {
                return true;
            }
        }
        List<x> e = xVar.e();
        if (e != null && !e.isEmpty()) {
            Iterator<x> it2 = e.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set<String> l(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> e = xVar.e();
        if (e != null && !e.isEmpty()) {
            Iterator<x> it = e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public ax.B2.l a() {
        if (this.h) {
            ax.B2.i.e().k(j, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            RunnableC0786c runnableC0786c = new RunnableC0786c(this);
            this.a.p().c(runnableC0786c);
            this.i = runnableC0786c.d();
        }
        return this.i;
    }

    public ax.B2.d b() {
        return this.c;
    }

    public List<String> c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List<x> e() {
        return this.g;
    }

    public List<? extends ax.B2.t> f() {
        return this.d;
    }

    public D g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public x(D d, String str, ax.B2.d dVar, List<? extends ax.B2.t> list, List<x> list2) {
        this.a = d;
        this.b = str;
        this.c = dVar;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator<x> it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(it.next().f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String b = list.get(i).b();
            this.e.add(b);
            this.f.add(b);
        }
    }
}
