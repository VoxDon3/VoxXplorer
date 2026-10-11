/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.graphics.Insets;
import android.graphics.Rect;
import ax.u.m;
import ax.u.n;
import ax.u.o;
import ax.u.p;

public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private b(int n8, int n9, int n10, int n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
    }

    public static b a(b b8, b b9) {
        return ax.T.b.b(Math.max(b8.a, b9.a), Math.max(b8.b, b9.b), Math.max(b8.c, b9.c), Math.max(b8.d, b9.d));
    }

    public static b b(int n8, int n9, int n10, int n11) {
        if (n8 == 0 && n9 == 0 && n10 == 0 && n11 == 0) {
            return e;
        }
        return new b(n8, n9, n10, n11);
    }

    public static b c(Rect rect) {
        return ax.T.b.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return ax.T.b.b(m.a(insets), n.a(insets), o.a(insets), p.a(insets));
    }

    public Insets e() {
        return ax.T.b$a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            if (this.d != ((b)object).d) {
                return false;
            }
            if (this.a != ((b)object).a) {
                return false;
            }
            if (this.c != ((b)object).c) {
                return false;
            }
            return this.b == ((b)object).b;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Insets{left=");
        stringBuilder.append(this.a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.b);
        stringBuilder.append(", right=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static class a {
        static Insets a(int n8, int n9, int n10, int n11) {
            return Insets.of((int)n8, (int)n9, (int)n10, (int)n11);
        }
    }
}

