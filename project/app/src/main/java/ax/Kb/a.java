/*
 * Decompiled with CFR 0.152.
 */
package ax.Kb;

import ax.Gb.l;
import java.util.Random;

public final class a
extends ax.Jb.a {
    @Override
    public Random d() {
        j.ThreadLocalRandom threadLocalRandom = j.ThreadLocalRandom.current();
        l.e(threadLocalRandom, "current(...)");
        return threadLocalRandom;
    }
}

