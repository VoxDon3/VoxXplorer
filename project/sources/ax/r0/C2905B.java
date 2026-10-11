package ax.r0;

import java.io.IOException;

/* renamed from: ax.r0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2905B extends IOException {
    private S q;

    /* renamed from: ax.r0.B$a */
    public static class a extends C2905B {
        public a(String str) {
            super(str);
        }
    }

    public C2905B(String str) {
        super(str);
        this.q = null;
    }

    static C2905B a() {
        return new C2905B("Protocol message end-group tag did not match expected tag.");
    }

    static C2905B b() {
        return new C2905B("Protocol message contained an invalid tag (zero).");
    }

    static C2905B c() {
        return new C2905B("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C2905B e() {
        return new C2905B("CodedInputStream encountered a malformed varint.");
    }

    static C2905B f() {
        return new C2905B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C2905B g() {
        return new C2905B("Failed to parse the message.");
    }

    static C2905B h() {
        return new C2905B("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C2905B j() {
        return new C2905B("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C2905B k() {
        return new C2905B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C2905B i(S s) {
        this.q = s;
        return this;
    }
}
