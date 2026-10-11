/*
 * Decompiled with CFR 0.152.
 */
package ax.sb;

import ax.Gb.l;
import ax.sb.g;

public final class f
implements Comparable<f> {
    public static final a f0 = new a(null);
    public static final f g0 = g.a();
    private final int c0;
    private final int d0;
    private final int e0;
    private final int q;

    public f(int n8, int n9, int n10) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = n10;
        this.e0 = this.h(n8, n9, n10);
    }

    private final int h(int n8, int n9, int n10) {
        if (n8 >= 0 && n8 < 256 && n9 >= 0 && n9 < 256 && n10 >= 0 && n10 < 256) {
            return (n8 << 16) + (n9 << 8) + n10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Version components are out of range: ");
        stringBuilder.append(n8);
        stringBuilder.append('.');
        stringBuilder.append(n9);
        stringBuilder.append('.');
        stringBuilder.append(n10);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public int d(f f8) {
        l.f(f8, "other");
        return this.e0 - f8.e0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object = object instanceof f ? (f)object : null) == null) {
            return false;
        }
        return this.e0 == ((f)object).e0;
    }

    public int hashCode() {
        return this.e0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.q);
        stringBuilder.append('.');
        stringBuilder.append(this.c0);
        stringBuilder.append('.');
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }
    }
}

