/*
 * Decompiled with CFR 0.152.
 */
package ax.V3;

import android.net.Uri;
import ax.M3.j;
import ax.U3.g;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b
implements m<Uri, InputStream> {
    private static final Set<String> b = java.util.DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("http", "https")));
    private final m<g, InputStream> a;

    public b(m<g, InputStream> m8) {
        this.a = m8;
    }

    public m.a<InputStream> c(Uri uri, int n8, int n9, j j8) {
        return this.a.a(new g(uri.toString()), n8, n9, j8);
    }

    public boolean d(Uri uri) {
        return b.contains(uri.getScheme());
    }

    public static class a
    implements n<Uri, InputStream> {
        @Override
        public m<Uri, InputStream> b(q q8) {
            return new b(q8.d(g.class, InputStream.class));
        }
    }
}

