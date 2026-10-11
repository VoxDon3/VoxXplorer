/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.Q8.i;
import ax.R8.A;
import ax.a9.a;
import ax.i9.b;
import ax.k9.d;
import ax.o9.a;
import ax.o9.c;
import ax.s9.f;
import ax.s9.m;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class l {
    private static final ax.Xd.d d = ax.Xd.f.k(l.class);
    private m a;
    private i b;
    private String c;

    public l(m m8, i i8, String string) {
        this.a = m8;
        this.b = i8;
        this.c = string;
    }

    public OutputStream a(long l8) {
        int n8 = this.a.e0.j().W();
        return new f(this, this.a.j(), l8, this.a.m(), true, n8, null);
    }

    public long b(c object, b b8) {
        long l8 = 0L;
        while (((c)object).e()) {
            d.d("Writing to {} from offset {}", this.c, ((c)object).d());
            A a8 = this.a.s0(this.b, (c)object);
            long l9 = ((c)object).c();
            long l10 = a8.n();
            if (l10 == l9) {
                l8 = l9 = l8 + l10;
                if (b8 == null) continue;
                b8.a(l10, ((c)object).d());
                l8 = l9;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Possible remote file corruption detected, server wrote less bytes (");
            ((StringBuilder)object).append(l10);
            ((StringBuilder)object).append(") than we sent (");
            ((StringBuilder)object).append(l9);
            ((StringBuilder)object).append(").");
            throw new d(((StringBuilder)object).toString());
        }
        return l8;
    }

    public long c(byte[] byArray, long l8, int n8, int n9) {
        return this.b(new a(byArray, n8, n9, l8), null);
    }

    public Future<Long> d(c c8) {
        ArrayList arrayList = new ArrayList();
        while (c8.e()) {
            d.d("Sending async write request to {} from offset {}", this.c, c8.d());
            arrayList.add(ax.a9.d.d(this.a.u0(this.b, c8), new a.a<A, Long>(){
                final long a;
                final l b;
                {
                    this.b = l8;
                    this.a = l9;
                }

                public Long a(A object) {
                    long l8;
                    long l9 = ((A)object).n();
                    if (l9 == (l8 = this.a)) {
                        return l8;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Possible remote file corruption detected, server wrote less bytes (");
                    ((StringBuilder)object).append(l9);
                    ((StringBuilder)object).append(") in async mode than we sent (");
                    ((StringBuilder)object).append(this.a);
                    ((StringBuilder)object).append(").");
                    throw new d(((StringBuilder)object).toString());
                }
            }));
        }
        return ax.a9.d.d(ax.a9.d.c(arrayList), new a.a<List<Long>, Long>(this){
            final l a;
            {
                this.a = l8;
            }

            public Long a(List<Long> object) {
                object = object.iterator();
                long l8 = 0L;
                while (object.hasNext()) {
                    l8 += ((Long)object.next()).longValue();
                }
                return l8;
            }
        });
    }
}

