package ax.B0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.Gb.l;

/* loaded from: classes.dex */
public final class d extends h {
    private final ViewGroup c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        l.f(fragment, "fragment");
        this.c0 = viewGroup;
    }
}
