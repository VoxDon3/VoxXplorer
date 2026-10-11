/*
 * Decompiled with CFR 0.152.
 */
package ax.b2;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class b
extends c {
    Set<String> B0 = new HashSet<String>();
    boolean C0;
    CharSequence[] D0;
    CharSequence[] E0;

    private MultiSelectListPreference l3() {
        return (MultiSelectListPreference)this.d3();
    }

    public static b m3(String string) {
        b b8 = new b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", string);
        b8.v2(bundle);
        return b8;
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<String>(this.B0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.C0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.D0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.E0);
    }

    @Override
    public void h3(boolean bl) {
        MultiSelectListPreference multiSelectListPreference;
        if (bl && this.C0 && (multiSelectListPreference = this.l3()).h(this.B0)) {
            multiSelectListPreference.c1(this.B0);
        }
        this.C0 = false;
    }

    @Override
    protected void i3(a.a a8) {
        super.i3(a8);
        int n8 = this.E0.length;
        boolean[] blArray = new boolean[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            blArray[i8] = this.B0.contains(this.E0[i8].toString());
        }
        a8.g(this.D0, blArray, new DialogInterface.OnMultiChoiceClickListener(this){
            final b a;
            {
                this.a = b8;
            }

            public void onClick(DialogInterface object, int n8, boolean bl) {
                if (bl) {
                    object = this.a;
                    bl = object.C0;
                    object.C0 = object.B0.add(object.E0[n8].toString()) | bl;
                    return;
                }
                object = this.a;
                bl = object.C0;
                object.C0 = object.B0.remove(object.E0[n8].toString()) | bl;
            }
        });
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        if (object == null) {
            object = this.l3();
            if (((MultiSelectListPreference)object).Z0() != null && ((MultiSelectListPreference)object).a1() != null) {
                this.B0.clear();
                this.B0.addAll(((MultiSelectListPreference)object).b1());
                this.C0 = false;
                this.D0 = ((MultiSelectListPreference)object).Z0();
                this.E0 = ((MultiSelectListPreference)object).a1();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.B0.clear();
        this.B0.addAll(object.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.C0 = object.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.D0 = object.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.E0 = object.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }
}

