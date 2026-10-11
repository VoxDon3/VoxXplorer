/*
 * Decompiled with CFR 0.152.
 */
package ax.g5;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class b {
    private static final String e = "b";
    private int a;
    private int b;
    private int c;
    private byte d;

    public byte a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public void c(ByteBuffer byteBuffer) {
        int n8;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.a = n8 = byteBuffer.getInt();
        if (n8 != 1396855637) {
            String string = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected dCSWSignature ");
            stringBuilder.append(this.a);
            Log.e((String)string, (String)stringBuilder.toString());
        }
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.get();
    }
}

