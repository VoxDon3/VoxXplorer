/*
 * Decompiled with CFR 0.152.
 */
package ax.b2;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.ListPreference;
import androidx.preference.c;

public class a
extends c {
    int B0;
    private CharSequence[] C0;
    private CharSequence[] D0;

    private ListPreference l3() {
        return (ListPreference)this.d3();
    }

    public static a m3(String string) {
        a a8 = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", string);
        a8.v2(bundle);
        return a8;
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.B0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.C0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.D0);
    }

    @Override
    public void h3(boolean bl) {
        int n8;
        if (bl && (n8 = this.B0) >= 0) {
            String string = this.D0[n8].toString();
            ListPreference listPreference = this.l3();
            if (listPreference.h(string)) {
                listPreference.j1(string);
            }
        }
    }

    @Override
    protected void i3(a.a a8) {
        super.i3(a8);
        a8.o(this.C0, this.B0, new DialogInterface.OnClickListener(this){
            final a a;
            {
                this.a = a8;
            }

            public void onClick(DialogInterface dialogInterface, int n8) {
                a a8 = this.a;
                a8.B0 = n8;
                a8.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        a8.l(null, null);
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        if (object == null) {
            object = this.l3();
            if (((ListPreference)object).a1() != null && ((ListPreference)object).c1() != null) {
                this.B0 = ((ListPreference)object).Z0(((ListPreference)object).d1());
                this.C0 = ((ListPreference)object).a1();
                this.D0 = ((ListPreference)object).c1();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.B0 = object.getInt("ListPreferenceDialogFragment.index", 0);
        this.C0 = object.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.D0 = object.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }
}

