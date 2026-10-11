package ax.S8;

import ax.Q8.D;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends c {
    private List<D> b;

    public b() {
        super(d.SMB2_ENCRYPTION_CAPABILITIES);
        this.b = new ArrayList();
    }

    @Override // ax.S8.c
    protected void d(C2171b c2171b, int i) throws a.b {
        int J = c2171b.J();
        for (int i2 = 0; i2 < J; i2++) {
            this.b.add((D) c.a.f(c2171b.J(), D.class, null));
        }
    }

    @Override // ax.S8.c
    protected int g(C2171b c2171b) {
        List<D> list = this.b;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("Cannot serialize an empty or null cipherList");
        }
        c2171b.s(this.b.size());
        Iterator<D> it = this.b.iterator();
        while (it.hasNext()) {
            c2171b.s((int) it.next().getValue());
        }
        return (this.b.size() * 2) + 2;
    }

    public List<D> i() {
        return this.b;
    }

    public b(List<D> list) {
        super(d.SMB2_ENCRYPTION_CAPABILITIES);
        this.b = list;
    }
}
