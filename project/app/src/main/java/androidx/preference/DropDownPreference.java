/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.ListPreference;
import androidx.preference.h;
import ax.b2.f;

public class DropDownPreference
extends ListPreference {
    private final Context c1;
    private final ArrayAdapter d1;
    private Spinner e1;
    private final AdapterView.OnItemSelectedListener f1 = new AdapterView.OnItemSelectedListener(this){
        final DropDownPreference a;
        {
            this.a = dropDownPreference;
        }

        public void onItemSelected(AdapterView<?> object, View view, int n8, long l8) {
            if (n8 >= 0 && !((String)(object = this.a.c1()[n8].toString())).equals(this.a.d1()) && this.a.h(object)) {
                this.a.j1((String)object);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        this.c1 = context;
        this.d1 = this.k1();
        this.m1();
    }

    private int l1(String string) {
        CharSequence[] charSequenceArray = this.c1();
        if (string != null && charSequenceArray != null) {
            for (int i8 = charSequenceArray.length - 1; i8 >= 0; --i8) {
                if (!TextUtils.equals((CharSequence)charSequenceArray[i8].toString(), (CharSequence)string)) continue;
                return i8;
            }
        }
        return -1;
    }

    private void m1() {
        this.d1.clear();
        if (this.a1() != null) {
            for (CharSequence charSequence : this.a1()) {
                this.d1.add((Object)charSequence.toString());
            }
        }
    }

    @Override
    protected void W() {
        super.W();
        ArrayAdapter arrayAdapter = this.d1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void c0(h h8) {
        Spinner spinner;
        this.e1 = spinner = (Spinner)h8.a.findViewById(ax.b2.h.e);
        spinner.setAdapter((SpinnerAdapter)this.d1);
        this.e1.setOnItemSelectedListener(this.f1);
        this.e1.setSelection(this.l1(this.d1()));
        super.c0(h8);
    }

    @Override
    protected void d0() {
        this.e1.performClick();
    }

    @Override
    public void g1(CharSequence[] charSequenceArray) {
        super.g1(charSequenceArray);
        this.m1();
    }

    protected ArrayAdapter k1() {
        return new ArrayAdapter(this.c1, 0x1090009);
    }
}

