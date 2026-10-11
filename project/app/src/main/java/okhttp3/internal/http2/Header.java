/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.h;

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

    static {
        h.a a8 = h.e0;
        PSEUDO_PREFIX = a8.d(":");
        RESPONSE_STATUS = a8.d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = a8.d(TARGET_METHOD_UTF8);
        TARGET_PATH = a8.d(TARGET_PATH_UTF8);
        TARGET_SCHEME = a8.d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = a8.d(TARGET_AUTHORITY_UTF8);
    }

    public Header(h h8, h h9) {
        l.f(h8, "name");
        l.f(h9, "value");
        this.name = h8;
        this.value = h9;
        this.hpackSize = h8.G() + 32 + h9.G();
    }

    public Header(h h8, String string) {
        l.f(h8, "name");
        l.f(string, "value");
        this(h8, h.e0.d(string));
    }

    public Header(String string, String string2) {
        l.f(string, "name");
        l.f(string2, "value");
        h.a a8 = h.e0;
        this(a8.d(string), a8.d(string2));
    }

    public static /* synthetic */ Header copy$default(Header header, h h8, h h9, int n8, Object object) {
        if ((n8 & 1) != 0) {
            h8 = header.name;
        }
        if ((n8 & 2) != 0) {
            h9 = header.value;
        }
        return header.copy(h8, h9);
    }

    public final h component1() {
        return this.name;
    }

    public final h component2() {
        return this.value;
    }

    public final Header copy(h h8, h h9) {
        l.f(h8, "name");
        l.f(h9, "value");
        return new Header(h8, h9);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Header)) {
            return false;
        }
        object = (Header)object;
        if (!l.a(this.name, ((Header)object).name)) {
            return false;
        }
        return l.a(this.value, ((Header)object).value);
    }

    public int hashCode() {
        return this.name.hashCode() * 31 + this.value.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name.K());
        stringBuilder.append(": ");
        stringBuilder.append(this.value.K());
        return stringBuilder.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}

