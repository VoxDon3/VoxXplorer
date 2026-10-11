package ax.I2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class e<T> extends h<T> {
    private final BroadcastReceiver f;

    public static final class a extends BroadcastReceiver {
        final /* synthetic */ e<T> a;

        a(e<T> eVar) {
            this.a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ax.Gb.l.f(context, "context");
            ax.Gb.l.f(intent, "intent");
            this.a.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ax.N2.c cVar) {
        super(context, cVar);
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        this.f = new a(this);
    }

    @Override // ax.I2.h
    public void h() {
        String str;
        ax.B2.i e = ax.B2.i.e();
        str = f.a;
        e.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f, j());
    }

    @Override // ax.I2.h
    public void i() {
        String str;
        ax.B2.i e = ax.B2.i.e();
        str = f.a;
        e.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
