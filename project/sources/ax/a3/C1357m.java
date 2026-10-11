package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.W2.k;
import ax.a3.S;
import ax.c3.d0;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1357m extends I {
    private EditText t0;
    private String u0;
    private AutoCompleteTextView v0;
    private f w0;
    private boolean x0 = false;
    private long y0;

    /* renamed from: ax.a3.m$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (System.currentTimeMillis() - C1357m.this.y0 > 100) {
                C1357m.this.v0.showDropDown();
            }
        }
    }

    /* renamed from: ax.a3.m$b */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            C1357m.this.v0.showDropDown();
            C1357m.this.y0 = System.currentTimeMillis();
            return false;
        }
    }

    /* renamed from: ax.a3.m$c */
    class c implements TextView.OnEditorActionListener {
        c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                return false;
            }
            if (keyEvent != null && keyEvent.getAction() == 1) {
                return true;
            }
            C1357m.this.o3();
            return true;
        }
    }

    /* renamed from: ax.a3.m$d */
    class d implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        /* renamed from: ax.a3.m$d$a */
        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                C1357m.this.o3();
            }
        }

        d(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
        }
    }

    /* renamed from: ax.a3.m$f */
    public interface f {
        void a(String str, k.a aVar);
    }

    public static C1357m m3(String str) {
        C1357m c1357m = new C1357m();
        Bundle bundle = new Bundle();
        bundle.putString("FILE_NAME", str);
        c1357m.v2(bundle);
        return c1357m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        f fVar;
        if (this.x0) {
            return;
        }
        String trim = this.t0.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(f0(), R.string.file_name_cannot_be_empty, 1).show();
            return;
        }
        if (d0.c(trim)) {
            Toast.makeText(f0(), M0(R.string.contains_special_characters), 1).show();
        } else {
            if (f1() || (fVar = this.w0) == null) {
                return;
            }
            fVar.a(trim, n3());
            this.x0 = true;
            N2();
        }
    }

    private void q3(Context context, AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setAdapter(new S.j(context, new String[]{".zip", ".7z"}));
        autoCompleteTextView.setOnItemClickListener(new e());
        autoCompleteTextView.setText(".zip");
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.u0 = j0().getString("FILE_NAME");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a p = C3190h.a(f0()).p(R.string.dialog_title_compress_file);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_compress_file_name, (ViewGroup) null, false);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(R.id.compress_file_name_tv_compress_file_extension);
        this.v0 = autoCompleteTextView;
        autoCompleteTextView.setOnClickListener(new a());
        this.v0.setOnTouchListener(new b());
        EditText editText = (EditText) inflate.findViewById(R.id.compress_file_name_et_compress_file_name);
        this.t0 = editText;
        editText.setText(this.u0);
        this.t0.setOnEditorActionListener(new c());
        this.t0.requestFocus();
        q3(f0(), this.v0);
        p.setView(inflate);
        p.b(true);
        p.setNegativeButton(android.R.string.cancel, null);
        p.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = p.create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new d(create));
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    k.a n3() {
        return ".7z".equals(this.v0.getText().toString()) ? k.a.SEVENZ : k.a.ZIP;
    }

    public void p3(f fVar) {
        this.w0 = fVar;
    }

    /* renamed from: ax.a3.m$e */
    class e implements AdapterView.OnItemClickListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }
}
