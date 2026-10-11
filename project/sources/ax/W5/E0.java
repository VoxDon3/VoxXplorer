package ax.W5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class E0 {
    private static final E0 d = new E0(true);
    final I1 a = new C1085y1(16);
    private boolean b;
    private boolean c;

    private E0() {
    }

    public static E0 a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(ax.W5.D0 r4, java.lang.Object r5) {
        /*
            ax.W5.c2 r0 = r4.b()
            byte[] r1 = ax.W5.O0.d
            r5.getClass()
            ax.W5.c2 r1 = ax.W5.c2.c0
            ax.W5.d2 r1 = ax.W5.d2.INT
            ax.W5.d2 r0 = r0.d()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L23;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L40
        L19:
            boolean r0 = r5 instanceof ax.W5.InterfaceC1041j1
            if (r0 == 0) goto L40
            return
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L40
            return
        L23:
            boolean r0 = r5 instanceof ax.W5.AbstractC1069t0
            if (r0 != 0) goto L2b
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L40
        L2b:
            return
        L2c:
            boolean r0 = r5 instanceof java.lang.String
            goto L3d
        L2f:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3d
        L32:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3d
        L35:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3d
        L38:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3d
        L3b:
            boolean r0 = r5 instanceof java.lang.Integer
        L3d:
            if (r0 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ax.W5.c2 r4 = r4.b()
            ax.W5.d2 r4 = r4.d()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W5.E0.d(ax.W5.D0, java.lang.Object):void");
    }

    public final void b() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            if (g.getValue() instanceof J0) {
                ((J0) g.getValue()).j();
            }
        }
        this.a.a();
        this.b = true;
    }

    public final void c(D0 d0, Object obj) {
        if (!d0.c()) {
            d(d0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d(d0, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(d0, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        E0 e0 = new E0();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            e0.c((D0) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.a.c()) {
            e0.c((D0) entry.getKey(), entry.getValue());
        }
        e0.c = this.c;
        return e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E0) {
            return this.a.equals(((E0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private E0(boolean z) {
        b();
        b();
    }
}
