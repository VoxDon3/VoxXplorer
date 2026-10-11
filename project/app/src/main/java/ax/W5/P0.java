/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.j1;
import java.io.IOException;

public final class P0
extends IOException {
    private j1 q = null;

    public P0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public P0(String string) {
        super(string);
    }

    static P0 a() {
        return new P0("Protocol message contained an invalid tag (zero).");
    }

    static P0 b() {
        return new P0("Protocol message had invalid UTF-8.");
    }

    static P0 c() {
        return new P0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static P0 d() {
        return new P0("Failed to parse the message.");
    }

    static P0 f() {
        return new P0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final P0 e(j1 j12) {
        this.q = j12;
        return this;
    }
}

