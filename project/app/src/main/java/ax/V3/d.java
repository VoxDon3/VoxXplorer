/*
 * Decompiled with CFR 0.152.
 */
package ax.V3;

import android.content.Context;
import android.net.Uri;
import ax.M3.j;
import ax.O3.b;
import ax.O3.c;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import ax.X3.o;
import java.io.InputStream;

public class d
implements m<Uri, InputStream> {
    private final Context a;

    d(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(j object) {
        return (object = ((j)object).c(o.c)) != null && (Long)object == -1L;
    }

    public m.a<InputStream> c(Uri uri, int n8, int n9, j j8) {
        if (b.d(n8, n9) && this.e(j8)) {
            return new m.a<InputStream>(new ax.j4.b(uri), c.g(this.a, uri));
        }
        return null;
    }

    public boolean d(Uri uri) {
        return b.c(uri);
    }

    public static class a
    implements n<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override
        public m<Uri, InputStream> b(q q8) {
            return new d(this.a);
        }
    }
}

