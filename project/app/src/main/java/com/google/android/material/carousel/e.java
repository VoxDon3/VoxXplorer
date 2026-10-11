/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import ax.l6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {
    private final float a;
    private int b;
    private final List<c> c;
    private final int d;
    private final int e;
    private final int f;

    private e(float f8, List<c> list, int n8, int n9, int n10) {
        this.a = f8;
        this.c = java.util.DesugarCollections.unmodifiableList(list);
        this.d = n8;
        this.e = n9;
        while (n8 <= n9) {
            if (list.get((int)n8).f == 0.0f) {
                ++this.b;
            }
            ++n8;
        }
        this.f = n10;
    }

    static e o(e e8, e e9, float f8) {
        if (e8.g() == e9.g()) {
            List<c> list = e8.h();
            List<c> list2 = e9.h();
            if (list.size() == list2.size()) {
                int n8;
                ArrayList<c> arrayList = new ArrayList<c>();
                for (n8 = 0; n8 < e8.h().size(); ++n8) {
                    arrayList.add(com.google.android.material.carousel.e$c.a(list.get(n8), list2.get(n8), f8));
                }
                int n9 = ax.l6.a.c(e8.c(), e9.c(), f8);
                n8 = ax.l6.a.c(e8.j(), e9.j(), f8);
                return new e(e8.g(), arrayList, n9, n8, e8.f);
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static e p(e e8, int n8) {
        b b8 = new b(e8.g(), n8);
        float f8 = (float)n8 - e8.k().b - e8.k().d / 2.0f;
        for (n8 = e8.h().size() - 1; n8 >= 0; --n8) {
            c c8 = e8.h().get(n8);
            float f9 = c8.d / 2.0f;
            boolean bl = n8 >= e8.c() && n8 <= e8.j();
            b8.d(f9 + f8, c8.c, c8.d, bl, c8.e);
            f8 += c8.d;
        }
        return b8.i();
    }

    int a() {
        return this.f;
    }

    c b() {
        return this.c.get(this.d);
    }

    int c() {
        return this.d;
    }

    c d() {
        return this.c.get(0);
    }

    c e() {
        for (int i8 = 0; i8 < this.c.size(); ++i8) {
            c c8 = this.c.get(i8);
            if (c8.e) continue;
            return c8;
        }
        return null;
    }

    List<c> f() {
        return this.c.subList(this.d, this.e + 1);
    }

    float g() {
        return this.a;
    }

    List<c> h() {
        return this.c;
    }

    c i() {
        return this.c.get(this.e);
    }

    int j() {
        return this.e;
    }

    c k() {
        List<c> list = this.c;
        return list.get(list.size() - 1);
    }

    c l() {
        for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            c c8 = this.c.get(i8);
            if (c8.e) continue;
            return c8;
        }
        return null;
    }

    int m() {
        Iterator<c> iterator = this.c.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            if (!iterator.next().e) continue;
            ++n8;
        }
        return this.c.size() - n8;
    }

    int n() {
        return this.b;
    }

    public static final class b {
        private final float a;
        private final int b;
        private final List<c> c = new ArrayList<c>();
        private c d;
        private c e;
        private int f = -1;
        private int g = -1;
        private float h = 0.0f;
        private int i = -1;

        public b(float f8, int n8) {
            this.a = f8;
            this.b = n8;
        }

        private static float j(float f8, float f9, int n8, int n9) {
            return f8 - (float)n8 * f9 + (float)n9 * f9;
        }

        public b a(float f8, float f9, float f10) {
            return this.d(f8, f9, f10, false, true);
        }

        public b b(float f8, float f9, float f10) {
            return this.c(f8, f9, f10, false);
        }

        public b c(float f8, float f9, float f10, boolean bl) {
            return this.d(f8, f9, f10, bl, false);
        }

        public b d(float f8, float f9, float f10, boolean bl, boolean bl2) {
            float f11 = f10 / 2.0f;
            float f12 = f8 - f11;
            int n8 = this.b;
            f12 = (f11 += f8) > (float)n8 ? Math.abs(f11 - Math.max(f11 - f10, (float)n8)) : (f12 < 0.0f ? Math.abs(f12 - Math.min(f12 + f10, 0.0f)) : 0.0f);
            return this.e(f8, f9, f10, bl, bl2, f12);
        }

        public b e(float f8, float f9, float f10, boolean bl, boolean bl2, float f11) {
            return this.f(f8, f9, f10, bl, bl2, f11, 0.0f, 0.0f);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public b f(float f8, float f9, float f10, boolean bl, boolean bl2, float f11, float f12, float f13) {
            if (f10 <= 0.0f) {
                return this;
            }
            if (bl2) {
                if (bl) throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                int n8 = this.i;
                if (n8 != -1 && n8 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            }
            c c8 = new c(Float.MIN_VALUE, f8, f9, f10, bl2, f11, f12, f13);
            if (bl) {
                if (this.d == null) {
                    this.d = c8;
                    this.f = this.c.size();
                }
                if (this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f10 != this.d.d) throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                this.e = c8;
                this.g = this.c.size();
            } else {
                if (this.d == null && c8.d < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && c8.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = c8.d;
            this.c.add(c8);
            return this;
        }

        public b g(float f8, float f9, float f10, int n8) {
            return this.h(f8, f9, f10, n8, false);
        }

        public b h(float f8, float f9, float f10, int n8, boolean bl) {
            if (n8 > 0 && !(f10 <= 0.0f)) {
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.c((float)i8 * f10 + f8, f9, f10, bl);
                }
            }
            return this;
        }

        public e i() {
            if (this.d != null) {
                ArrayList<c> arrayList = new ArrayList<c>();
                for (int i8 = 0; i8 < this.c.size(); ++i8) {
                    c c8 = this.c.get(i8);
                    arrayList.add(new c(com.google.android.material.carousel.e$b.j(this.d.b, this.a, this.f, i8), c8.b, c8.c, c8.d, c8.e, c8.f, c8.g, c8.h));
                }
                return new e(this.a, arrayList, this.f, this.g, this.b);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    static final class c {
        final float a;
        final float b;
        final float c;
        final float d;
        final boolean e;
        final float f;
        final float g;
        final float h;

        c(float f8, float f9, float f10, float f11) {
            this(f8, f9, f10, f11, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f8, float f9, float f10, float f11, boolean bl, float f12, float f13, float f14) {
            this.a = f8;
            this.b = f9;
            this.c = f10;
            this.d = f11;
            this.e = bl;
            this.f = f12;
            this.g = f13;
            this.h = f14;
        }

        static c a(c c8, c c9, float f8) {
            return new c(ax.l6.a.a(c8.a, c9.a, f8), ax.l6.a.a(c8.b, c9.b, f8), ax.l6.a.a(c8.c, c9.c, f8), ax.l6.a.a(c8.d, c9.d, f8));
        }
    }
}

