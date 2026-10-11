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
import ax.Q2.f;
import ax.a3.I;
import ax.a3.l;
import ax.c3.d0;
import ax.u3.b;
import ax.u3.h;
import com.alphainventor.filemanager.file.n;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;

public class N
extends I {
    private boolean A0 = false;
    private f B0;
    private TextInputLayout t0;
    private EditText u0;
    private TextView v0;
    private d w0;
    private boolean x0;
    private String y0;
    private boolean z0;

    public static N k3(f f8, n n8) {
        N n9 = new N();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", (Serializable)((Object)f8));
        bundle.putString("FILE_NAME", n8.B());
        bundle.putBoolean("IS_DIRECTORY", n8.isDirectory());
        n9.v2(bundle);
        return n9;
    }

    @Override
    public void f3() {
        super.f3();
        this.B0 = (f)((Object)this.j0().getSerializable("LOCATION"));
        this.y0 = this.j0().getString("FILE_NAME");
        this.z0 = this.j0().getBoolean("IS_DIRECTORY");
    }

    @Override
    public Dialog g3() {
        String string = this.y0;
        Object object = h.a((Context)this.f0()).p(2131951901);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558507, null, false);
        this.t0 = (TextInputLayout)view.findViewById(2131362306);
        this.u0 = (EditText)view.findViewById(2131362274);
        this.v0 = (TextView)view.findViewById(2131362270);
        if ((f.g0(this.B0) || this.B0 == f.F0) && !this.z0) {
            this.x0 = false;
            this.u0.setText((CharSequence)d0.g(string));
            this.v0.setVisibility(0);
            TextView textView = this.v0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".");
            stringBuilder.append(d0.f(string));
            textView.setText((CharSequence)stringBuilder.toString());
            this.u0.selectAll();
        } else {
            this.x0 = true;
            this.u0.setText((CharSequence)string);
            if (string.contains(".")) {
                int n8 = string.lastIndexOf(46);
                if (n8 < this.u0.getText().length()) {
                    this.u0.setSelection(0, n8);
                } else {
                    this.u0.selectAll();
                }
            } else {
                this.u0.selectAll();
            }
        }
        this.u0.addTextChangedListener(new TextWatcher(this){
            final N a;
            {
                this.a = n8;
            }

            public void afterTextChanged(Editable editable) {
                if (this.a.b() == null) {
                    return;
                }
                if (TextUtils.isEmpty((CharSequence)editable.toString())) {
                    if (this.a.z0) {
                        this.a.t0.setError(this.a.M0(2131952070));
                        return;
                    }
                    this.a.t0.setError(this.a.M0(2131952052));
                    return;
                }
                if (d0.c(editable.toString())) {
                    this.a.t0.setError(this.a.M0(2131951793));
                    return;
                }
                this.a.t0.setError(null);
                this.a.t0.setErrorEnabled(false);
            }

            public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }

            public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }
        });
        this.u0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final N a;
            {
                this.a = n8;
            }

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66 || n8 == 6) {
                    if (keyEvent != null && keyEvent.getAction() == 1) {
                        return true;
                    }
                    this.a.l3();
                    return true;
                }
                return false;
            }
        });
        this.u0.requestFocus();
        ((a.a)object).b(true);
        ((a.a)object).setView(view);
        ((a.a)object).setNegativeButton(0x1040000, null);
        ((a.a)object).setPositiveButton(17039370, null);
        object = ((a.a)object).create();
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final N b;
            {
                this.b = n8;
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
                        this.c.b.l3();
                    }
                });
            }
        });
        object.setCanceledOnTouchOutside(false);
        return object;
    }

    public void l3() {
        if (!this.A0) {
            Object object = this.u0.getText().toString().trim();
            if (TextUtils.isEmpty((CharSequence)object)) {
                if (this.z0) {
                    this.t0.setError(this.M0(2131952070));
                    return;
                }
                this.t0.setError(this.M0(2131952052));
                return;
            }
            if (d0.c((String)object)) {
                this.t0.setError(this.M0(2131951793));
                return;
            }
            Object object2 = object;
            if (!this.x0) {
                String string = this.v0.getText().toString();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(string);
                object2 = ((StringBuilder)object2).toString();
            }
            if ((object = this.w0) != null) {
                if ((object2 = object.a((String)object2)) == l.q) {
                    this.A0 = true;
                    this.O2();
                    return;
                }
                if (object2 == l.c0) {
                    this.t0.setError(this.M0(2131952343));
                    return;
                }
                if (object2 == l.d0) {
                    this.t0.setError(this.M0(2131951927));
                    return;
                }
                b.f();
            }
        }
    }

    public void m3(d d8) {
        this.w0 = d8;
    }

    public static interface d {
        public l a(String var1);
    }
}

