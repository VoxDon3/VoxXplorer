/*
 * Decompiled with CFR 0.152.
 */
package ax.w0;

import ax.w0.c;
import java.nio.ByteBuffer;

public final class a
extends c {
    public a f(int n8, ByteBuffer byteBuffer) {
        this.g(n8, byteBuffer);
        return this;
    }

    public void g(int n8, ByteBuffer byteBuffer) {
        this.c(n8, byteBuffer);
    }

    public int h(int n8) {
        int n9 = this.b(16);
        if (n9 != 0) {
            return this.b.getInt(this.d(n9) + n8 * 4);
        }
        return 0;
    }

    public int i() {
        int n8 = this.b(16);
        if (n8 != 0) {
            return this.e(n8);
        }
        return 0;
    }

    public boolean j() {
        int n8 = this.b(6);
        return n8 != 0 && this.b.get(n8 + this.a) != 0;
    }

    public short k() {
        int n8 = this.b(14);
        if (n8 != 0) {
            return this.b.getShort(n8 + this.a);
        }
        return 0;
    }

    public int l() {
        int n8 = this.b(4);
        if (n8 != 0) {
            return this.b.getInt(n8 + this.a);
        }
        return 0;
    }

    public short m() {
        int n8 = this.b(8);
        if (n8 != 0) {
            return this.b.getShort(n8 + this.a);
        }
        return 0;
    }

    public short n() {
        int n8 = this.b(12);
        if (n8 != 0) {
            return this.b.getShort(n8 + this.a);
        }
        return 0;
    }
}

