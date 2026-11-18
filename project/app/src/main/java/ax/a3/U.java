/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.Q2.f;
import ax.a3.I;
import ax.u3.h;
import ax.u3.q;
import com.voxdon.xplorer.file.D;
import com.voxdon.xplorer.file.H;
import java.io.Serializable;

public class U
extends I {
    private c t0;
    private f u0;
    private TextView v0;
    private EditText w0;
    private b x0;

    public static U l3(f f8) {
        U u8 = new U();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", (Serializable)((Object)f8));
        u8.v2(bundle);
        return u8;
    }

    private boolean m3(String string) {
        return Patterns.WEB_URL.matcher(string).matches();
    }

    @Override
    public void f3() {
        super.f3();
        this.u0 = (f)((Object)this.j0().getSerializable("location"));
        if (this.f0() instanceof c) {
            this.t0 = (c)((Object)this.f0());
        }
    }

    @Override
    public Dialog g3() {
        a.a a8 = h.a((Context)this.f0());
        LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)this.f0()).inflate(2131558522, null);
        Object object = (EditText)linearLayout.findViewById(2131361868);
        this.w0 = object;
        object.requestFocus();
        this.v0 = (TextView)linearLayout.findViewById(2131362192);
        object = this.u0;
        if (object == f.T0) {
            object = ((f)((Object)object)).M(this.b());
        } else if (object == f.U0) {
            object = ((f)((Object)object)).M(this.b());
        } else {
            ax.u3.b.f();
            object = "";
        }
        object = a8.setView((View)linearLayout).setTitle((CharSequence)object).setPositiveButton(17039370, null).setNegativeButton(0x1040000, null).create();
        object.getWindow().setSoftInputMode(36);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final androidx.appcompat.app.a a;
            final U b;
            {
                this.b = u8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final a c;
                    {
                        this.c = a8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.b.n3();
                    }
                });
            }
        });
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    void n3() {
        if (this.f0() != null) {
            ((InputMethodManager)this.f0().getSystemService("input_method")).hideSoftInputFromInputMethod(this.w0.getWindowToken(), 0);
            String string = this.w0.getText().toString().trim();
            if (TextUtils.isEmpty((CharSequence)string)) {
                this.v0.setText(2131951942);
                return;
            }
            if (!this.m3(string)) {
                this.v0.setText(2131951942);
                return;
            }
            Object object = string;
            if (string.endsWith("/")) {
                object = string.substring(0, string.length() - 1);
            }
            if (!q.n(this.x0)) {
                this.x0 = object = new b(this, this.b(), (String)object);
                ((q)object).h(new Void[0]);
            }
        }
    }

    class b
    extends q<Void, Void, d> {
        Context h;
        String i;
        Button j;
        final U k;

        b(U u8, Context context, String string) {
            this.k = u8;
            super(q.e.f0);
            this.h = context;
            this.i = string;
            if (u8.Q2() != null) {
                this.j = ((androidx.appcompat.app.a)u8.Q2()).i(-1);
            }
        }

        @Override
        protected void r() {
            super.r();
            Button button = this.j;
            if (button != null) {
                button.setEnabled(false);
            }
        }

        protected d w(Void ... voidArray) {
            if (this.k.u0 == f.T0) {
                return D.X0(this.h, this.i, true);
            }
            if (this.k.u0 == f.U0) {
                return H.T0(this.i, true);
            }
            ax.u3.b.f();
            return d.d0;
        }

        protected void x(d d8) {
            if (this.k.f0() == null) {
                return;
            }
            Button button = this.j;
            if (button != null) {
                button.setEnabled(true);
            }
            if (d8 == d.q) {
                if (this.k.t0 != null) {
                    this.k.t0.c(this.k.u0, this.i);
                }
                this.k.O2();
                return;
            }
            if (d8 == d.c0) {
                this.k.v0.setText(2131951948);
                return;
            }
            if (d8 == d.e0) {
                this.k.v0.setText(2131951929);
                return;
            }
            this.k.v0.setText(2131951942);
        }
    }

    public static interface c {
        public void c(f var1, String var2);
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        public static final /* enum */ d e0;
        private static final d[] f0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = new d();
            e0 = new d();
            f0 = d.d();
        }

        private static /* synthetic */ d[] d() {
            return new d[]{q, c0, d0, e0};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])f0.clone();
        }
    }
}

