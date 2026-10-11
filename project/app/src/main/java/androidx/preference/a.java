/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import androidx.preference.c;

public class a
extends c {
    private EditText B0;
    private CharSequence C0;
    private final Runnable D0 = new Runnable(this){
        final a q;
        {
            this.q = a8;
        }

        @Override
        public void run() {
            this.q.o3();
        }
    };
    private long E0 = -1L;

    private EditTextPreference l3() {
        return (EditTextPreference)this.d3();
    }

    private boolean m3() {
        long l8 = this.E0;
        return l8 != -1L && l8 + 1000L > SystemClock.currentThreadTimeMillis();
    }

    public static a n3(String string) {
        a a8 = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", string);
        a8.v2(bundle);
        return a8;
    }

    private void p3(boolean bl) {
        long l8 = bl ? SystemClock.currentThreadTimeMillis() : -1L;
        this.E0 = l8;
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.C0);
    }

    @Override
    protected boolean e3() {
        return true;
    }

    @Override
    protected void f3(View view) {
        super.f3(view);
        view = (EditText)view.findViewById(16908291);
        this.B0 = view;
        if (view != null) {
            view.requestFocus();
            this.B0.setText(this.C0);
            view = this.B0;
            view.setSelection(view.getText().length());
            this.l3().Z0();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override
    public void h3(boolean bl) {
        if (bl) {
            String string = this.B0.getText().toString();
            EditTextPreference editTextPreference = this.l3();
            if (editTextPreference.h(string)) {
                editTextPreference.b1(string);
            }
        }
    }

    @Override
    protected void k3() {
        this.p3(true);
        this.o3();
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) {
            this.C0 = this.l3().a1();
            return;
        }
        this.C0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    void o3() {
        if (this.m3()) {
            EditText editText = this.B0;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager)this.B0.getContext().getSystemService("input_method")).showSoftInput((View)this.B0, 0)) {
                    this.p3(false);
                    return;
                }
                this.B0.removeCallbacks(this.D0);
                this.B0.postDelayed(this.D0, 50L);
                return;
            }
            this.p3(false);
        }
    }
}

