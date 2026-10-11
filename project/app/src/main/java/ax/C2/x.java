/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.text.TextUtils;
import ax.B2.d;
import ax.B2.i;
import ax.B2.l;
import ax.B2.q;
import ax.B2.t;
import ax.C2.D;
import ax.L2.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class x
extends q {
    private static final String j = ax.B2.i.i("WorkContinuationImpl");
    private final D a;
    private final String b;
    private final d c;
    private final List<? extends t> d;
    private final List<String> e;
    private final List<String> f;
    private final List<x> g;
    private boolean h;
    private l i;

    /*
     * WARNING - void declaration
     */
    public x(D object, String object22, d d8, List<? extends t> list, List<x> list2) {
        Object var5_7;
        t var4_6;
        Object var3_5;
        this.a = object;
        this.b = object22;
        this.c = var3_5;
        this.d = var4_6;
        this.g = var5_7;
        this.e = new ArrayList<String>(var4_6.size());
        this.f = new ArrayList<String>();
        if (var5_7 != null) {
            for (x x8 : var5_7) {
                this.f.addAll(x8.f);
            }
        }
        for (int i8 = 0; i8 < var4_6.size(); ++i8) {
            object = ((t)var4_6.get(i8)).b();
            this.e.add((String)object);
            this.f.add((String)object);
        }
    }

    public x(D d8, List<? extends t> list) {
        this(d8, null, ax.B2.d.c0, list, null);
    }

    private static boolean i(x x8, Set<String> set) {
        set.addAll(x8.c());
        List<x> list = x.l(x8);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (!list.contains(iterator.next())) continue;
            return true;
        }
        list = x8.e();
        if (list != null && !list.isEmpty()) {
            list = list.iterator();
            while (list.hasNext()) {
                if (!x.i((x)list.next(), set)) continue;
                return true;
            }
        }
        set.removeAll(x8.c());
        return false;
    }

    public static Set<String> l(x iterator) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((iterator = ((x)((Object)iterator)).e()) != null && !iterator.isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                hashSet.addAll(((x)iterator.next()).c());
            }
        }
        return hashSet;
    }

    public l a() {
        if (!this.h) {
            c c8 = new c(this);
            this.a.p().c(c8);
            this.i = c8.d();
        } else {
            i i8 = ax.B2.i.e();
            String string = j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Already enqueued work ids (");
            stringBuilder.append(TextUtils.join((CharSequence)", ", this.e));
            stringBuilder.append(")");
            i8.k(string, stringBuilder.toString());
        }
        return this.i;
    }

    public d b() {
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

    public List<? extends t> f() {
        return this.d;
    }

    public D g() {
        return this.a;
    }

    public boolean h() {
        return x.i(this, new HashSet<String>());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }
}

