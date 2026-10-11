/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.u3.h;

public class u
extends I {
    private c t0;

    @Override
    public void H1() {
        super.H1();
        a a8 = (a)this.Q2();
        if (a8 != null && (a8 = a8.i(-1)) != null) {
            a8.requestFocus();
        }
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        this.Y2(false);
        Object object = h.a((Context)this.f0());
        ((a.a)object).p(2131952156);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558500, null, false);
        ((a.a)object).setView(view);
        view.findViewById(2131361980).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final u c;
            {
                this.c = u8;
            }

            @Override
            public void a(View view) {
                this.c.t0.a(true);
                this.c.O2();
            }
        });
        view.findViewById(2131361982).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final u c;
            {
                this.c = u8;
            }

            @Override
            public void a(View view) {
                this.c.t0.a(false);
                this.c.O2();
            }
        });
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(false);
        return object;
    }

    public void j3(c c8) {
        this.t0 = c8;
    }

    public static interface c {
        public void a(boolean var1);
    }
}

