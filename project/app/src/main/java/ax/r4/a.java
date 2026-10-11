/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import ax.Gb.l;
import ax.p4.k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import java.util.List;

public final class a {
    private final String a;
    private final String b;
    private final String c;
    private final List<String> d;
    private final String e;
    private final z f;
    private final m g;
    private final k h;
    private final String i;
    private final q j;

    public a(String string, String string2, String string3, List<String> list, String string4, z z8, m m8, k k8, String string5, q q8) {
        l.f(list, "sAlreadyAuthedUids");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = list;
        this.e = string4;
        this.f = z8;
        this.g = m8;
        this.h = k8;
        this.i = string5;
        this.j = q8;
    }

    public final List<String> a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final k e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (!l.a(this.a, ((a)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((a)object).b)) {
            return false;
        }
        if (!l.a(this.c, ((a)object).c)) {
            return false;
        }
        if (!l.a(this.d, ((a)object).d)) {
            return false;
        }
        if (!l.a(this.e, ((a)object).e)) {
            return false;
        }
        if (this.f != ((a)object).f) {
            return false;
        }
        if (!l.a(this.g, ((a)object).g)) {
            return false;
        }
        if (!l.a(this.h, ((a)object).h)) {
            return false;
        }
        if (!l.a(this.i, ((a)object).i)) {
            return false;
        }
        return this.j == ((a)object).j;
    }

    public final q f() {
        return this.j;
    }

    public final m g() {
        return this.g;
    }

    public final String h() {
        return this.i;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n11 = object == null ? 0 : object.hashCode();
        int n12 = ((Object)this.d).hashCode();
        object = this.e;
        int n13 = object == null ? 0 : object.hashCode();
        object = this.f;
        int n14 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n15 = object == null ? 0 : object.hashCode();
        object = this.h;
        int n16 = object == null ? 0 : ((k)object).hashCode();
        object = this.i;
        int n17 = object == null ? 0 : object.hashCode();
        object = this.j;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((((((((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n8;
    }

    public final String i() {
        return this.e;
    }

    public final z j() {
        return this.f;
    }

    public String toString() {
        String string = this.a;
        String string2 = this.b;
        String string3 = this.c;
        List<String> list = this.d;
        String string4 = this.e;
        z z8 = this.f;
        m m8 = this.g;
        k k8 = this.h;
        String string5 = this.i;
        q q8 = this.j;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthParameters(sAppKey=");
        stringBuilder.append(string);
        stringBuilder.append(", sApiType=");
        stringBuilder.append(string2);
        stringBuilder.append(", sDesiredUid=");
        stringBuilder.append(string3);
        stringBuilder.append(", sAlreadyAuthedUids=");
        stringBuilder.append(list);
        stringBuilder.append(", sSessionId=");
        stringBuilder.append(string4);
        stringBuilder.append(", sTokenAccessType=");
        stringBuilder.append((Object)z8);
        stringBuilder.append(", sRequestConfig=");
        stringBuilder.append(m8);
        stringBuilder.append(", sHost=");
        stringBuilder.append(k8);
        stringBuilder.append(", sScope=");
        stringBuilder.append(string5);
        stringBuilder.append(", sIncludeGrantedScopes=");
        stringBuilder.append((Object)q8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

