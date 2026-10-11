package ax.V3;

import android.content.Context;
import android.net.Uri;
import ax.M3.j;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements m<Uri, InputStream> {
    public final Context a;

    public static class a implements n<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // ax.U3.n
        public m<Uri, InputStream> b(q qVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(Uri uri, int i, int i2, j jVar) {
        if (ax.O3.b.d(i, i2)) {
            return new m.a<>(new ax.j4.b(uri), ax.O3.c.f(this.a, uri));
        }
        return null;
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ax.O3.b.a(uri);
    }
}
