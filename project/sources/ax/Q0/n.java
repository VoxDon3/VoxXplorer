package ax.Q0;

import ax.Q0.o;
import ax.S0.C0968a;
import ax.r7.AbstractC2991z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {
    private final AbstractC2991z<o> a;
    private final List<o> b = new ArrayList();
    private ByteBuffer[] c = new ByteBuffer[0];
    private o.a d;
    private o.a e;
    private boolean f;

    public n(AbstractC2991z<o> abstractC2991z) {
        this.a = abstractC2991z;
        o.a aVar = o.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }

    private int c() {
        return this.c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    o oVar = this.b.get(i);
                    if (!oVar.c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : o.a;
                        long remaining = byteBuffer2.remaining();
                        oVar.d(byteBuffer2);
                        this.c[i] = oVar.b();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        this.b.get(i + 1).f();
                    }
                }
                i++;
            }
        }
    }

    public o.a a(o.a aVar) throws o.b {
        if (aVar.equals(o.a.e)) {
            throw new o.b(aVar);
        }
        for (int i = 0; i < this.a.size(); i++) {
            o oVar = this.a.get(i);
            o.a g = oVar.g(aVar);
            if (oVar.e()) {
                C0968a.g(!g.equals(o.a.e));
                aVar = g;
            }
        }
        this.e = aVar;
        return aVar;
    }

    public void b() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for (int i = 0; i < this.a.size(); i++) {
            o oVar = this.a.get(i);
            oVar.flush();
            if (oVar.e()) {
                this.b.add(oVar);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = this.b.get(i2).b();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return o.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(o.a);
        return this.c[c()];
    }

    public boolean e() {
        return this.f && this.b.get(c()).c() && !this.c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a.size() != nVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i) != nVar.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.b.isEmpty();
    }

    public void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        this.b.get(0).f();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i = 0; i < this.a.size(); i++) {
            o oVar = this.a.get(i);
            oVar.flush();
            oVar.a();
        }
        this.c = new ByteBuffer[0];
        o.a aVar = o.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }
}
