package ax.g5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class g {
    private int a;
    private int b;

    private g() {
    }

    public static g c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        g gVar = new g();
        gVar.a = byteBuffer.getInt();
        gVar.b = byteBuffer.getInt();
        return gVar;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}
