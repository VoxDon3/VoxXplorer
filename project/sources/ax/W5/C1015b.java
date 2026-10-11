package ax.W5;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import ax.K5.a;
import ax.K5.f;
import ax.L5.InterfaceC0798j;
import ax.M5.C0821p;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3610d;

/* renamed from: ax.W5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1015b extends ax.K5.f implements InterfaceC1050m1 {
    private static final a.g l;
    private static final a.AbstractC0107a m;
    private static final ax.K5.a n;
    private static final ax.P5.a o;
    private final Context k;

    static {
        a.g gVar = new a.g();
        l = gVar;
        u2 u2Var = new u2();
        m = u2Var;
        n = new ax.K5.a("GoogleAuthService.API", u2Var, gVar);
        o = ax.D5.d.a("GoogleAuthServiceClient");
    }

    C1015b(Context context) {
        super(context, n, a.d.a, f.a.c);
        this.k = context;
    }

    static /* bridge */ /* synthetic */ void s(Status status, Object obj, C2328k c2328k) {
        if (ax.L5.n.a(status, obj, c2328k)) {
            return;
        }
        o.e("The task is already complete.", new Object[0]);
    }

    @Override // ax.W5.InterfaceC1050m1
    public final AbstractC2327j a(final Account account, final String str, final Bundle bundle) {
        C0821p.m(account, "Account name cannot be null!");
        C0821p.g(str, "Scope cannot be null!");
        return g(AbstractC3610d.a().d(ax.D5.e.l).b(new InterfaceC0798j() { // from class: ax.W5.s2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ax.L5.InterfaceC0798j
            public final void a(Object obj, Object obj2) {
                C1015b c1015b = C1015b.this;
                ((r2) ((o2) obj).D()).b2(new v2(c1015b, (C2328k) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // ax.W5.InterfaceC1050m1
    public final AbstractC2327j c(final C1030g c1030g) {
        return g(AbstractC3610d.a().d(ax.D5.e.l).b(new InterfaceC0798j() { // from class: ax.W5.t2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ax.L5.InterfaceC0798j
            public final void a(Object obj, Object obj2) {
                C1015b c1015b = C1015b.this;
                ((r2) ((o2) obj).D()).a2(new w2(c1015b, (C2328k) obj2), c1030g);
            }
        }).e(1513).a());
    }
}
