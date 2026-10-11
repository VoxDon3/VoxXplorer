package ax.A7;

import android.content.Context;
import android.os.Bundle;
import ax.A7.a;
import ax.M5.C0821p;
import ax.b6.W0;
import ax.e6.C1982a;
import ax.x7.C3467b;
import ax.x7.C3471f;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class b implements ax.A7.a {
    private static volatile ax.A7.a c;
    private final C1982a a;
    final Map<String, Object> b;

    class a implements a.InterfaceC0050a {
        private final /* synthetic */ String a;
        private final /* synthetic */ b b;

        a(b bVar, String str) {
            this.a = str;
            this.b = bVar;
        }
    }

    private b(C1982a c1982a) {
        C0821p.l(c1982a);
        this.a = c1982a;
        this.b = new ConcurrentHashMap();
    }

    public static ax.A7.a g(C3471f c3471f, Context context, ax.Y7.d dVar) {
        C0821p.l(c3471f);
        C0821p.l(context);
        C0821p.l(dVar);
        C0821p.l(context.getApplicationContext());
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c3471f.u()) {
                            dVar.a(C3467b.class, new Executor() { // from class: ax.A7.d
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new ax.Y7.b() { // from class: ax.A7.c
                                @Override // ax.Y7.b
                                public final void a(ax.Y7.a aVar) {
                                    b.h(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c3471f.t());
                        }
                        c = new b(W0.f(context, null, null, null, bundle).y());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    static /* synthetic */ void h(ax.Y7.a aVar) {
        boolean z = ((C3467b) aVar.a()).a;
        synchronized (b.class) {
            ((b) C0821p.l(c)).a.h(z);
        }
    }

    private final boolean i(String str) {
        return (str.isEmpty() || !this.b.containsKey(str) || this.b.get(str) == null) ? false : true;
    }

    @Override // ax.A7.a
    public Map<String, Object> a(boolean z) {
        return this.a.d(null, null, z);
    }

    @Override // ax.A7.a
    public void b(a.c cVar) {
        if (ax.B7.b.g(cVar)) {
            this.a.g(ax.B7.b.a(cVar));
        }
    }

    @Override // ax.A7.a
    public a.InterfaceC0050a c(String str, a.b bVar) {
        C0821p.l(bVar);
        if (!ax.B7.b.j(str) || i(str)) {
            return null;
        }
        C1982a c1982a = this.a;
        Object aVar = "fiam".equals(str) ? new ax.B7.a(c1982a, bVar) : "clx".equals(str) ? new ax.B7.c(c1982a, bVar) : null;
        if (aVar == null) {
            return null;
        }
        this.b.put(str, aVar);
        return new a(this, str);
    }

    @Override // ax.A7.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || ax.B7.b.e(str2, bundle)) {
            this.a.a(str, str2, bundle);
        }
    }

    @Override // ax.A7.a
    public void d(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (ax.B7.b.j(str) && ax.B7.b.e(str2, bundle) && ax.B7.b.h(str, str2, bundle)) {
            ax.B7.b.d(str, str2, bundle);
            this.a.e(str, str2, bundle);
        }
    }

    @Override // ax.A7.a
    public int e(String str) {
        return this.a.c(str);
    }

    @Override // ax.A7.a
    public List<a.c> f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.a.b(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(ax.B7.b.b(it.next()));
        }
        return arrayList;
    }
}
