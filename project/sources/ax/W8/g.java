package ax.W8;

import ax.Z8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class g {
    private static final ax.Xd.d b = ax.Xd.f.k(g.class);
    private List<ax.U8.b<?>> a = new ArrayList();

    public g a() {
        g gVar = new g();
        gVar.a = new ArrayList(this.a);
        return gVar;
    }

    public <T extends ax.U8.b<?>> T b(ax.U8.a aVar) {
        Iterator<ax.U8.b<?>> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.a() == aVar) {
                return t;
            }
        }
        return null;
    }

    public boolean c(ax.U8.a aVar) {
        Iterator<ax.U8.b<?>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a() == aVar) {
                return true;
            }
        }
        return false;
    }

    public void d(ax.U8.b<?> bVar) {
        Iterator<ax.U8.b<?>> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ax.U8.b<?> next = it.next();
            if (next.a() == bVar.a()) {
                this.a.remove(next);
                break;
            }
        }
        this.a.add(bVar);
    }

    public g e(a.c cVar) throws a.b {
        while (true) {
            ax.U8.b<?> a = ax.U8.e.a(cVar);
            if (a.a() == ax.U8.a.MsvAvEOL) {
                return this;
            }
            b.i("Read TargetInfo {} --> {}", a.a(), a.b());
            this.a.add(a);
        }
    }

    public void f(a.c cVar) {
        for (ax.U8.b<?> bVar : this.a) {
            b.i("Writing TargetInfo {} --> {}", bVar.a(), bVar.b());
            bVar.c(cVar);
        }
        new ax.U8.d().c(cVar);
    }

    public String toString() {
        return "TargetInfo{targetInfo=" + this.a + '}';
    }
}
