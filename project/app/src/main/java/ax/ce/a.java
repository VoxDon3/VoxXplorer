/*
 * Decompiled with CFR 0.152.
 */
package ax.ce;

import ax.ce.c;
import java.util.zip.CRC32;

public class a
extends c {
    private final CRC32 c = new CRC32();

    public a() {
        this.a = 4;
        this.b = "CRC32";
    }

    @Override
    public byte[] a() {
        long l8 = this.c.getValue();
        byte by = (byte)l8;
        byte by2 = (byte)(l8 >>> 8);
        byte by3 = (byte)(l8 >>> 16);
        byte by4 = (byte)(l8 >>> 24);
        this.c.reset();
        return new byte[]{by, by2, by3, by4};
    }

    @Override
    public void f(byte[] byArray, int n8, int n9) {
        this.c.update(byArray, n8, n9);
    }
}

