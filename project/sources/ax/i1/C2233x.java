package ax.i1;

import android.net.Uri;
import ax.S0.C0968a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: ax.i1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2233x implements ax.U0.g {
    private final ax.U0.g a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    /* renamed from: ax.i1.x$a */
    public interface a {
        void b(ax.S0.G g);
    }

    public C2233x(ax.U0.g gVar, int i, a aVar) {
        C0968a.a(i > 0);
        this.a = gVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    private boolean q() throws IOException {
        if (this.a.c(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int c = this.a.c(bArr, i3, i2);
            if (c == -1) {
                return false;
            }
            i3 += c;
            i2 -= c;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.b(new ax.S0.G(bArr, i));
        }
        return true;
    }

    @Override // ax.U0.g
    public Uri b() {
        return this.a.b();
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == 0) {
            if (!q()) {
                return -1;
            }
            this.e = this.b;
        }
        int c = this.a.c(bArr, i, Math.min(this.e, i2));
        if (c != -1) {
            this.e -= c;
        }
        return c;
    }

    @Override // ax.U0.g
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // ax.U0.g
    public void d(ax.U0.z zVar) {
        C0968a.e(zVar);
        this.a.d(zVar);
    }

    @Override // ax.U0.g
    public long f(ax.U0.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.U0.g
    public Map<String, List<String>> l() {
        return this.a.l();
    }
}
