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
import com.voxdon.xplorer.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: ax.a3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1360p extends I {
    private d t0;
    private TextInputLayout u0;
    EditText v0;
    private boolean w0;
    private String x0;
    EnumC1356l y0;

    /* renamed from: ax.a3.p$b */
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
            C1360p.this.m3();
            return true;
        }
    }

    /* renamed from: ax.a3.p$c */
    class c implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        /* renamed from: ax.a3.p$c$a */
        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                C1360p.this.m3();
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

    /* renamed from: ax.a3.p$d */
    public interface d {
        EnumC1356l a(String str);
    }

    public static C1360p l3(boolean z, d dVar) {
        C1360p c1360p = new C1360p();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDirectory", z);
        c1360p.v2(bundle);
        c1360p.n3(dVar);
        return c1360p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        EnumC1356l enumC1356l = this.y0;
        EnumC1356l enumC1356l2 = EnumC1356l.SUCCESS;
        if (enumC1356l == enumC1356l2) {
            return;
        }
        String trim = this.v0.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            this.u0.setError(this.x0);
            return;
        }
        if (d0.c(trim)) {
            this.u0.setError(M0(R.string.contains_special_characters));
            return;
        }
        d dVar = this.t0;
        if (dVar != null) {
            EnumC1356l a2 = dVar.a(trim);
            this.y0 = a2;
            if (a2 == enumC1356l2) {
                O2();
                return;
            }
            if (a2 == EnumC1356l.FAILURE_FILENAME_CONFLICT) {
                this.u0.setError(M0(R.string.msg_file_exists));
            } else if (a2 == EnumC1356l.FAILURE_COMMAND_START) {
                this.u0.setError(M0(R.string.error));
            } else {
                O2();
                C3184b.f();
            }
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        boolean z = j0().getBoolean("isDirectory");
        this.w0 = z;
        if (z) {
            this.x0 = M0(R.string.folder_name_cannot_be_empty);
        } else {
            this.x0 = M0(R.string.file_name_cannot_be_empty);
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a p = C3190h.a(f0()).p(this.w0 ? R.string.dialog_title_new_folder : R.string.dialog_title_new_file);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_filename_input, (ViewGroup) null, false);
        this.u0 = (TextInputLayout) inflate.findViewById(R.id.filename_layout);
        EditText editText = (EditText) inflate.findViewById(R.id.file_name);
        this.v0 = editText;
        editText.addTextChangedListener(new a());
        this.v0.setOnEditorActionListener(new b());
        try {
            this.v0.requestFocus();
        } catch (RuntimeException unused) {
        }
        p.setView(inflate);
        p.setNegativeButton(android.R.string.cancel, null);
        p.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = p.create();
        create.setCanceledOnTouchOutside(false);
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new c(create));
        return create;
    }

    public void n3(d dVar) {
        this.t0 = dVar;
    }

    /* renamed from: ax.a3.p$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C1360p.this.b() == null) {
                return;
            }
            if (TextUtils.isEmpty(editable.toString())) {
                C1360p.this.u0.setError(C1360p.this.x0);
            } else if (d0.c(editable.toString())) {
                C1360p.this.u0.setError(C1360p.this.M0(R.string.contains_special_characters));
            } else {
                C1360p.this.u0.setError(null);
                C1360p.this.u0.setErrorEnabled(false);
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
