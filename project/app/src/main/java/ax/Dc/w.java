/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.I;
import ax.Dc.V;
import java.io.Serializable;
import java.util.zip.ZipException;

public class w
extends ZipException {
    private final transient I c0;
    private final a q;

    public w(V v8, I i8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported compression method ");
        stringBuilder.append(i8.getMethod());
        stringBuilder.append(" (");
        stringBuilder.append(v8.name());
        stringBuilder.append(") used in entry ");
        stringBuilder.append(i8.getName());
        super(stringBuilder.toString());
        this.q = a.d0;
        this.c0 = i8;
    }

    public w(a a8, I i8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported feature ");
        stringBuilder.append(a8);
        stringBuilder.append(" used in entry ");
        stringBuilder.append(i8.getName());
        super(stringBuilder.toString());
        this.q = a8;
        this.c0 = i8;
    }

    public static class a
    implements Serializable {
        public static final a c0 = new a("encryption");
        public static final a d0 = new a("compression method");
        public static final a e0 = new a("data descriptor");
        public static final a f0 = new a("splitting");
        public static final a g0 = new a("unknown compressed size");
        private final String q;

        private a(String string) {
            this.q = string;
        }

        public String toString() {
            return this.q;
        }
    }
}

