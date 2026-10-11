/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.be.i;
import ax.ie.b;
import java.io.DataInputStream;
import java.io.IOException;

public final class c
extends b {
    private final byte[] c;
    private int d;

    public c(int n8, ax.be.c object) {
        object = ((ax.be.c)object).a(n8 - 5, false);
        this.c = (byte[])object;
        this.d = ((Object)object).length;
    }

    @Override
    public void f() throws IOException {
        int n8 = this.a;
        if ((0xFF000000 & n8) == 0) {
            try {
                int n9 = this.b;
                byte[] byArray = this.c;
                int n10 = this.d;
                this.d = n10 + 1;
                this.b = n9 << 8 | byArray[n10] & 0xFF;
                this.a = n8 << 8;
                return;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new i();
            }
        }
    }

    public boolean g() {
        return this.d == this.c.length && this.b == 0;
    }

    public void h(DataInputStream dataInputStream, int n8) throws IOException {
        if (n8 >= 5) {
            if (dataInputStream.readUnsignedByte() == 0) {
                int n9;
                this.b = dataInputStream.readInt();
                this.a = -1;
                byte[] byArray = this.c;
                this.d = n9 = byArray.length - (n8 -= 5);
                dataInputStream.readFully(byArray, n9, n8);
                return;
            }
            throw new i();
        }
        throw new i();
    }

    public void i(ax.be.c c8) {
        c8.d(this.c);
    }
}

