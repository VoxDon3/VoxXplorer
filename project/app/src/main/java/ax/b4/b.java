/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.graphics.Bitmap;
import ax.L3.a;
import ax.Q3.d;

public final class b
implements a.a {
    private final d a;
    private final ax.Q3.b b;

    public b(d d8, ax.Q3.b b8) {
        this.a = d8;
        this.b = b8;
    }

    @Override
    public Bitmap a(int n8, int n9, Bitmap.Config config) {
        return this.a.e(n8, n9, config);
    }

    @Override
    public int[] b(int n8) {
        ax.Q3.b b8 = this.b;
        if (b8 == null) {
            return new int[n8];
        }
        return b8.d(n8, int[].class);
    }

    @Override
    public void c(Bitmap bitmap) {
        this.a.c(bitmap);
    }

    @Override
    public void d(byte[] byArray) {
        ax.Q3.b b8 = this.b;
        if (b8 == null) {
            return;
        }
        b8.c(byArray, byte[].class);
    }

    @Override
    public byte[] e(int n8) {
        ax.Q3.b b8 = this.b;
        if (b8 == null) {
            return new byte[n8];
        }
        return b8.d(n8, byte[].class);
    }

    @Override
    public void f(int[] nArray) {
        ax.Q3.b b8 = this.b;
        if (b8 == null) {
            return;
        }
        b8.c(nArray, int[].class);
    }
}

