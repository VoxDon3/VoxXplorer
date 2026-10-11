package ax.L5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import ax.J5.C0742c;
import ax.K5.a;
import ax.K5.g;
import ax.M5.C0809d;
import ax.M5.C0821p;
import ax.M5.P;
import ax.h6.C2161e;
import ax.h6.InterfaceC2162f;
import java.util.Set;

/* loaded from: classes3.dex */
public final class C extends ax.i6.d implements g.a, g.b {
    private static final a.AbstractC0107a l = C2161e.c;
    private final Context e;
    private final Handler f;
    private final a.AbstractC0107a g;
    private final Set h;
    private final C0809d i;
    private InterfaceC2162f j;
    private B k;

    public C(Context context, Handler handler, C0809d c0809d) {
        a.AbstractC0107a abstractC0107a = l;
        this.e = context;
        this.f = handler;
        this.i = (C0809d) C0821p.m(c0809d, "ClientSettings must not be null");
        this.h = c0809d.g();
        this.g = abstractC0107a;
    }

    static /* bridge */ /* synthetic */ void c2(C c, ax.i6.l lVar) {
        C0742c k = lVar.k();
        if (k.C()) {
            P p = (P) C0821p.l(lVar.y());
            C0742c k2 = p.k();
            if (!k2.C()) {
                String valueOf = String.valueOf(k2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                c.k.a(k2);
                c.j.b();
                return;
            }
            c.k.b(p.y(), c.h);
        } else {
            c.k.a(k);
        }
        c.j.b();
    }

    @Override // ax.L5.InterfaceC0791c
    public final void B(Bundle bundle) {
        this.j.n(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ax.K5.a$f, ax.h6.f] */
    public final void d2(B b) {
        InterfaceC2162f interfaceC2162f = this.j;
        if (interfaceC2162f != null) {
            interfaceC2162f.b();
        }
        this.i.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0107a abstractC0107a = this.g;
        Context context = this.e;
        Handler handler = this.f;
        C0809d c0809d = this.i;
        this.j = abstractC0107a.a(context, handler.getLooper(), c0809d, c0809d.h(), this, this);
        this.k = b;
        Set set = this.h;
        if (set == null || set.isEmpty()) {
            this.f.post(new z(this));
        } else {
            this.j.p();
        }
    }

    public final void e2() {
        InterfaceC2162f interfaceC2162f = this.j;
        if (interfaceC2162f != null) {
            interfaceC2162f.b();
        }
    }

    @Override // ax.L5.InterfaceC0797i
    public final void r(C0742c c0742c) {
        this.k.a(c0742c);
    }

    @Override // ax.i6.f
    public final void t0(ax.i6.l lVar) {
        this.f.post(new A(this, lVar));
    }

    @Override // ax.L5.InterfaceC0791c
    public final void w(int i) {
        this.k.d(i);
    }
}
