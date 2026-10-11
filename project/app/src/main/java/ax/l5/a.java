/*
 * Decompiled with CFR 0.152.
 */
package ax.l5;

import android.util.Log;
import ax.j5.b;
import ax.j5.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
implements b {
    private static Map<Integer, Integer> b = new HashMap<Integer, Integer>(){
        {
            Integer n8 = 2;
            ((AbstractMap)this).put(11, n8);
            ((AbstractMap)this).put(12, n8);
            ((AbstractMap)this).put(27, n8);
            ((AbstractMap)this).put(28, n8);
            Integer n9 = 1;
            ((AbstractMap)this).put(n9, 0);
            n8 = 4;
            ((AbstractMap)this).put(n8, n9);
            Integer n10 = 6;
            ((AbstractMap)this).put(n10, n9);
            ((AbstractMap)this).put(14, n9);
            ((AbstractMap)this).put(131, 3);
            ((AbstractMap)this).put(7, n10);
            ((AbstractMap)this).put(175, n8);
        }
    };
    private static final String c = a.class.getSimpleName();
    private List<c> a = new ArrayList<c>();

    private a() {
    }

    public static a b(ByteBuffer byteBuffer) throws IOException {
        a a8 = new a();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBuffer.limit() >= 512) {
            if (byteBuffer.get(510) == 85 && byteBuffer.get(511) == -86) {
                for (int i8 = 0; i8 < 4; ++i8) {
                    int n8 = i8 * 16;
                    byte by = byteBuffer.get(n8 + 450);
                    if (by == 0) continue;
                    if (by != 5 && by != 15) {
                        Object object;
                        Object object2 = object = b.get(by & 0xFF);
                        if (object == null) {
                            object = c;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Unknown partition type");
                            ((StringBuilder)object2).append(by);
                            Log.d((String)object, (String)((StringBuilder)object2).toString());
                            object2 = -1;
                        }
                        object2 = new c((Integer)object2, byteBuffer.getInt(n8 + 454), byteBuffer.getInt(n8 + 458));
                        a8.a.add((c)object2);
                        continue;
                    }
                    Log.w((String)c, (String)"extended partitions are currently unsupported!");
                }
                return a8;
            }
            Log.i((String)c, (String)"not a valid mbr partition table!");
            return null;
        }
        throw new IOException("Size mismatch!");
    }

    @Override
    public List<c> a() {
        return this.a;
    }
}

