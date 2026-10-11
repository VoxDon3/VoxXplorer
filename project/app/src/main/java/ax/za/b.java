/*
 * Decompiled with CFR 0.152.
 */
package ax.za;

import ax.za.a;
import java.io.IOException;

public class b
extends a {
    private final ax.Ca.a d;

    public b(ax.Ca.a a8) {
        this.d = a8;
    }

    @Override
    public int a(byte[] byArray) throws IOException {
        byte[] byArray2 = this.d.m();
        System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
        return byArray2.length;
    }

    @Override
    public int b(byte[] byArray, byte[] byArray2) throws IOException {
        byArray = this.d.o(byArray);
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        return byArray.length;
    }
}

