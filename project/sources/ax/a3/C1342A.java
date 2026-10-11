package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Filter;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1342A extends I {
    private static final String[] A0 = {"KB", "MB", "GB"};
    private g t0;
    private int u0;
    private int v0;
    private AutoCompleteTextView w0;
    private AutoCompleteTextView x0;
    private EditText y0;
    private EditText z0;

    /* renamed from: ax.a3.A$a */
    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (C1342A.this.t0 != null) {
                C1342A.this.t0.a();
            }
        }
    }

    /* renamed from: ax.a3.A$b */
    class b extends AbstractDialogInterfaceOnClickListenerC1363t {
        b() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (C1342A.this.t0 != null) {
                C1342A.this.t0.b(C1342A.this.p3(), C1342A.this.q3());
            }
        }
    }

    /* renamed from: ax.a3.A$c */
    class c extends AbstractDialogInterfaceOnClickListenerC1363t {
        c() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (C1342A.this.t0 != null) {
                C1342A.this.t0.a();
            }
        }
    }

    /* renamed from: ax.a3.A$d */
    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1342A.this.u0 = i;
        }
    }

    /* renamed from: ax.a3.A$e */
    class e implements AdapterView.OnItemClickListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1342A.this.v0 = i;
        }
    }

    /* renamed from: ax.a3.A$g */
    public interface g {
        void a();

        void b(long j, long j2);
    }

    private long n3(int i, int i2) {
        long j;
        long j2;
        if (i2 == 0) {
            j = i;
            j2 = 1000;
        } else if (i2 == 1) {
            j = i;
            j2 = 1000000;
        } else {
            if (i2 != 2) {
                return i;
            }
            j = i;
            j2 = 1000000000;
        }
        return j * j2;
    }

    public static C1342A o3() {
        return new C1342A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long p3() {
        try {
            String obj = this.y0.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                return -1L;
            }
            return n3(Integer.parseInt(obj), this.u0);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q3() {
        try {
            String obj = this.z0.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                return -1L;
            }
            return n3(Integer.parseInt(obj), this.v0);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private void s3(Context context, AutoCompleteTextView autoCompleteTextView) {
        String[] strArr = A0;
        autoCompleteTextView.setAdapter(new f(context, strArr));
        autoCompleteTextView.setOnItemClickListener(new d());
        this.u0 = 0;
        autoCompleteTextView.setText(strArr[0]);
    }

    private void t3(Context context, AutoCompleteTextView autoCompleteTextView) {
        String[] strArr = A0;
        autoCompleteTextView.setAdapter(new f(context, strArr));
        autoCompleteTextView.setOnItemClickListener(new e());
        this.v0 = 0;
        autoCompleteTextView.setText(strArr[0]);
    }

    @Override // ax.a3.I
    public Dialog g3() {
        Context b2 = b();
        a.C0006a a2 = C3190h.a(f0());
        View inflate = LayoutInflater.from(b2).inflate(R.layout.dialog_file_size_range_input, (ViewGroup) null, false);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(R.id.from_unit_text_view);
        this.w0 = autoCompleteTextView;
        s3(b2, autoCompleteTextView);
        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) inflate.findViewById(R.id.to_unit_text_view);
        this.x0 = autoCompleteTextView2;
        t3(b2, autoCompleteTextView2);
        this.y0 = (EditText) inflate.findViewById(R.id.from_input_edittext);
        this.z0 = (EditText) inflate.findViewById(R.id.to_input_edittext);
        a2.p(R.string.title_size);
        a2.setView(inflate);
        a2.b(true);
        a2.j(new a());
        a2.setPositiveButton(android.R.string.ok, new b());
        a2.setNegativeButton(android.R.string.cancel, new c());
        return a2.create();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        g gVar = this.t0;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void r3(g gVar) {
        this.t0 = gVar;
    }

    /* renamed from: ax.a3.A$f */
    static class f extends ArrayAdapter<String> {
        private String[] a;

        f(Context context, String[] strArr) {
            super(context, R.layout.item_search_filter_dropdown, strArr);
            this.a = strArr;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            return new a();
        }

        /* renamed from: ax.a3.A$f$a */
        class a extends Filter {
            a() {
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = f.this.a;
                filterResults.count = f.this.a.length;
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            }
        }
    }
}
