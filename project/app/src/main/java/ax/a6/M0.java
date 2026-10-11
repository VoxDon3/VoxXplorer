/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.os.Handler;
import ax.a6.D0;
import ax.a6.G;
import ax.a6.K0;
import ax.a6.O0;
import ax.a6.c;
import ax.a6.p;
import java.util.concurrent.Executor;

final class M0 {
    private final Application a;
    private final Handler b;
    private final Executor c;
    private final p d;
    private final G e;
    private final K0 f;
    private final O0 g;
    private final D0 h;

    M0(Application application, c c8, Handler handler, Executor executor, p p8, G g8, K0 k02, O0 o02, D0 d02) {
        this.a = application;
        this.b = handler;
        this.c = executor;
        this.d = p8;
        this.e = g8;
        this.f = k02;
        this.g = o02;
        this.h = d02;
    }
}

