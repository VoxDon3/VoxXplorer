/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.T0.i;
import java.nio.ByteBuffer;
import java.util.List;

public final class a {
    private i.e a;

    private boolean a(i.d object, boolean bl) {
        int n8 = ((i.d)object).a;
        if (n8 != 2 && n8 != 15) {
            i.e e8;
            if (n8 == 3 && !bl) {
                return false;
            }
            return (n8 == 6 || n8 == 3) && (e8 = this.a) != null && (object = i.b.b(e8, (i.d)object)) != null && !((i.b)object).a();
        }
        return true;
    }

    private void e(List<i.d> list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (list.get((int)i8).a != 1) continue;
            this.a = i.e.a(list.get(i8));
        }
    }

    public void b(ByteBuffer byteBuffer) {
        this.e(i.e(byteBuffer));
    }

    public void c() {
        this.a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean bl) {
        int n8;
        List<i.d> list = i.e(byteBuffer);
        this.e(list);
        int n9 = 0;
        for (n8 = list.size() - 1; n8 >= 0 && this.a(list.get(n8), bl); --n8) {
            int n10;
            block7: {
                block6: {
                    if (list.get((int)n8).a == 6) break block6;
                    n10 = n9;
                    if (list.get((int)n8).a != 3) break block7;
                }
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        if (n9 <= 1 && n8 + 1 < 8) {
            if (n8 >= 0) {
                return list.get((int)n8).b.limit();
            }
            return byteBuffer.position();
        }
        return byteBuffer.limit();
    }
}

