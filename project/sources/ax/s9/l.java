package ax.s9;

import ax.R8.A;
import ax.a9.AbstractFutureC1431a;
import ax.i9.InterfaceC2290b;
import ax.o9.AbstractC2736c;
import ax.o9.C2734a;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class l {
    private static final ax.Xd.d d = ax.Xd.f.k(l.class);
    private m a;
    private ax.Q8.i b;
    private String c;

    class a implements AbstractFutureC1431a.InterfaceC0255a<A, Long> {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // ax.a9.AbstractFutureC1431a.InterfaceC0255a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(A a) {
            long n = a.n();
            long j = this.a;
            if (n == j) {
                return Long.valueOf(j);
            }
            throw new ax.k9.d("Possible remote file corruption detected, server wrote less bytes (" + n + ") in async mode than we sent (" + this.a + ").");
        }
    }

    class b implements AbstractFutureC1431a.InterfaceC0255a<List<Long>, Long> {
        b() {
        }

        @Override // ax.a9.AbstractFutureC1431a.InterfaceC0255a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(List<Long> list) {
            Iterator<Long> it = list.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().longValue();
            }
            return Long.valueOf(j);
        }
    }

    public l(m mVar, ax.Q8.i iVar, String str) {
        this.a = mVar;
        this.b = iVar;
        this.c = str;
    }

    public OutputStream a(long j) {
        return new f(this, this.a.j(), j, this.a.m(), true, this.a.e0.j().W(), null);
    }

    public long b(AbstractC2736c abstractC2736c, InterfaceC2290b interfaceC2290b) {
        long j = 0;
        while (abstractC2736c.e()) {
            d.d("Writing to {} from offset {}", this.c, Long.valueOf(abstractC2736c.d()));
            A s0 = this.a.s0(this.b, abstractC2736c);
            long c = abstractC2736c.c();
            long n = s0.n();
            if (n != c) {
                throw new ax.k9.d("Possible remote file corruption detected, server wrote less bytes (" + n + ") than we sent (" + c + ").");
            }
            j += n;
            if (interfaceC2290b != null) {
                interfaceC2290b.a(n, abstractC2736c.d());
            }
        }
        return j;
    }

    public long c(byte[] bArr, long j, int i, int i2) {
        return b(new C2734a(bArr, i, i2, j), null);
    }

    public Future<Long> d(AbstractC2736c abstractC2736c) {
        ArrayList arrayList = new ArrayList();
        while (abstractC2736c.e()) {
            d.d("Sending async write request to {} from offset {}", this.c, Long.valueOf(abstractC2736c.d()));
            arrayList.add(ax.a9.d.d(this.a.u0(this.b, abstractC2736c), new a(abstractC2736c.c())));
        }
        return ax.a9.d.d(ax.a9.d.c(arrayList), new b());
    }
}
