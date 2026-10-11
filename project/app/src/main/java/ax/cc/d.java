/*
 * Decompiled with CFR 0.152.
 */
package ax.cc;

import ax.cc.c;
import ax.kc.e;
import java.util.Collection;
import java.util.Iterator;

public class d
implements c {
    private final Collection<e> a;
    private final Object b;
    private volatile b c = ax.cc.d$b.q;
    private volatile boolean d = false;
    private final ax.cc.b e;
    private ax.fc.d f = null;

    protected d(ax.cc.b b8, Collection<e> collection, Object object, b b9) {
        this.e = b8;
        this.a = collection;
        this.b = object;
        this.c = b9;
    }

    @Override
    public Object a() {
        return this.b;
    }

    public boolean b() {
        return ax.dc.a.class.equals(this.b.getClass());
    }

    public boolean c() {
        return ax.dc.b.class.equals(this.b.getClass());
    }

    public void d() {
        this.d = true;
    }

    public void e(ax.fc.d d8) {
        this.f = d8;
    }

    @Override
    public void execute() {
        this.c = ax.cc.d$b.d0;
        Iterator<e> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().e(this, this.b);
        }
        this.c = ax.cc.d$b.e0;
        if (!this.d) {
            if (!this.c() && !this.b()) {
                this.e.d().a(new ax.dc.b(this.b));
                return;
            }
            if (!this.b()) {
                this.e.d().a(new ax.dc.a(this.b));
            }
        }
    }

    public static class a {
        public d a(ax.cc.b b8, Collection<e> collection, Object object) {
            return new d(b8, collection, object, ax.cc.d$b.q);
        }
    }

    private static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            q = b11 = new b();
            c0 = b10 = new b();
            d0 = b9 = new b();
            e0 = b8 = new b();
            f0 = new b[]{b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

