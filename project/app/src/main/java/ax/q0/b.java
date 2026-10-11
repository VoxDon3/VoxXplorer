/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Fb.p;
import ax.Gb.l;
import ax.n0.f;
import ax.q0.a;
import ax.q0.d;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;

public final class b
implements f<d> {
    private final f<d> a;

    public b(f<d> f8) {
        l.f(f8, "delegate");
        this.a = f8;
    }

    @Override
    public Object a(p<? super d, ? super e<? super d>, ? extends Object> p8, e<? super d> e8) {
        return this.a.a((p<d, e<d>, Object>)new p<d, e<? super d>, Object>(p8, null){
            int f0;
            Object g0;
            final p<d, e<? super d>, Object> h0;
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

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object p(Object object) {
                Object object2 = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o.b(object);
                } else {
                    o.b(object);
                    Object object3 = (d)this.g0;
                    object = this.h0;
                    this.f0 = 1;
                    object = object3 = object.j((d)object3, (e<? super d>)this);
                    if (object3 == object2) {
                        return object2;
                    }
                }
                object = (d)object;
                ((a)object).f();
                return object;
            }

            public final Object u(d d8, e<? super d> e8) {
                return (this.a(d8, e8)).p(t.a);
            }
        }, e8);
    }

    @Override
    public ax.Tb.b<d> b() {
        return this.a.b();
    }
}

