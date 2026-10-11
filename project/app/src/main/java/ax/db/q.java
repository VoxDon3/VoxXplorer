/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.b;
import ax.db.n;
import ax.db.o;
import ax.db.p;
import ax.db.s;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public abstract class q {
    private static final Map<String, ax.db.a> c = Collections.EMPTY_MAP;
    private static final Set<a> d = java.util.DesugarCollections.unmodifiableSet(EnumSet.noneOf(a.class));
    private final s a;
    private final Set<a> b;

    protected q(s s8, EnumSet<a> set) {
        this.a = ax.cb.b.b(s8, "context");
        set = set == null ? d : java.util.DesugarCollections.unmodifiableSet(EnumSet.copyOf(set));
        this.b = set;
        boolean bl = !s8.c().d() || set.contains((Object)ax.db.q$a.q);
        ax.cb.b.a(bl, "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public final void a(String string) {
        ax.cb.b.b(string, "description");
        this.b(string, c);
    }

    public abstract void b(String var1, Map<String, ax.db.a> var2);

    @Deprecated
    public void c(Map<String, ax.db.a> map) {
        this.j(map);
    }

    public void d(o o8) {
        ax.cb.b.b(o8, "messageEvent");
        this.e(ax.fb.a.b(o8));
    }

    @Deprecated
    public void e(p p8) {
        this.d(ax.fb.a.a(p8));
    }

    public final void f() {
        this.g(n.a);
    }

    public abstract void g(n var1);

    public final s h() {
        return this.a;
    }

    public void i(String string, ax.db.a a8) {
        ax.cb.b.b(string, "key");
        ax.cb.b.b(a8, "value");
        this.j(Collections.singletonMap(string, a8));
    }

    public void j(Map<String, ax.db.a> map) {
        ax.cb.b.b(map, "attributes");
        this.c(map);
    }

    public static final class a
    extends Enum<a> {
        private static final a[] c0;
        public static final /* enum */ a q;

        static {
            a a8;
            q = a8 = new a();
            c0 = new a[]{a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])c0.clone();
        }
    }
}

