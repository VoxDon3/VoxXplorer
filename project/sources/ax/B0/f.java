package ax.B0;

import androidx.fragment.app.Fragment;
import ax.Gb.l;

/* loaded from: classes.dex */
public final class f extends g {
    private final Fragment c0;
    private final int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        l.f(fragment, "fragment");
        l.f(fragment2, "targetFragment");
        this.c0 = fragment2;
        this.d0 = i;
    }
}
