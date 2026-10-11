/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.a3.l;
import ax.c3.d0;
import ax.u3.b;
import ax.u3.h;
import com.google.android.material.textfield.TextInputLayout;

public class p
extends I {
    private d t0;
    private TextInputLayout u0;
    EditText v0;
    private boolean w0;
    private String x0;
    l y0;

    public static p l3(boolean bl, d d8) {
        p p8 = new p();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDirectory", bl);
        p8.v2(bundle);
        p8.n3(d8);
        return p8;
    }

    private void m3() {
        Object object = this.y0;
        l l8 = l.q;
        if (object != l8) {
            object = this.v0.getText().toString().trim();
            if (TextUtils.isEmpty((CharSequence)object)) {
                this.u0.setError(this.x0);
                return;
            }
            if (d0.c((String)object)) {
                this.u0.setError(this.M0(2131951793));
                return;
            }
            d d8 = this.t0;
            if (d8 != null) {
                this.y0 = object = d8.a((String)object);
                if (object == l8) {
                    this.O2();
                    return;
                }
                if (object == l.c0) {
                    this.u0.setError(this.M0(2131952343));
                    return;
                }
                if (object == l.d0) {
                    this.u0.setError(this.M0(2131951927));
                    return;
                }
                this.O2();
                b.f();
            }
        }
    }

    @Override
    public void f3() {
        boolean bl;
        super.f3();
        this.w0 = bl = this.j0().getBoolean("isDirectory");
        if (bl) {
            this.x0 = this.M0(2131952070);
            return;
        }
        this.x0 = this.M0(2131952052);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Dialog g3() {
        EditText editText;
        Object object = h.a((Context)this.f0());
        int n8 = this.w0 ? 2131951900 : 2131951899;
        a.a a8 = ((a.a)object).p(n8);
        object = LayoutInflater.from((Context)this.f0()).inflate(2131558507, null, false);
        this.u0 = (TextInputLayout)object.findViewById(2131362306);
        this.v0 = editText = (EditText)object.findViewById(2131362274);
        editText.addTextChangedListener(new TextWatcher(this){
            final p a;
            {
                this.a = p8;
            }

            public void afterTextChanged(Editable editable) {
                if (this.a.b() == null) {
                    return;
                }
                if (TextUtils.isEmpty((CharSequence)editable.toString())) {
                    this.a.u0.setError(this.a.x0);
                    return;
                }
                if (d0.c(editable.toString())) {
                    this.a.u0.setError(this.a.M0(2131951793));
                    return;
                }
                this.a.u0.setError(null);
                this.a.u0.setErrorEnabled(false);
            }

            public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }

            public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }
        });
        this.v0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final p a;
            {
                this.a = p8;
            }

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66 || n8 == 6) {
                    if (keyEvent != null && keyEvent.getAction() == 1) {
                        return true;
                    }
                    this.a.m3();
                    return true;
                }
                return false;
            }
        });
        try {
            this.v0.requestFocus();
        }
        catch (RuntimeException runtimeException) {}
        a8.setView((View)object);
        a8.setNegativeButton(0x1040000, null);
        a8.setPositiveButton(17039370, null);
        object = a8.create();
        object.setCanceledOnTouchOutside(false);
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final p b;
            {
                this.b = p8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final c c;
                    {
                        this.c = c8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.b.m3();
                    }
                });
            }
        });
        return object;
    }

    public void n3(d d8) {
        this.t0 = d8;
    }

    public static interface d {
        public l a(String var1);
    }
}

