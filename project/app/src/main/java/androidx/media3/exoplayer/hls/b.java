/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import ax.S0.a;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

final class b {
    private final LinkedHashMap<Uri, byte[]> a;

    public b(int n8) {
        this.a = new LinkedHashMap<Uri, byte[]>(this, n8 + 1, 1.0f, false, n8){
            final b c0;
            final int q;
            {
                this.c0 = b8;
                this.q = n9;
                super(n8, f8, bl);
            }

            @Override
            protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return ((AbstractMap)this).size() > this.q;
            }
        };
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] byArray) {
        return ((AbstractMap)this.a).put(ax.S0.a.e(uri), ax.S0.a.e(byArray));
    }

    public byte[] c(Uri uri) {
        return (byte[])((AbstractMap)this.a).remove(ax.S0.a.e(uri));
    }
}

