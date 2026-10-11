package ax.b2;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1474b extends androidx.preference.c {
    Set<String> B0 = new HashSet();
    boolean C0;
    CharSequence[] D0;
    CharSequence[] E0;

    /* renamed from: ax.b2.b$a */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                C1474b c1474b = C1474b.this;
                c1474b.C0 = c1474b.B0.add(c1474b.E0[i].toString()) | c1474b.C0;
            } else {
                C1474b c1474b2 = C1474b.this;
                c1474b2.C0 = c1474b2.B0.remove(c1474b2.E0[i].toString()) | c1474b2.C0;
            }
        }
    }

    private MultiSelectListPreference l3() {
        return (MultiSelectListPreference) d3();
    }

    public static C1474b m3(String str) {
        C1474b c1474b = new C1474b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        c1474b.v2(bundle);
        return c1474b;
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.B0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.C0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.D0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.E0);
    }

    @Override // androidx.preference.c
    public void h3(boolean z) {
        if (z && this.C0) {
            MultiSelectListPreference l3 = l3();
            if (l3.h(this.B0)) {
                l3.c1(this.B0);
            }
        }
        this.C0 = false;
    }

    @Override // androidx.preference.c
    protected void i3(a.C0006a c0006a) {
        super.i3(c0006a);
        int length = this.E0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.B0.contains(this.E0[i].toString());
        }
        c0006a.g(this.D0, zArr, new a());
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle != null) {
            this.B0.clear();
            this.B0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.C0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.D0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.E0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference l3 = l3();
        if (l3.Z0() == null || l3.a1() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.B0.clear();
        this.B0.addAll(l3.b1());
        this.C0 = false;
        this.D0 = l3.Z0();
        this.E0 = l3.a1();
    }
}
