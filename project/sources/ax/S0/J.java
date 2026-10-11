package ax.S0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class J implements InterfaceC0975h {
    protected J() {
    }

    @Override // ax.S0.InterfaceC0975h
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // ax.S0.InterfaceC0975h
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ax.S0.InterfaceC0975h
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // ax.S0.InterfaceC0975h
    public InterfaceC0984q d(Looper looper, Handler.Callback callback) {
        return new K(new Handler(looper, callback));
    }

    @Override // ax.S0.InterfaceC0975h
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // ax.S0.InterfaceC0975h
    public void e() {
    }
}
