/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.p;

class F {
    static void a(p[] pArray) throws L {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < pArray.length - 1; ++n8) {
            if (pArray[n8].a()) {
                continue;
            }
            throw new L("Unsupported XZ filter chain");
        }
        if (pArray[pArray.length - 1].c()) {
            int n10 = 0;
            while (n9 < pArray.length) {
                n8 = n10;
                if (pArray[n9].e()) {
                    n8 = n10 + 1;
                }
                ++n9;
                n10 = n8;
            }
            if (n10 <= 3) {
                return;
            }
            throw new L("Unsupported XZ filter chain");
        }
        throw new L("Unsupported XZ filter chain");
    }
}

