/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.x;
import ax.Q2.d;
import ax.Q2.e;
import ax.Q2.f;
import ax.c3.B;
import ax.c3.K;
import ax.g3.c;
import com.voxdon.xplorer.widget.PieProgress;

public class k {
    Context a;
    View b;
    K c;
    ax.Z2.d d;
    View e;
    PieProgress f;
    TextView g;
    View h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    Button m;
    boolean n;
    int o;
    int p;
    b q;

    public k(View view, ax.Z2.d d8, K k8, b b8) {
        this.b = view;
        this.a = view.getContext();
        this.d = d8;
        this.c = k8;
        this.q = b8;
        this.b();
        this.a();
    }

    private void b() {
        this.e = this.b.findViewById(2131362348);
        this.f = (PieProgress)this.b.findViewById(2131362695);
        ((TextView)this.b.findViewById(2131362464)).setText((CharSequence)this.c.f(this.a));
        this.g = (TextView)this.b.findViewById(2131362465);
        this.h = this.b.findViewById(2131362466);
        this.i = (TextView)this.b.findViewById(2131362462);
        this.j = (TextView)this.b.findViewById(2131362837);
        this.k = (TextView)this.b.findViewById(2131362833);
        this.l = (TextView)this.b.findViewById(2131362842);
        this.m = (Button)this.b.findViewById(2131361987);
        this.o = ax.Q.b.c(this.a, 2131099834);
        this.p = ax.Q.b.c(this.a, 2131099833);
        this.m.setText(2131952113);
        this.m.setOnClickListener((View.OnClickListener)new c(this){
            final k c;
            {
                this.c = k8;
            }

            @Override
            public void a(View object) {
                k k8 = this.c;
                object = k8.q;
                if (object != null) {
                    object.x(k8.c);
                }
            }
        });
    }

    public void a() {
        long l8;
        f f8;
        Object object;
        boolean bl = this.d.t(this.c);
        boolean bl2 = false;
        if (bl) {
            float f9 = this.d.r(this.c);
            this.f.setProgressPercent((int)f9);
            try {
                this.g.setText((CharSequence)ax.u3.B.Q(f9));
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                object = ax.u3.B.Q(f9);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Emoji error:");
                stringBuilder.append((String)object);
                stringBuilder.append(":");
                stringBuilder.append(((String)object).length());
                ax.Q2.d.c("emoji2settext", new Exception(stringBuilder.toString(), indexOutOfBoundsException));
                f8 = this.g;
                if (f8 instanceof x) {
                    ((x)((Object)f8)).setEmojiCompatEnabled(false);
                }
                this.g.setText((CharSequence)ax.u3.B.R(f9));
            }
            this.h.setVisibility(0);
            this.i.setText((CharSequence)this.d.v(this.c, true));
            if (f9 >= (float)ax.Q2.e.l(this.a)) {
                bl2 = true;
            }
            this.n = bl2;
        } else {
            this.f.setProgressPercent(0);
            this.g.setText((CharSequence)"");
            this.h.setVisibility(4);
            this.i.setText((CharSequence)"");
            this.n = false;
        }
        if (this.n) {
            this.g.setTextColor(this.o);
        } else {
            this.g.setTextColor(this.p);
        }
        object = this.d;
        f8 = ax.Q2.f.z0;
        if (((ax.Z2.d)object).s(f8)) {
            l8 = this.d.l(f8, this.c.d());
            this.j.setText((CharSequence)B.k(this.a, l8));
        } else {
            this.j.setText((CharSequence)"");
        }
        object = this.d;
        f8 = ax.Q2.f.A0;
        if (((ax.Z2.d)object).s(f8)) {
            l8 = this.d.l(f8, this.c.d());
            this.k.setText((CharSequence)B.k(this.a, l8));
        } else {
            this.k.setText((CharSequence)"");
        }
        object = this.d;
        f8 = ax.Q2.f.B0;
        if (((ax.Z2.d)object).s(f8)) {
            l8 = this.d.l(f8, this.c.d());
            this.l.setText((CharSequence)B.k(this.a, l8));
        } else {
            this.l.setText((CharSequence)"");
        }
    }

    public void c(int n8) {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.width = n8 = ax.u3.B.e(this.a, n8);
        layoutParams.height = n8;
        this.e.setLayoutParams(layoutParams);
    }

    public static interface b {
        public void x(K var1);
    }
}

