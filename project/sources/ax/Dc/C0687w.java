package ax.Dc;

import java.io.Serializable;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0687w extends ZipException {
    private final transient I c0;
    private final a q;

    /* renamed from: ax.Dc.w$a */
    public static class a implements Serializable {
        public static final a c0 = new a("encryption");
        public static final a d0 = new a("compression method");
        public static final a e0 = new a("data descriptor");
        public static final a f0 = new a("splitting");
        public static final a g0 = new a("unknown compressed size");
        private final String q;

        private a(String str) {
            this.q = str;
        }

        public String toString() {
            return this.q;
        }
    }

    public C0687w(a aVar, I i) {
        super("Unsupported feature " + aVar + " used in entry " + i.getName());
        this.q = aVar;
        this.c0 = i;
    }

    public C0687w(V v, I i) {
        super("Unsupported compression method " + i.getMethod() + " (" + v.name() + ") used in entry " + i.getName());
        this.q = a.d0;
        this.c0 = i;
    }
}
