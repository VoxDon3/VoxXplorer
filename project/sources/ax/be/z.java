package ax.be;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public class z extends r {
    private static final int[] k0 = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 33554432, 67108864};
    private static final int[] l0 = {4, 8, 24, 48};
    private byte[] c0 = null;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int q;

    public z() {
        try {
            w(6);
        } catch (L unused) {
            throw new RuntimeException();
        }
    }

    @Override // ax.be.r
    public InputStream c(InputStream inputStream, C1735c c1735c) throws IOException {
        return new y(inputStream, this.q, this.c0, c1735c);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    @Override // ax.be.r
    public s f(s sVar, C1735c c1735c) {
        return this.g0 == 0 ? new K(sVar, c1735c) : new A(sVar, this, c1735c);
    }

    public int h() {
        return this.j0;
    }

    public int i() {
        return this.q;
    }

    public int j() {
        return this.d0;
    }

    public int k() {
        return this.e0;
    }

    public int l() {
        return this.i0;
    }

    public int m() {
        return this.g0;
    }

    public int n() {
        return this.h0;
    }

    public int o() {
        return this.f0;
    }

    public byte[] r() {
        return this.c0;
    }

    public void s(int i) throws L {
        if (i < 4096) {
            throw new L("LZMA2 dictionary size must be at least 4 KiB: " + i + " B");
        }
        if (i <= 805306368) {
            this.q = i;
            return;
        }
        throw new L("LZMA2 dictionary size must not exceed 768 MiB: " + i + " B");
    }

    public void t(int i, int i2) throws L {
        if (i >= 0 && i2 >= 0 && i <= 4 && i2 <= 4 && i + i2 <= 4) {
            this.d0 = i;
            this.e0 = i2;
            return;
        }
        throw new L("lc + lp must not exceed 4: " + i + " + " + i2);
    }

    public void v(int i) throws L {
        if (i >= 0 && i <= 4) {
            this.f0 = i;
            return;
        }
        throw new L("pb must not exceed 4: " + i);
    }

    public void w(int i) throws L {
        if (i < 0 || i > 9) {
            throw new L("Unsupported preset: " + i);
        }
        this.d0 = 3;
        this.e0 = 0;
        this.f0 = 2;
        this.q = k0[i];
        if (i <= 3) {
            this.g0 = 1;
            this.i0 = 4;
            this.h0 = i <= 1 ? 128 : 273;
            this.j0 = l0[i];
            return;
        }
        this.g0 = 2;
        this.i0 = 20;
        this.h0 = i == 4 ? 16 : i == 5 ? 32 : 64;
        this.j0 = 0;
    }
}
