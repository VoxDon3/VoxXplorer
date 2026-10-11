package ax.S8;

import ax.Q8.E;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class f extends c {
    private List<E> b;
    private byte[] c;

    public f() {
        super(d.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.b = new ArrayList();
    }

    @Override // ax.S8.c
    protected void d(C2171b c2171b, int i) throws a.b {
        int J = c2171b.J();
        int J2 = c2171b.J();
        for (int i2 = 0; i2 < J; i2++) {
            int J3 = c2171b.J();
            E e = (E) c.a.f(J3, E.class, null);
            if (e == null) {
                throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", Integer.valueOf(J3)));
            }
            this.b.add(e);
        }
        this.c = c2171b.G(J2);
    }

    @Override // ax.S8.c
    protected int g(C2171b c2171b) {
        List<E> list = this.b;
        if (list == null) {
            throw new IllegalStateException("There should be at least 1 hash algorithm provided");
        }
        if (this.c == null) {
            throw new IllegalStateException("A salt should be provided");
        }
        c2171b.s(list.size());
        c2171b.s(this.c.length);
        Iterator<E> it = this.b.iterator();
        while (it.hasNext()) {
            c2171b.s((int) it.next().getValue());
        }
        c2171b.o(this.c);
        return (this.b.size() * 2) + 4 + this.c.length;
    }

    public List<E> i() {
        return this.b;
    }

    public f(List<E> list, byte[] bArr) {
        super(d.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.b = list;
        this.c = (byte[]) bArr.clone();
    }
}
