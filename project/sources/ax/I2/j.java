package ax.I2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ax.L2.q;

/* loaded from: classes.dex */
public final class j extends h<ax.G2.b> {
    private final ConnectivityManager f;
    private final a g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str;
            ax.Gb.l.f(network, "network");
            ax.Gb.l.f(networkCapabilities, "capabilities");
            ax.B2.i e = ax.B2.i.e();
            str = k.a;
            e.a(str, "Network capabilities changed: " + networkCapabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            ax.Gb.l.f(network, "network");
            ax.B2.i e = ax.B2.i.e();
            str = k.a;
            e.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, ax.N2.c cVar) {
        super(context, cVar);
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new a();
    }

    @Override // ax.I2.h
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            ax.B2.i e = ax.B2.i.e();
            str3 = k.a;
            e.a(str3, "Registering network callback");
            q.a(this.f, this.g);
        } catch (IllegalArgumentException e2) {
            ax.B2.i e3 = ax.B2.i.e();
            str2 = k.a;
            e3.d(str2, "Received exception while registering network callback", e2);
        } catch (SecurityException e4) {
            ax.B2.i e5 = ax.B2.i.e();
            str = k.a;
            e5.d(str, "Received exception while registering network callback", e4);
        }
    }

    @Override // ax.I2.h
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            ax.B2.i e = ax.B2.i.e();
            str3 = k.a;
            e.a(str3, "Unregistering network callback");
            ax.L2.m.c(this.f, this.g);
        } catch (IllegalArgumentException e2) {
            ax.B2.i e3 = ax.B2.i.e();
            str2 = k.a;
            e3.d(str2, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e4) {
            ax.B2.i e5 = ax.B2.i.e();
            str = k.a;
            e5.d(str, "Received exception while unregistering network callback", e4);
        }
    }

    @Override // ax.I2.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ax.G2.b e() {
        return k.c(this.f);
    }
}
