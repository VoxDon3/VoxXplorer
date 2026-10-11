/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.os.HandlerThread;
import android.os.Looper;
import ax.S0.a;

public final class T {
    private final Object a = new Object();
    private Looper b;
    private HandlerThread c;
    private int d;

    public T() {
        this(null);
    }

    public T(Looper looper) {
        this.b = looper;
        this.c = null;
        this.d = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Looper a() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    HandlerThread handlerThread;
                    boolean bl;
                    try {
                        if (this.b == null) {
                            bl = this.d == 0 && this.c == null;
                        }
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    ax.S0.a.g(bl);
                    this.c = handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    handlerThread.start();
                    this.b = this.c.getLooper();
                }
                ++this.d;
                return this.b;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        HandlerThread handlerThread;
                        int n8;
                        boolean bl = this.d > 0;
                        ax.S0.a.g(bl);
                        this.d = n8 = this.d - 1;
                        if (n8 != 0 || (handlerThread = this.c) == null) break block3;
                        handlerThread.quit();
                        this.c = null;
                        this.b = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

