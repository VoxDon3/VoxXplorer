/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.a;
import ax.Z8.a;
import ax.h9.b;

public class i {
    private byte[] a;
    private byte[] b;

    public i(byte[] byArray, byte[] byArray2) {
        this.a = byArray;
        this.b = byArray2;
    }

    public static i a(b b8) throws a.b {
        return new i(b8.G(8), b8.G(8));
    }

    public void b(b b8) {
        b8.o(this.a);
        b8.o(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SMB2FileId{persistentHandle=");
        stringBuilder.append(ax.Y8.a.a(this.a));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

