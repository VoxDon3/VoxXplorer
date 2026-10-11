package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.c3.d0;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: ax.a3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1347c extends I {
    private View A0;
    private View B0;
    private View C0;
    private View D0;
    private View E0;
    private EditText F0;
    private EditText G0;
    private EditText H0;
    private EditText I0;
    private h J0;
    private boolean K0 = false;
    private ax.Q2.f L0;
    private boolean M0;
    private ArrayList<String> N0;
    private List<String> O0;
    private boolean P0;
    private String Q0;
    private boolean R0;
    private TextInputLayout t0;
    private TextInputLayout u0;
    private EditText v0;
    private EditText w0;
    private View x0;
    private ListView y0;
    private View z0;

    /* renamed from: ax.a3.c$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1347c.this.y3();
        }
    }

    /* renamed from: ax.a3.c$b */
    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1347c.this.A3();
        }
    }

    /* renamed from: ax.a3.c$c, reason: collision with other inner class name */
    class C0248c extends ax.g3.c {
        C0248c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1347c.this.z3();
        }
    }

    /* renamed from: ax.a3.c$f */
    class f implements TextView.OnEditorActionListener {
        f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                return false;
            }
            if (keyEvent != null && keyEvent.getAction() == 1) {
                return true;
            }
            C1347c.this.C3();
            return true;
        }
    }

    /* renamed from: ax.a3.c$g */
    class g implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        /* renamed from: ax.a3.c$g$a */
        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                C1347c.this.C3();
            }
        }

        /* renamed from: ax.a3.c$g$b */
        class b extends ax.g3.c {
            final /* synthetic */ Button c;

            b(Button button) {
                this.c = button;
            }

            @Override // ax.g3.c
            public void a(View view) {
                C1347c.this.F3();
                this.c.setVisibility(8);
            }
        }

        g(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
            Button i = this.a.i(-3);
            i.setOnClickListener(new b(i));
        }
    }

    /* renamed from: ax.a3.c$h */
    public interface h {
        EnumC1356l a(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        int selectionStart;
        H3(true);
        D3(0, 1);
        Editable text = this.v0.getText();
        if (!x3() && (selectionStart = this.v0.getSelectionStart()) >= 0) {
            text.insert(selectionStart, "(###)");
        }
    }

    private static boolean B3(List<AbstractC3595n> list) {
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isDirectory()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        if (this.K0) {
            return;
        }
        String trim = this.v0.getText().toString().trim();
        String trim2 = this.w0.getText().toString().trim();
        if ((!this.P0 || trim2.equals(this.Q0)) && TextUtils.isEmpty(trim)) {
            G3();
            return;
        }
        if (d0.c(trim) || d0.c(trim2)) {
            this.t0.setError(M0(R.string.contains_special_characters));
            return;
        }
        List<String> list = this.O0;
        if (list == null) {
            C3184b.f();
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                G3();
                return;
            }
        }
        h hVar = this.J0;
        if (hVar != null) {
            EnumC1356l a2 = hVar.a(this.O0);
            if (a2 == EnumC1356l.SUCCESS) {
                this.K0 = true;
                N2();
            } else if (a2 == EnumC1356l.FAILURE_FILENAME_CONFLICT) {
                this.t0.setError(M0(R.string.msg_file_exists));
            } else if (a2 == EnumC1356l.FAILURE_COMMAND_START) {
                this.t0.setError(M0(R.string.error));
            } else {
                C3184b.f();
            }
        }
    }

    private void D3(int i, int i2) {
        this.F0.setText(String.valueOf(i));
        this.G0.setText(String.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.R0 = true;
        this.C0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        if (this.M0) {
            this.t0.setError(M0(R.string.folder_name_cannot_be_empty));
        } else {
            this.t0.setError(M0(R.string.file_name_cannot_be_empty));
        }
    }

    private void H3(boolean z) {
        if (z) {
            this.D0.setVisibility(0);
        } else {
            this.D0.setVisibility(8);
        }
    }

    private void I3(boolean z) {
        if (z) {
            this.E0.setVisibility(0);
        } else {
            this.E0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3() {
        Context context = this.y0.getContext();
        String trim = this.v0.getText().toString().trim();
        String trim2 = this.w0.getText().toString().trim();
        this.O0 = (!this.P0 || trim2.equals(this.Q0)) ? TextUtils.isEmpty(trim) ? this.N0 : s3(this.N0, trim, null) : s3(this.N0, trim, trim2);
        this.y0.setAdapter((ListAdapter) new ArrayAdapter(context, R.layout.item_batch_rename, this.O0));
    }

    private String r3(String str) {
        String obj = this.H0.getText().toString();
        return TextUtils.isEmpty(obj) ? str : str.replace(obj, this.I0.getText().toString());
    }

    public static C1347c t3(ax.Q2.f fVar, List<AbstractC3595n> list) {
        C1347c c1347c = new C1347c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", fVar);
        bundle.putBoolean("IS_DIRECTORY", B3(list));
        bundle.putStringArrayList("FILENAME_LIST", u3(list));
        c1347c.v2(bundle);
        return c1347c;
    }

    private static ArrayList<String> u3(List<AbstractC3595n> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).B());
        }
        return arrayList;
    }

    private int v3() {
        try {
            return Integer.parseInt(this.F0.getText().toString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private int w3() {
        try {
            return Integer.parseInt(this.G0.getText().toString());
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    private boolean x3() {
        return this.v0.getText().toString().contains("###");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        int selectionStart;
        I3(true);
        Editable text = this.v0.getText();
        if (!text.toString().contains("%%%") && (selectionStart = this.v0.getSelectionStart()) >= 0) {
            text.insert(selectionStart, "%%%");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        int selectionStart;
        H3(true);
        D3(4, 1);
        Editable text = this.v0.getText();
        if (!x3() && (selectionStart = this.v0.getSelectionStart()) >= 0) {
            text.insert(selectionStart, "###");
        }
    }

    public void E3(h hVar) {
        this.J0 = hVar;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.L0 = (ax.Q2.f) j0().getSerializable("LOCATION");
        this.M0 = j0().getBoolean("IS_DIRECTORY");
        this.N0 = j0().getStringArrayList("FILENAME_LIST");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a p = C3190h.a(f0()).p(R.string.menu_batch_rename);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_batch_rename, (ViewGroup) null, false);
        this.t0 = (TextInputLayout) inflate.findViewById(R.id.filename_layout);
        this.u0 = (TextInputLayout) inflate.findViewById(R.id.ext_layout);
        this.v0 = (EditText) inflate.findViewById(R.id.file_name);
        this.w0 = (EditText) inflate.findViewById(R.id.file_ext);
        this.x0 = inflate.findViewById(R.id.dot);
        this.y0 = (ListView) inflate.findViewById(R.id.list);
        this.C0 = inflate.findViewById(R.id.format_button_container);
        this.z0 = inflate.findViewById(R.id.insert_filename);
        this.A0 = inflate.findViewById(R.id.insert_number);
        this.B0 = inflate.findViewById(R.id.insert_fixed_number);
        this.D0 = inflate.findViewById(R.id.format_numbering_container);
        this.E0 = inflate.findViewById(R.id.format_replace_container);
        this.F0 = (EditText) inflate.findViewById(R.id.edit_padding);
        this.G0 = (EditText) inflate.findViewById(R.id.edit_start_number);
        this.H0 = (EditText) inflate.findViewById(R.id.edit_find);
        this.I0 = (EditText) inflate.findViewById(R.id.edit_replace_with);
        J3();
        this.z0.setOnClickListener(new a());
        this.A0.setOnClickListener(new b());
        this.B0.setOnClickListener(new C0248c());
        if (d0.a(this.N0)) {
            this.u0.setVisibility(0);
            this.x0.setVisibility(0);
            String f2 = d0.f(this.N0.get(0));
            this.Q0 = f2;
            this.w0.setText(f2);
            this.P0 = true;
        }
        this.v0.addTextChangedListener(new d());
        e eVar = new e();
        this.F0.addTextChangedListener(eVar);
        this.G0.addTextChangedListener(eVar);
        this.w0.addTextChangedListener(eVar);
        this.H0.addTextChangedListener(eVar);
        this.I0.addTextChangedListener(eVar);
        this.v0.setOnEditorActionListener(new f());
        try {
            this.v0.requestFocus();
        } catch (Exception unused) {
        }
        p.b(true);
        p.setView(inflate);
        p.setNegativeButton(android.R.string.cancel, null);
        p.setPositiveButton(android.R.string.ok, null);
        p.i(R.string.menu_more, null);
        androidx.appcompat.app.a create = p.create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new g(create));
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    List<String> s3(List<String> list, String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str4 = list.get(i);
            String f2 = str2 != null ? str2 : d0.f(str4);
            if (TextUtils.isEmpty(str)) {
                str3 = d0.g(str4);
            } else if (this.R0 && (str.contains("%%%") || x3())) {
                StringBuilder sb = new StringBuilder(str);
                int indexOf = sb.indexOf("%%%");
                if (indexOf >= 0) {
                    sb.replace(indexOf, indexOf + 3, r3(d0.g(str4)));
                }
                int v3 = v3();
                int w3 = w3();
                int indexOf2 = sb.indexOf("###");
                if (indexOf2 >= 0) {
                    sb.replace(indexOf2, indexOf2 + 3, v3 == 0 ? String.valueOf(w3 + i) : String.format(Locale.US, "%0" + v3 + ax.ba.d.d, Integer.valueOf(w3 + i)));
                }
                str3 = sb.toString();
            } else {
                str3 = str + " (" + (i + 1) + ")";
            }
            if (!TextUtils.isEmpty(f2)) {
                str3 = str3 + "." + f2;
            }
            arrayList.add(str3);
        }
        return arrayList;
    }

    /* renamed from: ax.a3.c$d */
    class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!C1347c.this.P0 && TextUtils.isEmpty(editable.toString())) {
                C1347c.this.G3();
            } else if (d0.c(editable.toString())) {
                C1347c.this.t0.setError(C1347c.this.M0(R.string.contains_special_characters));
            } else {
                C1347c.this.t0.setError(null);
                C1347c.this.t0.setErrorEnabled(false);
            }
            C1347c.this.J3();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ax.a3.c$e */
    class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1347c.this.J3();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
