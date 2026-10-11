package ax.Y0;

import ax.r7.AbstractC2964C;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class Y {
    public static final Y i = new b().h();
    public final AbstractC2964C<Integer> a;
    public final Double b;
    public final Double c;
    public final boolean d;

    @Deprecated
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public static final class b {
        private Double b;
        private Double c;
        private AbstractC2964C<Integer> a = AbstractC2964C.A(1, 5);
        private boolean d = true;
        private boolean e = true;
        private boolean f = true;
        private boolean g = true;

        public Y h() {
            return new Y(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return this.a.equals(y.a) && this.f == y.f && Objects.equals(this.b, y.b) && Objects.equals(this.c, y.c) && this.d == y.d && this.g == y.g && this.h == y.h;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    private Y(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = !bVar.e;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
    }
}
