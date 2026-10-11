/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.i1.f0;
import ax.i1.i;
import ax.i1.j;
import ax.r7.z;
import java.util.List;

public final class k
implements j {
    @Override
    public f0 a(List<? extends f0> list, List<List<Integer>> list2) {
        return new i(list, list2);
    }

    @Override
    public f0 empty() {
        return new i(z.z(), z.<List<Integer>>z());
    }
}

