package ax.b6;

import java.io.IOException;

/* renamed from: ax.b6.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1663s4 extends IOException {
    public C1663s4(String str) {
        super(str);
    }

    static C1687v4 a() {
        return new C1687v4("Protocol message tag had invalid wire type.");
    }

    static C1663s4 b() {
        return new C1663s4("Protocol message contained an invalid tag (zero).");
    }

    static C1663s4 c() {
        return new C1663s4("Protocol message had invalid UTF-8.");
    }

    static C1663s4 d() {
        return new C1663s4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1663s4 e() {
        return new C1663s4("Failed to parse the message.");
    }

    static C1663s4 f() {
        return new C1663s4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
