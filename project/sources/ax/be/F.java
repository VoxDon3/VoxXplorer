package ax.be;

/* loaded from: classes3.dex */
class F {
    static void a(InterfaceC1748p[] interfaceC1748pArr) throws L {
        for (int i = 0; i < interfaceC1748pArr.length - 1; i++) {
            if (!interfaceC1748pArr[i].a()) {
                throw new L("Unsupported XZ filter chain");
            }
        }
        if (!interfaceC1748pArr[interfaceC1748pArr.length - 1].c()) {
            throw new L("Unsupported XZ filter chain");
        }
        int i2 = 0;
        for (InterfaceC1748p interfaceC1748p : interfaceC1748pArr) {
            if (interfaceC1748p.e()) {
                i2++;
            }
        }
        if (i2 > 3) {
            throw new L("Unsupported XZ filter chain");
        }
    }
}
