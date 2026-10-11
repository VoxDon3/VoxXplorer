package ax.a3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.a3.C1350f;
import ax.a3.C1359o;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.x3.C3407C;
import ax.x3.C3429o;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.R;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.a3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1365v extends androidx.fragment.app.e {
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
    ax.g3.c U0 = new a();
    private View t0;
    private EditText u0;
    private EditText v0;
    private EditText w0;
    private boolean x0;
    private boolean y0;
    private boolean z0;

    /* renamed from: ax.a3.v$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1365v.this.M3(null);
        }
    }

    /* renamed from: ax.a3.v$b */
    class b extends ax.g3.c {
        final /* synthetic */ Button c;

        b(Button button) {
            this.c = button;
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1365v c1365v = C1365v.this;
            c1365v.T3(c1365v.Q2().findViewById(R.id.root_view));
            this.c.setVisibility(8);
        }
    }

    /* renamed from: ax.a3.v$e */
    static /* synthetic */ class e {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.H0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.I0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.J0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.K0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ax.a3.v$f */
    class f implements CompoundButton.OnCheckedChangeListener {
        f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1365v.this.x0 = z;
        }
    }

    /* renamed from: ax.a3.v$g */
    class g implements CompoundButton.OnCheckedChangeListener {
        g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1365v.this.x0 = !z;
        }
    }

    /* renamed from: ax.a3.v$h */
    class h implements CompoundButton.OnCheckedChangeListener {
        h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1365v.this.y0 = z;
        }
    }

    /* renamed from: ax.a3.v$i */
    class i implements CompoundButton.OnCheckedChangeListener {
        i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1365v.this.y0 = !z;
        }
    }

    /* renamed from: ax.a3.v$j */
    class j implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ View a;

        j(View view) {
            this.a = view;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                C1365v.this.J0.setVisibility(0);
            }
            C1365v.this.z0 = !z;
            if (!C1365v.this.T0 || C1365v.this.z0) {
                return;
            }
            this.a.findViewById(R.id.server_layout_security).setVisibility(8);
        }
    }

    /* renamed from: ax.a3.v$k */
    class k implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ View a;

        k(View view) {
            this.a = view;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                C1365v.this.J0.setVisibility(8);
            }
            C1365v.this.z0 = z;
            if (C1365v.this.T0 && C1365v.this.z0) {
                this.a.findViewById(R.id.server_layout_security).setVisibility(0);
            }
        }
    }

    /* renamed from: ax.a3.v$l */
    class l implements CompoundButton.OnCheckedChangeListener {
        l() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                C1365v.this.J0.setVisibility(0);
            }
            C1365v.this.z0 = !z;
            if (C1365v.this.z0 || C1365v.this.G3() != 443) {
                return;
            }
            C1365v.this.w0.setText("80");
        }
    }

    /* renamed from: ax.a3.v$m */
    class m implements CompoundButton.OnCheckedChangeListener {
        m() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                C1365v.this.J0.setVisibility(8);
            }
            C1365v.this.z0 = z;
            if (C1365v.this.z0 && C1365v.this.G3() == 80) {
                C1365v.this.w0.setText("443");
            }
        }
    }

    /* renamed from: ax.a3.v$n */
    class n implements CompoundButton.OnCheckedChangeListener {
        n() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1365v.this.A0 = z;
            C1365v.this.B0.setEnabled(!z);
            C1365v.this.C0.setEnabled(!z);
        }
    }

    /* renamed from: ax.a3.v$o */
    private class o extends AbstractC3199q<Object, Void, Boolean> {
        ax.Z2.o h;
        ax.Q2.f i;
        int j;
        ax.g3.k k;
        Context l;
        X509Certificate m;

        /* renamed from: ax.a3.v$o$a */
        class a implements C1359o.e {
            a() {
            }

            @Override // ax.a3.C1359o.e
            public void a(boolean z) {
                if (C1365v.this.f0() != null && z) {
                    C1365v.this.W3();
                    o.this.h.u(true);
                    o.this.x();
                }
            }
        }

        o(ax.Q2.f fVar, int i, ax.Z2.o oVar, ax.g3.k kVar) {
            super(AbstractC3199q.e.HIGH);
            this.i = fVar;
            this.j = i;
            this.h = oVar;
            this.k = kVar;
            this.l = C1365v.this.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            com.voxdon.xplorer.file.T.d(C1365v.this.f0(), this.i).l(this.j, this.h, this.k, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Boolean g(Object... objArr) {
            if (this.l == null) {
                return Boolean.FALSE;
            }
            W.a aVar = new W.a();
            aVar.a(this.l, this.h);
            if (aVar.a) {
                return Boolean.FALSE;
            }
            X509Certificate x509Certificate = aVar.b;
            if (x509Certificate == null) {
                return Boolean.FALSE;
            }
            this.m = x509Certificate;
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (C1365v.this.f0() == null) {
                return;
            }
            if (!bool.booleanValue()) {
                this.h.u(false);
                x();
                return;
            }
            C1365v.this.B3();
            Principal subjectDN = this.m.getSubjectDN();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String principal = subjectDN != null ? this.m.getSubjectDN().toString() : HttpUrl.FRAGMENT_ENCODE_SET;
            if (this.m.getIssuerDN() != null) {
                str = this.m.getIssuerDN().toString();
            }
            C1359o j3 = C1359o.j3(this.h.d(), principal, str);
            try {
                j3.c3(C1365v.this.A0(), "save_confirm");
                j3.m3(new a());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.I0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.S0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        ProgressDialog progressDialog = this.K0;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
                this.K0 = null;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static C1365v C3(ax.c3.K k2) {
        C1365v c1365v = new C1365v();
        Bundle bundle = new Bundle();
        bundle.putInt("action", 2);
        bundle.putSerializable("location", k2.d());
        bundle.putInt("location_key", k2.b());
        c1365v.v2(bundle);
        return c1365v;
    }

    private String D3() {
        C3429o.a aVar = (C3429o.a) this.G0.getSelectedItem();
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    private String E3() {
        return this.S0;
    }

    private String F3() {
        C3407C.a aVar = (C3407C.a) this.H0.getSelectedItem();
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G3() {
        try {
            return Integer.parseInt(this.w0.getText().toString().trim());
        } catch (NumberFormatException unused) {
            return this.L0;
        }
    }

    private boolean I3(ax.Q2.f fVar) {
        return fVar == ax.Q2.f.H0 || fVar == ax.Q2.f.J0 || fVar == ax.Q2.f.I0;
    }

    private boolean J3() {
        return !TextUtils.isEmpty(this.S0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(View view) {
        view.findViewById(R.id.server_layout_private_key_passphrase).setVisibility(8);
        view.findViewById(R.id.server_layout_password).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M3(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.C1365v.M3(java.lang.String):void");
    }

    private void N3(String str, String str2, int i2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, String str8, String str9, String str10) {
        d dVar;
        int i3;
        ax.Z2.o oVar;
        int indexOf;
        d dVar2 = new d(str2);
        int i4 = this.N0;
        int i5 = i4 == 1 ? -100 : i4 == 2 ? this.Q0 : -1;
        ax.Z2.o oVar2 = new ax.Z2.o();
        oVar2.t(str10);
        oVar2.r(str);
        oVar2.s(str2);
        oVar2.z(i2);
        oVar2.D(str3);
        oVar2.y(str4);
        oVar2.v(str5);
        oVar2.q(str6);
        ax.Q2.f fVar = this.P0;
        if (fVar == ax.Q2.f.J0) {
            if (TextUtils.isEmpty(str) && (indexOf = str3.indexOf(92)) > 0) {
                oVar2.r(str3.substring(0, indexOf));
                oVar2.D(str3.substring(indexOf + 1));
            }
            oVar2.B(str9);
        } else if (fVar == ax.Q2.f.H0) {
            oVar2.w(z);
            oVar2.x(z2);
            oVar2.p(str7);
            oVar2.C(z3);
        } else if (fVar == ax.Q2.f.I0) {
            oVar2.A(str8);
        } else if (fVar == ax.Q2.f.K0) {
            oVar2.C(z3);
            if (z3) {
                new o(this.P0, i5, oVar2, dVar2).i(new Object[0]);
                return;
            }
            dVar = dVar2;
            i3 = i5;
            oVar = oVar2;
            oVar.u(false);
            com.voxdon.xplorer.file.T.d(f0(), this.P0).l(i3, oVar, dVar, true);
        }
        dVar = dVar2;
        i3 = i5;
        oVar = oVar2;
        com.voxdon.xplorer.file.T.d(f0(), this.P0).l(i3, oVar, dVar, true);
    }

    private void O3(Spinner spinner, String str) {
        int i2 = 0;
        if (str != null) {
            int indexOf = C3429o.a(b()).indexOf(C3429o.a.a(str));
            if (indexOf >= 0) {
                i2 = indexOf;
            }
        }
        spinner.setSelection(i2);
    }

    private void P3(Spinner spinner, String str) {
        int i2 = 0;
        if (str != null) {
            int indexOf = C3407C.a(b()).indexOf(C3407C.a.a(str));
            if (indexOf >= 0) {
                i2 = indexOf;
            }
        }
        spinner.setSelection(i2);
    }

    private void Q3(boolean z) {
        if (this.F0 == null) {
            C3184b.f();
        } else {
            this.E0.setChecked(!z);
            this.F0.setChecked(z);
        }
    }

    private void R3(String str) {
        this.I0.setText(com.voxdon.xplorer.file.L.w0(str));
        this.S0 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r4.I0.setText(r7.B());
        V3(r5, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r4.I0.setText(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r6 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        ax.c3.F.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r4.S0 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S3(android.view.View r5, com.voxdon.xplorer.file.C3596o r6, com.voxdon.xplorer.file.AbstractC3595n r7) {
        /*
            r4 = this;
            r0 = 0
            r2 = 0
            java.io.InputStream r6 = r6.J(r7, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Throwable -> L24
            long r0 = r7.p()     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            byte[] r0 = ax.c3.F.h(r6, r1)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            java.lang.String r3 = "UTF-8"
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            r4.S0 = r1     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L25
            if (r6 == 0) goto L2a
        L1b:
            ax.c3.F.a(r6)
            goto L2a
        L1f:
            r5 = move-exception
            r2 = r6
            goto L43
        L22:
            r5 = move-exception
            goto L43
        L24:
            r6 = r2
        L25:
            r4.S0 = r2     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L2a
            goto L1b
        L2a:
            java.lang.String r6 = r4.S0
            java.lang.String r0 = ""
            if (r6 == 0) goto L3d
            android.widget.TextView r6 = r4.I0
            java.lang.String r7 = r7.B()
            r6.setText(r7)
            r4.V3(r5, r0)
            goto L42
        L3d:
            android.widget.TextView r5 = r4.I0
            r5.setText(r0)
        L42:
            return
        L43:
            if (r2 == 0) goto L48
            ax.c3.F.a(r2)
        L48:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.C1365v.S3(android.view.View, com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(View view) {
        this.T0 = true;
        if (I3(this.P0)) {
            ax.Q2.f fVar = this.P0;
            if (fVar == ax.Q2.f.H0) {
                view.findViewById(R.id.server_layout_mode).setVisibility(0);
                if (this.z0) {
                    view.findViewById(R.id.server_layout_security).setVisibility(0);
                } else {
                    view.findViewById(R.id.server_layout_security).setVisibility(8);
                }
                view.findViewById(R.id.server_layout_encoding).setVisibility(0);
            } else if (fVar == ax.Q2.f.J0) {
                view.findViewById(R.id.server_layout_domain).setVisibility(0);
                view.findViewById(R.id.server_layout_port).setVisibility(0);
                view.findViewById(R.id.server_layout_protocol).setVisibility(0);
            } else if (fVar == ax.Q2.f.I0) {
                U3(view);
            }
        }
        view.findViewById(R.id.server_layout_diaplay).setVisibility(0);
    }

    private void U3(View view) {
        view.findViewById(R.id.server_layout_private_key).setVisibility(0);
        this.I0.setOnClickListener(new c(view));
    }

    private void V3(View view, String str) {
        view.findViewById(R.id.server_layout_private_key_passphrase).setVisibility(0);
        view.findViewById(R.id.server_layout_password).setVisibility(8);
        ((EditText) view.findViewById(R.id.server_private_key_passphrase)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3() {
        ProgressDialog progressDialog = new ProgressDialog(f0());
        this.K0 = progressDialog;
        progressDialog.setMessage(M0(R.string.dialog_msg_connecting));
        this.K0.setProgressStyle(0);
        this.K0.show();
    }

    private String X3(String str) {
        return (str == null || !str.startsWith("//")) ? str : str.substring(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y3() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.C1365v.y3():void");
    }

    private boolean z3(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(b(), R.string.enter_host, 1).show();
            return false;
        }
        if (!z) {
            if (TextUtils.isEmpty(str2)) {
                Toast.makeText(b(), R.string.invalid_username_password, 1).show();
                return false;
            }
            if (TextUtils.isEmpty(str3) && ((this.P0 != ax.Q2.f.I0 || !J3()) && !"guest".equalsIgnoreCase(str2) && this.P0 != ax.Q2.f.J0)) {
                Toast.makeText(b(), R.string.error_password_empty, 1).show();
                return false;
            }
        }
        return true;
    }

    int H3() {
        int i2 = e.a[this.P0.ordinal()];
        if (i2 == 1) {
            return R.string.location_ftp;
        }
        if (i2 == 2) {
            return R.string.location_sftp;
        }
        if (i2 == 3) {
            return R.string.location_smb;
        }
        if (i2 != 4) {
            return 0;
        }
        return R.string.location_webdav;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        if (aVar != null) {
            aVar.i(-1).setOnClickListener(this.U0);
            Button i2 = aVar.i(-3);
            i2.setOnClickListener(new b(i2));
        }
    }

    ax.Z2.o L3(ax.Q2.f fVar, int i2) {
        return com.voxdon.xplorer.file.T.d(f0(), fVar).k(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x028a, code lost:
    
        if (I3(r16.P0) == false) goto L41;
     */
    @Override // androidx.fragment.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Dialog T2(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.C1365v.T2(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.N0 = j0().getInt("action");
        this.M0 = j0().getString("host");
        this.O0 = j0().getString("display_name");
        this.L0 = j0().getInt("port");
        this.P0 = (ax.Q2.f) j0().getSerializable("location");
        int i2 = this.N0;
        if (i2 != 1 && i2 == 2) {
            int i3 = j0().getInt("location_key");
            this.Q0 = i3;
            this.R0 = L3(this.P0, i3);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    /* renamed from: ax.a3.v$c */
    class c extends ax.g3.c {
        final /* synthetic */ View c;

        c(View view) {
            this.c = view;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1365v.this.s0() == null) {
                return;
            }
            C1350f G3 = C1350f.G3(C1365v.this.S0 != null);
            G3.P3(new a());
            G3.c3(C1365v.this.s0(), "choose_key");
        }

        /* renamed from: ax.a3.v$c$a */
        class a implements C1350f.j {
            a() {
            }

            @Override // ax.a3.C1350f.j
            public void b() {
                C1365v.this.A3();
                c cVar = c.this;
                C1365v.this.K3(cVar.c);
            }

            @Override // ax.a3.C1350f.j
            public void c(C3596o c3596o, AbstractC3595n abstractC3595n) {
                if (abstractC3595n != null) {
                    c cVar = c.this;
                    C1365v.this.S3(cVar.c, c3596o, abstractC3595n);
                }
            }

            @Override // ax.a3.C1350f.j
            public void a() {
            }
        }
    }

    /* renamed from: ax.a3.v$d */
    class d implements ax.g3.k {
        final /* synthetic */ String a;

        /* renamed from: ax.a3.v$d$a */
        class a implements C1359o.e {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // ax.a3.C1359o.e
            public void a(boolean z) {
                if (C1365v.this.f0() != null && z) {
                    C1365v.this.M3(this.a);
                }
            }
        }

        d(String str) {
            this.a = str;
        }

        @Override // ax.g3.k
        public void a(ax.Q2.f fVar, String str, int i, String str2, String str3) {
            boolean z;
            C1365v.this.B3();
            if (C1365v.this.X0()) {
                if (i > 0) {
                    str = str + ":" + i;
                }
                String N0 = C1365v.this.N0(R.string.msg_connection_failed_with_user, str, str2);
                if (ax.t3.j.o(C1365v.this.f0()) && !TextUtils.isEmpty(str3)) {
                    N0 = N0 + " : " + str3;
                    if (ax.X2.Q.b0()) {
                        z = true;
                        if (z || C1365v.this.Q2() == null) {
                            Toast.makeText(C1365v.this.f0(), N0, 1).show();
                        }
                        View findViewById = C1365v.this.Q2().findViewById(android.R.id.content);
                        if (findViewById != null) {
                            C3180B.U(findViewById, N0, 0, 12).a0();
                            return;
                        } else {
                            Toast.makeText(C1365v.this.f0(), N0, 1).show();
                            return;
                        }
                    }
                }
                z = false;
                if (z) {
                }
                Toast.makeText(C1365v.this.f0(), N0, 1).show();
            }
        }

        @Override // ax.g3.k
        public void c(ax.Q2.f fVar, int i) {
            FragmentManager s0;
            Fragment k0;
            ax.c3.K a2 = ax.c3.K.a(fVar, i);
            C1365v.this.B3();
            if (C1365v.this.N0 == 1) {
                if (C1365v.this.f0() instanceof MainActivity) {
                    ((MainActivity) C1365v.this.f0()).D1().c(fVar, i);
                }
                if (C1365v.this.P0 == ax.Q2.f.J0 && (s0 = C1365v.this.s0()) != null && (k0 = s0.k0("chooseSmb")) != null) {
                    ((androidx.fragment.app.e) k0).O2();
                }
            } else if (C1365v.this.N0 == 2) {
                ax.Z2.b.k().c();
                ax.V2.c.d(a2).a();
                if (C1365v.this.P0() instanceof ax.g3.n) {
                    ((ax.g3.n) C1365v.this.P0()).E(fVar, i);
                }
            }
            if (C1365v.this.f0() == null) {
                return;
            }
            C1365v.this.O2();
        }

        @Override // ax.g3.k
        public void d(ax.Q2.f fVar, int i, Map<String, Object> map) {
            if (fVar == ax.Q2.f.I0) {
                C1365v.this.B3();
                String str = (String) map.get("host_key");
                String str2 = (String) map.get("key_type");
                String str3 = (String) map.get("key_fingerprint");
                if (str == null) {
                    Toast.makeText(C1365v.this.f0(), R.string.error, 1).show();
                    return;
                }
                if (C1365v.this.b() == null) {
                    ax.Ha.c.h().f().d("SFTP HOSTKEY CONFIRM NO DIALOG").h();
                    return;
                }
                if (!C1365v.this.f1()) {
                    C1359o l3 = C1359o.l3(this.a, str2, str3);
                    l3.c3(C1365v.this.A0(), "save_confirm");
                    l3.m3(new a(str));
                } else {
                    String k3 = C1359o.k3(str2, str3);
                    if (C1365v.this.f0() != null) {
                        Toast.makeText(C1365v.this.f0(), k3, 1).show();
                    }
                }
            }
        }

        @Override // ax.g3.k
        public void b(ax.Q2.f fVar) {
        }
    }
}
