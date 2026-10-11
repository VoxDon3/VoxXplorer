package ax.p1;

import androidx.media3.exoplayer.AbstractC0601h;
import androidx.media3.exoplayer.C0622s;
import ax.P0.C0912v;
import ax.S0.G;
import ax.S0.d0;
import ax.Y0.V;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends AbstractC0601h {
    private final ax.V0.i t0;
    private final G u0;
    private InterfaceC2758a v0;
    private long w0;

    public b() {
        super(6);
        this.t0 = new ax.V0.i(1);
        this.u0 = new G();
    }

    private float[] i0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.u0.Z(byteBuffer.array(), byteBuffer.limit());
        this.u0.b0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.u0.z());
        }
        return fArr;
    }

    private void j0() {
        InterfaceC2758a interfaceC2758a = this.v0;
        if (interfaceC2758a != null) {
            interfaceC2758a.e();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i == 8) {
            this.v0 = (InterfaceC2758a) obj;
        } else {
            super.B(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        j0();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) {
        this.w0 = Long.MIN_VALUE;
        j0();
    }

    @Override // androidx.media3.exoplayer.N0
    public int b(C0912v c0912v) {
        return "application/x-camera-motion".equals(c0912v.o) ? V.a(4) : V.a(0);
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return n();
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) {
        while (!n() && this.w0 < 100000 + j) {
            this.t0.p();
            if (f0(M(), this.t0, 0) != -4 || this.t0.s()) {
                return;
            }
            long j3 = this.t0.g0;
            this.w0 = j3;
            boolean z = j3 < O();
            if (this.v0 != null && !z) {
                this.t0.D();
                float[] i0 = i0((ByteBuffer) d0.i(this.t0.e0));
                if (i0 != null) {
                    ((InterfaceC2758a) d0.i(this.v0)).b(this.w0 - R(), i0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        return true;
    }
}
