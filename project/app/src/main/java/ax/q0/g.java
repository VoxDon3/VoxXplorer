/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Fb.p;
import ax.n0.f;
import ax.q0.a;
import ax.q0.d;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;

public final class g {
    public static final Object a(f<d> f8, p<? super a, ? super e<? super t>, ? extends Object> p8, e<? super d> e8) {
        return f8.a((p<d, e<d>, Object>)new p<d, e<? super d>, Object>(p8, null){
            int f0;
            Object g0;
            final p<a, e<? super t>, Object> h0;
            {
                this.h0 = p8;
                super(2, e8);
            }

            @Override
            public final e<t> a(Object object, e<?> p8) {
                p8 = new /* invalid duplicate definition of identical inner class */;
                p8.g0 = object;
                return p8;
            }

            @Override
            public final Object p(Object p8) {
                Object object = b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 == 1) {
                        object = (a)this.g0;
                        o.b(p8);
                        return object;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(p8);
                a a8 = ((d)this.g0).c();
                p8 = this.h0;
                this.g0 = a8;
                this.f0 = 1;
                if (p8.j(a8, this) == object) {
                    return object;
                }
                return a8;
            }

            public final Object u(d d8, e<? super d> e8) {
                return (this.a(d8, e8)).p(t.a);
            }
        }, e8);
    }
}

