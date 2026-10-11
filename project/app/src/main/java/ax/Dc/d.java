/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Kc.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

class d
extends b {
    d(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    int o() throws IOException {
        return (int)this.j(1);
    }

    long p(int n8) throws IOException {
        if (n8 >= 0 && n8 <= 8) {
            return this.j(n8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to read ");
        stringBuilder.append(n8);
        stringBuilder.append(" bits, at most 8 are allowed");
        throw new IOException(stringBuilder.toString());
    }

    int q() throws IOException {
        return (int)this.j(8);
    }
}

