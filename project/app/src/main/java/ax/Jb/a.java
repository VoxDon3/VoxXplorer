/*
 * Decompiled with CFR 0.152.
 */
package ax.Jb;

import ax.Jb.c;
import java.util.Random;

public abstract class a
extends c {
    @Override
    public int b() {
        return this.d().nextInt();
    }

    @Override
    public int c(int n8) {
        return this.d().nextInt(n8);
    }

    public abstract Random d();
}

