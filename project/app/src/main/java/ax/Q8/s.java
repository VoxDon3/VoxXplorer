/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.r;
import ax.Z8.a;
import ax.c9.a;

public class s
implements a<r> {
    @Override
    public boolean b(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        return byArray.length >= 4 && byArray[0] == -2 && byArray[1] == 83 && byArray[2] == 77 && byArray[3] == 66;
    }

    public r c(byte[] byArray) throws a.b {
        return new r(byArray);
    }
}

