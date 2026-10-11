package ax.Sd;

import ax.Sd.b;
import ax.Vd.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class l extends b {
    private b.a b;
    private List<b> c;
    private b d;
    private int e;

    public l() {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new n(new ax.Vd.o()));
        this.c.add(new n(new ax.Vd.g()));
        this.c.add(new n(new ax.Vd.i()));
        this.c.add(new n(new ax.Vd.k()));
        this.c.add(new n(new ax.Vd.f()));
        this.c.add(new n(new ax.Vd.e()));
        this.c.add(new n(new ax.Vd.j()));
        this.c.add(new n(new p()));
        this.c.add(new n(new ax.Vd.h()));
        this.c.add(new n(new ax.Vd.n()));
        this.c.add(new n(new ax.Vd.m()));
        ax.Vd.d dVar = new ax.Vd.d();
        h hVar = new h();
        n nVar = new n(dVar, false, hVar);
        n nVar2 = new n(dVar, true, hVar);
        hVar.n(nVar, nVar2);
        this.c.add(hVar);
        this.c.add(nVar);
        this.c.add(nVar2);
        j();
    }

    private boolean m(b bVar, b bVar2) {
        return n(bVar) && n(bVar2);
    }

    private boolean n(b bVar) {
        if (bVar == null) {
            return false;
        }
        return ax.Rd.b.q.equals(bVar.c()) || ax.Rd.b.p.equals(bVar.c());
    }

    @Override // ax.Sd.b
    public String c() {
        if (this.d == null) {
            d();
            if (this.d == null) {
                this.d = this.c.get(0);
            }
        }
        return this.d.c();
    }

    @Override // ax.Sd.b
    public float d() {
        b.a aVar = this.b;
        if (aVar == b.a.FOUND_IT) {
            return 0.99f;
        }
        if (aVar == b.a.NOT_ME) {
            return 0.01f;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (b bVar : this.c) {
            if (bVar.g()) {
                float d = bVar.d();
                if (f2 < d) {
                    this.d = bVar;
                    f2 = d;
                }
            }
        }
        b bVar2 = this.d;
        if (bVar2 != null && n(bVar2)) {
            b bVar3 = null;
            for (b bVar4 : this.c) {
                if (bVar4.g() && m(this.d, bVar4) && (bVar4 instanceof n)) {
                    float l = ((n) bVar4).l();
                    if (f < l) {
                        bVar3 = bVar4;
                        f = l;
                    }
                }
            }
            if (bVar3 != null) {
                this.d = bVar3;
            }
        }
        return f2;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.b;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        b next;
        b.a aVar;
        ByteBuffer b = b(bArr, i, i2);
        if (b.position() != 0) {
            Iterator<b> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (next.g()) {
                    b.a f = next.f(b.array(), 0, b.position());
                    aVar = b.a.FOUND_IT;
                    if (f == aVar || 0.99f == next.d()) {
                        break;
                    }
                    b.a aVar2 = b.a.NOT_ME;
                    if (f == aVar2) {
                        next.k(false);
                        int i3 = this.e - 1;
                        this.e = i3;
                        if (i3 <= 0) {
                            this.b = aVar2;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.d = next;
            this.b = aVar;
        }
        return this.b;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.e = 0;
        for (b bVar : this.c) {
            bVar.j();
            bVar.k(true);
            this.e++;
        }
        this.d = null;
        this.b = b.a.DETECTING;
    }

    public b l() {
        return this.d;
    }
}
