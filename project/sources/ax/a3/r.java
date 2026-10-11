package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.W2.h;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.u3.AbstractC3199q;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3591j;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r extends I {
    private DialogInterface.OnCancelListener A0;
    private C3596o B0;
    private List<AbstractC3595n> C0;
    private C3587f D0;
    private int E0;
    private int F0;
    private boolean G0;
    private boolean H0;
    private ax.W2.o I0;
    private boolean J0;
    private ax.c3.K K0;
    private TextView t0;
    private TextView u0;
    private CheckBox v0;
    private ColorStateList w0;
    private Button x0;
    private Button y0;
    private f z0;

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            r.this.I0.y(!z);
            r.this.t0.setText(r.this.B3(!z));
            r.this.Q2().setTitle(r.this.C3(!z));
            r rVar = r.this;
            rVar.H3(rVar.v0.getContext());
        }
    }

    class b extends AbstractDialogInterfaceOnClickListenerC1363t {
        b() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (r.this.A0 != null) {
                r.this.A0.onCancel(dialogInterface);
            }
        }
    }

    class c extends AbstractDialogInterfaceOnClickListenerC1363t {
        c() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (r.this.z0 != null) {
                r.this.z0.a(true);
            }
        }
    }

    class d implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        d(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            r.this.D3(this.a);
        }
    }

    class e implements C3587f.b {
        e() {
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void a(int i, int i2, long j, Map<String, C3587f.a> map) {
            if (!r.this.X0() || r.this.f0() == null) {
                return;
            }
            r.this.I0.z(i2);
            r.this.I0.A(j);
            r.this.I0.w(map);
            if (r.this.F0 != 0) {
                r.this.t0.setText(r.this.F0);
            } else {
                TextView textView = r.this.t0;
                r rVar = r.this;
                textView.setText(rVar.B3(rVar.I0.p()));
            }
            r.this.x0.setVisibility(0);
            r.this.y0.setVisibility(0);
            r.this.x0.requestFocus();
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void b(int i, int i2, long j) {
            if (!r.this.X0() || r.this.f0() == null) {
                return;
            }
            r.this.u0.setText(r.this.N0(R.string.delete_file_count, Integer.valueOf(i), Integer.valueOf(i2), C1809B.k(r.this.f0(), j)));
        }
    }

    public interface f {
        void a(boolean z);
    }

    class g extends AbstractC3199q<Void, Void, List<AbstractC3595n>> {
        C3596o h;
        Exception i;
        Context j;

        g() {
            super(AbstractC3199q.e.HIGH);
            this.h = C1835x.e(ax.T2.h.b0(r.this.K0));
            this.j = r.this.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(Void... voidArr) {
            try {
                C3596o c3596o = this.h;
                return this.h.f0(c3596o.z(c3596o.V()));
            } catch (C1495j e) {
                this.i = e;
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            h.a f = r.this.I0.f();
            if (list == null) {
                ax.Ha.c.h().d("EMPTY_RECYCLE BIN").l(this.i).h();
                String string = this.j.getString(R.string.msg_delete_failed);
                Toast.makeText(this.j, R.string.error, 1).show();
                f.a(h.b.FAILURE, string, null, null, null);
                r.this.O2();
                return;
            }
            C3591j R0 = C3604x.R0(this.h.t(), list);
            if (R0 == null) {
                r.this.B0 = this.h;
                r.this.C0 = list;
                r.this.I0.o(this.h, list, true, f);
                r.this.new h().i(new Void[0]);
                return;
            }
            if (R0.a != ax.c3.K.f && !ax.X2.Q.L()) {
                ax.Ha.c.h().f().b("RECYCLEBIN EMPTY PERMISION NOT SDCARD").g("location:" + R0.a).h();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(R0.a.k());
            arrayList.add(R0.b);
            f.a(h.b.FAILURE, "NEED_STORAGE_PERMISSION", null, arrayList, null);
            r.this.O2();
        }
    }

    class h extends AbstractC3199q<Void, Void, Void> {
        h() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            r.this.I0.k();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r1) {
            r.this.E3();
        }
    }

    public static r A3(ax.W2.o oVar, ax.c3.K k, int i, int i2, boolean z, boolean z2) {
        r rVar = new r();
        Bundle bundle = new Bundle();
        bundle.putLong("command_id", oVar.e());
        bundle.putSerializable("location", k.d());
        bundle.putInt("location_key", k.b());
        if (i != 0) {
            bundle.putInt("custom_title", i);
        }
        if (i2 != 0) {
            bundle.putInt("custom_message", i2);
        }
        bundle.putBoolean("default_move_to_recycle_bin", z);
        bundle.putBoolean("show_recycle_checkbox", z2);
        rVar.v2(bundle);
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B3(boolean z) {
        if (this.C0.size() == 1) {
            return f0().getResources().getString(z ? R.string.confirm_recyclebin_single_item : R.string.confirm_delete_item, this.C0.get(0).B());
        }
        return f0().getResources().getQuantityString(z ? R.plurals.confirm_recyclebin_items_plurals : R.plurals.confirm_delete_items_plurals, this.C0.size(), Integer.valueOf(this.C0.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C3(boolean z) {
        return z ? R.string.menu_move_to_recycle_bin : R.string.dialog_title_delete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(androidx.appcompat.app.a aVar) {
        if (this.I0 == null) {
            return;
        }
        if (this.x0 == null) {
            Button i = aVar.i(-1);
            this.x0 = i;
            i.setVisibility(8);
        }
        if (this.y0 == null) {
            Button i2 = aVar.i(-2);
            this.y0 = i2;
            i2.setVisibility(8);
        }
        if (this.J0) {
            return;
        }
        if (this.I0.s()) {
            new g().i(new Void[0]);
        } else if (this.I0.u()) {
            new h().i(new Void[0]);
        } else {
            E3();
        }
        this.J0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3() {
        C3587f c3587f = new C3587f(C3587f.c.DELETE, this.B0, this.I0.q(), this.I0.u(), new e());
        this.D0 = c3587f;
        c3587f.i(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(Context context) {
        CheckBox checkBox = this.v0;
        if (checkBox != null) {
            if (checkBox.isChecked()) {
                this.v0.setTextColor(ax.Q.b.c(context, R.color.vivid_messsage_text_color));
            } else {
                this.v0.setTextColor(this.w0);
            }
        }
    }

    public static r z3(ax.W2.o oVar, ax.c3.K k) {
        r rVar = new r();
        Bundle bundle = new Bundle();
        bundle.putLong("command_id", oVar.e());
        if (k != null) {
            bundle.putSerializable("location", k.d());
            bundle.putInt("location_key", k.b());
        }
        bundle.putInt("custom_title", R.string.menu_empty_recycle_bin);
        bundle.putInt("custom_message", R.string.empty_recycle_bin_message);
        rVar.v2(bundle);
        return rVar;
    }

    public void F3(f fVar) {
        this.z0 = fVar;
    }

    public void G3(DialogInterface.OnCancelListener onCancelListener) {
        this.A0 = onCancelListener;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        ax.W2.o oVar = (ax.W2.o) ax.W2.i.c(j0().getLong("command_id"));
        this.I0 = oVar;
        if (oVar == null) {
            ax.Ha.c.h().f().b("not existing command id").h();
            Z2(false);
            N2();
            return;
        }
        if (oVar.s()) {
            ax.Q2.f fVar = (ax.Q2.f) j0().getSerializable("location");
            if (fVar == null) {
                this.K0 = null;
            } else {
                this.K0 = ax.c3.K.a(fVar, j0().getInt("location_key"));
            }
        } else {
            this.C0 = this.I0.q();
            this.B0 = C1835x.d((ax.Q2.f) j0().getSerializable("location"), j0().getInt("location_key"));
        }
        this.E0 = j0().getInt("custom_title");
        this.F0 = j0().getInt("custom_message");
        this.G0 = j0().getBoolean("default_move_to_recycle_bin", false);
        this.H0 = j0().getBoolean("show_recycle_checkbox", false);
    }

    @Override // ax.a3.I
    public Dialog g3() {
        View inflate = ((LayoutInflater) f0().getSystemService("layout_inflater")).inflate(R.layout.dialog_delete, (ViewGroup) null, false);
        this.t0 = (TextView) inflate.findViewById(R.id.delete_tv_info);
        this.u0 = (TextView) inflate.findViewById(R.id.delete_tv_count);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.check_permanently_delete);
        this.v0 = checkBox;
        if (this.H0) {
            checkBox.setVisibility(0);
        }
        this.v0.setChecked(!this.G0);
        this.w0 = this.v0.getTextColors();
        H3(f0());
        this.v0.setOnCheckedChangeListener(new a());
        a.C0006a a2 = C3190h.a(f0());
        int i = this.E0;
        a.C0006a p = i != 0 ? a2.p(i) : a2.p(C3(this.G0));
        this.t0.setText(R.string.dialog_msg_prepare_delete);
        p.b(true);
        p.setView(inflate);
        p.setNegativeButton(android.R.string.cancel, new b());
        p.setPositiveButton(android.R.string.ok, new c());
        androidx.appcompat.app.a create = p.create();
        create.setCanceledOnTouchOutside(true);
        create.setOnShowListener(new d(create));
        return create;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void v1() {
        C3587f c3587f = this.D0;
        if (c3587f != null) {
            c3587f.e();
        }
        super.v1();
    }
}
