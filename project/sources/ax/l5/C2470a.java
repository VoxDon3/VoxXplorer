package ax.l5;

import android.util.Log;
import ax.j5.C2315c;
import ax.j5.InterfaceC2314b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ax.l5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2470a implements InterfaceC2314b {
    private static Map<Integer, Integer> b = new C0363a();
    private static final String c = C2470a.class.getSimpleName();
    private List<C2315c> a = new ArrayList();

    /* renamed from: ax.l5.a$a, reason: collision with other inner class name */
    class C0363a extends HashMap<Integer, Integer> {
        C0363a() {
            put(11, 2);
            put(12, 2);
            put(27, 2);
            put(28, 2);
            put(1, 0);
            put(4, 1);
            put(6, 1);
            put(14, 1);
            put(131, 3);
            put(7, 6);
            put(175, 4);
        }
    }

    private C2470a() {
    }

    public static C2470a b(ByteBuffer byteBuffer) throws IOException {
        C2470a c2470a = new C2470a();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBuffer.limit() < 512) {
            throw new IOException("Size mismatch!");
        }
        if (byteBuffer.get(510) != 85 || byteBuffer.get(511) != -86) {
            Log.i(c, "not a valid mbr partition table!");
            return null;
        }
        for (int i = 0; i < 4; i++) {
            int i2 = i * 16;
            byte b2 = byteBuffer.get(i2 + 450);
            if (b2 != 0) {
                if (b2 == 5 || b2 == 15) {
                    Log.w(c, "extended partitions are currently unsupported!");
                } else {
                    Integer num = b.get(Integer.valueOf(b2 & 255));
                    if (num == null) {
                        Log.d(c, "Unknown partition type" + ((int) b2));
                        num = -1;
                    }
                    c2470a.a.add(new C2315c(num.intValue(), byteBuffer.getInt(i2 + 454), byteBuffer.getInt(i2 + 458)));
                }
            }
        }
        return c2470a;
    }

    @Override // ax.j5.InterfaceC2314b
    public List<C2315c> a() {
        return this.a;
    }
}
