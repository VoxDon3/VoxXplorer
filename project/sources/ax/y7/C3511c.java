package ax.y7;

import android.content.Context;
import ax.A7.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.y7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3511c {
    private final ax.a8.b<ax.A7.a> a;
    private final String b;
    private Integer c = null;

    public C3511c(Context context, ax.a8.b<ax.A7.a> bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    private void a(a.c cVar) {
        this.a.get().b(cVar);
    }

    private void b(List<C3510b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i = i();
        for (C3510b c3510b : list) {
            while (arrayDeque.size() >= i) {
                k(((a.c) arrayDeque.pollFirst()).b);
            }
            a.c f = c3510b.f(this.b);
            a(f);
            arrayDeque.offer(f);
        }
    }

    private static List<C3510b> c(List<Map<String, String>> list) throws C3509a {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3510b.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<C3510b> list, C3510b c3510b) {
        String c = c3510b.c();
        String e = c3510b.e();
        for (C3510b c3510b2 : list) {
            if (c3510b2.c().equals(c) && c3510b2.e().equals(e)) {
                return true;
            }
        }
        return false;
    }

    private List<a.c> f() {
        return this.a.get().f(this.b, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private ArrayList<C3510b> g(List<C3510b> list, List<C3510b> list2) {
        ArrayList<C3510b> arrayList = new ArrayList<>();
        for (C3510b c3510b : list) {
            if (!d(list2, c3510b)) {
                arrayList.add(c3510b);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<C3510b> list, List<C3510b> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (C3510b c3510b : list) {
            if (!d(list2, c3510b)) {
                arrayList.add(c3510b.f(this.b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.get().e(this.b));
        }
        return this.c.intValue();
    }

    private void k(String str) {
        this.a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().b);
        }
    }

    private void n(List<C3510b> list) throws C3509a {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<C3510b> e = e();
        l(h(e, list));
        b(g(list, e));
    }

    private void o() throws C3509a {
        if (this.a.get() == null) {
            throw new C3509a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<C3510b> e() throws C3509a {
        o();
        List<a.c> f = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(C3510b.a(it.next()));
        }
        return arrayList;
    }

    public void j() throws C3509a {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws C3509a {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
