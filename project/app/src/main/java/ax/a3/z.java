/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.text.Selection;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.U2.a;
import ax.Z2.j;
import ax.a3.I;
import ax.a3.e;
import ax.a3.t;
import ax.c3.B;
import ax.c3.K;
import ax.c3.k;
import ax.c3.u;
import ax.r3.d;
import ax.u3.b;
import ax.u3.h;
import ax.u3.q;
import com.alphainventor.filemanager.file.f;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.p;
import com.alphainventor.filemanager.file.y;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class z
extends I {
    private boolean A0;
    private String B0;
    private boolean C0;
    private a D0;
    private View t0;
    private TextView u0;
    private TextView v0;
    private Context w0;
    private o x0;
    private List<n> y0;
    private n z0;

    static /* synthetic */ a j3(z z8, a a8) {
        z8.D0 = a8;
        return a8;
    }

    private void q3(androidx.appcompat.app.a a8) {
        block7: {
            block6: {
                block5: {
                    if (this.y0 != null) break block5;
                    if (this.f0() != null) {
                        Toast.makeText((Context)this.f0(), (int)2131951934, (int)1).show();
                        return;
                    }
                    break block6;
                }
                if (this.b() != null) break block7;
            }
            return;
        }
        this.x0.n0();
        this.t0.findViewById(2131363011).setVisibility(8);
        this.t0.findViewById(2131362096).setVisibility(8);
        this.t0.findViewById(2131362687).setVisibility(8);
        this.t0.findViewById(2131362367).setVisibility(8);
        this.t0.findViewById(2131362679).setVisibility(8);
        this.t0.findViewById(2131362060).setVisibility(0);
        new com.alphainventor.filemanager.file.f(f.c.c0, this.x0, this.y0, false, new f.b(this){
            final z a;
            {
                this.a = z8;
            }

            @Override
            public void a(int n8, int n9, long l8, Map<String, f.a> map) {
            }

            @Override
            public void b(int n8, int n9, long l8) {
                if (this.a.Q2() != null && this.a.b() != null && this.a.X0()) {
                    String string = this.a.N0(2131952048, n8, n9);
                    this.a.v0.setText((CharSequence)string);
                    string = this.a.u0;
                    z z8 = this.a;
                    string.setText((CharSequence)z8.N0(2131952055, B.i(z8.b(), l8), NumberFormat.getInstance().format(l8)));
                }
            }
        }).i(new Void[0]);
        this.x0.k0(false);
    }

    private void r3(androidx.appcompat.app.a arrayList) {
        block29: {
            block28: {
                block27: {
                    if (this.y0 != null) break block27;
                    if (this.f0() != null) {
                        Toast.makeText((Context)this.f0(), (int)2131951934, (int)1).show();
                        return;
                    }
                    break block28;
                }
                if (this.b() != null) break block29;
            }
            return;
        }
        this.x0.n0();
        ((TextView)this.t0.findViewById(2131362303)).setText(this.v3());
        Object object = ax.c3.t.b(this.b(), this.z0.q());
        ((TextView)this.t0.findViewById(2131362267)).setText((CharSequence)object);
        if (this.z0.R() == K.h) {
            ((TextView)this.t0.findViewById(2131362276)).setText((CharSequence)this.u3());
        } else {
            this.t0.findViewById(2131362687).setVisibility(8);
        }
        if (this.z0.h()) {
            this.t0.findViewById(2131362367).setVisibility(0);
            ((TextView)this.t0.findViewById(2131362271)).setText(this.s3());
        } else {
            this.t0.findViewById(2131362367).setVisibility(8);
        }
        ((TextView)this.t0.findViewById(2131362275)).setText((CharSequence)this.t3());
        ((TextView)this.t0.findViewById(2131362275)).setOnLongClickListener(new View.OnLongClickListener(this){
            final z a;
            {
                this.a = z8;
            }

            public boolean onLongClick(View view) {
                view = (TextView)view;
                view.post(new Runnable(){
                    final View.OnLongClickListener c0;
                    final c d0;
                    final TextView q;
                    {
                        this.d0 = c8;
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
        });
        int n8 = ax.u3.B.e(this.w0, 32);
        object = this.z0.Y(this.b());
        if (object instanceof BitmapDrawable) {
            if ((object = ((BitmapDrawable)object).getBitmap()) != null) {
                object = ThumbnailUtils.extractThumbnail((Bitmap)object, (int)n8, (int)n8);
                ((androidx.appcompat.app.a)((Object)arrayList)).m((Drawable)new BitmapDrawable(this.b().getResources(), (Bitmap)object));
            }
        } else {
            ((androidx.appcompat.app.a)((Object)arrayList)).m((Drawable)object);
        }
        new d(this.w0, this.x0).v(this.z0, (androidx.appcompat.app.a)((Object)arrayList), n8);
        if (this.z0.isDirectory()) {
            this.u0.setText((CharSequence)"");
        } else {
            long l8 = this.z0.p();
            if (l8 == 0L) {
                this.u0.setText((CharSequence)this.z0.I(true));
            } else {
                this.u0.setText((CharSequence)this.N0(2131952055, this.z0.I(true), NumberFormat.getInstance().format(l8)));
            }
        }
        if (!this.z0.isDirectory() && B.H(this.z0)) {
            object = this.z0;
            arrayList = (k)object;
            if ((object = ((n)object).G()) != null) {
                if (object == ax.c3.z.f0) {
                    this.t0.findViewById(2131362257).setVisibility(0);
                    ((TextView)this.t0.findViewById(2131362258)).setText(2131951854);
                    new g(this, (k)((Object)arrayList)).i(new Void[0]);
                } else if (object == ax.c3.z.e0) {
                    this.t0.findViewById(2131362257).setVisibility(0);
                    ((TextView)this.t0.findViewById(2131362258)).setText(2131951854);
                    this.t0.findViewById(2131362260).setVisibility(0);
                    ((TextView)this.t0.findViewById(2131362261)).setText(2131951836);
                    new g(this, (k)((Object)arrayList)).i(new Void[0]);
                } else if (object == ax.c3.z.c0) {
                    this.t0.findViewById(2131362257).setVisibility(0);
                    ((TextView)this.t0.findViewById(2131362258)).setText(2131951836);
                    new g(this, (k)((Object)arrayList)).i(new Void[0]);
                } else if (object == ax.c3.z.s0) {
                    this.t0.findViewById(2131362257).setVisibility(0);
                    ((TextView)this.t0.findViewById(2131362258)).setText(2131951822);
                }
            }
        }
        if (!this.z0.isDirectory()) {
            this.t0.findViewById(2131362030).setVisibility(0);
            this.t0.findViewById(2131361970).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                final z c;
                {
                    this.c = z8;
                }

                @Override
                public void a(View view) {
                    this.c.y3();
                }
            });
        }
        if (this.z0.isDirectory()) {
            this.t0.findViewById(2131362060).setVisibility(0);
            arrayList = new ArrayList<n>();
            arrayList.add(this.z0);
            new com.alphainventor.filemanager.file.f(f.c.c0, this.x0, arrayList, false, new f.b(this){
                final z a;
                {
                    this.a = z8;
                }

                @Override
                public void a(int n8, int n9, long l8, Map<String, f.a> map) {
                }

                @Override
                public void b(int n8, int n9, long l8) {
                    if (this.a.Q2() != null && this.a.b() != null && this.a.X0()) {
                        Object object = this.a.N0(2131952048, n8, n9);
                        this.a.v0.setText((CharSequence)object);
                        TextView textView = this.a.u0;
                        object = this.a;
                        textView.setText((CharSequence)((Fragment)object).N0(2131952055, B.i(((Fragment)object).b(), l8), NumberFormat.getInstance().format(l8)));
                    }
                }
            }).i(new Void[0]);
        }
        this.x0.k0(false);
    }

    private int s3() {
        if (this.z0.h()) {
            return 2131952696;
        }
        return 2131952447;
    }

    private String t3() {
        return this.z0.E();
    }

    private String u3() {
        String string;
        p p8;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.z0.R() == K.h && (p8 = j.F().q() ? com.alphainventor.filemanager.file.z.Y().o(this.z0.E()) : com.alphainventor.filemanager.file.z.X().o(this.z0.E())) != null && p8.a != null && p8.b != null && (string = p8.c) != null) {
            stringBuilder.append(string);
            stringBuilder.append("\n");
            stringBuilder.append(p8.a);
            stringBuilder.append(" ");
            stringBuilder.append(p8.b);
        }
        if (stringBuilder.length() == 0) {
            if (this.z0.d()) {
                stringBuilder.append(this.w0.getString(2131952493));
                stringBuilder.append(" ");
            }
            if (this.z0.j()) {
                stringBuilder.append(this.w0.getString(2131952495));
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private int v3() {
        if (this.z0.isDirectory()) {
            return 2131952060;
        }
        return 2131952059;
    }

    private void w3() {
        new f(this).i(new Void[0]);
    }

    private void y3() {
        if (this.z0 == null) {
            b.f();
            return;
        }
        e e8 = new e();
        e8.n3(this.w0, this.x0, this.z0);
        ax.u3.B.d0(this.s0(), e8, "checksum", true);
    }

    @Override
    public void J1() {
        androidx.appcompat.app.a a8;
        super.J1();
        if (this.C0 && this.D0 == null && (a8 = (androidx.appcompat.app.a)this.Q2()) != null) {
            a8.i(-3).setVisibility(8);
        }
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        this.w0 = this.f0().getApplicationContext();
        Object object = LayoutInflater.from((Context)this.f0()).inflate(2131558505, null);
        this.t0 = object;
        this.u0 = (TextView)object.findViewById(2131362302);
        this.v0 = (TextView)this.t0.findViewById(2131362266);
        object = h.b((Context)this.f0());
        ((a.a)object).setView(this.t0).setTitle(this.B0).setPositiveButton(17039370, null).b(true);
        n n8 = this.z0;
        if (n8 != null && !n8.isDirectory() && B.P(this.z0) && this.z0.G() == ax.c3.z.s0) {
            this.C0 = true;
            this.w3();
            ((a.a)object).i(2131952308, new t(this){
                final z b;
                {
                    this.b = z8;
                }

                @Override
                public void a(DialogInterface dialogInterface, int n8) {
                    if (this.b.D0 != null) {
                        try {
                            dialogInterface = u.m(((z)this.b).D0.c);
                            u.p0(this.b, (Intent)dialogInterface);
                            return;
                        }
                        catch (ActivityNotFoundException activityNotFoundException) {
                            Toast.makeText((Context)this.b.w0, (int)2131952448, (int)1).show();
                        }
                    }
                }
            });
        }
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        if (this.A0) {
            ((androidx.appcompat.app.a)object).l(2131231472);
            this.r3((androidx.appcompat.app.a)object);
            return object;
        }
        this.q3((androidx.appcompat.app.a)object);
        return object;
    }

    public void x3(Context object, o o8, List<n> list) {
        this.x0 = o8;
        this.y0 = list;
        boolean bl = list.size() == 1;
        this.A0 = bl;
        if (bl) {
            object = this.y0.get(0);
            this.z0 = object;
            this.B0 = ((n)object).B();
            return;
        }
        this.B0 = object.getResources().getQuantityString(2131820559, list.size(), new Object[]{list.size()});
    }

    public class f
    extends q<Void, Void, a> {
        final z h;

        f(z z8) {
            this.h = z8;
            super(q.e.e0);
        }

        protected a w(Void ... voidArray) {
            if (!(this.h.z0 instanceof y)) {
                b.f();
                return null;
            }
            return ax.U2.d.q(this.h.w0, (y)this.h.z0);
        }

        protected void x(a object) {
            if (this.h.b() != null) {
                z.j3(this.h, (a)object);
                if (this.h.D0 != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(((z)this.h).D0.a);
                    ((StringBuilder)object).append("\n");
                    ((StringBuilder)object).append(((z)this.h).D0.b);
                    object = ((StringBuilder)object).toString();
                    ((TextView)this.h.t0.findViewById(2131362259)).setText((CharSequence)object);
                    if (this.h.Q2() != null && (object = ((androidx.appcompat.app.a)this.h.Q2()).i(-3)) != null) {
                        object.setVisibility(0);
                    }
                }
            }
        }
    }

    public class g
    extends q<Void, Void, a> {
        private k h;
        private String i;
        private String j;
        final z k;

        g(z z8, k k8) {
            this.k = z8;
            super(q.e.e0);
            this.h = k8;
        }

        protected a w(Void ... object) {
            object = this.h.G();
            if (object == ax.c3.z.f0) {
                this.i = this.h.f0();
            } else if (object == ax.c3.z.e0) {
                this.i = this.h.h0();
                this.j = this.h.g0();
            } else if (object == ax.c3.z.c0) {
                this.i = this.h.g0();
            }
            return null;
        }

        protected void x(a a8) {
            if (this.i != null) {
                ((TextView)this.k.t0.findViewById(2131362259)).setText((CharSequence)this.i);
            }
            if (this.j != null) {
                ((TextView)this.k.t0.findViewById(2131362262)).setText((CharSequence)this.j);
            }
        }
    }
}

