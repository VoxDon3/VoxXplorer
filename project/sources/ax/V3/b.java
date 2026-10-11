package ax.V3;

import android.net.Uri;
import ax.M3.j;
import ax.U3.g;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements m<Uri, InputStream> {
    private static final Set<String> b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final m<g, InputStream> a;

    public static class a implements n<Uri, InputStream> {
        @Override // ax.U3.n
        public m<Uri, InputStream> b(q qVar) {
            return new b(qVar.d(g.class, InputStream.class));
        }
    }

    public b(m<g, InputStream> mVar) {
        this.a = mVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(Uri uri, int i, int i2, j jVar) {
        return this.a.a(new g(uri.toString()), i, i2, jVar);
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
