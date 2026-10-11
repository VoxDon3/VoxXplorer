package ax.V3;

import ax.M3.j;
import ax.U3.g;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class e implements m<URL, InputStream> {
    private final m<g, InputStream> a;

    public static class a implements n<URL, InputStream> {
        @Override // ax.U3.n
        public m<URL, InputStream> b(q qVar) {
            return new e(qVar.d(g.class, InputStream.class));
        }
    }

    public e(m<g, InputStream> mVar) {
        this.a = mVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(URL url, int i, int i2, j jVar) {
        return this.a.a(new g(url), i, i2, jVar);
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
