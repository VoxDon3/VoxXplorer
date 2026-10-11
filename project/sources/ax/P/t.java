package ax.P;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class t {
    private final boolean a;
    private Configuration b;

    public t(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(boolean z, Configuration configuration) {
        this(z);
        ax.Gb.l.f(configuration, "newConfig");
        this.b = configuration;
    }
}
