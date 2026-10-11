package ax.U0;

import android.net.Uri;
import ax.S0.C0968a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements g {
    private final g a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.EMPTY_MAP;

    public y(g gVar) {
        this.a = (g) C0968a.e(gVar);
    }

    @Override // ax.U0.g
    public Uri b() {
        return this.a.b();
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws IOException {
        int c = this.a.c(bArr, i, i2);
        if (c != -1) {
            this.b += c;
        }
        return c;
    }

    @Override // ax.U0.g
    public void close() throws IOException {
        this.a.close();
    }

    @Override // ax.U0.g
    public void d(z zVar) {
        C0968a.e(zVar);
        this.a.d(zVar);
    }

    @Override // ax.U0.g
    public long f(k kVar) throws IOException {
        this.c = kVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return this.a.f(kVar);
        } finally {
            Uri b = b();
            if (b != null) {
                this.c = b;
            }
            this.d = l();
        }
    }

    @Override // ax.U0.g
    public Map<String, List<String>> l() {
        return this.a.l();
    }

    public long q() {
        return this.b;
    }

    public Uri r() {
        return this.c;
    }

    public Map<String, List<String>> s() {
        return this.d;
    }

    public void t() {
        this.b = 0L;
    }
}
