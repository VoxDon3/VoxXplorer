/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.U2.f;
import ax.a3.I;
import ax.a3.t;
import ax.c3.B;
import ax.g3.c;
import ax.u3.h;

public class b
extends I {
    private View t0;
    private TextView u0;
    private Context v0;
    private f w0;
    private String x0;
    private e y0;

    private void j3(a object) {
        long l8;
        block18: {
            block17: {
                block16: {
                    if (this.w0 != null) break block16;
                    if (this.f0() != null) {
                        Toast.makeText((Context)this.f0(), (int)2131951934, (int)1).show();
                        return;
                    }
                    break block17;
                }
                if (this.b() != null) break block18;
            }
            return;
        }
        View view = this.t0.findViewById(2131361974);
        view.setOnClickListener((View.OnClickListener)new c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View view) {
                if (this.c.y0 != null) {
                    this.c.y0.c();
                }
                this.c.O2();
            }
        });
        view.requestFocus();
        this.t0.findViewById(2131361971).setOnClickListener((View.OnClickListener)new c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View view) {
                if (this.c.y0 != null) {
                    this.c.y0.b();
                }
                this.c.O2();
            }
        });
        View view2 = this.t0.findViewById(2131361979);
        view2.setOnClickListener((View.OnClickListener)new c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View view) {
                if (this.c.y0 != null) {
                    this.c.y0.a();
                }
                this.c.O2();
            }
        });
        PackageManager packageManager = this.f0().getPackageManager();
        try {
            if (packageManager.getLaunchIntentForPackage(this.w0.r()) != null) {
                view.setEnabled(true);
                view.setAlpha(1.0f);
            } else {
                view.setEnabled(false);
                view.setAlpha(0.3f);
            }
        }
        catch (Exception exception) {
            view.setEnabled(false);
            view.setAlpha(0.3f);
        }
        if (this.w0.B()) {
            if (TextUtils.isEmpty((CharSequence)this.w0.m())) {
                view2.setEnabled(false);
                view2.setAlpha(0.3f);
            } else {
                view2.setEnabled(true);
                view2.setAlpha(1.0f);
            }
        } else {
            view2.setEnabled(false);
            view2.setAlpha(0.3f);
        }
        int n8 = ax.u3.B.e(this.v0, 32);
        view = this.w0.l();
        if (view instanceof BitmapDrawable) {
            if ((view = ((BitmapDrawable)view).getBitmap()) != null) {
                view = ThumbnailUtils.extractThumbnail((Bitmap)view, (int)n8, (int)n8);
                ((a)object).m((Drawable)new BitmapDrawable(this.b().getResources(), (Bitmap)view));
            }
        } else {
            ((a)object).m((Drawable)view);
        }
        object = (l8 = this.w0.s()) < 0L ? "-" : B.i(this.b(), l8);
        this.u0.setText((CharSequence)object);
        ((TextView)this.t0.findViewById(2131362267)).setText((CharSequence)this.w0.k(this.b()));
        ((TextView)this.t0.findViewById(2131362409)).setText((CharSequence)this.w0.j(this.b()));
        ((TextView)this.t0.findViewById(2131363024)).setText((CharSequence)this.w0.x());
        ((TextView)this.t0.findViewById(2131361895)).setText((CharSequence)this.w0.r());
    }

    public static b k3(f f8, e e8) {
        b b8 = new b();
        b8.m3(e8);
        b8.l3(f8);
        return b8;
    }

    @Override
    public void J1() {
        super.J1();
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        this.v0 = this.f0().getApplicationContext();
        Object object = LayoutInflater.from((Context)this.f0()).inflate(2131558489, null);
        this.t0 = object;
        this.u0 = (TextView)object.findViewById(2131362302);
        object = h.b((Context)this.f0());
        ((a.a)object).setView(this.t0).setTitle(this.x0).setPositiveButton(17039370, new t(this){
            final b b;
            {
                this.b = b8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
            }
        }).b(true);
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        ((a)object).l(2131231472);
        this.j3((a)object);
        return object;
    }

    public void l3(f f8) {
        this.w0 = f8;
        this.x0 = f8.q();
    }

    public void m3(e e8) {
        this.y0 = e8;
    }

    public static interface e {
        public void a();

        public void b();

        public void c();
    }
}

