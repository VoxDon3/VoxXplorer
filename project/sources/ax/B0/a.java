package ax.B0;

import androidx.fragment.app.Fragment;
import ax.Gb.l;

/* loaded from: classes.dex */
public final class a extends h {
    private final String c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        l.f(fragment, "fragment");
        l.f(str, "previousFragmentId");
        this.c0 = str;
    }
}
