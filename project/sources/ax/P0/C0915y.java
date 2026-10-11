package ax.P0;

import android.net.Uri;
import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import okhttp3.HttpUrl;

/* renamed from: ax.P0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915y {
    public static final C0915y i = new c().a();
    private static final String j = d0.G0(0);
    private static final String k = d0.G0(1);
    private static final String l = d0.G0(2);
    private static final String m = d0.G0(3);
    private static final String n = d0.G0(4);
    private static final String o = d0.G0(5);
    public final String a;
    public final h b;

    @Deprecated
    public final h c;
    public final g d;
    public final A e;
    public final d f;

    @Deprecated
    public final e g;
    public final i h;

    /* renamed from: ax.P0.y$b */
    public static final class b {
    }

    /* renamed from: ax.P0.y$c */
    public static final class c {
        private String a;
        private Uri b;
        private String c;
        private d.a d;
        private f.a e;
        private List<L> f;
        private String g;
        private AbstractC2991z<k> h;
        private Object i;
        private long j;
        private A k;
        private g.a l;
        private i m;

        public C0915y a() {
            h hVar;
            C0968a.g(this.e.b == null || this.e.a != null);
            Uri uri = this.b;
            if (uri != null) {
                hVar = new h(uri, this.c, this.e.a != null ? this.e.i() : null, null, this.f, this.g, this.h, this.i, this.j);
            } else {
                hVar = null;
            }
            String str = this.a;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str2 = str;
            e h = this.d.h();
            g f = this.l.f();
            A a = this.k;
            if (a == null) {
                a = A.I;
            }
            return new C0915y(str2, h, hVar, f, a, this.m);
        }

        public c b(g gVar) {
            this.l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.a = (String) C0968a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.h = AbstractC2991z.u(list);
            return this;
        }

        public c e(Object obj) {
            this.i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.d = new d.a();
            this.e = new f.a();
            this.f = Collections.EMPTY_LIST;
            this.h = AbstractC2991z.z();
            this.l = new g.a();
            this.m = i.d;
            this.j = -9223372036854775807L;
        }

        private c(C0915y c0915y) {
            this();
            f.a aVar;
            this.d = c0915y.f.a();
            this.a = c0915y.a;
            this.k = c0915y.e;
            this.l = c0915y.d.a();
            this.m = c0915y.h;
            h hVar = c0915y.b;
            if (hVar != null) {
                this.g = hVar.e;
                this.c = hVar.b;
                this.b = hVar.a;
                this.f = hVar.d;
                this.h = hVar.f;
                this.i = hVar.h;
                f fVar = hVar.c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.e = aVar;
                this.j = hVar.i;
            }
        }
    }

    /* renamed from: ax.P0.y$d */
    public static class d {
        public static final d i = new a().g();
        private static final String j = d0.G0(0);
        private static final String k = d0.G0(1);
        private static final String l = d0.G0(2);
        private static final String m = d0.G0(3);
        private static final String n = d0.G0(4);
        static final String o = d0.G0(5);
        static final String p = d0.G0(6);
        private static final String q = d0.G0(7);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        /* renamed from: ax.P0.y$d$a */
        public static final class a {
            private long a;
            private long b;
            private boolean c;
            private boolean d;
            private boolean e;
            private boolean f;

            public d g() {
                return new d(this);
            }

            @Deprecated
            public e h() {
                return new e(this);
            }

            public a() {
                this.b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.a = dVar.b;
                this.b = dVar.d;
                this.c = dVar.e;
                this.d = dVar.f;
                this.e = dVar.g;
                this.f = dVar.h;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h;
        }

        public int hashCode() {
            long j2 = this.b;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.d;
            return ((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
        }

        private d(a aVar) {
            this.a = d0.E1(aVar.a);
            this.c = d0.E1(aVar.b);
            this.b = aVar.a;
            this.d = aVar.b;
            this.e = aVar.c;
            this.f = aVar.d;
            this.g = aVar.e;
            this.h = aVar.f;
        }
    }

    @Deprecated
    /* renamed from: ax.P0.y$e */
    public static final class e extends d {
        public static final e r = new d.a().h();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: ax.P0.y$f */
    public static final class f {
        private static final String l = d0.G0(0);
        private static final String m = d0.G0(1);
        private static final String n = d0.G0(2);
        private static final String o = d0.G0(3);
        static final String p = d0.G0(4);
        private static final String q = d0.G0(5);
        private static final String r = d0.G0(6);
        private static final String s = d0.G0(7);
        public final UUID a;

        @Deprecated
        public final UUID b;
        public final Uri c;

        @Deprecated
        public final AbstractC2962A<String, String> d;
        public final AbstractC2962A<String, String> e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        @Deprecated
        public final AbstractC2991z<Integer> i;
        public final AbstractC2991z<Integer> j;
        private final byte[] k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && Objects.equals(this.c, fVar.c) && Objects.equals(this.e, fVar.e) && this.f == fVar.f && this.h == fVar.h && this.g == fVar.g && this.j.equals(fVar.j) && Arrays.equals(this.k, fVar.k);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Uri uri = this.c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + (this.f ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.j.hashCode()) * 31) + Arrays.hashCode(this.k);
        }

        /* renamed from: ax.P0.y$f$a */
        public static final class a {
            private UUID a;
            private Uri b;
            private AbstractC2962A<String, String> c;
            private boolean d;
            private boolean e;
            private boolean f;
            private AbstractC2991z<Integer> g;
            private byte[] h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.c = AbstractC2962A.k();
                this.e = true;
                this.g = AbstractC2991z.z();
            }

            private a(f fVar) {
                this.a = fVar.a;
                this.b = fVar.c;
                this.c = fVar.e;
                this.d = fVar.f;
                this.e = fVar.g;
                this.f = fVar.h;
                this.g = fVar.j;
                this.h = fVar.k;
            }
        }

        private f(a aVar) {
            C0968a.g((aVar.f && aVar.b == null) ? false : true);
            UUID uuid = (UUID) C0968a.e(aVar.a);
            this.a = uuid;
            this.b = uuid;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.c;
            this.f = aVar.d;
            this.h = aVar.f;
            this.g = aVar.e;
            this.i = aVar.g;
            this.j = aVar.g;
            this.k = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }
    }

    /* renamed from: ax.P0.y$g */
    public static final class g {
        public static final g f = new a().f();
        private static final String g = d0.G0(0);
        private static final String h = d0.G0(1);
        private static final String i = d0.G0(2);
        private static final String j = d0.G0(3);
        private static final String k = d0.G0(4);
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        /* renamed from: ax.P0.y$g$a */
        public static final class a {
            private long a;
            private long b;
            private long c;
            private float d;
            private float e;

            public g f() {
                return new g(this);
            }

            public a g(long j) {
                this.c = j;
                return this;
            }

            public a h(float f) {
                this.e = f;
                return this;
            }

            public a i(long j) {
                this.b = j;
                return this;
            }

            public a j(float f) {
                this.d = f;
                return this;
            }

            public a k(long j) {
                this.a = j;
                return this;
            }

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.a = gVar.a;
                this.b = gVar.b;
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.c;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f2 = this.d;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.e;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        private g(a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
        }

        @Deprecated
        public g(long j2, long j3, long j4, float f2, float f3) {
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.d = f2;
            this.e = f3;
        }
    }

    /* renamed from: ax.P0.y$h */
    public static final class h {
        private static final String j = d0.G0(0);
        private static final String k = d0.G0(1);
        private static final String l = d0.G0(2);
        private static final String m = d0.G0(3);
        private static final String n = d0.G0(4);
        private static final String o = d0.G0(5);
        private static final String p = d0.G0(6);
        private static final String q = d0.G0(7);
        public final Uri a;
        public final String b;
        public final f c;
        public final List<L> d;
        public final String e;
        public final AbstractC2991z<k> f;

        @Deprecated
        public final List<j> g;
        public final Object h;
        public final long i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.c, hVar.c) && this.d.equals(hVar.d) && Objects.equals(this.e, hVar.e) && this.f.equals(hVar.f) && Objects.equals(this.h, hVar.h) && this.i == hVar.i;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.d.hashCode()) * 31;
            String str2 = this.e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
            return (int) (((hashCode4 + (this.h != null ? r1.hashCode() : 0)) * 31) + this.i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<L> list, String str2, AbstractC2991z<k> abstractC2991z, Object obj, long j2) {
            this.a = uri;
            this.b = D.t(str);
            this.c = fVar;
            this.d = list;
            this.e = str2;
            this.f = abstractC2991z;
            AbstractC2991z.a r = AbstractC2991z.r();
            for (int i = 0; i < abstractC2991z.size(); i++) {
                r.a(abstractC2991z.get(i).a().j());
            }
            this.g = r.k();
            this.h = obj;
            this.i = j2;
        }
    }

    /* renamed from: ax.P0.y$i */
    public static final class i {
        public static final i d = new a().d();
        private static final String e = d0.G0(0);
        private static final String f = d0.G0(1);
        private static final String g = d0.G0(2);
        public final Uri a;
        public final String b;
        public final Bundle c;

        /* renamed from: ax.P0.y$i$a */
        public static final class a {
            private Uri a;
            private String b;
            private Bundle c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.a, iVar.a) && Objects.equals(this.b, iVar.b)) {
                if ((this.c == null) == (iVar.c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    @Deprecated
    /* renamed from: ax.P0.y$j */
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: ax.P0.y$k */
    public static class k {
        private static final String h = d0.G0(0);
        private static final String i = d0.G0(1);
        private static final String j = d0.G0(2);
        private static final String k = d0.G0(3);
        private static final String l = d0.G0(4);
        private static final String m = d0.G0(5);
        private static final String n = d0.G0(6);
        public final Uri a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        /* renamed from: ax.P0.y$k$a */
        public static final class a {
            private Uri a;
            private String b;
            private String c;
            private int d;
            private int e;
            private String f;
            private String g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.b = D.t(str);
                return this;
            }

            public a l(int i) {
                this.d = i;
                return this;
            }

            public a(Uri uri) {
                this.a = uri;
            }

            private a(k kVar) {
                this.a = kVar.a;
                this.b = kVar.b;
                this.c = kVar.c;
                this.d = kVar.d;
                this.e = kVar.e;
                this.f = kVar.f;
                this.g = kVar.g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a.equals(kVar.a) && Objects.equals(this.b, kVar.b) && Objects.equals(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Objects.equals(this.f, kVar.f) && Objects.equals(this.g, kVar.g);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            String str3 = this.f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }
    }

    public static C0915y b(Uri uri) {
        return new c().f(uri).a();
    }

    public static C0915y c(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0915y)) {
            return false;
        }
        C0915y c0915y = (C0915y) obj;
        return Objects.equals(this.a, c0915y.a) && this.f.equals(c0915y.f) && Objects.equals(this.b, c0915y.b) && Objects.equals(this.d, c0915y.d) && Objects.equals(this.e, c0915y.e) && Objects.equals(this.h, c0915y.h);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.h.hashCode();
    }

    private C0915y(String str, e eVar, h hVar, g gVar, A a2, i iVar) {
        this.a = str;
        this.b = hVar;
        this.c = hVar;
        this.d = gVar;
        this.e = a2;
        this.f = eVar;
        this.g = eVar;
        this.h = iVar;
    }
}
