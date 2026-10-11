/*
 * Decompiled with CFR 0.152.
 */
package ax.tc;

import ax.oc.a;
import ax.tc.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class d {
    private final byte[] a = new byte[2];
    private final byte[] b = new byte[4];
    private final byte[] c = new byte[8];

    private void a(InputStream inputStream, byte[] byArray, int n8) throws IOException {
        if (e.f(inputStream, byArray, 0, n8) == n8) {
            return;
        }
        throw new a("Could not fill buffer");
    }

    private void j(byte[] byArray) {
        Arrays.fill(byArray, (byte)0);
    }

    public int b(InputStream inputStream) throws IOException {
        this.a(inputStream, this.b, 4);
        return this.c(this.b);
    }

    public int c(byte[] byArray) {
        return this.d(byArray, 0);
    }

    public int d(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return ((byArray[n8 + 3] & 0xFF) << 8 | by3 & 0xFF) << 16 | (by & 0xFF | (by2 & 0xFF) << 8);
    }

    public long e(InputStream inputStream) throws IOException {
        byte[] byArray = this.c;
        this.a(inputStream, byArray, byArray.length);
        return this.g(this.c, 0);
    }

    public long f(InputStream inputStream, int n8) throws IOException {
        this.j(this.c);
        this.a(inputStream, this.c, n8);
        return this.g(this.c, 0);
    }

    public long g(byte[] byArray, int n8) {
        if (byArray.length - n8 < 8) {
            this.j(this.c);
        }
        System.arraycopy(byArray, n8, this.c, 0, Math.min(byArray.length - n8, 8));
        byArray = this.c;
        long l8 = byArray[7] & 0xFF;
        long l9 = byArray[6] & 0xFF;
        long l10 = byArray[5] & 0xFF;
        long l11 = byArray[4] & 0xFF;
        long l12 = byArray[3] & 0xFF;
        long l13 = byArray[2] & 0xFF;
        long l14 = byArray[1] & 0xFF;
        return (long)(byArray[0] & 0xFF) | ((((((l8 << 8 | l9) << 8 | l10) << 8 | l11) << 8 | l12) << 8 | l13) << 8 | l14) << 8;
    }

    public int h(InputStream inputStream) throws IOException {
        byte[] byArray = this.a;
        this.a(inputStream, byArray, byArray.length);
        return this.i(this.a, 0);
    }

    public int i(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF;
    }
}

