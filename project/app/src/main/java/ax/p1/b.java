/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.s;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.V;
import ax.p1.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class b
extends h {
    private final i t0 = new i(1);
    private final G u0 = new G();
    private a v0;
    private long w0;

    public b() {
        super(6);
    }

    private float[] i0(ByteBuffer object) {
        if (((Buffer)object).remaining() != 16) {
            return null;
        }
        this.u0.Z(((ByteBuffer)object).array(), ((Buffer)object).limit());
        this.u0.b0(((ByteBuffer)object).arrayOffset() + 4);
        object = new float[3];
        for (int i8 = 0; i8 < 3; ++i8) {
            object[i8] = Float.intBitsToFloat(this.u0.z());
        }
        return object;
    }

    private void j0() {
        a a8 = this.v0;
        if (a8 != null) {
            a8.e();
        }
    }

    @Override
    public void B(int n8, Object object) throws s {
        if (n8 == 8) {
            this.v0 = (a)object;
            return;
        }
        super.B(n8, object);
    }

    @Override
    protected void U() {
        this.j0();
    }

    @Override
    protected void X(long l8, boolean bl) {
        this.w0 = Long.MIN_VALUE;
        this.j0();
    }

    @Override
    public int b(v v8) {
        if ("application/x-camera-motion".equals(v8.o)) {
            return V.a(4);
        }
        return V.a(0);
    }

    @Override
    public boolean c() {
        return this.n();
    }

    @Override
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override
    public void i(long l8, long l9) {
        while (!this.n() && this.w0 < 100000L + l8) {
            this.t0.p();
            Object object = this.M();
            i i8 = this.t0;
            boolean bl = false;
            if (this.f0((O)object, i8, 0) != -4 || this.t0.s()) break;
            this.w0 = l9 = this.t0.g0;
            if (l9 < this.O()) {
                bl = true;
            }
            if (this.v0 == null || bl) continue;
            this.t0.D();
            object = this.i0(d0.i(this.t0.e0));
            if (object == null) continue;
            d0.i(this.v0).b(this.w0 - this.R(), (float[])object);
        }
    }

    @Override
    public boolean isReady() {
        return true;
    }
}

