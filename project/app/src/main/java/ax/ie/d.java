/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.be.i;
import ax.ie.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d
extends b {
    private final DataInputStream c;

    public d(InputStream inputStream) throws IOException {
        inputStream = new DataInputStream(inputStream);
        this.c = inputStream;
        if (((DataInputStream)inputStream).readUnsignedByte() == 0) {
            this.b = ((DataInputStream)inputStream).readInt();
            this.a = -1;
            return;
        }
        throw new i();
    }

    @Override
    public void f() throws IOException {
        if ((this.a & 0xFF000000) == 0) {
            this.b = this.b << 8 | this.c.readUnsignedByte();
            this.a <<= 8;
        }
    }

    public boolean g() {
        return this.b == 0;
    }
}

