package ax.O5;

import android.content.Context;
import ax.K5.a;
import ax.K5.f;
import ax.L5.InterfaceC0798j;
import ax.M5.C0824t;
import ax.M5.C0827w;
import ax.M5.InterfaceC0826v;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import com.google.android.gms.common.api.internal.AbstractC3610d;

/* loaded from: classes3.dex */
public final class d extends f implements InterfaceC0826v {
    private static final a.g k;
    private static final a.AbstractC0107a l;
    private static final ax.K5.a m;
    public static final /* synthetic */ int n = 0;

    static {
        a.g gVar = new a.g();
        k = gVar;
        c cVar = new c();
        l = cVar;
        m = new ax.K5.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C0827w c0827w) {
        super(context, m, c0827w, f.a.c);
    }

    @Override // ax.M5.InterfaceC0826v
    public final AbstractC2327j<Void> b(final C0824t c0824t) {
        AbstractC3610d.a a = AbstractC3610d.a();
        a.d(ax.Y5.f.a);
        a.c(false);
        a.b(new InterfaceC0798j() { // from class: ax.O5.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ax.L5.InterfaceC0798j
            public final void a(Object obj, Object obj2) {
                int i = d.n;
                ((a) ((e) obj).D()).a2(C0824t.this);
                ((C2328k) obj2).c(null);
            }
        });
        return f(a.a());
    }
}
