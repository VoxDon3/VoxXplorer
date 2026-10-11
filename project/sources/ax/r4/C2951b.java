package ax.r4;

import android.content.Intent;
import ax.Gb.l;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import ax.tb.C3139o;
import java.util.List;

/* renamed from: ax.r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2951b {
    public static final a a = new a(null);
    private static C0436b b = new C0436b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    private static boolean c;

    /* renamed from: ax.r4.b$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final void a() {
            C2951b.c = false;
            C2951b.b = new C0436b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public final C0436b b() {
            return C2951b.b;
        }

        public final boolean c() {
            return C2951b.c;
        }

        public final void d(C0436b c0436b) {
            l.f(c0436b, "state");
            C2951b.c = true;
            C2951b.b = c0436b;
        }

        private a() {
        }
    }

    /* renamed from: ax.r4.b$b, reason: collision with other inner class name */
    public static final class C0436b {
        public static final a n = new a(null);
        private C2774k a;
        private Intent b;
        private ax.p4.l c;
        private String d;
        private String e;
        private String f;
        private String g;
        private List<String> h;
        private String i;
        private z j;
        private m k;
        private String l;
        private q m;

        /* renamed from: ax.r4.b$b$a */
        public static final class a {
            public /* synthetic */ a(ax.Gb.g gVar) {
                this();
            }

            public final C0436b a(C2950a c2950a) {
                List<String> j;
                String c = c2950a != null ? c2950a.c() : null;
                String b = c2950a != null ? c2950a.b() : null;
                String d = c2950a != null ? c2950a.d() : null;
                if (c2950a == null || (j = c2950a.a()) == null) {
                    j = C3139o.j();
                }
                return new C0436b(c2950a != null ? c2950a.e() : null, null, null, null, c, b, d, j, c2950a != null ? c2950a.i() : null, c2950a != null ? c2950a.j() : null, c2950a != null ? c2950a.g() : null, c2950a != null ? c2950a.h() : null, c2950a != null ? c2950a.f() : null, 14, null);
            }

            private a() {
            }
        }

        public C0436b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public final List<String> a() {
            return this.h;
        }

        public final String b() {
            return this.f;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0436b)) {
                return false;
            }
            C0436b c0436b = (C0436b) obj;
            return l.a(this.a, c0436b.a) && l.a(this.b, c0436b.b) && l.a(this.c, c0436b.c) && l.a(this.d, c0436b.d) && l.a(this.e, c0436b.e) && l.a(this.f, c0436b.f) && l.a(this.g, c0436b.g) && l.a(this.h, c0436b.h) && l.a(this.i, c0436b.i) && this.j == c0436b.j && l.a(this.k, c0436b.k) && l.a(this.l, c0436b.l) && this.m == c0436b.m;
        }

        public final C2774k f() {
            return this.a;
        }

        public final q g() {
            return this.m;
        }

        public final ax.p4.l h() {
            return this.c;
        }

        public int hashCode() {
            C2774k c2774k = this.a;
            int hashCode = (c2774k == null ? 0 : c2774k.hashCode()) * 31;
            Intent intent = this.b;
            int hashCode2 = (((hashCode + (intent == null ? 0 : intent.hashCode())) * 31) + this.c.hashCode()) * 31;
            String str = this.d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.h.hashCode()) * 31;
            String str5 = this.i;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            z zVar = this.j;
            int hashCode8 = (hashCode7 + (zVar == null ? 0 : zVar.hashCode())) * 31;
            m mVar = this.k;
            int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            String str6 = this.l;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            q qVar = this.m;
            return hashCode10 + (qVar != null ? qVar.hashCode() : 0);
        }

        public final m i() {
            return this.k;
        }

        public final String j() {
            return this.l;
        }

        public final String k() {
            return this.i;
        }

        public final z l() {
            return this.j;
        }

        public final void m(String str) {
            this.d = str;
        }

        public String toString() {
            return "State(mHost=" + this.a + ", result=" + this.b + ", mPKCEManager=" + this.c + ", mAuthStateNonce=" + this.d + ", mAppKey=" + this.e + ", mApiType=" + this.f + ", mDesiredUid=" + this.g + ", mAlreadyAuthedUids=" + this.h + ", mSessionId=" + this.i + ", mTokenAccessType=" + this.j + ", mRequestConfig=" + this.k + ", mScope=" + this.l + ", mIncludeGrantedScopes=" + this.m + ")";
        }

        public C0436b(C2774k c2774k, Intent intent, ax.p4.l lVar, String str, String str2, String str3, String str4, List<String> list, String str5, z zVar, m mVar, String str6, q qVar) {
            l.f(lVar, "mPKCEManager");
            l.f(list, "mAlreadyAuthedUids");
            this.a = c2774k;
            this.b = intent;
            this.c = lVar;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = list;
            this.i = str5;
            this.j = zVar;
            this.k = mVar;
            this.l = str6;
            this.m = qVar;
        }

        public /* synthetic */ C0436b(C2774k c2774k, Intent intent, ax.p4.l lVar, String str, String str2, String str3, String str4, List list, String str5, z zVar, m mVar, String str6, q qVar, int i, ax.Gb.g gVar) {
            this((i & 1) != 0 ? null : c2774k, (i & 2) != 0 ? null : intent, (i & 4) != 0 ? new ax.p4.l() : lVar, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? C3139o.j() : list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : zVar, (i & 1024) != 0 ? null : mVar, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : qVar);
        }
    }
}
