/*
 * Decompiled with CFR 0.152.
 */
package ax.V0;

import android.media.MediaCodec;
import android.os.Build;
import ax.S0.a;
import ax.V0.d;
import ax.V0.e;
import ax.V0.f;

public final class c {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final MediaCodec.CryptoInfo i;
    private final b j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo;
        this.i = cryptoInfo = new MediaCodec.CryptoInfo();
        int n8 = Build.VERSION.SDK_INT;
        b b8 = null;
        if (n8 >= 24) {
            b8 = new b(cryptoInfo);
        }
        this.j = b8;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void b(int n8) {
        int[] nArray;
        if (n8 == 0) {
            return;
        }
        if (this.d == null) {
            nArray = new int[1];
            this.d = nArray;
            this.i.numBytesOfClearData = nArray;
        }
        nArray = this.d;
        nArray[0] = nArray[0] + n8;
    }

    public void c(int n8, int[] nArray, int[] nArray2, byte[] byArray, byte[] byArray2, int n9, int n10, int n11) {
        this.f = n8;
        this.d = nArray;
        this.e = nArray2;
        this.b = byArray;
        this.a = byArray2;
        this.c = n9;
        this.g = n10;
        this.h = n11;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = n8;
        cryptoInfo.numBytesOfClearData = nArray;
        cryptoInfo.numBytesOfEncryptedData = nArray2;
        cryptoInfo.key = byArray;
        cryptoInfo.iv = byArray2;
        cryptoInfo.mode = n9;
        if (Build.VERSION.SDK_INT >= 24) {
            ax.S0.a.e(this.j).b(n10, n11);
        }
    }

    private static final class b {
        private final MediaCodec.CryptoInfo a;
        private final MediaCodec.CryptoInfo.Pattern b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = ax.V0.d.a(0, 0);
        }

        private void b(int n8, int n9) {
            ax.V0.e.a(this.b, n8, n9);
            ax.V0.f.a(this.a, this.b);
        }
    }
}

