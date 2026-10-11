package ax.V3;

import android.content.Context;
import android.net.Uri;
import ax.M3.j;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import ax.X3.o;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d implements m<Uri, InputStream> {
    private final Context a;

    public static class a implements n<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // ax.U3.n
        public m<Uri, InputStream> b(q qVar) {
            return new d(this.a);
        }
    }

    d(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(j jVar) {
        Long l = (Long) jVar.c(o.c);
        return l != null && l.longValue() == -1;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(Uri uri, int i, int i2, j jVar) {
        if (ax.O3.b.d(i, i2) && e(jVar)) {
            return new m.a<>(new ax.j4.b(uri), ax.O3.c.g(this.a, uri));
        }
        return null;
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ax.O3.b.c(uri);
    }
}
