package ax.i2;

import ax.b0.C1446g;

/* renamed from: ax.i2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2236A {
    private final a a;
    private final int b;
    private int c = -1;

    /* renamed from: ax.i2.A$a */
    static abstract class a {
        a() {
        }

        abstract void a(int i, int i2, boolean z, int i3);
    }

    C2236A(int i, a aVar) {
        this.b = i;
        this.a = aVar;
    }

    private void a(int i, int i2) {
        C1446g.b(this.c == -1, "End has already been set.");
        this.c = i;
        int i3 = this.b;
        if (i > i3) {
            f(i3 + 1, i, true, i2);
        } else if (i < i3) {
            f(i, i3 - 1, true, i2);
        }
    }

    private void c(int i, int i2) {
        int i3 = this.c;
        if (i >= i3) {
            if (i > i3) {
                f(i3 + 1, i, true, i2);
            }
        } else {
            int i4 = this.b;
            if (i >= i4) {
                f(i + 1, i3, false, i2);
            } else {
                f(i4 + 1, i3, false, i2);
                f(i, this.b - 1, true, i2);
            }
        }
    }

    private void d(int i, int i2) {
        int i3 = this.c;
        if (i <= i3) {
            if (i < i3) {
                f(i, i3 - 1, true, i2);
            }
        } else {
            int i4 = this.b;
            if (i <= i4) {
                f(i3, i - 1, false, i2);
            } else {
                f(i3, i4 - 1, false, i2);
                f(this.b + 1, i, true, i2);
            }
        }
    }

    private void e(int i, int i2) {
        C1446g.b(this.c != -1, "End must already be set.");
        C1446g.b(this.b != this.c, "Beging and end point to same position.");
        int i3 = this.c;
        int i4 = this.b;
        if (i3 > i4) {
            c(i, i2);
        } else if (i3 < i4) {
            d(i, i2);
        }
        this.c = i;
    }

    private void f(int i, int i2, boolean z, int i3) {
        this.a.a(i, i2, z, i3);
    }

    void b(int i, int i2) {
        C1446g.b(i != -1, "Position cannot be NO_POSITION.");
        int i3 = this.c;
        if (i3 != -1 && i3 != this.b) {
            e(i, i2);
        } else {
            this.c = -1;
            a(i, i2);
        }
    }

    public String toString() {
        return "Range{begin=" + this.b + ", end=" + this.c + "}";
    }
}
