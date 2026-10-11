package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1359o extends I {
    private e t0;
    private String u0;
    private String v0;
    private String w0;
    private int x0;

    /* renamed from: ax.a3.o$a */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1359o.this.t0.a(true);
        }
    }

    /* renamed from: ax.a3.o$b */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1359o.this.t0.a(false);
        }
    }

    /* renamed from: ax.a3.o$c */
    class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C1359o.this.t0.a(false);
        }
    }

    /* renamed from: ax.a3.o$d */
    class d implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        d(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button i = this.a.i(-1);
            if (i != null) {
                i.requestFocus();
            }
        }
    }

    /* renamed from: ax.a3.o$e */
    public interface e {
        void a(boolean z);
    }

    public static C1359o j3(String str, String str2, String str3) {
        C1359o c1359o = new C1359o();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 2);
        bundle.putString("host", str);
        bundle.putString("param1", str2);
        bundle.putString("param2", str3);
        c1359o.v2(bundle);
        return c1359o;
    }

    public static String k3(String str, String str2) {
        return str + " key fingerprint: " + str2;
    }

    public static C1359o l3(String str, String str2, String str3) {
        C1359o c1359o = new C1359o();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 1);
        bundle.putString("host", str);
        bundle.putString("param1", str2);
        bundle.putString("param2", str3);
        c1359o.v2(bundle);
        return c1359o;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        if (j0() != null) {
            this.x0 = j0().getInt("dialog_type");
            this.w0 = j0().getString("host");
            this.u0 = j0().getString("param1");
            this.v0 = j0().getString("param2");
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        Y2(false);
        a.C0006a a2 = C3190h.a(f0());
        int i = this.x0;
        if (i == 1) {
            a2.setTitle(this.w0);
            a2.f(k3(this.u0, this.v0));
        } else if (i == 2) {
            a2.p(R.string.msg_certificate_not_valid);
            a2.f("Subject DN: " + this.u0 + "\nIssuer DN: " + this.v0);
        }
        a2.setView(LayoutInflater.from(f0()).inflate(R.layout.dialog_remote_continue, (ViewGroup) null, false));
        a2.setPositiveButton(android.R.string.yes, new a());
        a2.setNegativeButton(android.R.string.no, new b());
        a2.j(new c());
        androidx.appcompat.app.a create = a2.create();
        create.setOnShowListener(new d(create));
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void m3(e eVar) {
        this.t0 = eVar;
    }
}
