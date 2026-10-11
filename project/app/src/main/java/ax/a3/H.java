/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.Ha.c;
import ax.a3.j;
import ax.a3.t;
import ax.u3.h;
import java.util.concurrent.atomic.AtomicBoolean;

public class H
extends j {
    private String t0;
    private CharSequence u0;
    private b v0;
    private boolean w0;

    public static H l3(String string, int n8) {
        H h8 = new H();
        Bundle bundle = new Bundle();
        bundle.putString("title", string);
        bundle.putInt("message", n8);
        h8.v2(bundle);
        return h8;
    }

    @Override
    public void H1() {
        a a8;
        super.H1();
        if (this.w0) {
            this.w0 = false;
            this.N2();
        }
        if ((a8 = (a)this.Q2()) != null) {
            a8.i(-1).requestFocus();
        }
    }

    @Override
    public void f3() {
        super.f3();
        String string = this.j0().getString("title");
        this.u0 = this.M0(this.j0().getInt("message", 2131951927));
        this.t0 = string;
    }

    @Override
    public Dialog g3() {
        Object object;
        this.Y2(false);
        Object object2 = h.a((Context)this.f0());
        ((a.a)object2).setTitle(this.t0);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558496, null, false);
        if (!TextUtils.isEmpty((CharSequence)this.u0)) {
            object = (TextView)view.findViewById(2131362192);
            object.setVisibility(0);
            object.setText(this.u0);
            ((a.a)object2).setView(view);
        }
        object = new t(this, new AtomicBoolean(false)){
            final AtomicBoolean b;
            final H c;
            {
                this.c = h8;
                this.b = atomicBoolean;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                if (this.b.get()) {
                    c.h().f().d("ONRESULT CALLED TWICE").h();
                    return;
                }
                this.b.set(true);
                if (n8 != -2) {
                    if (n8 != -1) {
                        return;
                    }
                    this.c.v0.a(true);
                    return;
                }
                this.c.v0.a(false);
            }
        };
        ((a.a)object2).setPositiveButton(2131952549, (DialogInterface.OnClickListener)object);
        ((a.a)object2).setNegativeButton(2131951810, (DialogInterface.OnClickListener)object);
        object2 = ((a.a)object2).create();
        object2.setCanceledOnTouchOutside(false);
        return object2;
    }

    @Override
    public CharSequence i3(Context context) {
        return null;
    }

    @Override
    public CharSequence j3(Context context) {
        if (this.u0 == null && this.j0() != null) {
            this.u0 = context.getString(this.j0().getInt("message", 2131951927));
        }
        return this.u0;
    }

    public void m3(b b8) {
        this.v0 = b8;
    }

    public void n3(boolean bl) {
        this.w0 = bl;
    }

    public static interface b {
        public void a(boolean var1);
    }
}

