/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.W2.h;
import ax.X2.Q;
import ax.a3.I;
import ax.a3.p;
import ax.a3.t;
import ax.b3.c;
import ax.b3.e;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.x;
import ax.d3.E;
import ax.d3.n;
import ax.u3.b;
import ax.u3.h;
import ax.u3.q;
import com.alphainventor.filemanager.file.L;
import com.alphainventor.filemanager.file.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class f
extends I
implements AdapterView.OnItemClickListener {
    private TextView A0;
    private ProgressBar B0;
    private j C0;
    private l D0;
    private k E0;
    private List<com.alphainventor.filemanager.file.n> F0;
    private i G0;
    private m H0;
    private String I0;
    private com.alphainventor.filemanager.file.n J0;
    private o K0;
    private K L0;
    private int M0;
    private int N0;
    private int O0;
    private K P0;
    private int t0;
    private boolean u0;
    private View v0;
    private ListView w0;
    private ImageButton x0;
    private ImageButton y0;
    private TextView z0;

    private boolean D3() {
        return this.t0 == 1;
    }

    private void E3(String object) {
        if (object != null) {
            i i8 = this.G0;
            if (i8 != null && !i8.isCancelled()) {
                this.G0.e();
            }
            if (this.K0 != null) {
                this.I0 = object;
                this.W3(null);
                this.I3(false);
                this.G0 = object = new i(this, this.K0, (String)object);
                ((q)object).h(new Void[0]);
                return;
            }
            ax.Ha.c.h().f().b("CHOOSE FILE CD NULL").j().h();
        }
    }

    public static f F3(E e8, K k8) {
        f f8 = new f();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 1);
        if (k8 != null) {
            bundle.putSerializable("location", (Serializable)((Object)k8.d()));
            bundle.putSerializable("key", (Serializable)Integer.valueOf(k8.b()));
        }
        f8.v2(bundle);
        f8.D2(e8, 0);
        return f8;
    }

    public static f G3(boolean bl) {
        f f8 = new f();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 2);
        bundle.putBoolean("has_private_key", bl);
        f8.v2(bundle);
        return f8;
    }

    private void H3() {
        if (this.K0 == null) {
            return;
        }
        if (this.J0 == null) {
            ax.Ha.b b8 = ax.Ha.c.h().f().b("CREATE NEW FOLDER IN CHOOSEFILE");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PATH : ");
            stringBuilder.append(this.I0);
            b8.g(stringBuilder.toString()).h();
            return;
        }
        ax.W2.m m8 = ax.W2.m.n();
        m8.k(this.K0, this.J0.E(), true, new h.a(this){
            final f a;
            {
                this.a = f8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (this.a.b() == null) {
                    return;
                }
                this.a.N3();
                Toast.makeText((Context)this.a.b(), (CharSequence)string, (int)1).show();
            }

            @Override
            public void b() {
            }
        });
        this.S3(m8, true);
    }

    private void I3(boolean bl) {
        this.y0.setEnabled(bl);
        if (bl) {
            this.y0.setAlpha(1.0f);
            return;
        }
        this.y0.setAlpha(0.1f);
    }

    private List<K> J3() {
        Object object;
        ArrayList<K> arrayList = new ArrayList<K>();
        arrayList.add(K.e);
        ax.Z2.j.F().K0();
        if (ax.Z2.j.F().t0()) {
            arrayList.add(K.f);
        }
        if (this.D3() && Q.S1() && (object = ax.Z2.j.F().A()) != null) {
            arrayList.addAll((Collection<K>)object);
        }
        arrayList.add(K.i);
        object = this.P0;
        if (object != null && object != K.h && !arrayList.contains(object)) {
            if (ax.Q2.f.j0(this.P0.d())) {
                arrayList.add(this.P0);
                return arrayList;
            }
            if (this.D3() && ax.Q2.f.e0(this.P0.d())) {
                arrayList.add(this.P0);
            }
        }
        return arrayList;
    }

    private void K3() {
        if (this.J0 != null && this.L0.e() != null && !this.L0.e().equals(this.J0.E())) {
            if ("/".equals(this.J0.E())) {
                return;
            }
            this.E3(this.J0.T());
            return;
        }
        this.V3(K.a(ax.Q2.f.n0, 0));
        this.W3(null);
    }

    private void L3() {
        this.B0.setVisibility(8);
    }

    private boolean M3() {
        return this.L0 == K.a(ax.Q2.f.n0, 0);
    }

    private void N3() {
        K k8;
        if (this.J0 != null && (k8 = this.L0) != null && k8.d() != ax.Q2.f.n0) {
            this.E3(this.J0.E());
        }
    }

    private void O3(o object, com.alphainventor.filemanager.file.n n8) {
        if (!n8.isDirectory()) {
            return;
        }
        m m8 = this.H0;
        if (m8 != null && !m8.isCancelled()) {
            this.H0.e();
        }
        this.W3(null);
        this.T3();
        this.I3(false);
        this.H0 = object = new m(this, (o)object, n8);
        ((q)object).h(new Void[0]);
    }

    private void Q3(int n8) {
        if (this.Q2() == null) {
            return;
        }
        this.Q2().setTitle(n8);
    }

    private void R3(String string) {
        if (this.Q2() == null) {
            return;
        }
        this.Q2().setTitle((CharSequence)string);
    }

    private void T3() {
        this.B0.setVisibility(0);
    }

    private void U3(boolean bl) {
        if (bl) {
            this.w0.setVisibility(8);
            this.A0.setVisibility(0);
            return;
        }
        this.A0.setVisibility(8);
        this.w0.setVisibility(0);
    }

    private void V3(K object) {
        this.L0 = object;
        if (((K)object).d() == ax.Q2.f.n0) {
            this.K0 = null;
            this.J0 = null;
            this.w0.setAdapter((ListAdapter)this.D0);
            this.v0.setVisibility(8);
            this.z0.setText((CharSequence)"");
            this.F0.clear();
            this.Q3(this.M0);
            this.U3(false);
            return;
        }
        this.K0 = object = x.e(this.L0);
        if (!((o)object).a()) {
            this.K0.h(null);
        }
        this.w0.setAdapter((ListAdapter)this.E0);
        this.v0.setVisibility(0);
    }

    private void W3(com.alphainventor.filemanager.file.n n8) {
        Button button;
        if (this.Q2() == null || (button = ((a)this.Q2()).i(-1)) == null) {
            return;
        }
        if (n8 == null) {
            button.setEnabled(false);
            return;
        }
        if (n8.j()) {
            button.setEnabled(true);
            return;
        }
        button.setEnabled(false);
    }

    static /* synthetic */ com.alphainventor.filemanager.file.n j3(f f8, com.alphainventor.filemanager.file.n n8) {
        f8.J0 = n8;
        return n8;
    }

    static /* synthetic */ String m3(f f8, String string) {
        f8.I0 = string;
        return string;
    }

    @Override
    public void J1() {
        super.J1();
        if (this.Q2() != null) {
            this.V3(this.L0);
            this.W3(null);
        }
    }

    public void P3(j j8) {
        this.C0 = j8;
    }

    protected void S3(ax.W2.m m8, boolean bl) {
        if (!this.X0() || this.s0() == null || !(this.P0() instanceof n)) {
            return;
        }
        n n8 = (n)this.P0();
        n8.A(p.l3(bl, new p.d(){
            final ax.W2.m a;
            final n b;
            final f c;
            {
                this.c = f8;
                this.a = m8;
                this.b = n8;
            }

            @Override
            public ax.a3.l a(String object) {
                b.c(TextUtils.isEmpty((CharSequence)object) ^ true);
                if (this.c.F0 != null) {
                    String string = d0.Q(this.a.m(), object);
                    Iterator iterator = this.c.F0.iterator();
                    while (iterator.hasNext()) {
                        if (!string.equals(((com.alphainventor.filemanager.file.n)iterator.next()).E())) continue;
                        return ax.a3.l.c0;
                    }
                }
                this.a.o((String)object);
                try {
                    this.b.l(this.a, false);
                    object = ax.a3.l.q;
                    return object;
                }
                catch (c c8) {
                    return ax.a3.l.d0;
                }
            }
        }), "createFileName", true);
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        a.a a8 = h.a((Context)this.f0());
        RelativeLayout relativeLayout = (RelativeLayout)LayoutInflater.from((Context)this.f0()).inflate(2131558493, null);
        this.v0 = relativeLayout.findViewById(2131362127);
        this.w0 = (ListView)relativeLayout.findViewById(2131362125);
        this.x0 = (ImageButton)relativeLayout.findViewById(2131362124);
        this.y0 = (ImageButton)relativeLayout.findViewById(2131362123);
        this.z0 = (TextView)relativeLayout.findViewById(2131362129);
        this.A0 = (TextView)relativeLayout.findViewById(2131362130);
        this.B0 = (ProgressBar)relativeLayout.findViewById(2131362126);
        this.L0 = K.a(ax.Q2.f.n0, 0);
        int n8 = this.t0;
        if (n8 == 1) {
            this.M0 = 2131951885;
            this.N0 = 2131951811;
            this.O0 = 0;
        } else if (n8 == 2) {
            this.M0 = 2131951886;
            this.N0 = 0;
            this.O0 = this.u0 ? 2131952248 : 0;
            this.y0.setVisibility(8);
        }
        this.F0 = new ArrayList<com.alphainventor.filemanager.file.n>();
        this.E0 = new k(this, (Context)this.f0(), this.F0);
        this.w0.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        this.v0.setVisibility(8);
        this.D0 = new l(this, (Context)this.f0(), this.J3());
        n8 = this.N0;
        if (n8 != 0) {
            a8.setPositiveButton(n8, new t(this){
                final f b;
                {
                    this.b = f8;
                }

                @Override
                public void a(DialogInterface dialogInterface, int n8) {
                    if (this.b.J0 == null) {
                        return;
                    }
                    this.b.C0.c(this.b.K0, this.b.J0);
                    this.b.O2();
                }
            });
        }
        if ((n8 = this.O0) != 0) {
            a8.i(n8, new t(this){
                final f b;
                {
                    this.b = f8;
                }

                @Override
                public void a(DialogInterface dialogInterface, int n8) {
                    this.b.C0.b();
                    this.b.O2();
                }
            });
        }
        this.x0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final f c;
            {
                this.c = f8;
            }

            @Override
            public void a(View view) {
                this.c.K3();
            }
        });
        this.y0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final f c;
            {
                this.c = f8;
            }

            @Override
            public void a(View view) {
                this.c.H3();
            }
        });
        a8.setNegativeButton(0x1040000, null);
        a8.j(new DialogInterface.OnCancelListener(this){
            final f a;
            {
                this.a = f8;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.C0.a();
            }
        });
        a8.k(new DialogInterface.OnKeyListener(this){
            final f a;
            {
                this.a = f8;
            }

            public boolean onKey(DialogInterface dialogInterface, int n8, KeyEvent keyEvent) {
                if (n8 == 4 && keyEvent.getAction() == 0 && !this.a.M3()) {
                    this.a.K3();
                    return true;
                }
                return false;
            }
        });
        return a8.setView((View)relativeLayout).p(this.M0).create();
    }

    @Override
    public void k1(Context object) {
        super.k1((Context)object);
        Bundle bundle = this.j0();
        if (bundle != null) {
            int n8;
            this.t0 = n8 = bundle.getInt("dialog_type", 0);
            if (n8 == 2) {
                this.u0 = bundle.getBoolean("has_private_key");
            }
            if ((object = (ax.Q2.f)((Object)bundle.getSerializable("location"))) != null) {
                this.P0 = K.a((ax.Q2.f)((Object)object), bundle.getInt("key"));
            }
        }
    }

    public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
        if (this.L0.d() == ax.Q2.f.n0) {
            object = (K)this.D0.getItem(n8);
            this.V3((K)object);
            this.E3(((K)object).e());
            return;
        }
        object = (com.alphainventor.filemanager.file.n)this.E0.getItem(n8);
        if (object.isDirectory()) {
            this.O3(this.K0, (com.alphainventor.filemanager.file.n)object);
            return;
        }
        if (this.t0 == 2) {
            if (L.G0(this.K0, (com.alphainventor.filemanager.file.n)object)) {
                this.C0.c(this.K0, (com.alphainventor.filemanager.file.n)object);
                this.O2();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(this.M0(2131951943));
            ((StringBuilder)object).append("\n\n(e.g. ssh-keygen -t rsa -m PEM)");
            object = ((StringBuilder)object).toString();
            Toast.makeText((Context)this.b(), (CharSequence)object, (int)0).show();
        }
    }

    @Override
    public void s1() {
        q q8 = this.H0;
        if (q8 != null && !q8.isCancelled()) {
            this.H0.e();
        }
        if ((q8 = this.G0) != null && !q8.isCancelled()) {
            this.G0.e();
        }
        super.s1();
    }

    private class i
    extends q<Void, Void, com.alphainventor.filemanager.file.n> {
        private String h;
        o i;
        final f j;

        public i(f f8, o o8, String string) {
            this.j = f8;
            super(q.e.d0);
            this.i = o8;
            this.h = string;
        }

        @Override
        protected void r() {
            super.r();
            this.i.n0();
        }

        protected com.alphainventor.filemanager.file.n w(Void ... object) {
            block5: {
                com.alphainventor.filemanager.file.n n8;
                try {
                    n8 = this.i.z(this.h);
                    object = n8;
                }
                catch (ax.b3.j j8) {
                    return null;
                }
                if (this.i.S() != ax.Q2.f.q0) break block5;
                object = n8;
                if (n8.n()) break block5;
                object = n8;
                if (!d0.E(n8)) break block5;
                this.i.k(n8, true);
                object = this.i.z(this.h);
            }
            return object;
        }

        protected void x(com.alphainventor.filemanager.file.n n8) {
            this.i.k0(true);
        }

        protected void y(com.alphainventor.filemanager.file.n n8) {
            if (n8 != null) {
                f.j3(this.j, n8);
                this.j.O3(this.i, n8);
            } else if (this.j.J0 == null) {
                this.j.K3();
            } else {
                this.j.N3();
            }
            this.i.k0(true);
        }
    }

    public static interface j {
        public void a();

        public void b();

        public void c(o var1, com.alphainventor.filemanager.file.n var2);
    }

    private class k
    extends ArrayAdapter<com.alphainventor.filemanager.file.n> {
        private Context a;
        final f b;

        public k(f f8, Context context, List<com.alphainventor.filemanager.file.n> list) {
            this.b = f8;
            super(context, 0, list);
            this.a = context;
        }

        public View getView(int n8, View view, ViewGroup object) {
            com.alphainventor.filemanager.file.n n9 = (com.alphainventor.filemanager.file.n)this.getItem(n8);
            if (view == null) {
                view = LayoutInflater.from((Context)this.a).inflate(2131558463, (ViewGroup)object, false);
                object = new a(this, view);
                view.setTag(object);
            } else {
                object = (a)view.getTag();
            }
            ((a)object).a(n9);
            return view;
        }

        class a {
            private ImageView a;
            private TextView b;
            private String c;
            final k d;

            public a(k k8, View view) {
                this.d = k8;
                this.b(view);
            }

            private void b(View view) {
                this.a = (ImageView)view.findViewById(2131362035);
                this.b = (TextView)view.findViewById(2131362036);
            }

            private void c(ImageView imageView, boolean bl) {
                float f8 = bl ? 0.5f : 1.0f;
                imageView.setAlpha(f8);
            }

            void a(com.alphainventor.filemanager.file.n n8) {
                String string;
                if (n8 == null || (string = this.c) != null && string.equals(n8.t())) {
                    return;
                }
                this.c = n8.t();
                string = this.a;
                string.setImageDrawable(n8.Y(string.getContext()));
                this.b.setText((CharSequence)n8.B());
                this.c(this.a, n8.h());
            }
        }
    }

    private class l
    extends ArrayAdapter<K> {
        private Context a;
        final f b;

        public l(f f8, Context context, List<K> list) {
            this.b = f8;
            super(context, 0, list);
            this.a = context;
        }

        public View getView(int n8, View view, ViewGroup object) {
            K k8 = (K)this.getItem(n8);
            if (view == null) {
                view = LayoutInflater.from((Context)this.a).inflate(2131558463, (ViewGroup)object, false);
                object = new a(this, view);
                view.setTag(object);
            } else {
                object = (a)view.getTag();
            }
            ((a)object).a(k8);
            return view;
        }

        class a {
            private ImageView a;
            private TextView b;
            final l c;

            public a(l l8, View view) {
                this.c = l8;
                this.b(view);
            }

            private void b(View view) {
                this.a = (ImageView)view.findViewById(2131362035);
                this.b = (TextView)view.findViewById(2131362036);
            }

            void a(K k8) {
                if (k8 == null) {
                    return;
                }
                this.a.setImageResource(ax.s3.b.k(k8.d(), null));
                this.b.setText((CharSequence)k8.f(this.c.a));
            }
        }
    }

    private class m
    extends q<Void, Void, List<com.alphainventor.filemanager.file.n>> {
        private com.alphainventor.filemanager.file.n h;
        private ax.b3.j i;
        private o j;
        private Context k;
        final f l;

        public m(f f8, o o8, com.alphainventor.filemanager.file.n n8) {
            this.l = f8;
            super(q.e.d0);
            this.h = n8;
            this.j = o8;
            this.k = o8.t();
        }

        @Override
        protected void r() {
            super.r();
            this.j.n0();
            this.l.E0.clear();
        }

        protected List<com.alphainventor.filemanager.file.n> w(Void ... object) {
            block7: {
                e e82;
                block6: {
                    ax.b3.j j82;
                    block5: {
                        block4: {
                            if (this.l.L0.d() == ax.Q2.f.n0 || (object = this.h) == null) break block4;
                            try {
                                object = ax.c3.q.g(B.h(this.j.f0((com.alphainventor.filemanager.file.n)object), null, ax.t3.e.h((Context)this.l.f0(), this.l.L0.d(), this.l.L0.b(), this.h.E(), false), true), ax.c3.q.c("NameUp"));
                                return object;
                            }
                            catch (ax.b3.j j82) {
                                break block5;
                            }
                            catch (e e82) {
                                break block6;
                            }
                        }
                        return null;
                    }
                    j82.printStackTrace();
                    this.i = j82;
                    break block7;
                }
                e82.printStackTrace();
                this.i = e82;
            }
            return null;
        }

        protected void x(List<com.alphainventor.filemanager.file.n> list) {
            this.j.k0(false);
        }

        protected void y(List<com.alphainventor.filemanager.file.n> object) {
            this.j.k0(false);
            if (this.l.L0.d() == ax.Q2.f.n0) {
                f.j3(this.l, null);
                f.m3(this.l, null);
                this.l.w0.setAdapter((ListAdapter)this.l.D0);
                this.l.W3(null);
            } else {
                f.j3(this.l, this.h);
                if (object != null) {
                    this.l.F0.clear();
                    this.l.F0.addAll(object);
                    this.l.E0.notifyDataSetChanged();
                    this.l.w0.setSelectionAfterHeaderView();
                    object = this.l.J0.W();
                    String string = this.l.L0.f(this.k);
                    this.l.R3(string);
                    this.l.z0.setText((CharSequence)object);
                    if (this.l.F0.size() > 0) {
                        this.l.U3(false);
                    } else {
                        this.l.U3(true);
                    }
                } else {
                    this.l.U3(true);
                    if (this.i instanceof e) {
                        Toast.makeText((Context)this.l.f0(), (int)2131951929, (int)1).show();
                    } else {
                        Toast.makeText((Context)this.l.f0(), (int)2131951927, (int)1).show();
                    }
                }
                this.l.W3(this.h);
            }
            this.l.L3();
            this.l.I3(true);
        }
    }
}

