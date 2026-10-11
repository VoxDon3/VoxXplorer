/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

class k {
    private static int b = 11;
    private ByteBuffer a;

    k(String string, String string2) {
        byte[] byArray = new byte[b];
        Arrays.fill(byArray, (byte)32);
        int n8 = Math.min(string.length(), 8);
        System.arraycopy(string.getBytes(Charset.forName("ASCII")), 0, byArray, 0, n8);
        System.arraycopy(string2.getBytes(Charset.forName("ASCII")), 0, byArray, 8, string2.length());
        if (byArray[0] == 229) {
            byArray[0] = 5;
        }
        this.a = ByteBuffer.wrap(byArray);
    }

    private k(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    static k c(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[b];
        byteBuffer.get(byArray);
        return new k(ByteBuffer.wrap(byArray));
    }

    byte a() {
        int n8 = 0;
        for (int i8 = 0; i8 < b; ++i8) {
            int n9 = n8 & true ? 128 : 0;
            n8 = this.a.get(i8) + (n9 + ((n8 & 0xFF) >> 1));
        }
        return (byte)(n8 & 0xFF);
    }

    String b() {
        int n8;
        Object object = new char[8];
        Object object2 = new char[3];
        int n9 = 0;
        for (n8 = 0; n8 < 8; ++n8) {
            object[n8] = (char)(this.a.get(n8) & 0xFF);
        }
        n8 = n9;
        if (this.a.get(0) == 5) {
            object[0] = 229;
            n8 = n9;
        }
        while (n8 < 3) {
            object2[n8] = (char)(this.a.get(n8 + 8) & 0xFF);
            ++n8;
        }
        object = new String((char[])object).trim();
        String string = new String((char[])object2).trim();
        if (string.isEmpty()) {
            return object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(".");
        ((StringBuilder)object2).append(string);
        return ((StringBuilder)object2).toString();
    }

    void d(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.array(), 0, b);
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        return Arrays.equals(this.a.array(), ((k)object).a.array());
    }

    public String toString() {
        return this.b();
    }
}

