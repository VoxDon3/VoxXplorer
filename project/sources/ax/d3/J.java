package ax.d3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class J {
    public static void b(Fragment fragment, String str) {
        fragment.A0().u(str);
        fragment.A0().t(str);
    }

    public static void c(Fragment fragment, String str, final Consumer<Bundle> consumer) {
        fragment.A0().m1(str, fragment.R0() != null ? fragment.S0() : fragment, new ax.A0.l() { // from class: ax.d3.I
            @Override // ax.A0.l
            public final void a(String str2, Bundle bundle) {
                Consumer.this.s(bundle);
            }
        });
    }

    public static void d(Fragment fragment, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str2, z);
        fragment.A0().l1(str, bundle);
    }

    public static void e(Fragment fragment, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str2, i);
        fragment.A0().l1(str, bundle);
    }

    public static void f(Fragment fragment, String str, Bundle bundle) {
        fragment.A0().l1(str, bundle);
    }
}
