/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.U8.a;
import ax.U8.b;
import ax.U8.e;
import ax.Xd.d;
import ax.Xd.f;
import ax.Z8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g {
    private static final d b = f.k(g.class);
    private List<b<?>> a = new ArrayList();

    public g a() {
        g g8 = new g();
        g8.a = new ArrayList(this.a);
        return g8;
    }

    public <T extends b<?>> T b(a a8) {
        for (b<?> b8 : this.a) {
            if (b8.a() != a8) continue;
            return (T)b8;
        }
        return null;
    }

    public boolean c(a a8) {
        Iterator<b<?>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a() != a8) continue;
            return true;
        }
        return false;
    }

    public void d(b<?> b8) {
        for (b<?> b9 : this.a) {
            if (b9.a() != b8.a()) continue;
            this.a.remove(b9);
            break;
        }
        this.a.add(b8);
    }

    public g e(a.c c8) throws a.b {
        b<?> b8;
        while ((b8 = e.a(c8)).a() != ax.U8.a.c0) {
            b.i("Read TargetInfo {} --> {}", b8.a(), b8.b());
            this.a.add(b8);
        }
        return this;
    }

    public void f(a.c c8) {
        for (b<a.c> b8 : this.a) {
            b.i("Writing TargetInfo {} --> {}", b8.a(), b8.b());
            b8.c(c8);
        }
        new ax.U8.d().c(c8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TargetInfo{targetInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

