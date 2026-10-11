/*
 * Decompiled with CFR 0.152.
 */
package ax.Ub;

import ax.Fb.p;
import ax.Gb.l;
import ax.Qb.s0;
import ax.Ub.i;
import ax.Vb.B;
import ax.wb.i;

public final class k {
    public static final void a(i<?> i8, ax.wb.i i9) {
        if (((Number)i9.v(0, new p<Integer, i.b, Integer>(i8){
            final i<?> q;
            {
                this.q = i8;
                super(2);
            }

            public final Integer a(int n8, i.b b8) {
                Object object = b8.getKey();
                Object object2 = this.q.f0.a(object);
                if (object != s0.c) {
                    n8 = b8 != object2 ? Integer.MIN_VALUE : ++n8;
                    return n8;
                }
                object2 = (s0)object2;
                l.d(b8, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                b8 = k.b((s0)b8, object2);
                if (b8 == object2) {
                    if (object2 != null) {
                        ++n8;
                    }
                    return n8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                ((StringBuilder)object).append(b8);
                ((StringBuilder)object).append(", expected child of ");
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
        })).intValue() == i8.g0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Flow invariant is violated:\n\t\tFlow was collected in ");
        stringBuilder.append(i8.f0);
        stringBuilder.append(",\n\t\tbut emission happened in ");
        stringBuilder.append(i9);
        stringBuilder.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final s0 b(s0 s02, s0 s03) {
        while (s02 != null) {
            if (s02 == s03 || !(s02 instanceof B)) {
                return s02;
            }
            s02 = s02.getParent();
        }
        return null;
    }
}

