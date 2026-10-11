/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.b3.j;
import ax.u3.d;
import ax.u3.h;
import ax.u3.q;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.IOException;

public class e
extends I {
    private String A0;
    private View B0;
    private b C0;
    private View t0;
    private TextView u0;
    private TextView v0;
    private TextView w0;
    private Context x0;
    private o y0;
    private n z0;

    private void m3(androidx.appcompat.app.a object) {
        if (this.b() == null) {
            return;
        }
        this.y0.n0();
        ((TextView)this.t0.findViewById(2131362304)).setText((CharSequence)this.z0.B());
        object = new View.OnLongClickListener(this){
            final e a;
            {
                this.a = e8;
            }

            public boolean onLongClick(View view) {
                view = (TextView)view;
                view.post(new Runnable(){
                    final View.OnLongClickListener c0;
                    final a d0;
                    final TextView q;
                    {
                        this.d0 = a8;
                        this.q = textView;
                        this.c0 = onLongClickListener;
                    }

                    @Override
                    public void run() {
                        this.q.setOnLongClickListener(null);
                        Selection.selectAll((Spannable)((Spannable)this.q.getText()));
                        this.q.performLongClick();
                        this.q.setOnLongClickListener(this.c0);
                    }
                });
                return true;
            }
        };
        this.u0.setOnLongClickListener((View.OnLongClickListener)object);
        this.v0.setOnLongClickListener((View.OnLongClickListener)object);
        this.w0.setOnLongClickListener((View.OnLongClickListener)object);
        this.C0 = object = new b(this);
        ((q)object).i(new Void[0]);
        this.y0.k0(false);
    }

    private void o3(d.a object) {
        if (object == null) {
            this.u0.setText(2131951927);
            this.v0.setText(2131951927);
            this.w0.setText(2131951927);
            return;
        }
        String string = ((d.a)object).a;
        if (string != null) {
            this.u0.setText((CharSequence)string);
        } else {
            this.u0.setText(2131951927);
        }
        string = ((d.a)object).b;
        if (string != null) {
            this.v0.setText((CharSequence)string);
        } else {
            this.v0.setText(2131951927);
        }
        object = ((d.a)object).c;
        if (object != null) {
            this.w0.setText((CharSequence)object);
            return;
        }
        this.w0.setText(2131951927);
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        this.x0 = this.f0().getApplicationContext();
        Object object = LayoutInflater.from((Context)this.f0()).inflate(2131558491, null);
        this.t0 = object;
        this.B0 = object.findViewById(2131362720);
        this.u0 = (TextView)this.t0.findViewById(2131362031);
        this.v0 = (TextView)this.t0.findViewById(2131362032);
        this.w0 = (TextView)this.t0.findViewById(2131362033);
        object = h.a((Context)this.f0());
        ((a.a)object).setView(this.t0).setTitle(this.A0).setPositiveButton(17039370, null).b(true);
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        this.m3((androidx.appcompat.app.a)object);
        return object;
    }

    public void n3(Context context, o o8, n n8) {
        this.y0 = o8;
        this.z0 = n8;
        this.A0 = context.getString(2131952046);
    }

    @Override
    public void s1() {
        super.s1();
        b b8 = this.C0;
        if (b8 != null) {
            b8.e();
        }
    }

    public class b
    extends q<Void, d.a, d.a> {
        final e h;

        b(e e8) {
            this.h = e8;
            super(q.e.f0);
        }

        @Override
        protected void r() {
            this.h.y0.n0();
            this.h.B0.setVisibility(0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected d.a w(Void ... object) {
            if (this.h.b() == null) return null;
            if (this.isCancelled()) {
                return null;
            }
            try {
                return d.a(this.h.y0.J(this.h.z0, 0L), this);
            }
            catch (j | IOException exception) {
                return null;
            }
        }

        protected void x(d.a a8) {
            this.h.y0.k0(false);
            this.h.B0.setVisibility(8);
        }

        protected void y(d.a a8) {
            this.h.y0.k0(false);
            this.h.B0.setVisibility(8);
            this.h.o3(a8);
        }
    }
}

