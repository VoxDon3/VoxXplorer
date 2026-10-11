/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class i
extends b {
    private static final byte[] e = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    private static final byte[] f = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};
    private b.a b;
    private byte c;
    private int[] d = new int[4];

    public i() {
        this.j();
    }

    @Override
    public String c() {
        return ax.Rd.b.r;
    }

    @Override
    public float d() {
        float f8;
        block4: {
            int[] nArray;
            if (this.b == b.a.d0) {
                return 0.01f;
            }
            int n8 = 0;
            for (int i8 = 0; i8 < (nArray = this.d).length; ++i8) {
                n8 += nArray[i8];
            }
            float f9 = 0.0f;
            if (n8 <= 0) {
                f8 = 0.0f;
            } else {
                float f10 = nArray[3];
                f8 = n8;
                f8 = f10 * 1.0f / f8 - (float)nArray[1] * 20.0f / f8;
            }
            if (!(f8 < 0.0f)) break block4;
            f8 = f9;
        }
        return f8 * 0.5f;
    }

    @Override
    public b.a e() {
        return this.b;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        Object object = this.a(byArray, n8, n9);
        byArray = ((ByteBuffer)object).array();
        n9 = ((Buffer)object).position();
        for (n8 = 0; n8 < n9; ++n8) {
            byte by = byArray[n8];
            byte by2 = e[by & 0xFF];
            if ((by = f[this.c * 8 + by2]) == 0) {
                this.b = b.a.d0;
                break;
            }
            object = this.d;
            object[by] = object[by] + true;
            this.c = by2;
        }
        return this.b;
    }

    @Override
    public final void j() {
        int[] nArray;
        this.b = b.a.q;
        this.c = 1;
        for (int i8 = 0; i8 < (nArray = this.d).length; ++i8) {
            nArray[i8] = 0;
        }
    }
}

