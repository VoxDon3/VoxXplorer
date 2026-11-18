/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.fragment.app.FragmentManager;
import ax.X2.Q;
import ax.a3.f;
import ax.a3.o;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.g3.k;
import ax.g3.n;
import ax.t3.j;
import ax.u3.B;
import ax.u3.b;
import ax.u3.h;
import ax.u3.q;
import ax.x3.C;
import ax.x3.o;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.L;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.W;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.cert.X509Certificate;
import java.util.Map;

public class v
extends androidx.fragment.app.e {
    private boolean A0;
    private EditText B0;
    private EditText C0;
    private EditText D0;
    private RadioButton E0;
    private RadioButton F0;
    private Spinner G0;
    private Spinner H0;
    private TextView I0;
    private View J0;
    private ProgressDialog K0;
    private int L0;
    private String M0;
    private int N0;
    private String O0;
    private ax.Q2.f P0;
    private int Q0;
    private ax.Z2.o R0;
    private String S0;
    private boolean T0;
    ax.g3.c U0 = new ax.g3.c(this){
        final v c;
        {
            this.c = v8;
        }

        @Override
        public void a(View view) {
            this.c.M3(null);
        }
    };
    private View t0;
    private EditText u0;
    private EditText v0;
    private EditText w0;
    private boolean x0;
    private boolean y0;
    private boolean z0;

    private void A3() {
        this.I0.setText((CharSequence)"");
        this.S0 = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void B3() {
        ProgressDialog progressDialog = this.K0;
        if (progressDialog == null) return;
        try {
            progressDialog.dismiss();
            this.K0 = null;
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public static v C3(K k8) {
        v v8 = new v();
        Bundle bundle = new Bundle();
        bundle.putInt("action", 2);
        bundle.putSerializable("location", (Serializable)((Object)k8.d()));
        bundle.putInt("location_key", k8.b());
        v8.v2(bundle);
        return v8;
    }

    private String D3() {
        o.a a8 = (o.a)this.G0.getSelectedItem();
        if (a8 == null) {
            return null;
        }
        return a8.c();
    }

    private String E3() {
        return this.S0;
    }

    private String F3() {
        C.a a8 = (C.a)this.H0.getSelectedItem();
        if (a8 == null) {
            return null;
        }
        return a8.c();
    }

    private int G3() {
        try {
            int n8 = Integer.parseInt(this.w0.getText().toString().trim());
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return this.L0;
        }
    }

    private boolean I3(ax.Q2.f f8) {
        return f8 == ax.Q2.f.H0 || f8 == ax.Q2.f.J0 || f8 == ax.Q2.f.I0;
        {
        }
    }

    private boolean J3() {
        return TextUtils.isEmpty((CharSequence)this.S0) ^ true;
    }

    private void K3(View view) {
        view.findViewById(2131362804).setVisibility(8);
        view.findViewById(2131362801).setVisibility(0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void M3(String var1_1) {
        block16: {
            block15: {
                this.y3();
                var15_2 = this.u0.getText().toString().trim();
                var8_3 = this.v0.getText().toString().trim();
                var12_4 = this.D0.getText().toString().trim();
                var10_5 = this.B0.getText().toString().trim();
                var5_6 /* !! */  = this.P0;
                var6_7 /* !! */  = ax.Q2.f.I0;
                var5_6 /* !! */  = var5_6 /* !! */  == var6_7 /* !! */  ? (this.t0.findViewById(2131362804).getVisibility() == 0 ? ((EditText)this.t0.findViewById(2131362816)).getText().toString() : this.C0.getText().toString()) : this.C0.getText().toString();
                var4_8 = this.A0;
                var9_9 /* !! */  = var5_6 /* !! */ ;
                if (var4_8) {
                    var10_5 = "anonymous";
                    var9_9 /* !! */  = "";
                }
                if (!this.z3(var8_3, var10_5, (String)var9_9 /* !! */ , var4_8)) {
                    return;
                }
                var2_10 = TextUtils.isEmpty((CharSequence)this.w0.getText().toString().trim()) == false ? this.G3() : 0;
                var5_6 /* !! */  = this.P0;
                var7_11 /* !! */  = ax.Q2.f.K0;
                var14_12 = null;
                if (var5_6 /* !! */  == var7_11 /* !! */ ) ** GOTO lbl-1000
                if (var5_6 /* !! */  == ax.Q2.f.H0) {
                    var5_6 /* !! */  = this.D3();
lbl23:
                    // 2 sources

                    while (true) {
                        var6_7 /* !! */  = null;
                        var7_11 /* !! */  = null;
                        break;
                    }
                } else if (var5_6 /* !! */  == var6_7 /* !! */ ) {
                    var6_7 /* !! */  = this.E3();
                    var5_6 /* !! */  = null;
                    var7_11 /* !! */  = null;
                } else if (var5_6 /* !! */  == ax.Q2.f.J0) {
                    var7_11 /* !! */  = this.F3();
                    var5_6 /* !! */  = null;
                    var6_7 /* !! */  = null;
                } else lbl-1000:
                // 2 sources

                {
                    var5_6 /* !! */  = null;
                    ** continue;
                }
                var11_13 = var12_4;
                if (TextUtils.isEmpty((CharSequence)var12_4)) {
                    var11_13 = var8_3;
                }
                if ((var13_14 = this.X3(var8_3)).contains("/")) break block15;
                var8_3 = var13_14;
                var12_4 = var14_12;
                if (!var13_14.contains("\\")) break block16;
            }
            if (!var13_14.contains("/")) {
                var13_14 = var13_14.replace("\\", "/");
            }
            var3_15 = var13_14.indexOf("/");
            var14_12 = var13_14.substring(0, var3_15);
            var8_3 = var12_4 = var13_14.substring(var3_15);
            if (var12_4 != null) {
                var8_3 = d0.V(var12_4);
            }
            var12_4 = var8_3;
            var8_3 = var14_12;
        }
        this.W3();
        this.N3(var15_2, var8_3, var2_10, var10_5, (String)var9_9 /* !! */ , var12_4, var11_13, this.x0, this.y0, this.z0, (String)var5_6 /* !! */ , (String)var6_7 /* !! */ , (String)var7_11 /* !! */ , var1_1);
    }

    private void N3(String string, String object, int n8, String string2, String string3, String string4, String string5, boolean bl, boolean bl2, boolean bl3, String string6, String string7, String string8, String string9) {
        k k8 = new k(){
            final String a;
            final v b;
            {
                this.b = v8;
                this.a = string;
            }

            /*
             * Unable to fully structure code
             */
            @Override
            public void a(ax.Q2.f var1_1, String var2_2, int var3_3, String var4_4, String var5_5) {
                block5: {
                    v.l3(this.b);
                    if (!this.b.X0()) break block5;
                    var1_1 = var2_2;
                    if (var3_3 > 0) {
                        var1_1 = new StringBuilder();
                        var1_1.append(var2_2);
                        var1_1.append(":");
                        var1_1.append(var3_3);
                        var1_1 = var1_1.toString();
                    }
                    var2_2 = this.b.N0(2131952326, new Object[]{var1_1, var4_4});
                    var1_1 = var2_2;
                    if (!j.o((Context)this.b.f0())) ** GOTO lbl-1000
                    var1_1 = var2_2;
                    if (TextUtils.isEmpty((CharSequence)var5_5)) ** GOTO lbl-1000
                    var1_1 = new StringBuilder();
                    var1_1.append(var2_2);
                    var1_1.append(" : ");
                    var1_1.append(var5_5);
                    var2_2 = var1_1.toString();
                    var1_1 = var2_2;
                    if (Q.b0()) {
                        var3_3 = 1;
                        var1_1 = var2_2;
                    } else lbl-1000:
                    // 3 sources

                    {
                        var3_3 = 0;
                    }
                    if (var3_3 != 0 && this.b.Q2() != null) {
                        var2_2 = this.b.Q2().findViewById(0x1020002);
                        if (var2_2 != null) {
                            B.U((View)var2_2, (CharSequence)var1_1, 0, 12).a0();
                            return;
                        }
                        Toast.makeText((Context)this.b.f0(), (CharSequence)var1_1, (int)1).show();
                        return;
                    }
                    Toast.makeText((Context)this.b.f0(), (CharSequence)var1_1, (int)1).show();
                }
            }

            @Override
            public void b(ax.Q2.f f8) {
            }

            @Override
            public void c(ax.Q2.f object, int n8) {
                K k8 = K.a((ax.Q2.f)((Object)object), n8);
                this.b.B3();
                if (this.b.N0 == 1) {
                    if (this.b.f0() instanceof MainActivity) {
                        ((MainActivity)this.b.f0()).D1().c((ax.Q2.f)((Object)object), n8);
                    }
                    if (this.b.P0 == ax.Q2.f.J0 && (object = this.b.s0()) != null && (object = ((FragmentManager)object).k0("chooseSmb")) != null) {
                        ((androidx.fragment.app.e)object).O2();
                    }
                } else if (this.b.N0 == 2) {
                    ax.Z2.b.k().c();
                    ax.V2.c.d(k8).a();
                    if (this.b.P0() instanceof n) {
                        ((n)((Object)this.b.P0())).E((ax.Q2.f)((Object)object), n8);
                    }
                }
                if (this.b.f0() == null) {
                    return;
                }
                this.b.O2();
            }

            @Override
            public void d(ax.Q2.f object, int n8, Map<String, Object> object2) {
                if (object == ax.Q2.f.I0) {
                    this.b.B3();
                    object = (String)object2.get("host_key");
                    String string = (String)object2.get("key_type");
                    object2 = (String)object2.get("key_fingerprint");
                    if (object == null) {
                        Toast.makeText((Context)this.b.f0(), (int)2131951927, (int)1).show();
                        return;
                    }
                    if (this.b.b() == null) {
                        ax.Ha.c.h().f().d("SFTP HOSTKEY CONFIRM NO DIALOG").h();
                        return;
                    }
                    if (this.b.f1()) {
                        object = ax.a3.o.k3(string, (String)object2);
                        if (this.b.f0() != null) {
                            Toast.makeText((Context)this.b.f0(), (CharSequence)object, (int)1).show();
                            return;
                        }
                    } else {
                        object2 = ax.a3.o.l3(this.a, string, (String)object2);
                        ((androidx.fragment.app.e)object2).c3(this.b.A0(), "save_confirm");
                        ((ax.a3.o)object2).m3(new o.e(){
                            final String a;
                            final d b;
                            {
                                this.b = d8;
                                this.a = string;
                            }

                            @Override
                            public void a(boolean bl) {
                                if (this.b.b.f0() != null && bl) {
                                    this.b.b.M3(this.a);
                                }
                            }
                        });
                    }
                }
            }
        };
        int n9 = this.N0;
        n9 = n9 == 1 ? -100 : (n9 == 2 ? this.Q0 : -1);
        ax.Z2.o o8 = new ax.Z2.o();
        o8.t(string9);
        o8.r(string);
        o8.s((String)object);
        o8.z(n8);
        o8.D(string2);
        o8.y(string3);
        o8.v(string4);
        o8.q(string5);
        object = this.P0;
        if (object == ax.Q2.f.J0) {
            if (TextUtils.isEmpty((CharSequence)string) && (n8 = string2.indexOf(92)) > 0) {
                o8.r(string2.substring(0, n8));
                o8.D(string2.substring(n8 + 1));
            }
            o8.B(string8);
        } else if (object == ax.Q2.f.H0) {
            o8.w(bl);
            o8.x(bl2);
            o8.p(string6);
            o8.C(bl3);
        } else if (object == ax.Q2.f.I0) {
            o8.A(string7);
        } else if (object == ax.Q2.f.K0) {
            o8.C(bl3);
            if (bl3) {
                new o(this, this.P0, n9, o8, k8).i(new Object[0]);
                return;
            }
            o8.u(false);
        }
        T.d((Context)this.f0(), this.P0).l(n9, o8, k8, true);
    }

    private void O3(Spinner spinner, String object) {
        int n8;
        int n9 = n8 = 0;
        if (object != null) {
            object = o.a.a((String)object);
            n9 = ax.x3.o.a(this.b()).indexOf(object);
            if (n9 < 0) {
                n9 = n8;
            }
        }
        spinner.setSelection(n9);
    }

    private void P3(Spinner spinner, String object) {
        int n8;
        int n9 = n8 = 0;
        if (object != null) {
            object = C.a.a((String)object);
            n9 = C.a(this.b()).indexOf(object);
            if (n9 < 0) {
                n9 = n8;
            }
        }
        spinner.setSelection(n9);
    }

    private void Q3(boolean bl) {
        if (this.F0 == null) {
            b.f();
            return;
        }
        this.E0.setChecked(bl ^ true);
        this.F0.setChecked(bl);
    }

    private void R3(String string) {
        String string2 = L.w0(string);
        this.I0.setText((CharSequence)string2);
        this.S0 = string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void S3(View var1_1, com.voxdon.xplorer.file.o var2_2, com.voxdon.xplorer.file.n var3_7) {
        block12: {
            var4_8 = null;
            var4_8 = var2_2 = var2_2.J(var3_7, 0L);
            ** try [egrp 1[TRYBLOCK] [5, 3, 4 : 13->56)] { 
lbl5:
            // 1 sources

            ** GOTO lbl9
lbl-1000:
            // 1 sources

            {
                catch (Throwable var2_3) {
                    var1_1 /* !! */  = var4_8;
                    break block12;
                }
lbl9:
                // 1 sources

                var6_10 = F.h((InputStream)var2_2, (int)var3_7.p());
                var4_8 = var2_2;
                var4_8 = var2_2;
                var5_11 = new String(var6_10, "UTF-8");
                var4_8 = var2_2;
                this.S0 = var5_11;
                if (var2_2 == null) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        if (this.S0 != null) {
                            this.I0.setText((CharSequence)var3_7.B());
                            this.V3(var1_1 /* !! */ , "");
                            return;
                        }
                        this.I0.setText((CharSequence)"");
                        return;
                    }
                }
lbl23:
                // 3 sources

                while (true) {
                    F.a((AutoCloseable)var2_2);
                    ** GOTO lbl-1000
                    break;
                }
                catch (Throwable var2_4) {
                    var1_1 /* !! */  = var4_8;
                    break block12;
                }
                catch (ax.b3.j | IOException var2_5) {}
                var2_2 = null;
lbl31:
                // 2 sources

                while (true) {
                    var4_8 = var2_2;
                    {
                        this.S0 = null;
                        if (var2_2 != null) ** break;
                        ** continue;
                        ** continue;
                    }
                    break;
                }
            }
lbl37:
            // 2 sources

            catch (ax.b3.j | IOException var4_9) {
                ** continue;
            }
        }
        if (var1_1 /* !! */  == null) throw var2_6;
        F.a((AutoCloseable)var1_1 /* !! */ );
        throw var2_6;
    }

    private void T3(View view) {
        this.T0 = true;
        if (this.I3(this.P0)) {
            ax.Q2.f f8 = this.P0;
            if (f8 == ax.Q2.f.H0) {
                view.findViewById(2131362800).setVisibility(0);
                if (this.z0) {
                    view.findViewById(2131362806).setVisibility(0);
                } else {
                    view.findViewById(2131362806).setVisibility(8);
                }
                view.findViewById(2131362796).setVisibility(0);
            } else if (f8 == ax.Q2.f.J0) {
                view.findViewById(2131362795).setVisibility(0);
                view.findViewById(2131362802).setVisibility(0);
                view.findViewById(2131362805).setVisibility(0);
            } else if (f8 == ax.Q2.f.I0) {
                this.U3(view);
            }
        }
        view.findViewById(2131362794).setVisibility(0);
    }

    private void U3(View view) {
        view.findViewById(2131362803).setVisibility(0);
        this.I0.setOnClickListener((View.OnClickListener)new ax.g3.c(this, view){
            final View c;
            final v d;
            {
                this.d = v8;
                this.c = view;
            }

            @Override
            public void a(View object) {
                if (this.d.s0() == null) {
                    return;
                }
                boolean bl = this.d.S0 != null;
                object = f.G3(bl);
                ((f)object).P3(new f.j(this){
                    final c a;
                    {
                        this.a = c8;
                    }

                    @Override
                    public void a() {
                    }

                    @Override
                    public void b() {
                        this.a.d.A3();
                        c c8 = this.a;
                        c8.d.K3(c8.c);
                    }

                    @Override
                    public void c(com.voxdon.xplorer.file.o o8, com.voxdon.xplorer.file.n n8) {
                        if (n8 != null) {
                            c c8 = this.a;
                            c8.d.S3(c8.c, o8, n8);
                        }
                    }
                });
                ((androidx.fragment.app.e)object).c3(this.d.s0(), "choose_key");
            }
        });
    }

    private void V3(View view, String string) {
        view.findViewById(2131362804).setVisibility(0);
        view.findViewById(2131362801).setVisibility(8);
        ((EditText)view.findViewById(2131362816)).setText((CharSequence)string);
    }

    private void W3() {
        ProgressDialog progressDialog;
        this.K0 = progressDialog = new ProgressDialog((Context)this.f0());
        progressDialog.setMessage((CharSequence)this.M0(2131951871));
        this.K0.setProgressStyle(0);
        this.K0.show();
    }

    private String X3(String string) {
        String string2 = string;
        if (string != null) {
            string2 = string;
            if (string.startsWith("//")) {
                string2 = string.substring(2);
            }
        }
        return string2;
    }

    static /* synthetic */ boolean d3(v v8, boolean bl) {
        v8.x0 = bl;
        return bl;
    }

    static /* synthetic */ boolean f3(v v8, boolean bl) {
        v8.y0 = bl;
        return bl;
    }

    static /* synthetic */ boolean r3(v v8, boolean bl) {
        v8.z0 = bl;
        return bl;
    }

    static /* synthetic */ boolean v3(v v8, boolean bl) {
        v8.A0 = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void y3() {
        Object object;
        int n8;
        int n9;
        boolean bl;
        CharSequence charSequence;
        block23: {
            block24: {
                int n10;
                int n11;
                int n12;
                block27: {
                    block26: {
                        block25: {
                            charSequence = this.v0.getText().toString().trim();
                            bl = TextUtils.isEmpty((CharSequence)this.w0.getText().toString().trim());
                            n12 = 0;
                            if (!bl) {
                                n8 = n9 = this.G3();
                                if (n9 > 65534) {
                                    this.w0.setText((CharSequence)String.valueOf(65534));
                                    n8 = 65534;
                                }
                            } else {
                                n8 = 0;
                            }
                            object = this.P0;
                            ax.Q2.f f8 = ax.Q2.f.K0;
                            bl = true;
                            n11 = 1;
                            if (object != f8) break block23;
                            if (!((String)charSequence).startsWith("http")) break block24;
                            object = Uri.parse((String)charSequence);
                            charSequence = object.getScheme();
                            n10 = object.getPort();
                            if (!"http".equals(charSequence)) break block25;
                            n9 = n8;
                            if (n8 == 443) {
                                n9 = 80;
                            }
                            this.z0 = false;
                            break block26;
                        }
                        n9 = n8;
                        if (!"https".equals(charSequence)) break block27;
                        n9 = n8;
                        if (n8 == 80) {
                            n9 = 443;
                        }
                        this.z0 = true;
                    }
                    n12 = 1;
                }
                if (n10 > 0) {
                    n9 = n10;
                    n8 = n11;
                } else {
                    n8 = n12;
                }
                if (n8 == 0) return;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(object.getHost());
                ((StringBuilder)charSequence).append(object.getPath());
                object = ((StringBuilder)charSequence).toString();
                this.v0.setText((CharSequence)object);
                this.Q3(this.z0);
                if (n10 <= 0) return;
                this.w0.setText((CharSequence)String.valueOf(n9));
                return;
            }
            if (((String)charSequence).contains("://") || !((String)charSequence).contains(":")) return;
            object = new StringBuilder();
            ((StringBuilder)object).append("test://");
            ((StringBuilder)object).append((String)charSequence);
            charSequence = Uri.parse((String)((StringBuilder)object).toString());
            n8 = charSequence.getPort();
            if (n8 <= 0) return;
            object = new StringBuilder();
            ((StringBuilder)object).append(charSequence.getHost());
            ((StringBuilder)object).append(charSequence.getPath());
            object = ((StringBuilder)object).toString();
            this.v0.setText((CharSequence)object);
            if (n8 <= 0) return;
            this.w0.setText((CharSequence)String.valueOf(n8));
            return;
        }
        ax.Q2.f f9 = ax.Q2.f.H0;
        if (object != f9 && object != ax.Q2.f.J0) return;
        object = object == f9 ? "ftp" : "smb";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("://");
        if (!((String)charSequence).startsWith(stringBuilder.toString())) return;
        charSequence = Uri.parse((String)charSequence);
        String string = charSequence.getScheme();
        n9 = charSequence.getPort();
        boolean bl2 = ((String)object).equals(string);
        if (n9 > 0) {
            n8 = n9;
        } else {
            bl = bl2;
        }
        if (!bl) return;
        object = new StringBuilder();
        ((StringBuilder)object).append(charSequence.getHost());
        ((StringBuilder)object).append(charSequence.getPath());
        object = ((StringBuilder)object).toString();
        this.v0.setText((CharSequence)object);
        if (n9 <= 0) return;
        this.w0.setText((CharSequence)String.valueOf(n8));
    }

    private boolean z3(String string, String string2, String string3, boolean bl) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            Toast.makeText((Context)this.b(), (int)2131951925, (int)1).show();
            return false;
        }
        if (!bl) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                Toast.makeText((Context)this.b(), (int)2131952109, (int)1).show();
                return false;
            }
            if (!(!TextUtils.isEmpty((CharSequence)string3) || this.P0 == ax.Q2.f.I0 && this.J3() || "guest".equalsIgnoreCase(string2) || this.P0 == ax.Q2.f.J0)) {
                Toast.makeText((Context)this.b(), (int)2131951954, (int)1).show();
                return false;
            }
        }
        return true;
    }

    int H3() {
        int n8 = e.a[this.P0.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return 0;
                    }
                    return 2131952193;
                }
                return 2131952184;
            }
            return 2131952183;
        }
        return 2131952159;
    }

    @Override
    public void J1() {
        super.J1();
        a a8 = (a)this.Q2();
        if (a8 != null) {
            a8.i(-1).setOnClickListener((View.OnClickListener)this.U0);
            a8 = a8.i(-3);
            a8.setOnClickListener(new ax.g3.c(this, (Button)a8){
                final Button c;
                final v d;
                {
                    this.d = v8;
                    this.c = button;
                }

                @Override
                public void a(View object) {
                    object = this.d;
                    ((v)object).T3(((androidx.fragment.app.e)object).Q2().findViewById(2131362746));
                    this.c.setVisibility(8);
                }
            });
        }
    }

    ax.Z2.o L3(ax.Q2.f f8, int n8) {
        return T.d((Context)this.f0(), f8).k(n8);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Dialog T2(Bundle var1_1) {
        block26: {
            var6_2 = h.a((Context)this.f0());
            this.t0 = var5_3 = LayoutInflater.from((Context)this.f0()).inflate(2131558521, null);
            this.u0 = (EditText)var5_3.findViewById(2131362787);
            this.v0 = (EditText)var5_3.findViewById(2131362791);
            this.w0 = (EditText)var5_3.findViewById(2131362814);
            this.B0 = (EditText)var5_3.findViewById(2131362819);
            this.C0 = (EditText)var5_3.findViewById(2131362813);
            this.D0 = (EditText)var5_3.findViewById(2131362786);
            this.I0 = (TextView)var5_3.findViewById(2131362815);
            this.E0 = (RadioButton)var5_3.findViewById(2131362789);
            this.F0 = (RadioButton)var5_3.findViewById(2131362790);
            this.H0 = (Spinner)var5_3.findViewById(2131362817);
            this.G0 = (Spinner)var5_3.findViewById(2131362785);
            this.J0 = var5_3.findViewById(2131362799);
            this.v0.requestFocus();
            var2_4 = this.L0;
            if (var2_4 > 0) {
                this.w0.setText((CharSequence)String.valueOf(var2_4));
            }
            var1_1 /* !! */  = this.P0;
            var4_5 = ax.Q2.f.J0;
            var3_6 = 0;
            if (var1_1 /* !! */  == var4_5) {
                var1_1 /* !! */  = this.M0;
                if (var1_1 /* !! */  != null) {
                    this.v0.setText((CharSequence)var1_1 /* !! */ );
                    this.B0.requestFocus();
                }
                if ((var1_1 /* !! */  = this.O0) != null) {
                    this.D0.setText((CharSequence)var1_1 /* !! */ );
                    var5_3.findViewById(2131362794).setVisibility(0);
                }
                var5_3.findViewById(2131362802).setVisibility(8);
                this.v0.setHint(2131951867);
                this.H0.setAdapter((SpinnerAdapter)new C((Context)this.f0()));
            }
            var1_1 /* !! */  = this.P0;
            var7_7 = ax.Q2.f.H0;
            var2_4 = 1;
            if (var1_1 /* !! */  == var7_7) {
                this.G0.setAdapter((SpinnerAdapter)new ax.x3.o((Context)this.f0()));
                ((RadioButton)var5_3.findViewById(2131362809)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        v.d3(this.a, bl);
                    }
                });
                ((RadioButton)var5_3.findViewById(2131362812)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        v.d3(this.a, bl ^ true);
                    }
                });
                ((RadioButton)var5_3.findViewById(2131362811)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        v.f3(this.a, bl);
                    }
                });
                ((RadioButton)var5_3.findViewById(2131362810)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        v.f3(this.a, bl ^ true);
                    }
                });
                this.E0.setText(2131952078);
                this.F0.setText(2131952079);
                this.z0 = true;
                this.Q3(true);
                this.E0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                    final View a;
                    final v b;
                    {
                        this.b = v8;
                        this.a = view;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (bl) {
                            this.b.J0.setVisibility(0);
                        }
                        v.r3(this.b, bl ^ true);
                        if (this.b.T0 && !this.b.z0) {
                            this.a.findViewById(2131362806).setVisibility(8);
                        }
                    }
                });
                this.F0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                    final View a;
                    final v b;
                    {
                        this.b = v8;
                        this.a = view;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (bl) {
                            this.b.J0.setVisibility(8);
                        }
                        v.r3(this.b, bl);
                        if (this.b.T0 && this.b.z0) {
                            this.a.findViewById(2131362806).setVisibility(0);
                        }
                    }
                });
            } else if (var1_1 /* !! */  == ax.Q2.f.K0) {
                this.v0.setHint(2131951868);
                this.E0.setText(2131952100);
                this.F0.setText(2131952101);
                this.z0 = true;
                this.Q3(true);
                this.E0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (bl) {
                            this.a.J0.setVisibility(0);
                        }
                        v.r3(this.a, bl ^ true);
                        if (!this.a.z0 && this.a.G3() == 443) {
                            this.a.w0.setText((CharSequence)"80");
                        }
                    }
                });
                this.F0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (bl) {
                            this.a.J0.setVisibility(8);
                        }
                        v.r3(this.a, bl);
                        if (this.a.z0 && this.a.G3() == 80) {
                            this.a.w0.setText((CharSequence)"443");
                        }
                    }
                });
                var5_3.findViewById(2131362793).setVisibility(8);
            } else if (var1_1 /* !! */  == ax.Q2.f.I0) {
                var5_3.findViewById(2131362793).setVisibility(8);
                var5_3.findViewById(2131362797).setVisibility(8);
            } else {
                var5_3.findViewById(2131362797).setVisibility(8);
            }
            var8_8 /* !! */  = (CheckBox)var5_3.findViewById(2131362784);
            var8_8 /* !! */ .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
                final v a;
                {
                    this.a = v8;
                }

                public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                    v.v3(this.a, bl);
                    this.a.B0.setEnabled(bl ^ true);
                    this.a.C0.setEnabled(bl ^ true);
                }
            });
            if (this.N0 != 2) break block26;
            this.u0.setText((CharSequence)this.R0.c());
            if (!TextUtils.isEmpty((CharSequence)this.R0.c())) {
                var5_3.findViewById(2131362795).setVisibility(0);
            }
            if (!TextUtils.isEmpty((CharSequence)this.R0.f())) {
                var1_1 /* !! */  = new StringBuilder();
                var1_1 /* !! */ .append(this.R0.d());
                var1_1 /* !! */ .append(this.R0.f());
                var1_1 /* !! */  = var1_1 /* !! */ .toString();
            } else {
                var1_1 /* !! */  = this.R0.d();
            }
            this.v0.setText((CharSequence)var1_1 /* !! */ );
            this.B0.setText((CharSequence)this.R0.k());
            this.C0.setText((CharSequence)this.R0.g());
            if (TextUtils.isEmpty((CharSequence)this.R0.b()) || this.R0.b().equals(var1_1 /* !! */ )) ** GOTO lbl-1000
            this.D0.setText((CharSequence)this.R0.b());
            var5_3.findViewById(2131362794).setVisibility(0);
            if (!this.I3(this.P0)) {
                var2_4 = var3_6;
            } else lbl-1000:
            // 2 sources

            {
                var2_4 = 1;
            }
            if (this.R0.h() > 0) {
                this.w0.setText((CharSequence)String.valueOf(this.R0.h()));
            }
            if ((var9_9 = this.P0) != (var1_1 /* !! */  = ax.Q2.f.K0) && "anonymous".equals(this.R0.k()) && TextUtils.isEmpty((CharSequence)this.R0.g())) {
                this.B0.setText((CharSequence)"");
                this.C0.setText((CharSequence)"");
                var8_8 /* !! */ .setChecked(true);
            }
            if ((var8_8 /* !! */  = this.P0) == var7_7) {
                ((RadioButton)var5_3.findViewById(2131362809)).setChecked(this.R0.m());
                ((RadioButton)var5_3.findViewById(2131362812)).setChecked(this.R0.m() ^ true);
                ((RadioButton)var5_3.findViewById(2131362811)).setChecked(this.R0.n());
                ((RadioButton)var5_3.findViewById(2131362810)).setChecked(this.R0.n() ^ true);
                this.O3(this.G0, this.R0.a());
                this.Q3(this.R0.o());
            } else if (var8_8 /* !! */  == var1_1 /* !! */ ) {
                this.Q3(this.R0.o());
            } else if (var8_8 /* !! */  == ax.Q2.f.I0) {
                if (this.R0.i() != null) {
                    this.U3(var5_3);
                    this.V3(var5_3, this.R0.g());
                    this.R3(this.R0.i());
                }
            } else if (var8_8 /* !! */  == var4_5) {
                this.P3(this.H0, this.R0.j());
            }
        }
        var6_2.setView(var5_3).p(this.H3()).setPositiveButton(17039370, null).setNegativeButton(0x1040000, null);
        if (var2_4 != 0) {
            var6_2.i(2131952273, null);
        }
        return var6_2.create();
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.N0 = this.j0().getInt("action");
        this.M0 = this.j0().getString("host");
        this.O0 = this.j0().getString("display_name");
        this.L0 = this.j0().getInt("port");
        this.P0 = (ax.Q2.f)((Object)this.j0().getSerializable("location"));
        int n8 = this.N0;
        if (n8 != 1 && n8 == 2) {
            this.Q0 = n8 = this.j0().getInt("location_key");
            this.R0 = this.L3(this.P0, n8);
        }
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    private class o
    extends q<Object, Void, Boolean> {
        ax.Z2.o h;
        ax.Q2.f i;
        int j;
        k k;
        Context l;
        X509Certificate m;
        final v n;

        o(v v8, ax.Q2.f f8, int n8, ax.Z2.o o8, k k8) {
            this.n = v8;
            super(q.e.e0);
            this.i = f8;
            this.j = n8;
            this.h = o8;
            this.k = k8;
            this.l = v8.b();
        }

        private void x() {
            T.d((Context)this.n.f0(), this.i).l(this.j, this.h, this.k, true);
        }

        protected Boolean y(Object ... object) {
            if (this.l == null) {
                return Boolean.FALSE;
            }
            object = new W.a();
            ((W.a)object).a(this.l, this.h);
            if (((W.a)object).a) {
                return Boolean.FALSE;
            }
            object = ((W.a)object).b;
            if (object == null) {
                return Boolean.FALSE;
            }
            this.m = object;
            return Boolean.TRUE;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void z(Boolean object) {
            if (this.n.f0() == null) {
                return;
            }
            if (!((Boolean)object).booleanValue()) {
                this.h.u(false);
                this.x();
                return;
            }
            this.n.B3();
            object = this.m.getSubjectDN();
            o.e e8 = "";
            object = object != null ? this.m.getSubjectDN().toString() : "";
            if (this.m.getIssuerDN() != null) {
                e8 = this.m.getIssuerDN().toString();
            }
            object = ax.a3.o.j3(this.h.d(), (String)object, (String)((Object)e8));
            try {
                ((androidx.fragment.app.e)object).c3(this.n.A0(), "save_confirm");
                e8 = new o.e(this){
                    final o a;
                    {
                        this.a = o8;
                    }

                    @Override
                    public void a(boolean bl) {
                        if (this.a.n.f0() != null && bl) {
                            this.a.n.W3();
                            this.a.h.u(true);
                            this.a.x();
                        }
                    }
                };
                ((ax.a3.o)object).m3(e8);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                return;
            }
        }
    }
}

