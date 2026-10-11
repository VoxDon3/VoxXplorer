package ax.B0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.Gb.l;

/* loaded from: classes.dex */
public final class i extends h {
    private final ViewGroup c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        l.f(fragment, "fragment");
        l.f(viewGroup, "container");
        this.c0 = viewGroup;
    }
}
