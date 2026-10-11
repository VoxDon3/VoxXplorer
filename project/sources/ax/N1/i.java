package ax.N1;

import ax.S0.InterfaceC0979l;
import java.util.List;

/* loaded from: classes.dex */
public class i {
    private static int a(k kVar, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int d = kVar.d(j);
        if (d == -1) {
            d = kVar.l();
        }
        return (d <= 0 || kVar.h(d + (-1)) != j) ? d : d - 1;
    }

    private static void b(k kVar, int i, InterfaceC0979l<e> interfaceC0979l) {
        long h = kVar.h(i);
        List<ax.R0.a> j = kVar.j(h);
        if (j.isEmpty()) {
            return;
        }
        if (i == kVar.l() - 1) {
            throw new IllegalStateException();
        }
        long h2 = kVar.h(i + 1) - kVar.h(i);
        if (h2 > 0) {
            interfaceC0979l.accept(new e(j, h, h2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[LOOP:0: B:11:0x003c->B:13:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(ax.N1.k r12, ax.N1.t.b r13, ax.S0.InterfaceC0979l<ax.N1.e> r14) {
        /*
            long r0 = r13.a
            int r0 = a(r12, r0)
            long r1 = r13.a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L3a
            int r1 = r12.l()
            if (r0 >= r1) goto L3a
            long r1 = r13.a
            java.util.List r7 = r12.j(r1)
            long r1 = r12.h(r0)
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L3a
            long r8 = r13.a
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L3a
            ax.N1.e r6 = new ax.N1.e
            long r10 = r1 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r2 = r0
        L3c:
            int r3 = r12.l()
            if (r2 >= r3) goto L48
            b(r12, r2, r14)
            int r2 = r2 + 1
            goto L3c
        L48:
            boolean r2 = r13.b
            if (r2 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r5 >= r0) goto L58
            b(r12, r5, r14)
            int r5 = r5 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            ax.N1.e r6 = new ax.N1.e
            long r1 = r13.a
            java.util.List r7 = r12.j(r1)
            long r8 = r12.h(r0)
            long r1 = r13.a
            long r12 = r12.h(r0)
            long r10 = r1 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.N1.i.c(ax.N1.k, ax.N1.t$b, ax.S0.l):void");
    }
}
