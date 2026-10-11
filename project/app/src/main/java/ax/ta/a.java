/*
 * Decompiled with CFR 0.152.
 */
package ax.ta;

import ax.c9.e;
import ax.va.b;
import ax.va.c;
import ax.wa.d;
import ax.wa.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class a
extends ax.ya.a {
    public a(ax.za.a a8) {
        super(a8);
    }

    private ax.ua.b h(d d8) {
        if (d8 == null) {
            return null;
        }
        return new ax.ua.b(this.c(d8.d()), d8.f(), this.c(d8.e()));
    }

    public List<ax.ua.b> g() throws IOException {
        return new a(this, -1L).a().e();
    }

    private class a
    extends b<d, ax.ua.b> {
        final a d;

        a(a a8, long l8) {
            this.d = a8;
            super(a8, l8);
        }

        @Override
        ax.va.b<? extends ax.wa.b<? extends f<d>>> c(long l8, Long l9) {
            return new b.a(l8, l9);
        }

        @Override
        String d() {
            return "NetrShareEnum[1]";
        }

        ax.ua.b f(d d8) {
            return this.d.h(d8);
        }
    }

    private abstract class b<S extends ax.wa.e, N extends ax.ua.c> {
        private final long a;
        private final List<N> b;
        final a c;

        b(a a8, long l8) {
            this.c = a8;
            this.a = l8;
            this.b = new ArrayList<N>();
        }

        b<S, N> a() throws IOException {
            block4: {
                ax.Qc.b b8 = new ax.Qc.b();
                while (true) {
                    ax.wa.e[] eArray;
                    Object object = this.c(this.a, b8.j());
                    Object object2 = ((c)(object = (c)this.c.b(object, this.d(), new ax.sa.a[]{ax.sa.a.C3, ax.sa.a.c0}))).g();
                    if (object2 != null && (object2 = ((ax.wa.b)object2).f()) != null && (eArray = object2.f()) != null) {
                        int n8 = eArray.length;
                        for (int i8 = 0; i8 < n8; ++i8) {
                            object2 = eArray[i8];
                            this.b.add(this.b(object2));
                        }
                    }
                    if (ax.sa.a.c0.l(((ax.ra.e)object).b())) {
                        return this;
                    }
                    if ((object = ((c)object).f()) == null) break block4;
                    if (((Long)object).longValue() == b8.j().longValue()) break;
                    b8.d((Number)object);
                }
                throw new e("NetrShareEnum resume handle not updated.");
            }
            throw new e("NetrShareEnum resume handle null.");
        }

        abstract N b(S var1);

        abstract ax.va.b<? extends ax.wa.b<? extends f<S>>> c(long var1, Long var3);

        abstract String d();

        List<N> e() {
            return this.b;
        }
    }
}

