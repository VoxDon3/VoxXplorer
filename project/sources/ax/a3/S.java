package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import androidx.appcompat.app.a;
import ax.a3.C1342A;
import ax.b0.C1442c;
import ax.c3.C1836y;
import ax.u3.C3180B;
import ax.u3.C3183a;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import com.google.android.material.datepicker.k;
import j$.util.DesugarTimeZone;
import j$.util.List;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.TimeZone;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class S extends I {
    private static final TimeZone J0 = DesugarTimeZone.getTimeZone("UTC");
    private String[] A0;
    private int B0 = -1;
    private int C0 = -1;
    private int D0 = -1;
    private long E0 = -1;
    private long F0 = -1;
    private long G0 = -1;
    private long H0 = -1;
    private ArrayList<String> I0;
    private k t0;
    private ax.Z2.p u0;
    AutoCompleteTextView v0;
    AutoCompleteTextView w0;
    AutoCompleteTextView x0;
    private String[] y0;
    private String[] z0;

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            S.this.T3();
            if (S.this.t0 != null) {
                S.this.t0.a();
            }
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 7) {
                S.this.S3();
            } else {
                S.this.C0 = i;
            }
        }
    }

    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 5) {
                S.this.R3();
            } else {
                S.this.B0 = i;
            }
        }
    }

    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            S.this.D0 = i;
        }
    }

    class e implements C1342A.g {
        e() {
        }

        @Override // ax.a3.C1342A.g
        public void a() {
            S s = S.this;
            s.I3(s.C0, S.this.G0, S.this.H0);
        }

        @Override // ax.a3.C1342A.g
        public void b(long j, long j2) {
            S.this.I3(7, j, j2);
        }
    }

    class f implements ax.A6.j<C1442c<Long, Long>> {
        f() {
        }

        @Override // ax.A6.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1442c<Long, Long> c1442c) {
            S.this.H3(5, c1442c.a.longValue(), c1442c.b.longValue(), true);
        }
    }

    class g implements DialogInterface.OnCancelListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            S s = S.this;
            s.H3(s.B0, S.this.E0, S.this.F0, false);
        }
    }

    class h extends ax.g3.c {
        h() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            S s = S.this;
            s.H3(s.B0, S.this.E0, S.this.F0, false);
        }
    }

    public static class i implements Comparator<String> {
        Collator c0;
        C3183a q;

        public i() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
            }
            this.c0.setStrength(3);
            this.q = new C3183a(this.c0);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            try {
                return this.q.compare(str, str2);
            } catch (Exception unused) {
                return this.c0.compare(str, str2);
            }
        }
    }

    public interface k {
        void a();
    }

    public static S B3() {
        return new S();
    }

    private String C3(long j2, long j3) {
        return C1836y.d(j2, j3, true);
    }

    private int E3() {
        Calendar calendar = Calendar.getInstance();
        int firstDayOfWeek = calendar.getFirstDayOfWeek() - calendar.get(7);
        return firstDayOfWeek > 0 ? firstDayOfWeek - 7 : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i2, long j2, long j3, boolean z) {
        if (i2 == -1) {
            this.B0 = i2;
            this.v0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        } else if (i2 == 5) {
            this.B0 = i2;
            K3(j2, j3, z);
        } else {
            this.B0 = i2;
            this.v0.setText(this.y0[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(int i2, long j2, long j3) {
        if (i2 == -1) {
            this.C0 = i2;
            this.w0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            if (i2 != 7) {
                this.C0 = i2;
                this.w0.setText(this.z0[i2]);
                return;
            }
            this.C0 = i2;
            if (j2 > j3) {
                L3(j3, j2);
            } else {
                L3(j2, j3);
            }
        }
    }

    private void J3(int i2, String str) {
        this.D0 = i2;
        this.x0.setText(G3(str));
    }

    private void K3(long j2, long j3, boolean z) {
        if (z) {
            this.E0 = A3(j2);
            this.F0 = z3(j3);
        } else {
            this.E0 = y3(j2);
            this.F0 = x3(j3);
        }
        this.v0.setText(DateUtils.formatDateRange(b(), this.E0, this.F0, 524304));
    }

    private void L3(long j2, long j3) {
        this.G0 = j2;
        this.H0 = j3;
        this.w0.setText(C3(j2, j3));
    }

    private void O3(Context context, AutoCompleteTextView autoCompleteTextView) {
        this.y0 = context.getResources().getStringArray(R.array.date_filter_values);
        autoCompleteTextView.setAdapter(new j(context, this.y0));
        autoCompleteTextView.setOnItemClickListener(new c());
        ax.Z2.p pVar = this.u0;
        int i2 = pVar.g0;
        if (i2 >= 0) {
            if (i2 == 0) {
                pVar.g0 = -1;
            }
            H3(pVar.g0, pVar.q, pVar.c0, false);
        }
    }

    private void P3(Context context, AutoCompleteTextView autoCompleteTextView) {
        this.z0 = context.getResources().getStringArray(R.array.size_filter_values);
        autoCompleteTextView.setAdapter(new j(context, this.z0));
        autoCompleteTextView.setOnItemClickListener(new b());
        ax.Z2.p pVar = this.u0;
        int i2 = pVar.h0;
        if (i2 >= 0) {
            if (i2 == 0) {
                pVar.h0 = -1;
            }
            I3(pVar.h0, pVar.d0, pVar.e0);
        }
    }

    private void Q3(Context context, AutoCompleteTextView autoCompleteTextView) {
        ArrayList arrayList = new ArrayList(this.I0);
        arrayList.add(0, context.getResources().getString(R.string.option_any_type));
        this.A0 = (String[]) arrayList.toArray(new String[0]);
        autoCompleteTextView.setAdapter(new j(context, this.A0));
        autoCompleteTextView.setOnItemClickListener(new d());
        ax.Z2.p pVar = this.u0;
        int i2 = pVar.i0;
        if (i2 >= 0) {
            if (i2 == 0) {
                pVar.i0 = -1;
            }
            J3(pVar.i0, pVar.f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3() {
        com.google.android.material.datepicker.k<C1442c<Long, Long>> a2 = k.c.c().a();
        a2.i3(new f());
        a2.g3(new g());
        a2.h3(new h());
        C3180B.d0(A0(), a2, "custom_picker", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3() {
        C1342A o3 = C1342A.o3();
        o3.r3(new e());
        C3180B.d0(A0(), o3, "custom_picker", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3() {
        ax.Z2.p pVar = this.u0;
        int i2 = this.C0;
        pVar.h0 = i2;
        if (i2 == -1 || i2 == 0) {
            pVar.d0 = -1L;
            pVar.e0 = -1L;
        } else if (i2 == 1) {
            pVar.d0 = 0L;
            pVar.e0 = 0L;
        } else if (i2 == 2) {
            pVar.d0 = 0L;
            pVar.e0 = 16000L;
        } else if (i2 == 3) {
            pVar.d0 = 16000L;
            pVar.e0 = 1000000L;
        } else if (i2 == 4) {
            pVar.d0 = 1000000L;
            pVar.e0 = 128000000L;
        } else if (i2 == 5) {
            pVar.d0 = 128000000L;
            pVar.e0 = 1000000000L;
        } else if (i2 == 6) {
            pVar.d0 = 1000000000L;
            pVar.e0 = -1L;
        } else if (i2 == 7) {
            pVar.d0 = this.G0;
            pVar.e0 = this.H0;
        } else {
            C3184b.f();
        }
        if (this.u0.b()) {
            this.u0.k0 = this.w0.getText().toString();
        } else {
            this.u0.k0 = null;
        }
        ax.Z2.p pVar2 = this.u0;
        int i3 = this.B0;
        pVar2.g0 = i3;
        if (i3 == -1 || i3 == 0) {
            pVar2.q = -1L;
            pVar2.c0 = -1L;
        } else if (i3 == 1) {
            pVar2.q = D3(0, true);
            this.u0.c0 = D3(0, false);
        } else if (i3 == 2) {
            pVar2.q = D3(-1, true);
            this.u0.c0 = D3(-1, false);
        } else if (i3 == 3) {
            pVar2.q = D3(E3(), true);
            this.u0.c0 = D3(0, false);
        } else if (i3 == 4) {
            int E3 = E3() - 7;
            int E32 = E3() - 1;
            this.u0.q = D3(E3, true);
            this.u0.c0 = D3(E32, false);
        } else if (i3 == 5) {
            pVar2.q = this.E0;
            pVar2.c0 = this.F0;
        } else {
            C3184b.f();
        }
        if (this.u0.c()) {
            this.u0.j0 = this.v0.getText().toString();
        } else {
            this.u0.j0 = null;
        }
        ax.Z2.p pVar3 = this.u0;
        int i4 = this.D0;
        pVar3.i0 = i4;
        if (i4 < 0 || i4 == 0) {
            pVar3.f0 = null;
        } else {
            pVar3.f0 = F3(i4);
        }
        if (!this.u0.d()) {
            this.u0.l0 = null;
        } else {
            this.u0.l0 = this.x0.getText().toString();
        }
    }

    public long A3(long j2) {
        Calendar calendar = Calendar.getInstance(J0);
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis();
    }

    public long D3(int i2, boolean z) {
        Calendar calendar = Calendar.getInstance();
        if (z) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
        }
        calendar.add(5, i2);
        return calendar.getTimeInMillis();
    }

    public String F3(int i2) {
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        if (i3 < this.I0.size()) {
            return this.I0.get(i3);
        }
        C3184b.g("ExtList Outofbound :" + this.I0.size() + ":" + i2);
        return null;
    }

    public String G3(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    public void M3(ax.B.b<String> bVar) {
        ArrayList<String> arrayList = new ArrayList<>(bVar);
        this.I0 = arrayList;
        List.EL.sort(arrayList, new i());
    }

    public void N3(ax.Z2.p pVar, k kVar) {
        this.u0 = pVar;
        this.t0 = kVar;
    }

    @Override // ax.a3.I
    public Dialog g3() {
        Context b2 = b();
        a.C0006a a2 = C3190h.a(f0());
        View inflate = LayoutInflater.from(b2).inflate(R.layout.dialog_search_filter, (ViewGroup) null, false);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(R.id.date_complete_text_view);
        this.v0 = autoCompleteTextView;
        O3(b2, autoCompleteTextView);
        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) inflate.findViewById(R.id.size_complete_text_view);
        this.w0 = autoCompleteTextView2;
        P3(b2, autoCompleteTextView2);
        AutoCompleteTextView autoCompleteTextView3 = (AutoCompleteTextView) inflate.findViewById(R.id.type_complete_text_view);
        this.x0 = autoCompleteTextView3;
        Q3(b2, autoCompleteTextView3);
        a2.p(R.string.menu_filter);
        a2.setView(inflate);
        a2.b(true);
        a2.setPositiveButton(android.R.string.ok, new a());
        a2.setNegativeButton(android.R.string.cancel, null);
        return a2.create();
    }

    public long x3(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public long y3(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public long z3(long j2) {
        Calendar calendar = Calendar.getInstance(J0);
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        calendar2.set(14, 999);
        return calendar2.getTimeInMillis();
    }

    static class j extends ArrayAdapter<String> {
        private final String[] a;

        j(Context context, String[] strArr) {
            super(context, R.layout.item_search_filter_dropdown, strArr);
            this.a = strArr;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            return new a();
        }

        class a extends Filter {
            a() {
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = j.this.a;
                filterResults.count = j.this.a.length;
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            }
        }
    }
}
