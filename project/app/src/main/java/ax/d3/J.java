/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ax.G0.h;
import ax.d3.I;
import java.util.function.Consumer;

public class J {
    public static /* synthetic */ void a(Consumer consumer, String string, Bundle bundle) {
        consumer.accept(bundle);
    }

    public static void b(Fragment fragment, String string) {
        fragment.A0().u(string);
        fragment.A0().t(string);
    }

    public static void c(Fragment fragment, String string, Consumer<Bundle> consumer) {
        h h8 = fragment.R0() != null ? fragment.S0() : fragment;
        fragment.A0().m1(string, h8, new I(consumer));
    }

    public static void d(Fragment fragment, String string, String string2, boolean bl) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(string2, bl);
        fragment.A0().l1(string, bundle);
    }

    public static void e(Fragment fragment, String string, String string2, int n8) {
        Bundle bundle = new Bundle();
        bundle.putInt(string2, n8);
        fragment.A0().l1(string, bundle);
    }

    public static void f(Fragment fragment, String string, Bundle bundle) {
        fragment.A0().l1(string, bundle);
    }
}

