/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import ax.W2.j;
import ax.W2.v;
import java.util.List;

public class s
extends ArrayAdapter<j> {
    private Context a;

    public s(Context context, List<j> list) {
        super(context, 0, list);
        this.a = context;
    }

    public View getView(int n8, View view, ViewGroup object) {
        j j8 = (j)this.getItem(n8);
        if (view == null) {
            view = LayoutInflater.from((Context)this.a).inflate(2131558539, (ViewGroup)object, false);
            object = new a(this, view);
            view.setTag(object);
        } else {
            object = (a)view.getTag();
        }
        ((a)object).a(j8, n8);
        return view;
    }

    public class a {
        private TextView a;
        private TextView b;
        private TextView c;
        private TextView d;
        private TextView e;
        private ProgressBar f;
        private j g;
        private int h;
        private int i;
        final s j;

        public a(s s8, View view) {
            this.j = s8;
            this.b(view);
        }

        private void b(View view) {
            this.a = (TextView)view.findViewById(2131362284);
            this.b = (TextView)view.findViewById(2131362280);
            this.c = (TextView)view.findViewById(2131362283);
            this.d = (TextView)view.findViewById(2131362282);
            this.e = (TextView)view.findViewById(2131362281);
            this.f = (ProgressBar)view.findViewById(2131362278);
        }

        public void a(j j8, int n8) {
            if (j8 == null) {
                return;
            }
            v v8 = j8.w();
            j j9 = this.g;
            if (j9 != null && j9 == j8) {
                if (this.h != j8.B()) {
                    this.h = j8.B();
                    this.a.setText((CharSequence)j8.C());
                }
            } else {
                this.g = j8;
                this.h = j8.B();
                this.a.setText((CharSequence)j8.C());
                this.f.setMax(v8.u());
            }
            if (!v8.R() && !v8.Q()) {
                this.b.setText((CharSequence)v8.v());
                this.c.setText((CharSequence)v8.A(this.j.getContext()));
                this.d.setText((CharSequence)v8.w());
                this.e.setText((CharSequence)this.j.a.getString(2131952608, new Object[]{v8.y()}));
                this.f.setProgress(v8.t());
                return;
            }
            n8 = v8.q();
            if (this.i != n8) {
                this.i = n8;
                this.f.setMax(n8);
            }
            this.f.setProgress(v8.o());
            this.b.setText(v8.i());
            this.c.setText((CharSequence)"");
            this.d.setText((CharSequence)"99%");
            this.e.setText((CharSequence)this.j.getContext().getString(2131952513, new Object[]{v8.p()}));
        }
    }
}

