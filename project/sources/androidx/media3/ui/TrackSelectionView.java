package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import ax.P0.C0912v;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.V;
import ax.S0.C0968a;
import ax.a2.C1311B;
import ax.a2.C1313D;
import ax.a2.C1322f;
import ax.a2.InterfaceC1316G;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    private final int a;
    private final LayoutInflater b;
    private final CheckedTextView c;
    private final CheckedTextView d;
    private final b e;
    private final List<V.a> f;
    private final Map<P, Q> g;
    private boolean h;
    private boolean i;
    private InterfaceC1316G j;
    private CheckedTextView[][] k;
    private boolean l;
    private Comparator<c> m;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {
        public final V.a a;
        public final int b;

        public c(V.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        public C0912v a() {
            return this.a.b(this.b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<P, Q> b(Map<P, Q> map, List<V.a> list, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            Q q = map.get(list.get(i).a());
            if (q != null && (z || hashMap.isEmpty())) {
                hashMap.put(q.a, q);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.c) {
            e();
        } else if (view == this.d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.l = false;
        this.g.clear();
    }

    private void e() {
        this.l = true;
        this.g.clear();
    }

    private void f(View view) {
        this.l = false;
        c cVar = (c) C0968a.e(view.getTag());
        P a2 = cVar.a.a();
        int i = cVar.b;
        Q q = this.g.get(a2);
        if (q == null) {
            if (!this.i && !this.g.isEmpty()) {
                this.g.clear();
            }
            this.g.put(a2, new Q(a2, AbstractC2991z.A(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(q.b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g = g(cVar.a);
        boolean z = g || h();
        if (isChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.g.remove(a2);
                return;
            } else {
                this.g.put(a2, new Q(a2, arrayList));
                return;
            }
        }
        if (isChecked) {
            return;
        }
        if (!g) {
            this.g.put(a2, new Q(a2, AbstractC2991z.A(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.g.put(a2, new Q(a2, arrayList));
        }
    }

    private boolean g(V.a aVar) {
        return this.h && aVar.e();
    }

    private boolean h() {
        return this.i && this.f.size() > 1;
    }

    private void i() {
        this.c.setChecked(this.l);
        this.d.setChecked(!this.l && this.g.isEmpty());
        for (int i = 0; i < this.k.length; i++) {
            Q q = this.g.get(this.f.get(i).a());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (q != null) {
                        this.k[i][i2].setChecked(q.b.contains(Integer.valueOf(((c) C0968a.e(checkedTextViewArr[i2].getTag())).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f.isEmpty()) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        this.k = new CheckedTextView[this.f.size()][];
        boolean h = h();
        for (int i = 0; i < this.f.size(); i++) {
            V.a aVar = this.f.get(i);
            boolean g = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i2 = aVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            c[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < aVar.a; i3++) {
                cVarArr[i3] = new c(aVar, i3);
            }
            Comparator<c> comparator = this.m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.b.inflate(C1311B.a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.b.inflate((g || h) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.a);
                checkedTextView.setText(this.j.a(cVarArr[i4].a()));
                checkedTextView.setTag(cVarArr[i4]);
                if (aVar.j(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.k[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<P, Q> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z && this.g.size() > 1) {
                Map<P, Q> b2 = b(this.g, this.f, false);
                this.g.clear();
                this.g.putAll(b2);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC1316G interfaceC1316G) {
        this.j = (InterfaceC1316G) C0968a.e(interfaceC1316G);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        b bVar = new b();
        this.e = bVar;
        this.j = new C1322f(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C1313D.x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C1311B.a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C1313D.w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
