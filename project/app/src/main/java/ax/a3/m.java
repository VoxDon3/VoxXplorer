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
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.W2.k;
import ax.a3.I;
import ax.a3.S;
import ax.c3.d0;
import ax.g3.c;
import ax.u3.h;

public class m
extends I {
    private EditText t0;
    private String u0;
    private AutoCompleteTextView v0;
    private f w0;
    private boolean x0 = false;
    private long y0;

    static /* synthetic */ long j3(m m8, long l8) {
        m8.y0 = l8;
        return l8;
    }

    public static m m3(String string) {
        m m8 = new m();
        Bundle bundle = new Bundle();
        bundle.putString("FILE_NAME", string);
        m8.v2(bundle);
        return m8;
    }

    private void o3() {
        if (!this.x0) {
            f f8;
            String string = this.t0.getText().toString().trim();
            if (TextUtils.isEmpty((CharSequence)string)) {
                Toast.makeText((Context)this.f0(), (int)2131952052, (int)1).show();
                return;
            }
            if (d0.c(string)) {
                Toast.makeText((Context)this.f0(), (CharSequence)this.M0(2131951793), (int)1).show();
                return;
            }
            if (!this.f1() && (f8 = this.w0) != null) {
                f8.a(string, this.n3());
                this.x0 = true;
                this.N2();
            }
        }
    }

    private void q3(Context context, AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setAdapter((ListAdapter)new S.j(context, new String[]{".zip", ".7z"}));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final m a;
            {
                this.a = m8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
            }
        });
        autoCompleteTextView.setText((CharSequence)".zip");
    }

    @Override
    public void f3() {
        super.f3();
        this.u0 = this.j0().getString("FILE_NAME");
    }

    @Override
    public Dialog g3() {
        AutoCompleteTextView autoCompleteTextView;
        Object object = h.a((Context)this.f0()).p(2131951889);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558498, null, false);
        this.v0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131362053);
        autoCompleteTextView.setOnClickListener((View.OnClickListener)new c(this){
            final m c;
            {
                this.c = m8;
            }

            @Override
            public void a(View view) {
                if (System.currentTimeMillis() - this.c.y0 > 100L) {
                    this.c.v0.showDropDown();
                }
            }
        });
        this.v0.setOnTouchListener(new View.OnTouchListener(this){
            final m a;
            {
                this.a = m8;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    this.a.v0.showDropDown();
                    m.j3(this.a, System.currentTimeMillis());
                }
                return false;
            }
        });
        autoCompleteTextView = (EditText)view.findViewById(2131362052);
        this.t0 = autoCompleteTextView;
        autoCompleteTextView.setText((CharSequence)this.u0);
        this.t0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final m a;
            {
                this.a = m8;
            }

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66 || n8 == 6) {
                    if (keyEvent != null && keyEvent.getAction() == 1) {
                        return true;
                    }
                    this.a.o3();
                    return true;
                }
                return false;
            }
        });
        this.t0.requestFocus();
        this.q3((Context)this.f0(), this.v0);
        ((a.a)object).setView(view);
        ((a.a)object).b(true);
        ((a.a)object).setNegativeButton(0x1040000, null);
        ((a.a)object).setPositiveButton(17039370, null);
        object = ((a.a)object).create();
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final m b;
            {
                this.b = m8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new c(this){
                    final d c;
                    {
                        this.c = d8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.b.o3();
                    }
                });
            }
        });
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    k.a n3() {
        if (".7z".equals(this.v0.getText().toString())) {
            return k.a.c0;
        }
        return k.a.q;
    }

    public void p3(f f8) {
        this.w0 = f8;
    }

    public static interface f {
        public void a(String var1, k.a var2);
    }
}

