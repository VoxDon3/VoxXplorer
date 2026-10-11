/*
 * Decompiled with CFR 0.152.
 */
package ax.y8;

import ax.C8.c;
import ax.y8.e;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class b
extends FilterOutputStream {
    private final ax.z8.b q;

    public b(ax.z8.b b8, OutputStream outputStream) {
        super(outputStream);
        this.q = b8;
    }

    private int a(int n8) {
        int n9 = 1;
        while (n8 > 255) {
            ++n9;
            n8 >>= 8;
        }
        return n9;
    }

    private void b(int n8) throws IOException {
        int n9;
        if (n8 < 127) {
            ((OutputStream)this).write(n8);
            return;
        }
        ((OutputStream)this).write(n9 | 0x80);
        for (n9 = this.a(n8); n9 > 0; --n9) {
            ((OutputStream)this).write(n8 >> (n9 - 1) * 8);
        }
    }

    private void d(c c8) throws IOException {
        int n8 = c8.g().d();
        int n9 = c8.f().d();
        ((OutputStream)this).write((byte)(c8.h() | (n8 | n9)));
    }

    public void c(ax.C8.b b8) throws IOException {
        this.d(b8.e());
        e<ax.C8.b> e8 = b8.e().k(this.q);
        this.b(e8.b(b8));
        e8.a(b8, this);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
    }
}

