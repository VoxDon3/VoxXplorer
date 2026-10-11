package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ax.b2.C1478f;
import ax.b2.C1480h;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context c1;
    private final ArrayAdapter d1;
    private Spinner e1;
    private final AdapterView.OnItemSelectedListener f1;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.c1()[i].toString();
                if (charSequence.equals(DropDownPreference.this.d1()) || !DropDownPreference.this.h(charSequence)) {
                    return;
                }
                DropDownPreference.this.j1(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1478f.c);
    }

    private int l1(String str) {
        CharSequence[] c1 = c1();
        if (str == null || c1 == null) {
            return -1;
        }
        for (int length = c1.length - 1; length >= 0; length--) {
            if (TextUtils.equals(c1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    private void m1() {
        this.d1.clear();
        if (a1() != null) {
            for (CharSequence charSequence : a1()) {
                this.d1.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void W() {
        super.W();
        ArrayAdapter arrayAdapter = this.d1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        Spinner spinner = (Spinner) hVar.a.findViewById(C1480h.e);
        this.e1 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.d1);
        this.e1.setOnItemSelectedListener(this.f1);
        this.e1.setSelection(l1(d1()));
        super.c0(hVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void d0() {
        this.e1.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void g1(CharSequence[] charSequenceArr) {
        super.g1(charSequenceArr);
        m1();
    }

    protected ArrayAdapter k1() {
        return new ArrayAdapter(this.c1, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1 = new a();
        this.c1 = context;
        this.d1 = k1();
        m1();
    }
}
