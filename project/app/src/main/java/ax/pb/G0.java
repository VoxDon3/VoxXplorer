/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.B0;
import ax.pb.C0;
import ax.pb.D0;
import ax.pb.E0;
import ax.pb.e0;
import ax.pb.g0;
import ax.pb.s;
import ax.pb.x0;
import ax.pb.y0;
import java.io.IOException;

class G0
extends e0 {
    private String n0;
    private g0 o0;
    private byte[] p0;
    private boolean q0;

    G0(g0 g02) throws IOException {
        int n8 = g02.G0;
        boolean bl = false;
        super(g02, false, n8 & 0xFFFF00FF | 0x20);
        this.p0 = new byte[1];
        this.o0 = g02;
        if ((g02.G0 & 0x600) == 1536) {
            bl = true;
        }
        this.q0 = bl;
        this.n0 = g02.p0;
    }

    @Override
    public void close() throws IOException {
        this.o0.d();
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.p0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] object, int n8, int n9) throws IOException {
        int n10 = n9;
        if (n9 < 0) {
            n10 = 0;
        }
        g0 g02 = this.o0;
        n9 = g02.G0;
        if ((n9 & 0x100) == 256) {
            g02.Y(new D0(this.n0), new E0());
            this.o0.Y(new x0(this.n0, (byte[])object, n8, n10), new y0(this.o0));
            return;
        }
        if ((n9 & 0x200) == 512) {
            this.c();
            object = new B0(this.o0.q0, (byte[])object, n8, n10);
            if (this.q0) {
                object.U0 = 1024;
            }
            this.o0.Y((s)object, new C0(this.o0));
        }
    }
}

