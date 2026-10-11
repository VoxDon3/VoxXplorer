package ax.he;

/* loaded from: classes3.dex */
final class f {
    final g a = new g();
    final int[] b = new int[4];
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    int h;
    int i;

    f() {
    }

    void a() {
        this.c = 1073741824;
    }

    void b(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = false;
    }

    void c(int i, int i2, int i3) {
        this.c = i;
        this.d = i2 + 1;
        this.e = i3;
        this.f = true;
        this.g = false;
    }

    void d(int i, int i2, int i3, int i4, int i5) {
        this.c = i;
        this.d = i4 + i2 + 1;
        this.e = i5;
        this.f = true;
        this.g = true;
        this.h = i2;
        this.i = i3;
    }
}
