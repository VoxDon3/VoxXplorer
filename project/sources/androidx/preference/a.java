package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public class a extends c {
    private EditText B0;
    private CharSequence C0;
    private final Runnable D0 = new RunnableC0033a();
    private long E0 = -1;

    /* renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    class RunnableC0033a implements Runnable {
        RunnableC0033a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o3();
        }
    }

    private EditTextPreference l3() {
        return (EditTextPreference) d3();
    }

    private boolean m3() {
        long j = this.E0;
        return j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis();
    }

    public static a n3(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.v2(bundle);
        return aVar;
    }

    private void p3(boolean z) {
        this.E0 = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.C0);
    }

    @Override // androidx.preference.c
    protected boolean e3() {
        return true;
    }

    @Override // androidx.preference.c
    protected void f3(View view) {
        super.f3(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.B0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.B0.setText(this.C0);
        EditText editText2 = this.B0;
        editText2.setSelection(editText2.getText().length());
        l3().Z0();
    }

    @Override // androidx.preference.c
    public void h3(boolean z) {
        if (z) {
            String obj = this.B0.getText().toString();
            EditTextPreference l3 = l3();
            if (l3.h(obj)) {
                l3.b1(obj);
            }
        }
    }

    @Override // androidx.preference.c
    protected void k3() {
        p3(true);
        o3();
    }

    @Override // androidx.preference.c, androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) {
            this.C0 = l3().a1();
        } else {
            this.C0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    void o3() {
        if (m3()) {
            EditText editText = this.B0;
            if (editText == null || !editText.isFocused()) {
                p3(false);
            } else if (((InputMethodManager) this.B0.getContext().getSystemService("input_method")).showSoftInput(this.B0, 0)) {
                p3(false);
            } else {
                this.B0.removeCallbacks(this.D0);
                this.B0.postDelayed(this.D0, 50L);
            }
        }
    }
}
