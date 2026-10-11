package ax.b6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1531d {
    private C1540e a;
    private C1540e b;
    private List<C1540e> c;

    public C1531d() {
        this.a = new C1540e(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
        this.b = new C1540e(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
        this.c = new ArrayList();
    }

    public final C1540e a() {
        return this.a;
    }

    public final void b(C1540e c1540e) {
        this.a = c1540e;
        this.b = (C1540e) c1540e.clone();
        this.c.clear();
    }

    public final void c(String str, long j, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C1540e.c(str2, this.a.b(str2), map.get(str2)));
        }
        this.c.add(new C1540e(str, j, hashMap));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1531d c1531d = new C1531d((C1540e) this.a.clone());
        Iterator<C1540e> it = this.c.iterator();
        while (it.hasNext()) {
            c1531d.c.add((C1540e) it.next().clone());
        }
        return c1531d;
    }

    public final C1540e d() {
        return this.b;
    }

    public final void e(C1540e c1540e) {
        this.b = c1540e;
    }

    public final List<C1540e> f() {
        return this.c;
    }

    private C1531d(C1540e c1540e) {
        this.a = c1540e;
        this.b = (C1540e) c1540e.clone();
        this.c = new ArrayList();
    }
}
