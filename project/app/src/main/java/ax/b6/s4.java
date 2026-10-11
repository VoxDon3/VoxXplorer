/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.v4;
import java.io.IOException;

public class s4
extends IOException {
    public s4(String string) {
        super(string);
    }

    static v4 a() {
        return new v4("Protocol message tag had invalid wire type.");
    }

    static s4 b() {
        return new s4("Protocol message contained an invalid tag (zero).");
    }

    static s4 c() {
        return new s4("Protocol message had invalid UTF-8.");
    }

    static s4 d() {
        return new s4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static s4 e() {
        return new s4("Failed to parse the message.");
    }

    static s4 f() {
        return new s4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

