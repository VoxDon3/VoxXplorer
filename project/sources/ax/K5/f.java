package ax.K5;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.K5.a;
import ax.K5.a.d;
import ax.L5.C;
import ax.L5.C0789a;
import ax.L5.C0790b;
import ax.L5.ServiceConnectionC0796h;
import ax.L5.r;
import ax.M5.AbstractC0808c;
import ax.M5.C0809d;
import ax.M5.C0821p;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC3608b;
import com.google.android.gms.common.api.internal.AbstractC3610d;
import com.google.android.gms.common.api.internal.C3609c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class f<O extends a.d> {
    private final Context a;
    private final String b;
    private final ax.K5.a c;
    private final a.d d;
    private final C0790b e;
    private final Looper f;
    private final int g;
    private final g h;
    private final ax.L5.l i;
    protected final C3609c j;

    public static class a {
        public static final a c = new C0109a().a();
        public final ax.L5.l a;
        public final Looper b;

        /* renamed from: ax.K5.f$a$a, reason: collision with other inner class name */
        public static class C0109a {
            private ax.L5.l a;
            private Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.a == null) {
                    this.a = new C0789a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }

            public C0109a b(ax.L5.l lVar) {
                C0821p.m(lVar, "StatusExceptionMapper must not be null.");
                this.a = lVar;
                return this;
            }
        }

        private a(ax.L5.l lVar, Account account, Looper looper) {
            this.a = lVar;
            this.b = looper;
        }
    }

    private f(Context context, Activity activity, ax.K5.a aVar, a.d dVar, a aVar2) {
        C0821p.m(context, "Null context is not permitted.");
        C0821p.m(aVar, "Api must not be null.");
        C0821p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C0821p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : i(context);
        this.b = attributionTag;
        this.c = aVar;
        this.d = dVar;
        this.f = aVar2.b;
        C0790b a2 = C0790b.a(aVar, dVar, attributionTag);
        this.e = a2;
        this.h = new r(this);
        C3609c u = C3609c.u(context2);
        this.j = u;
        this.g = u.l();
        this.i = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, u, a2);
        }
        u.F(this);
    }

    private final AbstractC3608b q(int i, AbstractC3608b abstractC3608b) {
        abstractC3608b.j();
        this.j.A(this, i, abstractC3608b);
        return abstractC3608b;
    }

    private final AbstractC2327j r(int i, AbstractC3610d abstractC3610d) {
        C2328k c2328k = new C2328k();
        this.j.B(this, i, abstractC3610d, c2328k, this.i);
        return c2328k.a();
    }

    public g d() {
        return this.h;
    }

    protected C0809d.a e() {
        Account i;
        Set<Scope> set;
        GoogleSignInAccount g;
        C0809d.a aVar = new C0809d.a();
        a.d dVar = this.d;
        if (!(dVar instanceof a.d.b) || (g = ((a.d.b) dVar).g()) == null) {
            a.d dVar2 = this.d;
            i = dVar2 instanceof a.d.InterfaceC0108a ? ((a.d.InterfaceC0108a) dVar2).i() : null;
        } else {
            i = g.i();
        }
        aVar.d(i);
        a.d dVar3 = this.d;
        if (dVar3 instanceof a.d.b) {
            GoogleSignInAccount g2 = ((a.d.b) dVar3).g();
            set = g2 == null ? Collections.EMPTY_SET : g2.G();
        } else {
            set = Collections.EMPTY_SET;
        }
        aVar.c(set);
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC2327j<TResult> f(AbstractC3610d<A, TResult> abstractC3610d) {
        return r(2, abstractC3610d);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC2327j<TResult> g(AbstractC3610d<A, TResult> abstractC3610d) {
        return r(1, abstractC3610d);
    }

    public <A extends a.b, T extends AbstractC3608b<? extends l, A>> T h(T t) {
        q(1, t);
        return t;
    }

    protected String i(Context context) {
        return null;
    }

    public final C0790b<O> j() {
        return this.e;
    }

    public Context k() {
        return this.a;
    }

    protected String l() {
        return this.b;
    }

    public Looper m() {
        return this.f;
    }

    public final int n() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f o(Looper looper, com.google.android.gms.common.api.internal.o oVar) {
        C0809d a2 = e().a();
        a.f a3 = ((a.AbstractC0107a) C0821p.l(this.c.a())).a(this.a, looper, a2, this.d, oVar, oVar);
        String l = l();
        if (l != null && (a3 instanceof AbstractC0808c)) {
            ((AbstractC0808c) a3).P(l);
        }
        if (l != null && (a3 instanceof ServiceConnectionC0796h)) {
            ((ServiceConnectionC0796h) a3).r(l);
        }
        return a3;
    }

    public final C p(Context context, Handler handler) {
        return new C(context, handler, e().a());
    }

    public f(Context context, ax.K5.a<O> aVar, O o, a aVar2) {
        this(context, null, aVar, o, aVar2);
    }
}
