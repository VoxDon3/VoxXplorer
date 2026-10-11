package ax.I2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class l extends e<ax.G2.b> {
    private final ConnectivityManager g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, ax.N2.c cVar) {
        super(context, cVar);
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager) systemService;
    }

    @Override // ax.I2.e
    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // ax.I2.e
    public void k(Intent intent) {
        String str;
        ax.Gb.l.f(intent, "intent");
        if (ax.Gb.l.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            ax.B2.i e = ax.B2.i.e();
            str = k.a;
            e.a(str, "Network broadcast received");
            g(k.c(this.g));
        }
    }

    @Override // ax.I2.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ax.G2.b e() {
        return k.c(this.g);
    }
}
