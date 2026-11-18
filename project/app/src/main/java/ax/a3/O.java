/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.Q2.f;
import ax.a3.I;
import ax.c3.K;
import ax.c3.g0;
import ax.g3.c;
import ax.g3.n;
import ax.u3.h;
import com.voxdon.xplorer.file.T;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;

public class O
extends I {
    private TextInputLayout t0;
    private EditText u0;
    private f v0;
    private int w0;

    public static O i3(K k8) {
        O o8 = new O();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", (Serializable)((Object)k8.d()));
        bundle.putInt("LOCATION_KEY", k8.b());
        o8.v2(bundle);
        return o8;
    }

    @Override
    public void f3() {
        super.f3();
        this.v0 = (f)((Object)this.j0().getSerializable("LOCATION"));
        this.w0 = this.j0().getInt("LOCATION_KEY");
    }

    @Override
    public Dialog g3() {
        EditText editText;
        Object object = this.j3();
        a.a a8 = h.a((Context)this.f0()).p(2131951901);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558507, null, false);
        this.t0 = (TextInputLayout)view.findViewById(2131362306);
        this.u0 = editText = (EditText)view.findViewById(2131362274);
        editText.setText((CharSequence)object);
        this.u0.selectAll();
        this.u0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final O a;
            {
                this.a = o8;
            }

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66 || n8 == 6) {
                    if (keyEvent != null && keyEvent.getAction() == 1) {
                        return true;
                    }
                    this.a.k3();
                    return true;
                }
                return false;
            }
        });
        this.u0.requestFocus();
        a8.b(true);
        a8.setView(view);
        a8.setNegativeButton(0x1040000, null);
        a8.setPositiveButton(17039370, null);
        object = a8.create();
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final O b;
            {
                this.b = o8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new c(this){
                    final b c;
                    {
                        this.c = b8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.b.k3();
                    }
                });
            }
        });
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    String j3() {
        if (f.X(this.v0)) {
            return T.b((Context)this.f0(), this.v0).f(this.w0).f();
        }
        return T.d((Context)this.f0(), this.v0).f(this.w0).f();
    }

    public void k3() {
        this.l3(this.u0.getText().toString().trim());
        if (this.P0() instanceof n) {
            ((n)((Object)this.P0())).E(this.v0, this.w0);
        }
        this.N2();
    }

    void l3(String string) {
        if (f.X(this.v0)) {
            T t8 = T.b((Context)this.f0(), this.v0);
            String string2 = string;
            if (TextUtils.isEmpty((CharSequence)string)) {
                string2 = this.v0.M((Context)this.f0());
            }
            t8.g(this.w0, string2);
            return;
        }
        g0 g02 = T.d((Context)this.f0(), this.v0);
        String string3 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string3 = g02.k(this.w0).d();
        }
        g02.g(this.w0, string3);
    }
}

