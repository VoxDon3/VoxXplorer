package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.c3.d0;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class N extends I {
    private boolean A0 = false;
    private ax.Q2.f B0;
    private TextInputLayout t0;
    private EditText u0;
    private TextView v0;
    private d w0;
    private boolean x0;
    private String y0;
    private boolean z0;

    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                return false;
            }
            if (keyEvent != null && keyEvent.getAction() == 1) {
                return true;
            }
            N.this.l3();
            return true;
        }
    }

    class c implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                N.this.l3();
            }
        }

        c(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
        }
    }

    public interface d {
        EnumC1356l a(String str);
    }

    public static N k3(ax.Q2.f fVar, AbstractC3595n abstractC3595n) {
        N n = new N();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", fVar);
        bundle.putString("FILE_NAME", abstractC3595n.B());
        bundle.putBoolean("IS_DIRECTORY", abstractC3595n.isDirectory());
        n.v2(bundle);
        return n;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.B0 = (ax.Q2.f) j0().getSerializable("LOCATION");
        this.y0 = j0().getString("FILE_NAME");
        this.z0 = j0().getBoolean("IS_DIRECTORY");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        String str = this.y0;
        a.C0006a p = C3190h.a(f0()).p(R.string.dialog_title_rename_file);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_filename_input, (ViewGroup) null, false);
        this.t0 = (TextInputLayout) inflate.findViewById(R.id.filename_layout);
        this.u0 = (EditText) inflate.findViewById(R.id.file_name);
        this.v0 = (TextView) inflate.findViewById(R.id.file_extension);
        if ((ax.Q2.f.g0(this.B0) || this.B0 == ax.Q2.f.F0) && !this.z0) {
            this.x0 = false;
            this.u0.setText(d0.g(str));
            this.v0.setVisibility(0);
            this.v0.setText("." + d0.f(str));
            this.u0.selectAll();
        } else {
            this.x0 = true;
            this.u0.setText(str);
            if (str.contains(".")) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf < this.u0.getText().length()) {
                    this.u0.setSelection(0, lastIndexOf);
                } else {
                    this.u0.selectAll();
                }
            } else {
                this.u0.selectAll();
            }
        }
        this.u0.addTextChangedListener(new a());
        this.u0.setOnEditorActionListener(new b());
        this.u0.requestFocus();
        p.b(true);
        p.setView(inflate);
        p.setNegativeButton(android.R.string.cancel, null);
        p.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = p.create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new c(create));
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void l3() {
        if (this.A0) {
            return;
        }
        String trim = this.u0.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            if (this.z0) {
                this.t0.setError(M0(R.string.folder_name_cannot_be_empty));
                return;
            } else {
                this.t0.setError(M0(R.string.file_name_cannot_be_empty));
                return;
            }
        }
        if (d0.c(trim)) {
            this.t0.setError(M0(R.string.contains_special_characters));
            return;
        }
        if (!this.x0) {
            trim = trim + this.v0.getText().toString();
        }
        d dVar = this.w0;
        if (dVar != null) {
            EnumC1356l a2 = dVar.a(trim);
            if (a2 == EnumC1356l.SUCCESS) {
                this.A0 = true;
                O2();
            } else if (a2 == EnumC1356l.FAILURE_FILENAME_CONFLICT) {
                this.t0.setError(M0(R.string.msg_file_exists));
            } else if (a2 == EnumC1356l.FAILURE_COMMAND_START) {
                this.t0.setError(M0(R.string.error));
            } else {
                C3184b.f();
            }
        }
    }

    public void m3(d dVar) {
        this.w0 = dVar;
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (N.this.b() == null) {
                return;
            }
            if (TextUtils.isEmpty(editable.toString())) {
                if (N.this.z0) {
                    N.this.t0.setError(N.this.M0(R.string.folder_name_cannot_be_empty));
                    return;
                } else {
                    N.this.t0.setError(N.this.M0(R.string.file_name_cannot_be_empty));
                    return;
                }
            }
            if (d0.c(editable.toString())) {
                N.this.t0.setError(N.this.M0(R.string.contains_special_characters));
            } else {
                N.this.t0.setError(null);
                N.this.t0.setErrorEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
