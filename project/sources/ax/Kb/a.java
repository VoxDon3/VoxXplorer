package ax.Kb;

import ax.Gb.l;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* loaded from: classes3.dex */
public final class a extends ax.Jb.a {
    @Override // ax.Jb.a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.e(current, "current(...)");
        return current;
    }
}
