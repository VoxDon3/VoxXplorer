package ax.l1;

import android.os.SystemClock;
import ax.P0.P;
import ax.P0.V;
import ax.i1.q0;
import ax.l1.AbstractC2448G;
import ax.m1.m;
import ax.r7.AbstractC2991z;
import java.util.Arrays;
import java.util.List;

/* renamed from: ax.l1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2450I {
    public static V a(AbstractC2448G.a aVar, InterfaceC2449H[] interfaceC2449HArr) {
        List[] listArr = new List[interfaceC2449HArr.length];
        for (int i = 0; i < interfaceC2449HArr.length; i++) {
            InterfaceC2449H interfaceC2449H = interfaceC2449HArr[i];
            listArr[i] = interfaceC2449H != null ? AbstractC2991z.A(interfaceC2449H) : AbstractC2991z.z();
        }
        return b(aVar, listArr);
    }

    public static V b(AbstractC2448G.a aVar, List<? extends InterfaceC2449H>[] listArr) {
        boolean z;
        AbstractC2991z.a aVar2 = new AbstractC2991z.a();
        for (int i = 0; i < aVar.d(); i++) {
            q0 g = aVar.g(i);
            List<? extends InterfaceC2449H> list = listArr[i];
            for (int i2 = 0; i2 < g.a; i2++) {
                P c = g.c(i2);
                boolean z2 = aVar.a(i, i2, false) != 0;
                int i3 = c.a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < c.a; i4++) {
                    iArr[i4] = aVar.h(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC2449H interfaceC2449H = list.get(i5);
                        if (interfaceC2449H.b().equals(c) && interfaceC2449H.t(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                aVar2.a(new V.a(c, z2, iArr, zArr));
            }
        }
        q0 j = aVar.j();
        for (int i6 = 0; i6 < j.a; i6++) {
            P c2 = j.c(i6);
            int[] iArr2 = new int[c2.a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new V.a(c2, false, iArr2, new boolean[c2.a]));
        }
        return new V(aVar2.k());
    }

    public static m.a c(InterfaceC2445D interfaceC2445D) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC2445D.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC2445D.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new m.a(1, 0, length, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point d(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            r3 = 1
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = ax.S0.d0.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = ax.S0.d0.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.l1.C2450I.d(boolean, int, int, int, int):android.graphics.Point");
    }
}
