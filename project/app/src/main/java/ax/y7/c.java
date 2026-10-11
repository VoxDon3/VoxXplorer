/*
 * Decompiled with CFR 0.152.
 */
package ax.y7;

import android.content.Context;
import ax.A7.a;
import ax.y7.a;
import ax.y7.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c {
    private final ax.a8.b<ax.A7.a> a;
    private final String b;
    private Integer c;

    public c(Context context, ax.a8.b<ax.A7.a> b8, String string) {
        this.a = b8;
        this.b = string;
        this.c = null;
    }

    private void a(a.c c8) {
        this.a.get().b(c8);
    }

    private void b(List<b> object) {
        ArrayDeque<a.c> arrayDeque = new ArrayDeque<a.c>(this.f());
        int n8 = this.i();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (b)object.next();
            while (arrayDeque.size() >= n8) {
                this.k(((a.c)arrayDeque.pollFirst()).b);
            }
            object2 = ((b)object2).f(this.b);
            this.a((a.c)object2);
            arrayDeque.offer((a.c)object2);
        }
    }

    private static List<b> c(List<Map<String, String>> object) throws a {
        ArrayList<b> arrayList = new ArrayList<b>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(ax.y7.b.b((Map)object.next()));
        }
        return arrayList;
    }

    private boolean d(List<b> object, b object2) {
        String string = ((b)object2).c();
        object2 = ((b)object2).e();
        Iterator<b> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!((b)object).c().equals(string) || !((b)object).e().equals(object2)) continue;
            return true;
        }
        return false;
    }

    private List<a.c> f() {
        return this.a.get().f(this.b, "");
    }

    private ArrayList<b> g(List<b> object, List<b> list) {
        ArrayList<b> arrayList = new ArrayList<b>();
        object = object.iterator();
        while (object.hasNext()) {
            b b8 = (b)object.next();
            if (this.d(list, b8)) continue;
            arrayList.add(b8);
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<b> object, List<b> list) {
        ArrayList<a.c> arrayList = new ArrayList<a.c>();
        Iterator<b> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (this.d(list, (b)object)) continue;
            arrayList.add(((b)object).f(this.b));
        }
        return arrayList;
    }

    private int i() {
        if (this.c == null) {
            this.c = this.a.get().e(this.b);
        }
        return this.c;
    }

    private void k(String string) {
        this.a.get().clearConditionalUserProperty(string, null, null);
    }

    private void l(Collection<a.c> object) {
        object = object.iterator();
        while (object.hasNext()) {
            this.k(((a.c)object.next()).b);
        }
    }

    private void n(List<b> list) throws a {
        if (list.isEmpty()) {
            this.j();
            return;
        }
        List<b> list2 = this.e();
        this.l(this.h(list2, list));
        this.b(this.g(list, list2));
    }

    private void o() throws a {
        if (this.a.get() != null) {
            return;
        }
        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    public List<b> e() throws a {
        this.o();
        Object object = this.f();
        ArrayList<b> arrayList = new ArrayList<b>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(ax.y7.b.a((a.c)object.next()));
        }
        return arrayList;
    }

    public void j() throws a {
        this.o();
        this.l(this.f());
    }

    public void m(List<Map<String, String>> list) throws a {
        this.o();
        if (list != null) {
            this.n(ax.y7.c.c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}

