package ax.S8;

import ax.Q8.A;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends c {
    private List<A> b;

    a() {
        super(d.SMB2_COMPRESSION_CAPABILITIES);
        this.b = new ArrayList();
    }

    @Override // ax.S8.c
    protected void d(C2171b c2171b, int i) throws a.b {
        int J = c2171b.J();
        c2171b.U(2);
        c2171b.U(4);
        for (int i2 = 0; i2 < J; i2++) {
            int J2 = c2171b.J();
            A a = (A) c.a.f(J2, A.class, null);
            if (a == null) {
                throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", Integer.valueOf(J2)));
            }
            this.b.add(a);
        }
    }

    @Override // ax.S8.c
    protected int g(C2171b c2171b) {
        List<A> list = this.b;
        if (list == null) {
            throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
        }
        c2171b.s(list.size());
        c2171b.X();
        c2171b.Y();
        Iterator<A> it = this.b.iterator();
        while (it.hasNext()) {
            c2171b.s((int) it.next().getValue());
        }
        return (this.b.size() * 2) + 8;
    }

    public List<A> i() {
        return this.b;
    }
}
