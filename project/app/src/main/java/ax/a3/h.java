/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.c3.x;
import ax.nb.g;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.u;
import ax.s3.b;
import ax.u3.p;
import ax.u3.q;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.file.o;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class h
extends androidx.fragment.app.e
implements AdapterView.OnItemClickListener {
    private o A0;
    private ListView t0;
    private View u0;
    private TextView v0;
    private ProgressBar w0;
    private f x0;
    private List<d> y0;
    private e z0;

    static /* synthetic */ String g3(h h8, b0 b02) {
        return h8.m3(b02);
    }

    private String m3(b0 object) {
        String string = object.getURL().getHost();
        object = g.k(string);
        int n8 = ((g[])object).length;
        for (int i8 = 0; i8 < n8; ++i8) {
            g g8 = object[i8];
            try {
                if (g8.r().equals(string) || g8.x()) continue;
                object = g8.r();
                return object;
            }
            catch (UnknownHostException unknownHostException) {}
            unknownHostException.printStackTrace();
            break;
        }
        return null;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String n3(String string) {
        Object object;
        block5: {
            g g8 = null;
            g g9 = null;
            g g10 = null;
            Object object2 = g10;
            try {
                g[] gArray;
                block6: {
                    gArray = g.j(g.n(string, 32, null), 2, 3000);
                    object = g9;
                    if (gArray == null) break block5;
                    object2 = g10;
                    object = g9;
                    if (gArray.length <= 0) break block5;
                    object2 = g10;
                    int n8 = gArray.length;
                    int n9 = 0;
                    while (true) {
                        object2 = g8;
                        if (n9 >= n8) break block6;
                        object = gArray[n9];
                        object2 = g10;
                        if (!((g)object).x()) break;
                        ++n9;
                    }
                    object2 = g10;
                    object2 = object = ((g)object).r();
                }
                object = object2;
                if (object2 == null) {
                    object = gArray[0].r();
                }
            }
            catch (UnknownHostException unknownHostException) {
                object = object2;
            }
        }
        if (object != null) return object;
        return string;
    }

    private void o3() {
        this.u0.setVisibility(8);
    }

    private void p3() {
        e e8 = this.z0;
        if (e8 != null && !e8.isCancelled()) {
            this.z0.e();
        }
        this.q3();
        this.z0 = e8 = new e(this);
        e8.i(new Void[0]);
    }

    private void q3() {
        this.u0.setVisibility(0);
    }

    private void r3(boolean bl) {
        if (bl) {
            this.t0.setVisibility(8);
            this.v0.setVisibility(0);
            return;
        }
        this.v0.setVisibility(8);
        this.t0.setVisibility(0);
    }

    @Override
    public void J1() {
        super.J1();
        a a8 = (a)this.Q2();
        if (a8 != null) {
            a8.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                final h c;
                {
                    this.c = h8;
                }

                @Override
                public void a(View view) {
                    if (this.c.f0() instanceof MainActivity) {
                        if (this.c.z0 != null && !this.c.z0.isCancelled()) {
                            this.c.z0.e();
                        }
                        ((MainActivity)this.c.f0()).w1().a(null);
                    }
                }
            });
            a8.i(-3).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                final h c;
                {
                    this.c = h8;
                }

                @Override
                public void a(View view) {
                    this.c.p3();
                }
            });
        }
        this.p3();
    }

    @Override
    public Dialog T2(Bundle bundle) {
        f f8;
        a.a a8 = ax.u3.h.a((Context)this.f0());
        bundle = (RelativeLayout)LayoutInflater.from((Context)this.f0()).inflate(2131558495, null);
        this.t0 = (ListView)bundle.findViewById(2131362132);
        this.u0 = bundle.findViewById(2131362720);
        this.v0 = (TextView)bundle.findViewById(2131362134);
        this.w0 = (ProgressBar)bundle.findViewById(2131362133);
        this.A0 = x.d(ax.Q2.f.J0, 0);
        this.y0 = new ArrayList<d>();
        this.x0 = f8 = new f(this, (Context)this.f0(), this.y0);
        this.t0.setAdapter((ListAdapter)f8);
        this.t0.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        a8.setPositiveButton(2131951813, null);
        a8.setNegativeButton(2131951810, null);
        return a8.setView((View)bundle).p(2131952165).create();
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
        if (this.f0() instanceof MainActivity) {
            object = this.z0;
            if (object != null && !((q)object).isCancelled()) {
                this.z0.e();
            }
            ((MainActivity)this.f0()).w1().a((d)this.x0.getItem(n8));
        }
    }

    @Override
    public void s1() {
        e e8 = this.z0;
        if (e8 != null && !e8.isCancelled()) {
            this.z0.e();
        }
        super.s1();
    }

    public static interface c {
        public void a(d var1);
    }

    public static class d {
        public String a;
        public String b;

        d(String string, String string2) {
            this.a = string;
            this.b = string2;
        }
    }

    private class e
    extends q<Void, Integer, List<d>> {
        List<d> h;
        final h i;

        public e(h h8) {
            this.i = h8;
            super(q.e.e0);
            this.h = java.util.DesugarCollections.synchronizedList(new ArrayList());
        }

        private Future<Void> B() {
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Void> future = executorService.submit(new Callable<Void>(this){
                final e a;
                {
                    this.a = e8;
                }

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public Void a() throws Exception {
                    block11: {
                        block12: {
                            block10: {
                                try {
                                    var3_1 = new b0("smb://");
                                    var3_1 = var3_1.M();
                                    var1_4 = 0;
lbl6:
                                    // 2 sources

                                    ** while (var1_4 < (var2_5 = var3_1.length))
lbl-1000:
                                    // 1 sources

                                    {
                                        var6_10 /* !! */  = var3_1[var1_4].M();
                                        for (var2_5 = 0; var2_5 < var6_10 /* !! */ .length; ++var2_5) {
                                            var4_6 = var6_10 /* !! */ [var2_5].getURL().getHost();
                                            if (var4_6 == null) continue;
                                            var7_11 = this.a;
                                            var5_9 = new d((String)var4_6, null);
                                            var7_11.y(var5_9);
                                        }
                                        break block10;
lbl17:
                                        // 1 sources

                                        break block11;
                                    }
                                }
                                catch (MalformedURLException var3_2) {}
                                var3_2.printStackTrace();
                                break block11;
                                catch (a0 var4_7) {
                                    ** GOTO lbl31
                                }
                                catch (u var4_8) {}
                                {
                                    var4_8.printStackTrace();
                                    var6_10 /* !! */  = ax.a3.h.g3(this.a.i, var3_1[var1_4]);
                                    if (var6_10 /* !! */  == null) break block10;
                                    var4_6 = this.a;
                                    var5_9 = new d((String)var6_10 /* !! */ , null);
                                    var4_6.y(var5_9);
                                    break block10;
lbl31:
                                    // 1 sources

                                    ** try [egrp 3[TRYBLOCK] [14, 13 : 108->171)] { 
lbl32:
                                    // 1 sources

                                    var4_7.printStackTrace();
                                }
lbl34:
                                // 2 sources

                                catch (a0 var3_3) {
                                    break block12;
                                }
                            }
                            ++var1_4;
                            ** GOTO lbl6
                        }
                        var3_3.printStackTrace();
                    }
                    e.x(this.a, new Integer[0]);
                    return null;
                }
            });
            executorService.shutdown();
            return future;
        }

        static /* synthetic */ void x(e e8, Object[] objectArray) {
            e8.v(objectArray);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void z() {
            Object object = this.i.f0();
            if (object == null) {
                return;
            }
            Future<Void> future = this.B();
            try {
                future.get(1000L, TimeUnit.MILLISECONDS);
            }
            catch (Exception exception) {
                // empty catch block
            }
            Object object2 = ax.i3.a.f((Context)object);
            if (object2[0] != 0) {
                object = p.b((byte[])object2, 500, 20, new p.b(this){
                    final e a;
                    {
                        this.a = e8;
                    }

                    @Override
                    public void a(String string) {
                        String string2 = ax.a3.h.n3(string);
                        this.a.y(new d(string2, string));
                        this.a.v(new Integer[0]);
                    }
                });
                object2 = new ArrayList();
                object = object.iterator();
                while (object.hasNext()) {
                    ExecutionException executionException2;
                    block11: {
                        Object object3 = (Future)object.next();
                        if (this.isCancelled()) {
                            object3.cancel(true);
                            continue;
                        }
                        try {
                            object3 = (p.c)object3.get();
                            if (!((p.c)object3).b) continue;
                            object2.add(((p.c)object3).a);
                            continue;
                        }
                        catch (InterruptedException interruptedException) {
                        }
                        catch (ExecutionException executionException2) {
                            break block11;
                        }
                        interruptedException.printStackTrace();
                        continue;
                    }
                    executionException2.printStackTrace();
                }
            }
            try {
                future.get();
                return;
            }
            catch (InterruptedException | ExecutionException exception) {
                return;
            }
        }

        protected List<d> A(Void ... voidArray) {
            this.h.clear();
            this.z();
            return this.h;
        }

        protected void C(List<d> list) {
            this.i.A0.k0(false);
            if (this.i.f0() == null) {
                return;
            }
            this.i.o3();
        }

        protected void D(List<d> list) {
            this.i.A0.k0(false);
            if (this.i.f0() == null) {
                return;
            }
            if (list != null) {
                this.i.y0.clear();
                this.i.y0.addAll(list);
                this.i.x0.notifyDataSetChanged();
                this.i.t0.setSelectionAfterHeaderView();
                if (this.i.y0.size() > 0) {
                    this.i.r3(false);
                } else {
                    this.i.r3(true);
                }
            } else {
                this.i.r3(true);
                Toast.makeText((Context)this.i.f0(), (int)2131951931, (int)1).show();
            }
            this.i.o3();
        }

        protected void E(Integer ... integerArray) {
            if (this.i.f0() == null) {
                return;
            }
            this.i.y0.clear();
            this.i.y0.addAll(this.h);
            this.i.x0.notifyDataSetChanged();
        }

        @Override
        protected void r() {
            super.r();
            this.i.A0.n0();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void y(d d8) {
            synchronized (this) {
                Throwable throwable2;
                block8: {
                    d d92;
                    block7: {
                        try {
                            for (d d92 : this.h) {
                                String string = d8.a;
                                if (string == null || !string.equals(d92.a)) continue;
                                break block7;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        d92 = null;
                    }
                    if (d92 != null) {
                        if (d92.b != null) {
                            this.h.remove(d92);
                            this.h.add(d8);
                        }
                    } else {
                        this.h.add(d8);
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }

    private class f
    extends ArrayAdapter<d> {
        private Context a;
        final h b;

        public f(h h8, Context context, List<d> list) {
            this.b = h8;
            super(context, 0, list);
            this.a = context;
        }

        public View getView(int n8, View view, ViewGroup object) {
            d d8 = (d)this.getItem(n8);
            if (view == null) {
                view = LayoutInflater.from((Context)this.a).inflate(2131558463, (ViewGroup)object, false);
                object = new a(this, view);
                view.setTag(object);
            } else {
                object = (a)view.getTag();
            }
            ((a)object).a(d8);
            return view;
        }

        class a {
            private ImageView a;
            private TextView b;
            final f c;

            public a(f f8, View view) {
                this.c = f8;
                this.b(view);
            }

            private void b(View view) {
                this.a = (ImageView)view.findViewById(2131362035);
                this.b = (TextView)view.findViewById(2131362036);
            }

            void a(d d8) {
                this.a.setImageResource(ax.s3.b.k(ax.Q2.f.J0, null));
                this.b.setText((CharSequence)d8.a);
            }
        }
    }
}

