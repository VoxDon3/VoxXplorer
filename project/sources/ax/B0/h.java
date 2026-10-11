package ax.B0;

import androidx.fragment.app.Fragment;
import ax.Gb.l;

/* loaded from: classes.dex */
public abstract class h extends RuntimeException {
    private final Fragment q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, String str) {
        super(str);
        l.f(fragment, "fragment");
        this.q = fragment;
    }

    public final Fragment a() {
        return this.q;
    }
}
