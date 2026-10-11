package ax.o1;

import ax.T0.i;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ax.o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2662a {
    private i.e a;

    private boolean a(i.d dVar, boolean z) {
        i.e eVar;
        i.b b;
        int i = dVar.a;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i != 3 || z) {
            return ((i != 6 && i != 3) || (eVar = this.a) == null || (b = i.b.b(eVar, dVar)) == null || b.a()) ? false : true;
        }
        return false;
    }

    private void e(List<i.d> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a == 1) {
                this.a = i.e.a(list.get(i));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(ax.T0.i.e(byteBuffer));
    }

    public void c() {
        this.a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z) {
        List<i.d> e = ax.T0.i.e(byteBuffer);
        e(e);
        int size = e.size() - 1;
        int i = 0;
        while (size >= 0 && a(e.get(size), z)) {
            if (e.get(size).a == 6 || e.get(size).a == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? e.get(size).b.limit() : byteBuffer.position();
    }
}
