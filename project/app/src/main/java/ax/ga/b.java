/*
 * Decompiled with CFR 0.152.
 */
package ax.ga;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public interface b {
    public InputStream a(String var1, Object var2) throws IOException;

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a d0 = new a("http");
        public static final /* enum */ a e0 = new a("https");
        public static final /* enum */ a f0 = new a("file");
        public static final /* enum */ a g0 = new a("content");
        public static final /* enum */ a h0 = new a("assets");
        public static final /* enum */ a i0 = new a("drawable");
        public static final /* enum */ a j0 = new a("");
        private static final a[] k0 = a.d();
        private String c0;
        private String q;

        private a(String string) {
            this.q = string;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("://");
            this.c0 = ((StringBuilder)charSequence).toString();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{d0, e0, f0, g0, h0, i0, j0};
        }

        private boolean h(String string) {
            return string.toLowerCase(Locale.US).startsWith(this.c0);
        }

        public static a l(String string) {
            if (string != null) {
                for (a a8 : a.values()) {
                    if (!a8.h(string)) continue;
                    return a8;
                }
            }
            return j0;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])k0.clone();
        }

        public String j(String string) {
            if (this.h(string)) {
                return string.substring(this.c0.length());
            }
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", string, this.q));
        }

        public String n(String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c0);
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
    }
}

