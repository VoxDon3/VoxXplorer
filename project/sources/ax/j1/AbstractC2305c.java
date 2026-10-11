package ax.j1;

import ax.P0.C0912v;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.j;
import ax.U0.k;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2305c extends AbstractC2304b {
    private byte[] j;
    private volatile boolean k;

    public AbstractC2305c(g gVar, k kVar, int i, C0912v c0912v, int i2, Object obj, byte[] bArr) {
        super(gVar, kVar, i, c0912v, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = bArr == null ? d0.f : bArr;
    }

    private void i(int i) {
        byte[] bArr = this.j;
        if (bArr.length < i + Http2.INITIAL_MAX_FRAME_SIZE) {
            this.j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
        }
    }

    @Override // ax.m1.o.e
    public final void a() throws IOException {
        try {
            this.i.f(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                i(i2);
                i = this.i.c(this.j, i2, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                g(this.j, i2);
            }
            j.a(this.i);
        } catch (Throwable th) {
            j.a(this.i);
            throw th;
        }
    }

    @Override // ax.m1.o.e
    public final void c() {
        this.k = true;
    }

    protected abstract void g(byte[] bArr, int i) throws IOException;

    public byte[] h() {
        return this.j;
    }
}
