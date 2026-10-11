package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.h;

/* loaded from: classes3.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final h PSEUDO_PREFIX;
    public static final h RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final h TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final h TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final h TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final h TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final h name;
    public final h value;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        h.a aVar = h.e0;
        PSEUDO_PREFIX = aVar.d(":");
        RESPONSE_STATUS = aVar.d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.d(TARGET_AUTHORITY_UTF8);
    }

    public Header(h hVar, h hVar2) {
        l.f(hVar, "name");
        l.f(hVar2, "value");
        this.name = hVar;
        this.value = hVar2;
        this.hpackSize = hVar.G() + 32 + hVar2.G();
    }

    public static /* synthetic */ Header copy$default(Header header, h hVar, h hVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = header.name;
        }
        if ((i & 2) != 0) {
            hVar2 = header.value;
        }
        return header.copy(hVar, hVar2);
    }

    public final h component1() {
        return this.name;
    }

    public final h component2() {
        return this.value;
    }

    public final Header copy(h hVar, h hVar2) {
        l.f(hVar, "name");
        l.f(hVar2, "value");
        return new Header(hVar, hVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return l.a(this.name, header.name) && l.a(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.K() + ": " + this.value.K();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            ax.Gb.l.f(r2, r0)
            java.lang.String r0 = "value"
            ax.Gb.l.f(r3, r0)
            ax.xc.h$a r0 = ax.xc.h.e0
            ax.xc.h r2 = r0.d(r2)
            ax.xc.h r3 = r0.d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h hVar, String str) {
        this(hVar, h.e0.d(str));
        l.f(hVar, "name");
        l.f(str, "value");
    }
}
