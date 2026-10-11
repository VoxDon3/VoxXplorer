package ax.b6;

/* loaded from: classes3.dex */
public final class D extends AbstractC1501A {
    public D() {
        this.a.add(Z.EQUALS);
        this.a.add(Z.GREATER_THAN);
        this.a.add(Z.GREATER_THAN_EQUALS);
        this.a.add(Z.IDENTITY_EQUALS);
        this.a.add(Z.IDENTITY_NOT_EQUALS);
        this.a.add(Z.LESS_THAN);
        this.a.add(Z.LESS_THAN_EQUALS);
        this.a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        InterfaceC1658s c1594k;
        InterfaceC1658s c1594k2;
        while (!interfaceC1658s.getClass().equals(interfaceC1658s2.getClass())) {
            if (((interfaceC1658s instanceof C1714z) || (interfaceC1658s instanceof C1643q)) && ((interfaceC1658s2 instanceof C1714z) || (interfaceC1658s2 instanceof C1643q))) {
                return true;
            }
            boolean z = interfaceC1658s instanceof C1594k;
            if (z && (interfaceC1658s2 instanceof C1674u)) {
                c1594k2 = new C1594k(interfaceC1658s2.f());
            } else {
                boolean z2 = interfaceC1658s instanceof C1674u;
                if (z2 && (interfaceC1658s2 instanceof C1594k)) {
                    c1594k = new C1594k(interfaceC1658s.f());
                } else if (interfaceC1658s instanceof C1567h) {
                    c1594k = new C1594k(interfaceC1658s.f());
                } else if (interfaceC1658s2 instanceof C1567h) {
                    c1594k2 = new C1594k(interfaceC1658s2.f());
                } else if ((z2 || z) && (interfaceC1658s2 instanceof InterfaceC1611m)) {
                    c1594k2 = new C1674u(interfaceC1658s2.g());
                } else {
                    if (!(interfaceC1658s instanceof InterfaceC1611m) || (!(interfaceC1658s2 instanceof C1674u) && !(interfaceC1658s2 instanceof C1594k))) {
                        return false;
                    }
                    c1594k = new C1674u(interfaceC1658s.g());
                }
                interfaceC1658s = c1594k;
            }
            interfaceC1658s2 = c1594k2;
        }
        if ((interfaceC1658s instanceof C1714z) || (interfaceC1658s instanceof C1643q)) {
            return true;
        }
        return interfaceC1658s instanceof C1594k ? (Double.isNaN(interfaceC1658s.f().doubleValue()) || Double.isNaN(interfaceC1658s2.f().doubleValue()) || interfaceC1658s.f().doubleValue() != interfaceC1658s2.f().doubleValue()) ? false : true : interfaceC1658s instanceof C1674u ? interfaceC1658s.g().equals(interfaceC1658s2.g()) : interfaceC1658s instanceof C1567h ? interfaceC1658s.e().equals(interfaceC1658s2.e()) : interfaceC1658s == interfaceC1658s2;
    }

    private static boolean d(InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        if (interfaceC1658s instanceof InterfaceC1611m) {
            interfaceC1658s = new C1674u(interfaceC1658s.g());
        }
        if (interfaceC1658s2 instanceof InterfaceC1611m) {
            interfaceC1658s2 = new C1674u(interfaceC1658s2.g());
        }
        if ((interfaceC1658s instanceof C1674u) && (interfaceC1658s2 instanceof C1674u)) {
            return interfaceC1658s.g().compareTo(interfaceC1658s2.g()) < 0;
        }
        double doubleValue = interfaceC1658s.f().doubleValue();
        double doubleValue2 = interfaceC1658s2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == -0.0d) || ((doubleValue == -0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        if (interfaceC1658s instanceof InterfaceC1611m) {
            interfaceC1658s = new C1674u(interfaceC1658s.g());
        }
        if (interfaceC1658s2 instanceof InterfaceC1611m) {
            interfaceC1658s2 = new C1674u(interfaceC1658s2.g());
        }
        return (((interfaceC1658s instanceof C1674u) && (interfaceC1658s2 instanceof C1674u)) || !(Double.isNaN(interfaceC1658s.f().doubleValue()) || Double.isNaN(interfaceC1658s2.f().doubleValue()))) && !d(interfaceC1658s2, interfaceC1658s);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // ax.b6.AbstractC1501A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ax.b6.InterfaceC1658s b(java.lang.String r4, ax.b6.Z2 r5, java.util.List<ax.b6.InterfaceC1658s> r6) {
        /*
            r3 = this;
            ax.b6.Z r0 = ax.b6.C1709y2.c(r4)
            r1 = 2
            ax.b6.C1709y2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            ax.b6.s r0 = (ax.b6.InterfaceC1658s) r0
            ax.b6.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            ax.b6.s r6 = (ax.b6.InterfaceC1658s) r6
            ax.b6.s r5 = r5.b(r6)
            int[] r6 = ax.b6.G.a
            ax.b6.Z r2 = ax.b6.C1709y2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            ax.b6.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = ax.b6.C1709y2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = ax.b6.C1709y2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            ax.b6.s r4 = ax.b6.InterfaceC1658s.k
            return r4
        L5f:
            ax.b6.s r4 = ax.b6.InterfaceC1658s.l
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.D.b(java.lang.String, ax.b6.Z2, java.util.List):ax.b6.s");
    }
}
