package ax.r4;

import ax.Gb.l;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.q;
import ax.p4.z;
import java.util.List;

/* renamed from: ax.r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2950a {
    private final String a;
    private final String b;
    private final String c;
    private final List<String> d;
    private final String e;
    private final z f;
    private final m g;
    private final C2774k h;
    private final String i;
    private final q j;

    public C2950a(String str, String str2, String str3, List<String> list, String str4, z zVar, m mVar, C2774k c2774k, String str5, q qVar) {
        l.f(list, "sAlreadyAuthedUids");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = zVar;
        this.g = mVar;
        this.h = c2774k;
        this.i = str5;
        this.j = qVar;
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

    public final C2774k e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2950a)) {
            return false;
        }
        C2950a c2950a = (C2950a) obj;
        return l.a(this.a, c2950a.a) && l.a(this.b, c2950a.b) && l.a(this.c, c2950a.c) && l.a(this.d, c2950a.d) && l.a(this.e, c2950a.e) && this.f == c2950a.f && l.a(this.g, c2950a.g) && l.a(this.h, c2950a.h) && l.a(this.i, c2950a.i) && this.j == c2950a.j;
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
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        z zVar = this.f;
        int hashCode5 = (hashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        m mVar = this.g;
        int hashCode6 = (hashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        C2774k c2774k = this.h;
        int hashCode7 = (hashCode6 + (c2774k == null ? 0 : c2774k.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        q qVar = this.j;
        return hashCode8 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final z j() {
        return this.f;
    }

    public String toString() {
        return "AuthParameters(sAppKey=" + this.a + ", sApiType=" + this.b + ", sDesiredUid=" + this.c + ", sAlreadyAuthedUids=" + this.d + ", sSessionId=" + this.e + ", sTokenAccessType=" + this.f + ", sRequestConfig=" + this.g + ", sHost=" + this.h + ", sScope=" + this.i + ", sIncludeGrantedScopes=" + this.j + ")";
    }
}
