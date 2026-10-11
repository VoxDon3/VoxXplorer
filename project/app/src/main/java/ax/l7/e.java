/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import ax.l7.c;
import ax.l7.f;
import ax.l7.i;
import ax.m7.t;
import ax.m7.v;
import ax.m7.w;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class e
implements t {
    private final c a;
    private final Set<String> b;

    protected e(a a8) {
        this.a = a8.a;
        this.b = new HashSet<String>(a8.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(f f8) throws IOException {
        Throwable throwable2;
        block3: {
            boolean bl;
            if (this.b.isEmpty()) {
                return;
            }
            try {
                bl = f8.C0(this.b) != null && f8.e() != i.e0;
            }
            catch (Throwable throwable2) {
                break block3;
            }
            v.c(bl, "wrapper key(s) not found: %s", this.b);
            return;
        }
        f8.close();
        throw throwable2;
    }

    @Override
    public <T> T a(InputStream inputStream, Charset charset, Class<T> clazz) throws IOException {
        return (T)this.e(inputStream, charset, clazz);
    }

    public final c b() {
        return this.a;
    }

    public Set<String> c() {
        return java.util.DesugarCollections.unmodifiableSet(this.b);
    }

    public Object e(InputStream closeable, Charset charset, Type type) throws IOException {
        closeable = this.a.c((InputStream)closeable, charset);
        this.d((f)closeable);
        return ((f)closeable).F(type, true);
    }

    public static class a {
        final c a;
        Collection<String> b = w.a();

        public a(c c8) {
            this.a = v.d(c8);
        }

        public e a() {
            return new e(this);
        }

        public a b(Collection<String> collection) {
            this.b = collection;
            return this;
        }
    }
}

