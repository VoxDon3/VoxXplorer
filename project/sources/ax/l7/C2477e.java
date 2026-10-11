package ax.l7;

import ax.m7.t;
import ax.m7.v;
import ax.m7.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.l7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2477e implements t {
    private final AbstractC2475c a;
    private final Set<String> b;

    /* renamed from: ax.l7.e$a */
    public static class a {
        final AbstractC2475c a;
        Collection<String> b = w.a();

        public a(AbstractC2475c abstractC2475c) {
            this.a = (AbstractC2475c) v.d(abstractC2475c);
        }

        public C2477e a() {
            return new C2477e(this);
        }

        public a b(Collection<String> collection) {
            this.b = collection;
            return this;
        }
    }

    protected C2477e(a aVar) {
        this.a = aVar.a;
        this.b = new HashSet(aVar.b);
    }

    private void d(AbstractC2478f abstractC2478f) throws IOException {
        if (this.b.isEmpty()) {
            return;
        }
        try {
            v.c((abstractC2478f.C0(this.b) == null || abstractC2478f.e() == EnumC2481i.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.b);
        } catch (Throwable th) {
            abstractC2478f.close();
            throw th;
        }
    }

    @Override // ax.m7.t
    public <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) e(inputStream, charset, cls);
    }

    public final AbstractC2475c b() {
        return this.a;
    }

    public Set<String> c() {
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public Object e(InputStream inputStream, Charset charset, Type type) throws IOException {
        AbstractC2478f c = this.a.c(inputStream, charset);
        d(c);
        return c.F(type, true);
    }
}
