/*
 * Decompiled with CFR 0.152.
 */
package ax.y2;

import android.graphics.Rect;
import ax.Gb.g;
import ax.Gb.l;

public final class a {
    public static final a e = new a(null);
    private static final a f = new a(0, 0, 0, 0);
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public a(int n8, int n9, int n10, int n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        if (n8 <= n10) {
            if (n9 <= n11) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("top must be less than or equal to bottom, top: ");
            stringBuilder.append(n9);
            stringBuilder.append(", bottom: ");
            stringBuilder.append(n11);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Left must be less than or equal to right, left: ");
        stringBuilder.append(n8);
        stringBuilder.append(", right: ");
        stringBuilder.append(n10);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public a(Rect rect) {
        l.f(rect, "rect");
        this(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!l.a(a.class, clazz)) {
            return false;
        }
        l.d(object, "null cannot be cast to non-null type androidx.window.core.Bounds");
        object = (a)object;
        if (this.a != ((a)object).a) {
            return false;
        }
        if (this.b != ((a)object).b) {
            return false;
        }
        if (this.c != ((a)object).c) {
            return false;
        }
        return this.d == ((a)object).d;
    }

    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.class.getSimpleName());
        stringBuilder.append(" { [");
        stringBuilder.append(this.a);
        stringBuilder.append(',');
        stringBuilder.append(this.b);
        stringBuilder.append(',');
        stringBuilder.append(this.c);
        stringBuilder.append(',');
        stringBuilder.append(this.d);
        stringBuilder.append("] }");
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

