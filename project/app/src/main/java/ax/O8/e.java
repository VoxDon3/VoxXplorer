/*
 * Decompiled with CFR 0.152.
 */
package ax.O8;

import ax.O8.b;
import ax.O8.d;
import ax.Z8.a;
import ax.c9.a;
import java.io.IOException;

public class e
implements a<d> {
    @Override
    public boolean b(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        return byArray.length >= 4 && byArray[0] == -1 && byArray[1] == 83 && byArray[2] == 77 && byArray[3] == 66;
    }

    public d c(byte[] byArray) throws a.b, IOException {
        throw new b();
    }
}

