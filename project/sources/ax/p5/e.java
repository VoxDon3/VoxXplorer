package ax.p5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.p5.v;
import ax.r5.C2957a;
import ax.r5.C2959c;
import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;
import ax.v5.C3280c;
import ax.v5.C3281d;
import ax.v5.C3284g;
import ax.v5.C3286i;
import ax.w5.AbstractC3352f;
import ax.w5.C3364r;
import ax.w5.C3365s;
import ax.w5.C3368v;
import ax.w5.C3369w;
import ax.w5.InterfaceC3370x;
import ax.x5.C3447g;
import ax.x5.C3448h;
import ax.x5.C3449i;
import ax.x5.C3450j;
import ax.x5.InterfaceC3444d;
import ax.x5.M;
import ax.x5.N;
import ax.x5.X;
import ax.z5.C3552c;
import ax.z5.C3553d;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class e {

    private static final class b implements v.a {
        private Context a;

        private b() {
        }

        @Override // ax.p5.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.a = (Context) C2960d.b(context);
            return this;
        }

        @Override // ax.p5.v.a
        public v g() {
            C2960d.a(this.a, Context.class);
            return new c(this.a);
        }
    }

    private static final class c extends v {
        private InterfaceC2296a<Executor> c0;
        private InterfaceC2296a<Context> d0;
        private InterfaceC2296a e0;
        private InterfaceC2296a f0;
        private InterfaceC2296a g0;
        private InterfaceC2296a<String> h0;
        private InterfaceC2296a<M> i0;
        private InterfaceC2296a<AbstractC3352f> j0;
        private InterfaceC2296a<InterfaceC3370x> k0;
        private InterfaceC2296a<C3280c> l0;
        private InterfaceC2296a<C3364r> m0;
        private InterfaceC2296a<C3368v> n0;
        private InterfaceC2296a<u> o0;
        private final c q;

        private void c(Context context) {
            this.c0 = C2957a.a(k.a());
            InterfaceC2958b a = C2959c.a(context);
            this.d0 = a;
            ax.q5.j a2 = ax.q5.j.a(a, C3552c.a(), C3553d.a());
            this.e0 = a2;
            this.f0 = C2957a.a(ax.q5.l.a(this.d0, a2));
            this.g0 = X.a(this.d0, C3447g.a(), C3449i.a());
            this.h0 = C2957a.a(C3448h.a(this.d0));
            this.i0 = C2957a.a(N.a(C3552c.a(), C3553d.a(), C3450j.a(), this.g0, this.h0));
            C3284g b = C3284g.b(C3552c.a());
            this.j0 = b;
            C3286i a3 = C3286i.a(this.d0, this.i0, b, C3553d.a());
            this.k0 = a3;
            InterfaceC2296a<Executor> interfaceC2296a = this.c0;
            InterfaceC2296a interfaceC2296a2 = this.f0;
            InterfaceC2296a<M> interfaceC2296a3 = this.i0;
            this.l0 = C3281d.a(interfaceC2296a, interfaceC2296a2, a3, interfaceC2296a3, interfaceC2296a3);
            InterfaceC2296a<Context> interfaceC2296a4 = this.d0;
            InterfaceC2296a interfaceC2296a5 = this.f0;
            InterfaceC2296a<M> interfaceC2296a6 = this.i0;
            this.m0 = C3365s.a(interfaceC2296a4, interfaceC2296a5, interfaceC2296a6, this.k0, this.c0, interfaceC2296a6, C3552c.a(), C3553d.a(), this.i0);
            InterfaceC2296a<Executor> interfaceC2296a7 = this.c0;
            InterfaceC2296a<M> interfaceC2296a8 = this.i0;
            this.n0 = C3369w.a(interfaceC2296a7, interfaceC2296a8, this.k0, interfaceC2296a8);
            this.o0 = C2957a.a(w.a(C3552c.a(), C3553d.a(), this.l0, this.m0, this.n0));
        }

        @Override // ax.p5.v
        InterfaceC3444d a() {
            return this.i0.get();
        }

        @Override // ax.p5.v
        u b() {
            return this.o0.get();
        }

        private c(Context context) {
            this.q = this;
            c(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
