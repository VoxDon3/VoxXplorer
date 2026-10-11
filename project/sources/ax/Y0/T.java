package ax.Y0;

import android.os.HandlerThread;
import android.os.Looper;
import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class T {
    private final Object a;
    private Looper b;
    private HandlerThread c;
    private int d;

    public T() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    C0968a.g(this.d == 0 && this.c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.c = handlerThread;
                    handlerThread.start();
                    this.b = this.c.getLooper();
                }
                this.d++;
                looper = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                C0968a.g(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T(Looper looper) {
        this.a = new Object();
        this.b = looper;
        this.c = null;
        this.d = 0;
    }
}
