/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import android.util.Base64;
import ax.P0.E;
import ax.S0.a;
import ax.S0.d0;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class e
extends b {
    private k e;
    private byte[] f;
    private int g;
    private int h;

    public e() {
        super(false);
    }

    @Override
    public Uri b() {
        k k8 = this.e;
        if (k8 != null) {
            return k8.a;
        }
        return null;
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) {
        if (n9 == 0) {
            return 0;
        }
        int n10 = this.h;
        if (n10 == 0) {
            return -1;
        }
        n9 = Math.min(n9, n10);
        System.arraycopy(d0.i(this.f), this.g, byArray, n8, n9);
        this.g += n9;
        this.h -= n9;
        this.q(n9);
        return n9;
    }

    @Override
    public void close() {
        if (this.f != null) {
            this.f = null;
            this.r();
        }
        this.e = null;
    }

    @Override
    public long f(k object) throws IOException {
        this.s((k)object);
        this.e = object;
        Object object2 = ((k)object).a.normalizeScheme();
        String[] stringArray = object2.getScheme();
        boolean bl = "data".equals(stringArray);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported scheme: ");
        stringBuilder.append((String)stringArray);
        a.b(bl, stringBuilder.toString());
        stringArray = d0.x1(object2.getSchemeSpecificPart(), ",");
        if (stringArray.length == 2) {
            object2 = stringArray[1];
            if (stringArray[0].contains(";base64")) {
                try {
                    this.f = Base64.decode((String)object2, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Error while parsing Base64 encoded string: ");
                    ((StringBuilder)object).append((String)object2);
                    throw E.b(((StringBuilder)object).toString(), illegalArgumentException);
                }
            } else {
                this.f = d0.x0(j.URLDecoder.decode((String)object2, (String)StandardCharsets.US_ASCII.name()));
            }
            long l8 = ((k)object).g;
            object2 = this.f;
            if (l8 <= (long)((Uri)object2).length) {
                int n8;
                this.g = n8 = (int)l8;
                this.h = n8 = ((Uri)object2).length - n8;
                l8 = ((k)object).h;
                if (l8 != -1L) {
                    this.h = (int)Math.min((long)n8, l8);
                }
                this.t((k)object);
                l8 = ((k)object).h;
                if (l8 != -1L) {
                    return l8;
                }
                return this.h;
            }
            this.f = null;
            throw new h(2008);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected URI format: ");
        ((StringBuilder)object).append(object2);
        throw E.b(((StringBuilder)object).toString(), null);
    }
}

