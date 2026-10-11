package ax.X0;

import android.content.Context;
import android.os.Handler;
import ax.P0.C0912v;
import ax.a1.H;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;

/* loaded from: classes.dex */
public final class f extends H<b> {
    private final Context V0;

    public f(Context context, Handler handler, InterfaceC1309z interfaceC1309z, InterfaceC1276B interfaceC1276B) {
        super(handler, interfaceC1309z, interfaceC1276B);
        this.V0 = context.getApplicationContext();
    }

    @Override // ax.a1.H
    protected int D0(C0912v c0912v) {
        if ("audio/x-exoplayer-midi".equals(c0912v.o)) {
            return !C0(b.D()) ? 1 : 4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.a1.H
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b m0(C0912v c0912v, ax.V0.b bVar) throws c {
        return new b(this.V0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.a1.H
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C0912v r0(b bVar) {
        return b.D();
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "MidiRenderer";
    }
}
