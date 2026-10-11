/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.y;
import ax.Z8.a;
import ax.c9.a;
import java.io.IOException;

public class z
implements a<y> {
    @Override
    public boolean b(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        return byArray.length >= 4 && byArray[0] == -4 && byArray[1] == 83 && byArray[2] == 77 && byArray[3] == 66;
    }

    public y c(byte[] byArray) throws a.b, IOException {
        return new y(byArray);
    }
}

