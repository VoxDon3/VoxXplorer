/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import ax.r7.C;

public final class Y {
    public static final Y i = new b().h();
    public final C<Integer> a;
    public final Double b;
    public final Double c;
    public final boolean d;
    @Deprecated
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    private Y(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e ^ true;
        this.f = b8.e;
        this.g = b8.f;
        this.h = b8.g;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Y)) {
            return false;
        }
        object = (Y)object;
        return this.a.equals(((Y)object).a) && this.f == ((Y)object).f && j.Objects.equals((Object)this.b, (Object)((Y)object).b) && j.Objects.equals((Object)this.c, (Object)((Y)object).c) && this.d == ((Y)object).d && this.g == ((Y)object).g && this.h == ((Y)object).h;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d, this.f, this.g, this.h});
    }

    public static final class b {
        private C<Integer> a = C.A(1, 5);
        private Double b;
        private Double c;
        private boolean d = true;
        private boolean e = true;
        private boolean f = true;
        private boolean g = true;

        public Y h() {
            return new Y(this);
        }
    }
}

