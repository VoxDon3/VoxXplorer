package ax.g5;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ax.g5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2122b {
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
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt();
        this.a = i;
        if (i != 1396855637) {
            Log.e(e, "unexpected dCSWSignature " + this.a);
        }
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.get();
    }
}
