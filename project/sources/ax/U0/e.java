package ax.U0;

import android.net.Uri;
import android.util.Base64;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class e extends b {
    private k e;
    private byte[] f;
    private int g;
    private int h;

    public e() {
        super(false);
    }

    @Override // ax.U0.g
    public Uri b() {
        k kVar = this.e;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(d0.i(this.f), this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        q(min);
        return min;
    }

    @Override // ax.U0.g
    public void close() {
        if (this.f != null) {
            this.f = null;
            r();
        }
        this.e = null;
    }

    @Override // ax.U0.g
    public long f(k kVar) throws IOException {
        s(kVar);
        this.e = kVar;
        Uri normalizeScheme = kVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        C0968a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] x1 = d0.x1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (x1.length != 2) {
            throw E.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = x1[1];
        if (x1[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw E.b("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f = d0.x0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = kVar.g;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new h(2008);
        }
        int i = (int) j;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        long j2 = kVar.h;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        t(kVar);
        long j3 = kVar.h;
        return j3 != -1 ? j3 : this.h;
    }
}
