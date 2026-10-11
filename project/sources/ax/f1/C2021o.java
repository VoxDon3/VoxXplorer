package ax.f1;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import ax.S0.C0987u;
import ax.f1.C2011e;
import ax.f1.InterfaceC2029x;
import ax.f1.c0;
import java.io.IOException;

/* renamed from: ax.f1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2021o implements InterfaceC2029x.b {
    private final Context b;
    private final ax.q7.u<HandlerThread> c;
    private final ax.q7.u<HandlerThread> d;
    private int e;
    private boolean f;

    @Deprecated
    public C2021o() {
        this.e = 0;
        this.f = false;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        Context context = this.b;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // ax.f1.InterfaceC2029x.b
    public InterfaceC2029x a(InterfaceC2029x.a aVar) throws IOException {
        int i;
        ax.q7.u<HandlerThread> uVar;
        if (Build.VERSION.SDK_INT < 23 || !((i = this.e) == 1 || (i == 0 && b()))) {
            return new c0.b().a(aVar);
        }
        int k = ax.P0.D.k(aVar.c.o);
        C0987u.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + ax.S0.d0.v0(k));
        ax.q7.u<HandlerThread> uVar2 = this.c;
        C2011e.b bVar = (uVar2 == null || (uVar = this.d) == null) ? new C2011e.b(k) : new C2011e.b(uVar2, uVar);
        bVar.e(this.f);
        return bVar.a(aVar);
    }

    public C2021o(Context context) {
        this(context, null, null);
    }

    public C2021o(Context context, ax.q7.u<HandlerThread> uVar, ax.q7.u<HandlerThread> uVar2) {
        this.b = context;
        this.e = 0;
        this.f = false;
        this.c = uVar;
        this.d = uVar2;
    }
}
