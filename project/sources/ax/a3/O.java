package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.c3.g0;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class O extends I {
    private TextInputLayout t0;
    private EditText u0;
    private ax.Q2.f v0;
    private int w0;

    class a implements TextView.OnEditorActionListener {
        a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                return false;
            }
            if (keyEvent != null && keyEvent.getAction() == 1) {
                return true;
            }
            O.this.k3();
            return true;
        }
    }

    class b implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                O.this.k3();
            }
        }

        b(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
        }
    }

    public static O i3(ax.c3.K k) {
        O o = new O();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", k.d());
        bundle.putInt("LOCATION_KEY", k.b());
        o.v2(bundle);
        return o;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.v0 = (ax.Q2.f) j0().getSerializable("LOCATION");
        this.w0 = j0().getInt("LOCATION_KEY");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        String j3 = j3();
        a.C0006a p = C3190h.a(f0()).p(R.string.dialog_title_rename_file);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_filename_input, (ViewGroup) null, false);
        this.t0 = (TextInputLayout) inflate.findViewById(R.id.filename_layout);
        EditText editText = (EditText) inflate.findViewById(R.id.file_name);
        this.u0 = editText;
        editText.setText(j3);
        this.u0.selectAll();
        this.u0.setOnEditorActionListener(new a());
        this.u0.requestFocus();
        p.b(true);
        p.setView(inflate);
        p.setNegativeButton(android.R.string.cancel, null);
        p.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = p.create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new b(create));
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    String j3() {
        return ax.Q2.f.X(this.v0) ? com.voxdon.xplorer.file.T.b(f0(), this.v0).f(this.w0).f() : com.voxdon.xplorer.file.T.d(f0(), this.v0).f(this.w0).f();
    }

    public void k3() {
        l3(this.u0.getText().toString().trim());
        if (P0() instanceof ax.g3.n) {
            ((ax.g3.n) P0()).E(this.v0, this.w0);
        }
        N2();
    }

    void l3(String str) {
        if (ax.Q2.f.X(this.v0)) {
            com.voxdon.xplorer.file.T b2 = com.voxdon.xplorer.file.T.b(f0(), this.v0);
            if (TextUtils.isEmpty(str)) {
                str = this.v0.M(f0());
            }
            b2.g(this.w0, str);
            return;
        }
        g0 d = com.voxdon.xplorer.file.T.d(f0(), this.v0);
        if (TextUtils.isEmpty(str)) {
            str = d.k(this.w0).d();
        }
        d.g(this.w0, str);
    }
}
