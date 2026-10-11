/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.net.Uri;
import ax.B2.c;
import ax.B2.j;
import ax.Gb.g;
import ax.Gb.l;
import ax.tb.L;
import java.util.Set;

public final class b {
    public static final a i = new a(null);
    public static final b j = new b(null, false, false, false, false, 0L, 0L, null, 255, null);
    private final j a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final long g;
    private final Set<b> h;

    public b() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public b(b b8) {
        l.f(b8, "other");
        boolean bl = b8.b;
        boolean bl2 = b8.c;
        j j8 = b8.a;
        boolean bl3 = b8.d;
        boolean bl4 = b8.e;
        Set<b> set = b8.h;
        this(j8, bl, bl2, bl3, bl4, b8.f, b8.g, set);
    }

    public b(j j8, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l8, long l9, Set<b> set) {
        l.f((Object)j8, "requiredNetworkType");
        l.f(set, "contentUriTriggers");
        this.a = j8;
        this.b = bl;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = l8;
        this.g = l9;
        this.h = set;
    }

    public /* synthetic */ b(j j8, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l8, long l9, Set set, int n8, g g8) {
        if ((n8 & 1) != 0) {
            j8 = ax.B2.j.q;
        }
        if ((n8 & 2) != 0) {
            bl = false;
        }
        if ((n8 & 4) != 0) {
            bl2 = false;
        }
        if ((n8 & 8) != 0) {
            bl3 = false;
        }
        if ((n8 & 0x10) != 0) {
            bl4 = false;
        }
        if ((n8 & 0x20) != 0) {
            l8 = -1L;
        }
        if ((n8 & 0x40) != 0) {
            l9 = -1L;
        }
        if ((n8 & 0x80) != 0) {
            set = L.d();
        }
        this(j8, bl, bl2, bl3, bl4, l8, l9, set);
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.f;
    }

    public final Set<b> c() {
        return this.h;
    }

    public final j d() {
        return this.a;
    }

    public final boolean e() {
        return this.h.isEmpty() ^ true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && l.a(b.class, object.getClass())) {
            object = (b)object;
            if (this.b != ((b)object).b) {
                return false;
            }
            if (this.c != ((b)object).c) {
                return false;
            }
            if (this.d != ((b)object).d) {
                return false;
            }
            if (this.e != ((b)object).e) {
                return false;
            }
            if (this.f != ((b)object).f) {
                return false;
            }
            if (this.g != ((b)object).g) {
                return false;
            }
            if (this.a != ((b)object).a) {
                return false;
            }
            return l.a(this.h, ((b)object).h);
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    public int hashCode() {
        int n8 = ((Object)((Object)this.a)).hashCode();
        int n9 = this.b;
        int n10 = this.c;
        int n11 = this.d;
        int n12 = this.e;
        long l8 = this.f;
        int n13 = (int)(l8 ^ l8 >>> 32);
        l8 = this.g;
        return ((((((n8 * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + ((Object)this.h).hashCode();
    }

    public final boolean i() {
        return this.e;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b {
        private final Uri a;
        private final boolean b;

        public b(Uri uri, boolean bl) {
            l.f(uri, "uri");
            this.a = uri;
            this.b = bl;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            Class<?> clazz = object != null ? object.getClass() : null;
            if (!l.a(b.class, clazz)) {
                return false;
            }
            l.d(object, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            object = (b)object;
            if (!l.a(this.a, ((b)object).a)) {
                return false;
            }
            return this.b == ((b)object).b;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + ax.B2.c.a(this.b);
        }
    }
}

