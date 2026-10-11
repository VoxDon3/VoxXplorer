package ax.g1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC0601h;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.Y0.O;
import ax.Y0.V;
import ax.i1.InterfaceC2209F;
import ax.z1.InterfaceC3538a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104c extends AbstractC0601h implements Handler.Callback {
    private boolean A0;
    private long B0;
    private C C0;
    private long D0;
    private final InterfaceC2102a t0;
    private final InterfaceC2103b u0;
    private final Handler v0;
    private final ax.z1.b w0;
    private final boolean x0;
    private InterfaceC3538a y0;
    private boolean z0;

    public C2104c(InterfaceC2103b interfaceC2103b, Looper looper) {
        this(interfaceC2103b, looper, InterfaceC2102a.a);
    }

    private void i0(C c, List<C.a> list) {
        for (int i = 0; i < c.e(); i++) {
            C0912v a = c.d(i).a();
            if (a == null || !this.t0.b(a)) {
                list.add(c.d(i));
            } else {
                InterfaceC3538a a2 = this.t0.a(a);
                byte[] bArr = (byte[]) C0968a.e(c.d(i).c());
                this.w0.p();
                this.w0.C(bArr.length);
                ((ByteBuffer) d0.i(this.w0.e0)).put(bArr);
                this.w0.D();
                C a3 = a2.a(this.w0);
                if (a3 != null) {
                    i0(a3, list);
                }
            }
        }
    }

    private long j0(long j) {
        C0968a.g(j != -9223372036854775807L);
        C0968a.g(this.D0 != -9223372036854775807L);
        return j - this.D0;
    }

    private void k0(C c) {
        Handler handler = this.v0;
        if (handler != null) {
            handler.obtainMessage(1, c).sendToTarget();
        } else {
            l0(c);
        }
    }

    private void l0(C c) {
        this.u0.r(c);
    }

    private boolean m0(long j) {
        boolean z;
        C c = this.C0;
        if (c == null || (!this.x0 && c.b > j0(j))) {
            z = false;
        } else {
            k0(this.C0);
            this.C0 = null;
            z = true;
        }
        if (this.z0 && this.C0 == null) {
            this.A0 = true;
        }
        return z;
    }

    private void n0() {
        if (this.z0 || this.C0 != null) {
            return;
        }
        this.w0.p();
        O M = M();
        int f0 = f0(M, this.w0, 0);
        if (f0 != -4) {
            if (f0 == -5) {
                this.B0 = ((C0912v) C0968a.e(M.b)).t;
                return;
            }
            return;
        }
        if (this.w0.s()) {
            this.z0 = true;
            return;
        }
        if (this.w0.g0 >= O()) {
            ax.z1.b bVar = this.w0;
            bVar.k0 = this.B0;
            bVar.D();
            C a = ((InterfaceC3538a) d0.i(this.y0)).a(this.w0);
            if (a != null) {
                ArrayList arrayList = new ArrayList(a.e());
                i0(a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.C0 = new C(j0(this.w0.g0), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.C0 = null;
        this.y0 = null;
        this.D0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) {
        this.C0 = null;
        this.z0 = false;
        this.A0 = false;
    }

    @Override // androidx.media3.exoplayer.N0
    public int b(C0912v c0912v) {
        if (this.t0.b(c0912v)) {
            return V.a(c0912v.P == 0 ? 4 : 2);
        }
        return V.a(0);
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return this.A0;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void d0(C0912v[] c0912vArr, long j, long j2, InterfaceC2209F.b bVar) {
        this.y0 = this.t0.a(c0912vArr[0]);
        C c = this.C0;
        if (c != null) {
            this.C0 = c.c((c.b + this.D0) - j2);
        }
        this.D0 = j2;
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        l0((C) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) {
        boolean z = true;
        while (z) {
            n0();
            z = m0(j);
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        return true;
    }

    public C2104c(InterfaceC2103b interfaceC2103b, Looper looper, InterfaceC2102a interfaceC2102a) {
        this(interfaceC2103b, looper, interfaceC2102a, false);
    }

    public C2104c(InterfaceC2103b interfaceC2103b, Looper looper, InterfaceC2102a interfaceC2102a, boolean z) {
        super(5);
        this.u0 = (InterfaceC2103b) C0968a.e(interfaceC2103b);
        this.v0 = looper == null ? null : d0.z(looper, this);
        this.t0 = (InterfaceC2102a) C0968a.e(interfaceC2102a);
        this.x0 = z;
        this.w0 = new ax.z1.b();
        this.D0 = -9223372036854775807L;
    }
}
