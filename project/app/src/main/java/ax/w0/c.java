/*
 * Decompiled with CFR 0.152.
 */
package ax.w0;

import ax.w0.d;
import java.nio.ByteBuffer;

public class c {
    protected int a;
    protected ByteBuffer b;
    private int c;
    private int d;
    d e = ax.w0.d.a();

    protected int a(int n8) {
        return n8 + this.b.getInt(n8);
    }

    protected int b(int n8) {
        if (n8 < this.d) {
            return this.b.getShort(this.c + n8);
        }
        return 0;
    }

    protected void c(int n8, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = n8;
            n8 -= byteBuffer.getInt(n8);
            this.c = n8;
            this.d = this.b.getShort(n8);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }

    protected int d(int n8) {
        return (n8 += this.a) + this.b.getInt(n8) + 4;
    }

    protected int e(int n8) {
        int n9 = n8 + this.a;
        n8 = this.b.getInt(n9);
        return this.b.getInt(n9 + n8);
    }
}

