/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Ic.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

class v
extends a {
    private final boolean[] n0;

    public v(InputStream inputStream) throws IOException {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.L(9);
        this.A(13);
        this.n0 = new boolean[this.q()];
        for (int i8 = 0; i8 < 256; ++i8) {
            this.n0[i8] = true;
        }
        this.d0(this.m() + 1);
    }

    private void o0() {
        boolean[] blArray;
        int n8;
        boolean[] blArray2 = new boolean[8192];
        for (n8 = 0; n8 < (blArray = this.n0).length; ++n8) {
            if (!blArray[n8] || this.p(n8) == -1) continue;
            blArray2[this.p((int)n8)] = true;
        }
        for (n8 = this.m() + 1; n8 < 8192; ++n8) {
            if (blArray2[n8]) continue;
            this.n0[n8] = false;
            this.W(n8, -1);
        }
    }

    @Override
    protected int d(int n8, byte by) throws IOException {
        int n9;
        for (n9 = this.u(); n9 < 8192 && this.n0[n9]; ++n9) {
        }
        this.d0(n9);
        n8 = this.e(n8, by, 8192);
        if (n8 >= 0) {
            this.n0[n8] = true;
        }
        return n8;
    }

    @Override
    protected int g() throws IOException {
        block6: {
            int n8;
            block10: {
                block9: {
                    block7: {
                        block8: {
                            int n9 = this.H();
                            if (n9 < 0) {
                                return -1;
                            }
                            n8 = this.m();
                            boolean bl = false;
                            if (n9 != n8) {
                                n8 = n9;
                                if (!this.n0[n9]) {
                                    n8 = this.f();
                                    bl = true;
                                }
                                return this.j(n8, bl);
                            }
                            n8 = this.H();
                            if (n8 < 0) break block6;
                            if (n8 != 1) break block7;
                            if (this.o() >= 13) break block8;
                            this.v();
                            break block9;
                        }
                        throw new IOException("Attempt to increase code size beyond maximum");
                    }
                    if (n8 != 2) break block10;
                    this.o0();
                    this.d0(this.m() + 1);
                }
                return 0;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid clear code subcode ");
            stringBuilder.append(n8);
            throw new IOException(stringBuilder.toString());
        }
        throw new IOException("Unexpected EOF;");
    }
}

