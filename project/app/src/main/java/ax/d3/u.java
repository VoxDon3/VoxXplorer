/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.X2.Q;
import ax.a3.n;
import ax.d3.Y;
import ax.t3.h;
import ax.u3.B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class u
extends Fragment
implements n.c,
Y {
    ListView d0;
    Switch e0;
    PackageManager f0;

    private void N2(b b8, String string, ComponentName componentName) {
        if (this.b() == null) {
            return;
        }
        if (componentName == null) {
            h.l(this.b(), string);
        } else {
            h.m(this.b(), string, componentName);
        }
        b8.a();
    }

    private List<d> O2(Context object2) {
        ArrayList<d> arrayList = new ArrayList<d>();
        Map<String, List<ax.Z2.c>> map = h.b((Context)object2);
        for (String string : map.keySet()) {
            arrayList.add(new d(this, string, map.get(string)));
        }
        Collections.sort(arrayList, new e(this));
        return arrayList;
    }

    private void P2() {
        boolean bl = h.i(this.b());
        this.e0.setChecked(bl);
        this.e0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final u a;
            {
                this.a = u8;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                block3: {
                    block4: {
                        block2: {
                            if (this.a.b() == null) break block2;
                            if (!bl || ax.c3.u.Q(this.a.b())) break block3;
                            if (B.F(this.a, true)) break block4;
                        }
                        return;
                    }
                    this.a.Q2();
                    this.a.e0.setChecked(false);
                    return;
                }
                h.n(this.a.b(), bl);
            }
        });
    }

    private void Q2() {
        n n8 = n.k3(0, 2131952352, 2131952270, 0x1040000);
        n8.D2(this, 0);
        B.d0(this.s0(), n8, "fileuri", true);
    }

    @Override
    public void G(n n8) {
    }

    @Override
    public void J1() {
        super.J1();
        this.P2();
    }

    @Override
    public void L1(View object, Bundle bundle) {
        this.f0 = this.b().getPackageManager();
        bundle = this.b();
        this.d0 = (ListView)object.findViewById(2131362452);
        View view = object.findViewById(2131362178);
        this.d0.setEmptyView(view);
        this.e0 = (Switch)object.findViewById(2131362049);
        if (!Q.N() || !Q.O() && !ax.c3.u.Q(this.b())) {
            this.e0.setVisibility(8);
        }
        object = new b(this, (Context)bundle);
        this.d0.setAdapter((ListAdapter)object);
        this.P2();
    }

    @Override
    public void P(n n8) {
        n8 = new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=com.alphainventor.plugin.fileuri"));
        try {
            ax.c3.u.p0(this, (Intent)n8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)this.b(), (int)2131952448, (int)1).show();
            return;
        }
    }

    @Override
    public void Z(n n8) {
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        if (!bl) {
            this.d0.setPadding(0, 0, 0, b8.d);
        }
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558550, null);
    }

    class b
    extends ArrayAdapter<d> {
        final u a;

        b(u u8, Context context) {
            this.a = u8;
            super(context, 0);
            this.a();
        }

        void a() {
            this.clear();
            this.addAll(this.a.O2(this.getContext()));
            this.notifyDataSetChanged();
        }

        /*
         * Unable to fully structure code
         */
        public View getView(int var1_1, View var2_2, ViewGroup var3_3) {
            var7_4 = LayoutInflater.from((Context)this.getContext());
            var4_5 = 0;
            if (var2_2 == null) {
                var2_2 = var7_4.inflate(2131558570, (ViewGroup)var3_3, false);
                var3_3 = new c(this.a, var2_2);
                var2_2.setTag(var3_3);
            } else {
                var3_3 = (c)var2_2.getTag();
            }
            var8_6 = (d)this.getItem(var1_1);
            var6_7 = var8_6.a;
            var3_3.a.setText((CharSequence)var6_7);
            if (!TextUtils.isEmpty((CharSequence)var8_6.b)) {
                var9_10 = var3_3.b;
                var6_7 = new StringBuilder();
                var6_7.append(".");
                var6_7.append(var8_6.b);
                var9_10.setText((CharSequence)var6_7.toString());
            } else {
                var3_3.b.setText((CharSequence)"");
            }
            var3_3.c.removeAllViews();
            if (var8_6.c.size() == 0) {
                var3_3 = new StringBuilder();
                var3_3.append("no component default mimetype : ");
                var3_3.append(var8_6.a);
                ax.u3.b.e(var3_3.toString());
                new Handler(Looper.getMainLooper()).post(new Runnable(){
                    final b c0;
                    final d q;
                    {
                        this.c0 = b8;
                        this.q = d8;
                    }

                    @Override
                    public void run() {
                        b b8 = this.c0;
                        b8.a.N2(b8, this.q.a, null);
                    }
                });
                return var2_2;
            }
            block22: for (ComponentName var10_12 : var8_6.c) {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    var1_1 = var4_5;
                                    var11_13 = var7_4.inflate(2131558571, (ViewGroup)var3_3.c, (boolean)var4_5);
                                    var1_1 = var4_5;
                                    var13_15 = (ImageView)var11_13.findViewById(2131362383);
                                    var1_1 = var4_5;
                                    var14_16 = (TextView)var11_13.findViewById(2131361893);
                                    var1_1 = var4_5;
                                    var12_14 = (TextView)var11_13.findViewById(2131361865);
                                    var1_1 = var4_5;
                                    var15_17 = this.a.f0.getActivityInfo(var10_12, var4_5);
                                    var1_1 = var4_5;
                                    var6_7 = var15_17.applicationInfo;
                                    if (var6_7 == null) break block29;
                                    var1_1 = var4_5;
                                    var6_7 = var6_7.loadLabel(this.a.f0);
                                    break block30;
                                }
                                var6_7 = null;
                            }
                            var1_1 = var4_5;
                            var16_18 = var15_17.loadLabel(this.a.f0);
                            try {
                                var13_15.setImageDrawable(var15_17.loadIcon(this.a.f0));
                                var12_14.setText(var16_18);
                                if (var16_18.equals(var6_7)) break block31;
                                var14_16.setText((CharSequence)var6_7);
                                var1_1 = 0;
                            }
                            catch (PackageManager.NameNotFoundException var6_8) {
                                var1_1 = 0;
                                break block33;
                            }
                            var14_16.setVisibility(0);
                            break block32;
                        }
                        var1_1 = var4_5 = 0;
                        var14_16.setText((CharSequence)"");
                        var1_1 = var4_5;
                        var14_16.setVisibility(8);
                    }
                    var5_11 = 0;
                    var4_5 = 0;
                    var1_1 = var5_11;
                    var12_14 = var11_13.findViewById(2131362039);
                    var1_1 = var5_11;
                    var1_1 = var5_11;
                    var6_7 = new View.OnClickListener(){
                        final d a;
                        final ComponentName b;
                        final b c;
                        {
                            this.c = b8;
                            this.a = d8;
                            this.b = componentName;
                        }

                        public void onClick(View object) {
                            object = this.c;
                            object.a.N2((b)((Object)object), this.a.a, this.b);
                        }
                    };
                    var1_1 = var5_11;
                    var12_14.setOnClickListener((View.OnClickListener)var6_7);
                    var1_1 = var5_11;
                    var1_1 = var5_11;
                    var6_7 = new View.OnLongClickListener(){
                        final ComponentName a;
                        final b b;
                        {
                            this.b = b8;
                            this.a = componentName;
                        }

                        public boolean onLongClick(View view) {
                            if (this.b.a.f0() == null) {
                                return false;
                            }
                            view = ax.c3.u.d(this.a.getPackageName());
                            try {
                                ax.c3.u.p0(this.b.a, (Intent)view);
                            }
                            catch (ActivityNotFoundException activityNotFoundException) {
                                Toast.makeText((Context)this.b.a.f0(), (int)2131952448, (int)1).show();
                            }
                            return true;
                        }
                    };
                    var1_1 = var5_11;
                    var11_13.setOnLongClickListener(var6_7);
                    var1_1 = var5_11;
                    var3_3.c.addView(var11_13);
                    continue;
                }
lbl107:
                // 2 sources

                while (true) {
                    new Handler(Looper.getMainLooper()).post(new Runnable(){
                        final ComponentName c0;
                        final b d0;
                        final d q;
                        {
                            this.d0 = b8;
                            this.q = d8;
                            this.c0 = componentName;
                        }

                        @Override
                        public void run() {
                            b b8 = this.d0;
                            b8.a.N2(b8, this.q.a, this.c0);
                        }
                    });
                    var4_5 = var1_1;
                    continue block22;
                    break;
                }
            }
            return var2_2;
            catch (PackageManager.NameNotFoundException var6_9) {
                ** continue;
            }
        }
    }

    class c {
        TextView a;
        TextView b;
        LinearLayout c;
        final u d;

        c(u u8, View view) {
            this.d = u8;
            this.a = (TextView)view.findViewById(2131362557);
            this.b = (TextView)view.findViewById(2131362256);
            this.c = (LinearLayout)view.findViewById(2131362050);
        }
    }

    class d {
        String a;
        String b;
        Set<ComponentName> c;
        final u d;

        /*
         * WARNING - void declaration
         */
        d(u object, String object22, List<ax.Z2.c> list) {
            Object var3_5;
            this.d = object;
            this.a = object22;
            this.c = new HashSet<ComponentName>();
            for (ax.Z2.c c8 : var3_5) {
                this.c.add(c8.e);
                this.b = c8.d;
            }
        }
    }

    class e
    implements Comparator<d> {
        final u q;

        e(u u8) {
            this.q = u8;
        }

        public int a(d d8, d d9) {
            int n8 = B.a(d8.a, d9.a);
            if (n8 != 0) {
                return n8;
            }
            return B.a(d8.b, d9.b);
        }
    }
}

