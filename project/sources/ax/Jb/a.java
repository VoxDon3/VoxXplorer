package ax.Jb;

import java.util.Random;

/* loaded from: classes3.dex */
public abstract class a extends c {
    @Override // ax.Jb.c
    public int b() {
        return d().nextInt();
    }

    @Override // ax.Jb.c
    public int c(int i) {
        return d().nextInt(i);
    }

    public abstract Random d();
}
