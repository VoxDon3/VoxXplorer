/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.p4.k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import ax.tb.o;
import java.util.List;

public final class b {
    public static final a a = new a(null);
    private static b b = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    private static boolean c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a() {
            c = false;
            b = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public final b b() {
            return b;
        }

        public final boolean c() {
            return c;
        }

        public final void d(b b8) {
            l.f(b8, "state");
            c = true;
            b = b8;
        }
    }

    public static final class b {
        public static final a n = new a(null);
        private k a;
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

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public b(k k8, Intent intent, ax.p4.l l8, String string, String string2, String string3, String string4, List<String> list, String string5, z z8, m m8, String string6, q q8) {
            ax.Gb.l.f(l8, "mPKCEManager");
            ax.Gb.l.f(list, "mAlreadyAuthedUids");
            this.a = k8;
            this.b = intent;
            this.c = l8;
            this.d = string;
            this.e = string2;
            this.f = string3;
            this.g = string4;
            this.h = list;
            this.i = string5;
            this.j = z8;
            this.k = m8;
            this.l = string6;
            this.m = q8;
        }

        public /* synthetic */ b(k k8, Intent intent, ax.p4.l l8, String string, String string2, String string3, String string4, List list, String string5, z z8, m m8, String string6, q q8, int n8, g g8) {
            if ((n8 & 1) != 0) {
                k8 = null;
            }
            if ((n8 & 2) != 0) {
                intent = null;
            }
            if ((n8 & 4) != 0) {
                l8 = new ax.p4.l();
            }
            if ((n8 & 8) != 0) {
                string = null;
            }
            if ((n8 & 0x10) != 0) {
                string2 = null;
            }
            if ((n8 & 0x20) != 0) {
                string3 = null;
            }
            if ((n8 & 0x40) != 0) {
                string4 = null;
            }
            if ((n8 & 0x80) != 0) {
                list = o.j();
            }
            if ((n8 & 0x100) != 0) {
                string5 = null;
            }
            if ((n8 & 0x200) != 0) {
                z8 = null;
            }
            if ((n8 & 0x400) != 0) {
                m8 = null;
            }
            if ((n8 & 0x800) != 0) {
                string6 = null;
            }
            if ((n8 & 0x1000) != 0) {
                q8 = null;
            }
            this(k8, intent, l8, string, string2, string3, string4, list, string5, z8, m8, string6, q8);
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

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (!ax.Gb.l.a(this.a, ((b)object).a)) {
                return false;
            }
            if (!ax.Gb.l.a(this.b, ((b)object).b)) {
                return false;
            }
            if (!ax.Gb.l.a(this.c, ((b)object).c)) {
                return false;
            }
            if (!ax.Gb.l.a(this.d, ((b)object).d)) {
                return false;
            }
            if (!ax.Gb.l.a(this.e, ((b)object).e)) {
                return false;
            }
            if (!ax.Gb.l.a(this.f, ((b)object).f)) {
                return false;
            }
            if (!ax.Gb.l.a(this.g, ((b)object).g)) {
                return false;
            }
            if (!ax.Gb.l.a(this.h, ((b)object).h)) {
                return false;
            }
            if (!ax.Gb.l.a(this.i, ((b)object).i)) {
                return false;
            }
            if (this.j != ((b)object).j) {
                return false;
            }
            if (!ax.Gb.l.a(this.k, ((b)object).k)) {
                return false;
            }
            if (!ax.Gb.l.a(this.l, ((b)object).l)) {
                return false;
            }
            return this.m == ((b)object).m;
        }

        public final k f() {
            return this.a;
        }

        public final q g() {
            return this.m;
        }

        public final ax.p4.l h() {
            return this.c;
        }

        public int hashCode() {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : ((k)object).hashCode();
            object = this.b;
            int n10 = object == null ? 0 : object.hashCode();
            int n11 = this.c.hashCode();
            object = this.d;
            int n12 = object == null ? 0 : ((String)object).hashCode();
            object = this.e;
            int n13 = object == null ? 0 : ((String)object).hashCode();
            object = this.f;
            int n14 = object == null ? 0 : ((String)object).hashCode();
            object = this.g;
            int n15 = object == null ? 0 : ((String)object).hashCode();
            int n16 = ((Object)this.h).hashCode();
            object = this.i;
            int n17 = object == null ? 0 : ((String)object).hashCode();
            object = this.j;
            int n18 = object == null ? 0 : object.hashCode();
            object = this.k;
            int n19 = object == null ? 0 : object.hashCode();
            object = this.l;
            int n20 = object == null ? 0 : ((String)object).hashCode();
            object = this.m;
            if (object != null) {
                n8 = object.hashCode();
            }
            return (((((((((((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n8;
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

        public final void m(String string) {
            this.d = string;
        }

        public String toString() {
            k k8 = this.a;
            Intent intent = this.b;
            ax.p4.l l8 = this.c;
            String string = this.d;
            String string2 = this.e;
            String string3 = this.f;
            String string4 = this.g;
            List<String> list = this.h;
            String string5 = this.i;
            z z8 = this.j;
            m m8 = this.k;
            String string6 = this.l;
            q q8 = this.m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State(mHost=");
            stringBuilder.append(k8);
            stringBuilder.append(", result=");
            stringBuilder.append(intent);
            stringBuilder.append(", mPKCEManager=");
            stringBuilder.append(l8);
            stringBuilder.append(", mAuthStateNonce=");
            stringBuilder.append(string);
            stringBuilder.append(", mAppKey=");
            stringBuilder.append(string2);
            stringBuilder.append(", mApiType=");
            stringBuilder.append(string3);
            stringBuilder.append(", mDesiredUid=");
            stringBuilder.append(string4);
            stringBuilder.append(", mAlreadyAuthedUids=");
            stringBuilder.append(list);
            stringBuilder.append(", mSessionId=");
            stringBuilder.append(string5);
            stringBuilder.append(", mTokenAccessType=");
            stringBuilder.append((Object)z8);
            stringBuilder.append(", mRequestConfig=");
            stringBuilder.append(m8);
            stringBuilder.append(", mScope=");
            stringBuilder.append(string6);
            stringBuilder.append(", mIncludeGrantedScopes=");
            stringBuilder.append((Object)q8);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            public final b a(ax.r4.a a8) {
                List<Object> list;
                Object object;
                String string;
                String string2;
                String string3;
                q q8;
                block5: {
                    block4: {
                        q8 = null;
                        string3 = a8 != null ? a8.c() : null;
                        string2 = a8 != null ? a8.b() : null;
                        string = a8 != null ? a8.d() : null;
                        if (a8 == null) break block4;
                        object = a8.a();
                        list = object;
                        if (object != null) break block5;
                    }
                    list = o.j();
                }
                object = a8 != null ? a8.i() : null;
                z z8 = a8 != null ? a8.j() : null;
                m m8 = a8 != null ? a8.g() : null;
                k k8 = a8 != null ? a8.e() : null;
                String string4 = a8 != null ? a8.h() : null;
                if (a8 != null) {
                    q8 = a8.f();
                }
                return new b(k8, null, null, null, string3, string2, string, list, (String)object, z8, m8, string4, q8, 14, null);
            }
        }
    }
}

