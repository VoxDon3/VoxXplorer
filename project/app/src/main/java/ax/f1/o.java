/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import ax.P0.D;
import ax.S0.d0;
import ax.S0.u;
import ax.f1.c0;
import ax.f1.e;
import ax.f1.x;
import java.io.IOException;

public final class o
implements x.b {
    private final Context b;
    private final ax.q7.u<HandlerThread> c;
    private final ax.q7.u<HandlerThread> d;
    private int e;
    private boolean f;

    @Deprecated
    public o() {
        this.e = 0;
        this.f = false;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public o(Context context) {
        this(context, null, null);
    }

    public o(Context context, ax.q7.u<HandlerThread> u8, ax.q7.u<HandlerThread> u9) {
        this.b = context;
        this.e = 0;
        this.f = false;
        this.c = u8;
        this.d = u9;
    }

    private boolean b() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 31) {
            return true;
        }
        Context context = this.b;
        return context != null && n8 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override
    public x a(x.a a8) throws IOException {
        int n8;
        if (Build.VERSION.SDK_INT >= 23 && ((n8 = this.e) == 1 || n8 == 0 && this.b())) {
            ax.q7.u<HandlerThread> u8;
            n8 = D.k(a8.c.o);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("Creating an asynchronous MediaCodec adapter for track type ");
            ((StringBuilder)object).append(d0.v0(n8));
            u.f("DMCodecAdapterFactory", ((StringBuilder)object).toString());
            object = this.c;
            object = object != null && (u8 = this.d) != null ? new e.b((ax.q7.u<HandlerThread>)object, u8) : new e.b(n8);
            ((e.b)object).e(this.f);
            return ((e.b)object).d(a8);
        }
        return new c0.b().a(a8);
    }
}

