/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.a3.j;
import ax.a3.t;
import ax.u3.h;
import com.google.android.material.textfield.TextInputLayout;

public class L
extends j {
    private TextInputLayout t0;
    private EditText u0;
    String v0;
    private int w0;
    private c x0;
    private String y0;

    public static L n3(String string, String string2, c c8) {
        L l8 = new L();
        l8.p3(c8);
        c8 = new Bundle();
        c8.putString("title", string);
        c8.putInt("type", 1);
        if (string2 != null) {
            c8.putString("error", string2);
        }
        l8.v2((Bundle)c8);
        return l8;
    }

    public static L o3(Fragment fragment, String string) {
        L l8 = new L();
        l8.D2(fragment, 0);
        fragment = new Bundle();
        fragment.putString("title", string);
        fragment.putInt("type", 2);
        l8.v2((Bundle)fragment);
        return l8;
    }

    @Override
    public void f3() {
        super.f3();
        if (this.j0() != null) {
            this.v0 = this.j0().getString("title");
            this.w0 = this.j0().getInt("type");
            this.y0 = this.j0().getString("error");
        }
    }

    @Override
    public Dialog g3() {
        Object object = h.a((Context)this.f0()).setTitle(this.v0);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558516, null, false);
        Object object2 = (InputFilter[])view.findViewById(2131362672);
        this.t0 = object2;
        ((TextInputLayout)((Object)object2)).setHint(this.M0(2131951846));
        if (!TextUtils.isEmpty((CharSequence)this.y0)) {
            this.t0.setError(this.y0);
        }
        object2 = (EditText)view.findViewById(2131362671);
        this.u0 = object2;
        InputFilter[] inputFilterArray = object2.getFilters();
        object2 = new InputFilter[inputFilterArray.length + 1];
        System.arraycopy(inputFilterArray, 0, object2, 0, inputFilterArray.length);
        object2[inputFilterArray.length] = this.w0 == 2 ? new InputFilter.LengthFilter(6) : new InputFilter.LengthFilter(64);
        this.u0.setFilters((InputFilter[])object2);
        int n8 = this.w0;
        if (n8 == 2) {
            this.u0.setInputType(18);
        } else if (n8 == 1) {
            this.u0.setInputType(129);
        } else {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("invlaid type :");
            ((StringBuilder)object2).append(this.w0);
            ax.u3.b.g(((StringBuilder)object2).toString());
            this.u0.setInputType(129);
        }
        this.u0.requestFocus();
        ((a.a)object).b(true);
        ((a.a)object).setView(view);
        ((a.a)object).setNegativeButton(0x1040000, new t(this){
            final L b;
            {
                this.b = l8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                this.b.onCancel(dialogInterface);
            }
        });
        ((a.a)object).setPositiveButton(17039370, null);
        object = ((a.a)object).create();
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final L b;
            {
                this.b = l8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final b c;
                    {
                        this.c = b8;
                    }

                    @Override
                    public void a(View object) {
                        object = this.c.b.u0.getText().toString().trim();
                        if (TextUtils.isEmpty((CharSequence)object)) {
                            this.c.b.t0.setError(this.c.b.M0(2131951954));
                            return;
                        }
                        if (this.c.b.x0 != null) {
                            this.c.b.x0.X((String)object);
                        } else if (this.c.b.P0() instanceof c) {
                            ((c)((Object)this.c.b.P0())).X((String)object);
                        }
                        this.c.b.O2();
                    }
                });
            }
        });
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public CharSequence i3(Context context) {
        return context.getString(2131952340);
    }

    @Override
    public CharSequence j3(Context context) {
        return context.getString(2131952340);
    }

    @Override
    public void onCancel(DialogInterface object) {
        super.onCancel((DialogInterface)object);
        object = this.x0;
        if (object != null) {
            object.a();
            return;
        }
        if (this.P0() instanceof c) {
            ((c)((Object)this.P0())).a();
        }
    }

    public void p3(c c8) {
        this.x0 = c8;
    }

    public static interface c {
        public void X(String var1);

        public void a();
    }
}

