/*
 * Decompiled with CFR 0.152.
 */
package ax.Jb;

import ax.Gb.l;
import java.util.Random;

public final class b
extends ax.Jb.a {
    private final a d0 = new ThreadLocal<Random>(){

        protected Random a() {
            return new Random();
        }
    };

    @Override
    public Random d() {
        Object t8 = this.d0.get();
        l.e(t8, "get(...)");
        return (Random)t8;
    }
}

