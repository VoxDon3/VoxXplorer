/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.K5.a;
import ax.K5.e;
import ax.K5.g;
import ax.K5.l;
import ax.K5.p;
import ax.L5.C;
import ax.L5.r;
import ax.M5.c;
import ax.M5.d;
import ax.j6.j;
import ax.j6.k;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.o;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;

public abstract class f<O extends a.d> {
    private final Context a;
    private final String b;
    private final ax.K5.a c;
    private final a.d d;
    private final ax.L5.b e;
    private final Looper f;
    private final int g;
    private final g h;
    private final ax.L5.l i;
    protected final com.google.android.gms.common.api.internal.c j;

    private f(Context object, Activity activity, ax.K5.a object2, a.d d8, a a8) {
        Context context;
        ax.M5.p.m(object, "Null context is not permitted.");
        ax.M5.p.m(object2, "Api must not be null.");
        ax.M5.p.m(a8, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context = ax.M5.p.m(object.getApplicationContext(), "The provided context did not have an application context.");
        object = Build.VERSION.SDK_INT >= 30 ? ax.K5.e.a(object) : this.i((Context)object);
        this.b = object;
        this.c = object2;
        this.d = d8;
        this.f = a8.b;
        object = ax.L5.b.a(object2, d8, (String)object);
        this.e = object;
        this.h = new r(this);
        this.j = object2 = com.google.android.gms.common.api.internal.c.u(context);
        this.g = ((com.google.android.gms.common.api.internal.c)object2).l();
        this.i = a8.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, (com.google.android.gms.common.api.internal.c)object2, (ax.L5.b)object);
        }
        ((com.google.android.gms.common.api.internal.c)object2).F(this);
    }

    public f(Context context, ax.K5.a<O> a8, O o8, a a9) {
        this(context, null, a8, (a.d)o8, a9);
    }

    private final b q(int n8, b b8) {
        b8.j();
        this.j.A(this, n8, b8);
        return b8;
    }

    private final j r(int n8, com.google.android.gms.common.api.internal.d d8) {
        k k8 = new k();
        ax.L5.l l8 = this.i;
        this.j.B(this, n8, d8, k8, l8);
        return k8.a();
    }

    public g d() {
        return this.h;
    }

    protected d.a e() {
        d.a a8 = new d.a();
        Object object = this.d;
        object = object instanceof a.d.b && (object = ((a.d.b)object).g()) != null ? ((GoogleSignInAccount)object).i() : ((object = this.d) instanceof a.d.a ? ((a.d.a)object).i() : null);
        a8.d((Account)object);
        object = this.d;
        object = object instanceof a.d.b ? ((object = ((a.d.b)object).g()) == null ? Collections.EMPTY_SET : ((GoogleSignInAccount)object).G()) : Collections.EMPTY_SET;
        a8.c((Collection)object);
        a8.e(this.a.getClass().getName());
        a8.b(this.a.getPackageName());
        return a8;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> j<TResult> f(com.google.android.gms.common.api.internal.d<A, TResult> d8) {
        return this.r(2, d8);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> j<TResult> g(com.google.android.gms.common.api.internal.d<A, TResult> d8) {
        return this.r(1, d8);
    }

    public <A extends a.b, T extends b<? extends l, A>> T h(T t8) {
        this.q(1, t8);
        return t8;
    }

    protected String i(Context context) {
        return null;
    }

    public final ax.L5.b<O> j() {
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

    public final a.f o(Looper object, o o8) {
        d d8 = this.e().a();
        a.a a8 = ax.M5.p.l(this.c.a());
        a.d d9 = this.d;
        o8 = a8.a(this.a, (Looper)object, d8, d9, o8, o8);
        object = this.l();
        if (object != null && o8 instanceof c) {
            ((c)((Object)o8)).P((String)object);
        }
        if (object != null && o8 instanceof ax.L5.h) {
            ((ax.L5.h)((Object)o8)).r((String)object);
        }
        return o8;
    }

    public final C p(Context context, Handler handler) {
        return new C(context, handler, this.e().a());
    }

    public static class ax.K5.f$a {
        public static final ax.K5.f$a c = new a().a();
        public final ax.L5.l a;
        public final Looper b;

        private ax.K5.f$a(ax.L5.l l8, Account account, Looper looper) {
            this.a = l8;
            this.b = looper;
        }

        /* synthetic */ ax.K5.f$a(ax.L5.l l8, Account account, Looper looper, p p8) {
            this(l8, null, looper);
        }

        public static class a {
            private ax.L5.l a;
            private Looper b;

            public ax.K5.f$a a() {
                if (this.a == null) {
                    this.a = new ax.L5.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new ax.K5.f$a(this.a, null, this.b, null);
            }

            public a b(ax.L5.l l8) {
                ax.M5.p.m(l8, "StatusExceptionMapper must not be null.");
                this.a = l8;
                return this;
            }
        }
    }
}

