/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.U2.f;
import ax.a3.I;
import ax.c3.B;
import ax.c3.k;
import ax.c3.t;
import ax.c3.z;
import ax.u3.b;
import ax.u3.h;
import ax.u3.q;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.y;

public class a
extends I {
    private Context A0;
    private o B0;
    private k C0;
    private String D0;
    private boolean E0;
    private ax.U2.a F0;
    private c G0;
    private View t0;
    private View u0;
    private TextView v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private View z0;

    static /* synthetic */ ax.U2.a n3(a a8, ax.U2.a a9) {
        a8.F0 = a9;
        return a9;
    }

    private void s3(androidx.appcompat.app.a object) {
        block13: {
            block12: {
                block11: {
                    if (this.C0 != null) break block11;
                    if (this.f0() != null) {
                        Toast.makeText((Context)this.f0(), (int)2131951934, (int)1).show();
                        return;
                    }
                    break block12;
                }
                if (this.b() != null) break block13;
            }
            return;
        }
        this.B0.n0();
        String string = t.b(this.b(), this.C0.q());
        ((TextView)this.t0.findViewById(2131362267)).setText((CharSequence)string);
        this.y0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final a c;
            {
                this.c = a8;
            }

            @Override
            public void a(View view) {
                if (this.c.G0 != null) {
                    this.c.G0.a(this.c.C0);
                }
                this.c.O2();
            }
        });
        this.z0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final a c;
            {
                this.c = a8;
            }

            @Override
            public void a(View view) {
                this.c.O2();
            }
        });
        this.y0.requestFocus();
        this.y0.setEnabled(false);
        this.z0.setEnabled(false);
        int n8 = ax.u3.B.e(this.A0, 32);
        string = this.C0.Y(this.b());
        if (string instanceof BitmapDrawable) {
            if ((string = ((BitmapDrawable)string).getBitmap()) != null) {
                string = ThumbnailUtils.extractThumbnail((Bitmap)string, (int)n8, (int)n8);
                object.m((Drawable)new BitmapDrawable(this.b().getResources(), (Bitmap)string));
            }
        } else {
            object.m(this.C0.Y(this.b()));
        }
        new ax.r3.d(this.A0, this.B0).v(this.C0, (androidx.appcompat.app.a)object, n8);
        if (this.C0.isDirectory()) {
            this.v0.setText((CharSequence)this.C0.I(true));
        } else {
            this.C0.p();
            this.v0.setText((CharSequence)this.C0.I(true));
        }
        if (!this.C0.isDirectory() && B.H(this.C0) && (object = this.C0.G()) != null && object == z.s0) {
            this.t0.findViewById(2131362257).setVisibility(0);
            ((TextView)this.t0.findViewById(2131362258)).setText(2131951822);
        }
        this.B0.k0(false);
    }

    private void t3() {
        new d(this).i(new Void[0]);
    }

    @Override
    public void J1() {
        androidx.appcompat.app.a a8;
        super.J1();
        if (this.E0 && this.F0 == null && (a8 = (androidx.appcompat.app.a)this.Q2()) != null) {
            a8.i(-3).setVisibility(8);
        }
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        this.A0 = this.f0().getApplicationContext();
        Object object = LayoutInflater.from((Context)this.f0()).inflate(2131558488, null);
        this.t0 = object;
        this.u0 = object.findViewById(2131362400);
        this.v0 = (TextView)this.t0.findViewById(2131362302);
        this.w0 = (TextView)this.t0.findViewById(2131362266);
        this.y0 = (TextView)this.t0.findViewById(2131361972);
        this.z0 = this.t0.findViewById(2131361969);
        this.x0 = (TextView)this.t0.findViewById(2131362569);
        object = h.b((Context)this.f0());
        ((a.a)object).setView(this.t0).setTitle(this.D0).b(true);
        androidx.appcompat.app.a a8 = ((a.a)object).create();
        a8.setCanceledOnTouchOutside(true);
        a8.l(2131231472);
        this.s3(a8);
        object = this.C0;
        if (object != null && !object.isDirectory() && B.P(this.C0) && this.C0.G() == z.s0) {
            this.E0 = true;
            this.t3();
        }
        return a8;
    }

    public void u3(c c8) {
        this.G0 = c8;
    }

    public void v3(Context context, o o8, k k8) {
        this.B0 = o8;
        this.C0 = k8;
        this.D0 = k8.B();
    }

    public static interface c {
        public void a(k var1);
    }

    public class d
    extends q<Void, Void, ax.U2.a> {
        private f h;
        final a i;

        d(a a8) {
            this.i = a8;
            super(q.e.e0);
        }

        @Override
        protected void r() {
            super.r();
            this.i.u0.setVisibility(0);
        }

        protected ax.U2.a w(Void ... object) {
            if (!(this.i.C0 instanceof y)) {
                b.f();
                return null;
            }
            object = ax.U2.d.q(this.i.A0, (y)this.i.C0);
            if (object != null) {
                this.h = ax.U2.d.F(this.i.A0).x(object.c);
            }
            return object;
        }

        protected void x(ax.U2.a object) {
            if (this.i.b() == null) {
                return;
            }
            this.i.u0.setVisibility(8);
            a.n3(this.i, (ax.U2.a)object);
            if (this.i.F0 != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(((a)this.i).F0.c);
                ((StringBuilder)object).append("\n");
                ((StringBuilder)object).append(((a)this.i).F0.b);
                ((StringBuilder)object).append(" (");
                ((StringBuilder)object).append(((a)this.i).F0.d);
                ((StringBuilder)object).append(")");
                object = ((StringBuilder)object).toString();
                ((TextView)this.i.t0.findViewById(2131362259)).setText((CharSequence)object);
                ((TextView)this.i.t0.findViewById(2131361893)).setText((CharSequence)((a)this.i).F0.a);
                if (this.h != null) {
                    TextView textView = (TextView)this.i.t0.findViewById(2131362412);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.h.x());
                    ((StringBuilder)object).append(" (");
                    ((StringBuilder)object).append(this.h.y());
                    ((StringBuilder)object).append(")");
                    textView.setText((CharSequence)((StringBuilder)object).toString());
                    if (this.h.y() >= ((a)this.i).F0.d) {
                        this.i.x0.setVisibility(0);
                        if (this.h.y() > ((a)this.i).F0.d) {
                            this.i.x0.setText(2131952353);
                            this.i.y0.setEnabled(false);
                            this.i.z0.requestFocus();
                        } else {
                            this.i.x0.setText(2131952317);
                            this.i.y0.setEnabled(true);
                            this.i.y0.requestFocus();
                        }
                    } else {
                        this.i.x0.setVisibility(8);
                        this.i.y0.setEnabled(true);
                        this.i.y0.requestFocus();
                    }
                    this.i.y0.setText(2131952314);
                } else {
                    this.i.t0.findViewById(2131362411).setVisibility(8);
                    this.i.x0.setVisibility(8);
                    this.i.y0.setEnabled(true);
                    this.i.y0.requestFocus();
                }
            } else {
                this.i.y0.setEnabled(true);
                this.i.y0.requestFocus();
            }
            this.i.z0.setEnabled(true);
        }
    }
}

