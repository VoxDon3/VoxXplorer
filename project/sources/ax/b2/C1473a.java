package ax.b2;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.ListPreference;

/* renamed from: ax.b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1473a extends androidx.preference.c {
    int B0;
    private CharSequence[] C0;
    private CharSequence[] D0;

    /* renamed from: ax.b2.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC0258a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC0258a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1473a c1473a = C1473a.this;
            c1473a.B0 = i;
            c1473a.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference l3() {
        return (ListPreference) d3();
    }

    public static C1473a m3(String str) {
        C1473a c1473a = new C1473a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        c1473a.v2(bundle);
        return c1473a;
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.B0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.C0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.D0);
    }

    @Override // androidx.preference.c
    public void h3(boolean z) {
        int i;
        if (!z || (i = this.B0) < 0) {
            return;
        }
        String charSequence = this.D0[i].toString();
        ListPreference l3 = l3();
        if (l3.h(charSequence)) {
            l3.j1(charSequence);
        }
    }

    @Override // androidx.preference.c
    protected void i3(a.C0006a c0006a) {
        super.i3(c0006a);
        c0006a.o(this.C0, this.B0, new DialogInterfaceOnClickListenerC0258a());
        c0006a.l(null, null);
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle != null) {
            this.B0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.C0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.D0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference l3 = l3();
        if (l3.a1() == null || l3.c1() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.B0 = l3.Z0(l3.d1());
        this.C0 = l3.a1();
        this.D0 = l3.c1();
    }
}
