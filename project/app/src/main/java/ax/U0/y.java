/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import ax.S0.a;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class y
implements g {
    private final g a;
    private long b;
    private Uri c;
    private Map<String, List<String>> d;

    public y(g g8) {
        this.a = ax.S0.a.e(g8);
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public Uri b() {
        return this.a.b();
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws IOException {
        if ((n8 = this.a.c(byArray, n8, n9)) != -1) {
            this.b += (long)n8;
        }
        return n8;
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    @Override
    public void d(z z8) {
        ax.S0.a.e(z8);
        this.a.d(z8);
    }

    @Override
    public long f(k k8) throws IOException {
        this.c = k8.a;
        this.d = Collections.EMPTY_MAP;
        try {
            long l8 = this.a.f(k8);
            return l8;
        }
        finally {
            k8 = this.b();
            if (k8 != null) {
                this.c = k8;
            }
            this.d = this.l();
        }
    }

    @Override
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

