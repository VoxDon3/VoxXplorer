/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.content.Context;
import ax.p5.k;
import ax.p5.u;
import ax.p5.v;
import ax.p5.w;
import ax.q5.i;
import ax.q5.j;
import ax.q5.l;
import ax.r5.a;
import ax.r5.d;
import ax.w5.f;
import ax.w5.r;
import ax.w5.s;
import ax.w5.x;
import ax.x5.M;
import ax.x5.N;
import ax.x5.X;
import ax.x5.g;
import ax.x5.h;
import java.util.concurrent.Executor;

final class e {
    public static v.a a() {
        return new b();
    }

    private static final class b
    implements v.a {
        private Context a;

        private b() {
        }

        public b b(Context context) {
            this.a = d.b(context);
            return this;
        }

        @Override
        public v g() {
            d.a(this.a, Context.class);
            return new c(this.a);
        }
    }

    private static final class c
    extends v {
        private ax.ib.a<Executor> c0;
        private ax.ib.a<Context> d0;
        private ax.ib.a e0;
        private ax.ib.a f0;
        private ax.ib.a g0;
        private ax.ib.a<String> h0;
        private ax.ib.a<M> i0;
        private ax.ib.a<f> j0;
        private ax.ib.a<x> k0;
        private ax.ib.a<ax.v5.c> l0;
        private ax.ib.a<r> m0;
        private ax.ib.a<ax.w5.v> n0;
        private ax.ib.a<u> o0;
        private final c q = this;

        private c(Context context) {
            this.c(context);
        }

        private void c(Context object) {
            ax.ib.a<x> a8;
            this.c0 = a.a(k.a());
            this.d0 = object = ax.r5.c.a(object);
            object = j.a((ax.ib.a<Context>)object, ax.z5.c.a(), ax.z5.d.a());
            this.e0 = object;
            this.f0 = a.a(l.a(this.d0, (ax.ib.a<i>)object));
            this.g0 = X.a(this.d0, g.a(), ax.x5.i.a());
            this.h0 = a.a(h.a(this.d0));
            this.i0 = a.a(N.a(ax.z5.c.a(), ax.z5.d.a(), ax.x5.j.a(), this.g0, this.h0));
            this.j0 = object = ax.v5.g.b(ax.z5.c.a());
            this.k0 = a8 = ax.v5.i.a(this.d0, this.i0, (ax.ib.a<f>)object, ax.z5.d.a());
            ax.ib.a<Object> a9 = this.c0;
            ax.ib.a a10 = this.f0;
            object = this.i0;
            this.l0 = ax.v5.d.a(a9, a10, a8, (ax.ib.a<ax.x5.d>)object, (ax.ib.a<ax.y5.b>)object);
            object = this.d0;
            a8 = this.f0;
            a9 = this.i0;
            this.m0 = s.a((ax.ib.a<Context>)object, a8, a9, this.k0, this.c0, a9, ax.z5.c.a(), ax.z5.d.a(), this.i0);
            a8 = this.c0;
            object = this.i0;
            this.n0 = ax.w5.w.a(a8, (ax.ib.a<ax.x5.d>)object, this.k0, (ax.ib.a<ax.y5.b>)object);
            this.o0 = a.a(w.a(ax.z5.c.a(), ax.z5.d.a(), this.l0, this.m0, this.n0));
        }

        @Override
        ax.x5.d a() {
            return this.i0.get();
        }

        @Override
        u b() {
            return this.o0.get();
        }
    }
}

