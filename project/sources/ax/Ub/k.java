package ax.Ub;

import ax.Fb.p;
import ax.Gb.l;
import ax.Gb.m;
import ax.Qb.InterfaceC0959s0;
import ax.Vb.B;
import ax.wb.i;

/* loaded from: classes3.dex */
public final class k {

    static final class a extends m implements p<Integer, i.b, Integer> {
        final /* synthetic */ i<?> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<?> iVar) {
            super(2);
            this.q = iVar;
        }

        public final Integer a(int i, i.b bVar) {
            i.c<?> key = bVar.getKey();
            i.b a = this.q.f0.a(key);
            if (key != InterfaceC0959s0.c) {
                return Integer.valueOf(bVar != a ? Integer.MIN_VALUE : i + 1);
            }
            InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) a;
            l.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC0959s0 b = k.b((InterfaceC0959s0) bVar, interfaceC0959s0);
            if (b == interfaceC0959s0) {
                if (interfaceC0959s0 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + interfaceC0959s0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ Integer j(Integer num, i.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(i<?> iVar, ax.wb.i iVar2) {
        if (((Number) iVar2.v(0, new a(iVar))).intValue() == iVar.g0) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f0 + ",\n\t\tbut emission happened in " + iVar2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC0959s0 b(InterfaceC0959s0 interfaceC0959s0, InterfaceC0959s0 interfaceC0959s02) {
        while (interfaceC0959s0 != null) {
            if (interfaceC0959s0 == interfaceC0959s02 || !(interfaceC0959s0 instanceof B)) {
                return interfaceC0959s0;
            }
            interfaceC0959s0 = interfaceC0959s0.getParent();
        }
        return null;
    }
}
