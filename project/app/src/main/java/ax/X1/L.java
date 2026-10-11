/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.SparseArray;
import ax.P0.E;
import ax.S0.G;
import ax.S0.M;
import ax.q1.t;
import java.util.Collections;
import java.util.List;

public interface L {
    public void a(M var1, t var2, d var3);

    public void b();

    public void c(G var1, int var2) throws E;

    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String string, int n8, byte[] byArray) {
            this.a = string;
            this.b = n8;
            this.c = byArray;
        }
    }

    public static final class b {
        public final int a;
        public final String b;
        public final int c;
        public final List<a> d;
        public final byte[] e;

        public b(int n8, String object, int n9, List<a> list, byte[] byArray) {
            this.a = n8;
            this.b = object;
            this.c = n9;
            object = list == null ? Collections.EMPTY_LIST : java.util.DesugarCollections.unmodifiableList(list);
            this.d = object;
            this.e = byArray;
        }

        public int a() {
            int n8 = this.c;
            if (n8 != 2) {
                if (n8 != 3) {
                    return 0;
                }
                return 512;
            }
            return 2048;
        }
    }

    public static interface c {
        public SparseArray<L> a();

        public L b(int var1, b var2);
    }

    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int n8, int n9) {
            this(Integer.MIN_VALUE, n8, n9);
        }

        public d(int n8, int n9, int n10) {
            CharSequence charSequence;
            if (n8 != Integer.MIN_VALUE) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(n8);
                ((StringBuilder)charSequence).append("/");
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = "";
            }
            this.a = charSequence;
            this.b = n9;
            this.c = n10;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }

        private void d() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public void a() {
            int n8 = this.d;
            n8 = n8 == Integer.MIN_VALUE ? this.b : (n8 += this.c);
            this.d = n8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(this.d);
            this.e = stringBuilder.toString();
        }

        public String b() {
            this.d();
            return this.e;
        }

        public int c() {
            this.d();
            return this.d;
        }
    }
}

