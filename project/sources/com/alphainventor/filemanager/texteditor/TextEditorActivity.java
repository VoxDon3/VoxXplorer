package com.voxdon.xplorer.texteditor;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.SuggestionSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.Q2.a;
import ax.X2.J;
import ax.X2.Q;
import ax.a3.C1358n;
import ax.a3.D;
import ax.b3.C1495j;
import ax.c0.C1788s;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.o3.C2688e;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.z;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3589h;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.R;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class TextEditorActivity extends ax.R2.c implements C1358n.c {
    private static final Logger D = ax.Q2.g.a(TextEditorActivity.class);
    private static boolean E = false;
    private static final int F;
    private static final int G;
    private static Pattern H;
    private String A;
    private String B;
    private int C;
    private Toolbar a;
    private RecyclerView b;
    private i c;
    private RecyclerView.p d;
    private ProgressBar e;
    private boolean f;
    private h g;
    private String h;
    private String i;
    private ArrayList<j> j;
    private Charset k;
    private String l;
    private int n;
    private int p;
    C1788s q;
    private boolean r;
    private C3596o s;
    private ax.Z2.k t;
    private ScaleGestureDetector u;
    private View.OnTouchListener v;
    private float w;
    private int x;
    private n y;
    private androidx.fragment.app.e z;
    private int m = -1;
    private int o = -1;

    class a extends LinearLayoutManager {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean g1(RecyclerView recyclerView, RecyclerView.B b, View view, View view2) {
            return true;
        }
    }

    class b implements Runnable {
        final /* synthetic */ EditText q;

        b(EditText editText) {
            this.q = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.q.hasFocus()) {
                int selectionStart = this.q.getSelectionStart();
                Layout layout = this.q.getLayout();
                if (layout == null || selectionStart == -1) {
                    return;
                }
                int lineForOffset = layout.getLineForOffset(selectionStart);
                int lineBaseline = layout.getLineBaseline(lineForOffset);
                int lineAscent = layout.getLineAscent(lineForOffset);
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(selectionStart);
                this.q.requestRectangleOnScreen(new Rect(primaryHorizontal, r1, primaryHorizontal, r1), false);
            }
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {

        class a implements Runnable {
            final /* synthetic */ View q;

            a(View view) {
                this.q = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextEditorActivity.this.n()) {
                    return;
                }
                z.E(TextEditorActivity.this, this.q);
            }
        }

        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (TextEditorActivity.this.d.P() > 0) {
                View O = TextEditorActivity.this.d.O(TextEditorActivity.this.d.P() - 1);
                if (!TextEditorActivity.this.f) {
                    O.requestFocus();
                    O.postDelayed(new a(O), 100L);
                }
            }
            return true;
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TextEditorActivity.this.u.onTouchEvent(motionEvent);
            return false;
        }
    }

    class e implements RecyclerView.t {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            TextEditorActivity.this.q.a(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (TextEditorActivity.this.b.X(motionEvent.getX(), motionEvent.getY()) != null) {
                return false;
            }
            TextEditorActivity.this.q.a(motionEvent);
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
        }
    }

    class f extends ax.g3.c {
        f() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            TextEditorActivity.this.onBackPressed();
        }
    }

    public static class g extends Editable.Factory {

        class a extends SpannableStringBuilder {
            a(CharSequence charSequence) {
                super(charSequence);
            }

            @Override // android.text.SpannableStringBuilder, android.text.Editable
            public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
                return (i == 0 && i3 == 0 && i2 == i4 && i2 == length() && length() == charSequence.length() && charSequence.toString().equals(toString()) && (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3, i4, SuggestionSpan.class) < i4) ? this : super.replace(i, i2, charSequence, i3, i4);
            }
        }

        @Override // android.text.Editable.Factory
        public Editable newEditable(CharSequence charSequence) {
            return new a(charSequence);
        }
    }

    enum h {
        UNDEFINED,
        LOADED,
        MODIFIED,
        SAVED
    }

    class i extends RecyclerView.h<a> {
        private ArrayList<j> d;

        class a extends RecyclerView.F {
            public EditText u;
            public boolean v;
            public boolean w;
            public boolean x;

            /* renamed from: com.voxdon.xplorer.texteditor.TextEditorActivity$i$a$a, reason: collision with other inner class name */
            class C0533a implements TextView.OnEditorActionListener {
                final /* synthetic */ i a;

                C0533a(i iVar) {
                    this.a = iVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if ((i != 6 && i != 5) || keyEvent != null) {
                        return false;
                    }
                    int max = Math.max(a.this.u.getSelectionStart(), 0);
                    int max2 = Math.max(a.this.u.getSelectionEnd(), 0);
                    a.this.u.getText().replace(Math.min(max, max2), Math.max(max, max2), "\n", 0, 1);
                    return true;
                }
            }

            class b implements View.OnKeyListener {
                final /* synthetic */ i a;

                b(i iVar) {
                    this.a = iVar;
                }

                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i == 47 && keyEvent.isCtrlPressed()) {
                        TextEditorActivity.this.G0(false);
                    }
                    if (i == 67 && keyEvent.getAction() == 0 && a.this.u.getSelectionStart() == 0) {
                        int k0 = TextEditorActivity.this.b.k0(a.this.u);
                        if (k0 >= 0 && k0 < i.this.d.size() && k0 > 0) {
                            TextEditorActivity.this.O0(h.MODIFIED);
                            int i2 = k0 - 1;
                            TextEditorActivity.this.o = i2;
                            i iVar = i.this;
                            TextEditorActivity.this.p = ((j) iVar.d.get(i2)).a.length();
                            StringBuilder sb = new StringBuilder();
                            j jVar = (j) i.this.d.get(i2);
                            sb.append(jVar.a);
                            sb.append(((j) i.this.d.get(k0)).a);
                            jVar.a = sb.toString();
                            i.this.d.remove(k0);
                            TextEditorActivity.this.c.s(i2);
                            TextEditorActivity.this.c.z(k0);
                        }
                        return true;
                    }
                    if ((!(i == 112) || !(keyEvent.getAction() == 0)) || a.this.u.getSelectionStart() != a.this.u.length()) {
                        return false;
                    }
                    int k02 = TextEditorActivity.this.b.k0(a.this.u);
                    if (k02 >= 0 && k02 < i.this.d.size() && k02 < i.this.d.size() - 1) {
                        TextEditorActivity.this.O0(h.MODIFIED);
                        TextEditorActivity.this.o = k02;
                        i iVar2 = i.this;
                        TextEditorActivity.this.p = ((j) iVar2.d.get(k02)).a.length();
                        StringBuilder sb2 = new StringBuilder();
                        j jVar2 = (j) i.this.d.get(k02);
                        sb2.append(jVar2.a);
                        int i3 = k02 + 1;
                        sb2.append(((j) i.this.d.get(i3)).a);
                        jVar2.a = sb2.toString();
                        i.this.d.remove(i3);
                        TextEditorActivity.this.c.s(k02);
                        TextEditorActivity.this.c.z(i3);
                    }
                    return true;
                }
            }

            class c implements TextWatcher {
                final /* synthetic */ i a;

                c(i iVar) {
                    this.a = iVar;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    a aVar = a.this;
                    if (aVar.v || aVar.w) {
                        aVar.v = false;
                        aVar.x = false;
                        return;
                    }
                    TextEditorActivity.this.O0(h.MODIFIED);
                    int m0 = TextEditorActivity.this.d.m0(a.this.u);
                    String obj = editable.toString();
                    if (m0 < 0) {
                        ax.Ha.c.h().f().b("TEXTEDITOR IndexOutOfBound -1").h();
                    } else if (m0 < i.this.d.size()) {
                        ((j) i.this.d.get(m0)).a = obj;
                    } else {
                        ax.Ha.c.h().f().b("TEXTEDITOR IndexOutOfBound").h();
                    }
                    if (!TextEditorActivity.this.r) {
                        if (obj.contains("\n")) {
                            int indexOf = obj.indexOf("\n");
                            String substring = obj.substring(0, indexOf);
                            String substring2 = obj.substring(indexOf + 1);
                            a aVar2 = a.this;
                            if (aVar2.x) {
                                ((j) i.this.d.get(m0)).a = substring;
                                int i = m0 + 1;
                                ((j) i.this.d.get(i)).a = substring2;
                                TextEditorActivity.this.c.s(m0);
                                TextEditorActivity.this.c.s(i);
                                return;
                            }
                            ((j) i.this.d.get(m0)).a = substring;
                            int i2 = m0 + 1;
                            i.this.d.add(i2, TextEditorActivity.this.new j(substring2));
                            TextEditorActivity.this.c.s(m0);
                            TextEditorActivity.this.c.u(i2);
                            TextEditorActivity.this.m = i2;
                            TextEditorActivity.this.n = 0;
                            TextEditorActivity.this.b.B1(0, a.this.u.getLineHeight());
                            a.this.x = true;
                            return;
                        }
                        return;
                    }
                    if (TextEditorActivity.E0(obj, '\n') >= TextEditorActivity.G - 1) {
                        int selectionStart = a.this.u.getSelectionStart();
                        int H0 = TextEditorActivity.H0(obj, '\n', TextEditorActivity.F);
                        String substring3 = obj.substring(0, H0 > 0 && obj.charAt(H0 + (-1)) == '\r' ? H0 - 1 : H0);
                        String substring4 = obj.substring(H0 + 1);
                        a aVar3 = a.this;
                        if (aVar3.x) {
                            ((j) i.this.d.get(m0)).a = substring3;
                            int i3 = m0 + 1;
                            ((j) i.this.d.get(i3)).a = substring4;
                            TextEditorActivity.this.c.s(m0);
                            TextEditorActivity.this.c.s(i3);
                            return;
                        }
                        ((j) i.this.d.get(m0)).a = substring3;
                        int i4 = m0 + 1;
                        i.this.d.add(i4, TextEditorActivity.this.new j(substring4));
                        TextEditorActivity.this.c.s(m0);
                        TextEditorActivity.this.c.u(i4);
                        if (selectionStart > substring3.length()) {
                            TextEditorActivity.this.m = i4;
                            TextEditorActivity.this.n = (selectionStart - H0) - 1;
                        }
                        TextEditorActivity.this.b.B1(0, a.this.u.getLineHeight());
                        a.this.x = true;
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            }

            public a(View view) {
                super(view);
                this.u = (EditText) view;
                if (J.e()) {
                    this.u.setEditableFactory(new g());
                }
                this.u.setOnTouchListener(TextEditorActivity.this.v);
                try {
                    this.u.setTypeface(ax.S.h.g(view.getContext(), R.font.robotomono_regular));
                } catch (Exception e) {
                    ax.Ha.c.h().f().b("FONT LOAD ERROR").l(e).h();
                }
                if (Q.r()) {
                    this.u.setOnEditorActionListener(new C0533a(i.this));
                }
                this.u.setOnKeyListener(new b(i.this));
                this.u.addTextChangedListener(new c(i.this));
            }

            public void N(int i) {
                this.v = true;
                this.w = true;
                boolean z = this.x;
                this.u.setTextKeepState(((j) i.this.d.get(i)).a);
                if (!z) {
                    EditText editText = this.u;
                    editText.setSelection(editText.length());
                }
                this.w = false;
            }

            public void O(float f) {
                this.u.setTextSize(f);
            }
        }

        public i(ArrayList<j> arrayList) {
            this.d = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public void B(a aVar, int i) {
            aVar.N(i);
            aVar.O(TextEditorActivity.this.x);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public a D(ViewGroup viewGroup, int i) {
            return new a(TextEditorActivity.this.f ? LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_texteditor_line_readonly, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_texteditor_line, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int l() {
            return this.d.size();
        }
    }

    class j {
        String a;

        j(String str) {
            this.a = str;
        }
    }

    class k implements RecyclerView.r {
        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
            if (TextEditorActivity.this.o != -1) {
                EditText editText = (EditText) TextEditorActivity.this.d.I(TextEditorActivity.this.o);
                if (editText == null) {
                    ax.Ha.c.h().d("INVALID TEXTEDITOR SELECTION NULL").g(Integer.valueOf(TextEditorActivity.this.p)).h();
                    TextEditorActivity.this.o = -1;
                    return;
                }
                if (!TextEditorActivity.this.f) {
                    editText.requestFocus();
                    z.E(TextEditorActivity.this, editText);
                }
                if (TextEditorActivity.this.p <= editText.getText().length()) {
                    editText.setSelection(TextEditorActivity.this.p);
                } else {
                    ax.Ha.c.h().d("INVALID TEXTEDITOR SELECTION").g(TextEditorActivity.this.p + " > " + editText.getText().length()).h();
                }
                TextEditorActivity.this.o = -1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(View view) {
            if (view == null || TextEditorActivity.this.m != TextEditorActivity.this.d.m0(view)) {
                return;
            }
            EditText editText = (EditText) view;
            if (!TextEditorActivity.this.f) {
                editText.requestFocus();
                z.E(TextEditorActivity.this, editText);
            }
            if (editText.getText().length() > TextEditorActivity.this.n) {
                editText.setSelection(TextEditorActivity.this.n);
            }
            TextEditorActivity.this.m = -1;
        }
    }

    private class l extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private l() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            TextEditorActivity.x0(TextEditorActivity.this, scaleGestureDetector.getScaleFactor());
            TextEditorActivity textEditorActivity = TextEditorActivity.this;
            textEditorActivity.w = Math.max(0.6f, Math.min(textEditorActivity.w, 4.0f));
            TextEditorActivity textEditorActivity2 = TextEditorActivity.this;
            textEditorActivity2.x = (int) (textEditorActivity2.w * 14.0f);
            if (TextEditorActivity.this.c == null) {
                return true;
            }
            TextEditorActivity.this.c.r();
            return true;
        }

        /* synthetic */ l(TextEditorActivity textEditorActivity, a aVar) {
            this();
        }
    }

    class m extends AbstractC3199q<Void, Void, Integer> {
        private boolean h;

        m() {
            super(AbstractC3199q.e.HIGHER);
        }

        private boolean A(int i) {
            return i == 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x003b, code lost:
        
            if (r2 == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x003d, code lost:
        
            r10.i.j.add(new com.voxdon.xplorer.texteditor.TextEditorActivity.j(r10.i, r0.toString()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
        
            if (r5 == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0062, code lost:
        
            r10.i.j.add(new com.voxdon.xplorer.texteditor.TextEditorActivity.j(r10.i, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET));
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x007c, code lost:
        
            if (r10.i.j.size() != 0) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x007e, code lost:
        
            r10.i.j.add(new com.voxdon.xplorer.texteditor.TextEditorActivity.j(r10.i, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET));
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x008e, code lost:
        
            r1.close();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int C(com.voxdon.xplorer.file.C3596o r11, com.voxdon.xplorer.file.AbstractC3595n r12) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.texteditor.TextEditorActivity.m.C(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
        
            if (r8 == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x002e, code lost:
        
            r6.i.j.add(new com.voxdon.xplorer.texteditor.TextEditorActivity.j(r6.i, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
        
            if (r6.i.j.size() != 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
        
            r6.i.j.add(new com.voxdon.xplorer.texteditor.TextEditorActivity.j(r6.i, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET));
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
        
            r1.close();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int D(com.voxdon.xplorer.file.C3596o r7, com.voxdon.xplorer.file.AbstractC3595n r8) {
            /*
                r6 = this;
                com.voxdon.xplorer.texteditor.TextEditorActivity r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.voxdon.xplorer.texteditor.TextEditorActivity.Q(r0, r1)
                r0 = 0
                ax.q3.a r1 = new ax.q3.a     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                r3 = 0
                java.io.InputStream r7 = r7.J(r8, r3)     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                java.nio.charset.Charset r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r8)     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                r2.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Lad java.lang.OutOfMemoryError -> Laf java.lang.Throwable -> Lb1
                r7 = 0
                r8 = 0
                r0 = 0
            L24:
                java.lang.String r2 = r1.e()     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47
                if (r2 != 0) goto L6b
                java.lang.String r0 = ""
                if (r8 == 0) goto L4b
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                java.util.ArrayList r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.O(r8)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity$j r2 = new com.voxdon.xplorer.texteditor.TextEditorActivity$j     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity r3 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r8.add(r2)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                goto L4b
            L3f:
                r7 = move-exception
                r0 = r1
                goto Lcf
            L43:
                r7 = move-exception
                r0 = r1
                goto Lb3
            L47:
                r0 = r1
                goto Ld5
            L4b:
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                java.util.ArrayList r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.O(r8)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                int r8 = r8.size()     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                if (r8 != 0) goto L67
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                java.util.ArrayList r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.O(r8)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity$j r2 = new com.voxdon.xplorer.texteditor.TextEditorActivity$j     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity r3 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r8.add(r2)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            L67:
                r1.close()     // Catch: java.io.IOException -> L6a
            L6a:
                return r7
            L6b:
                boolean r8 = r1.a()     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                int r3 = r2.length()     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r4 = 200000(0x30d40, float:2.8026E-40)
                r5 = -3
                if (r3 <= r4) goto L7d
                r1.close()     // Catch: java.io.IOException -> L7c
            L7c:
                return r5
            L7d:
                r3 = 0
            L7e:
                int r4 = r2.length()     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                if (r3 >= r4) goto L9b
                char r4 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                boolean r4 = r6.A(r4)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                if (r4 == 0) goto L98
                int r0 = r0 + 1
                r4 = 10
                if (r0 < r4) goto L98
                r1.close()     // Catch: java.io.IOException -> L97
            L97:
                return r5
            L98:
                int r3 = r3 + 1
                goto L7e
            L9b:
                com.voxdon.xplorer.texteditor.TextEditorActivity r3 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                java.util.ArrayList r3 = com.voxdon.xplorer.texteditor.TextEditorActivity.O(r3)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity$j r4 = new com.voxdon.xplorer.texteditor.TextEditorActivity$j     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                r3.add(r4)     // Catch: java.lang.Throwable -> L3f java.lang.OutOfMemoryError -> L43 java.lang.Throwable -> L47 java.lang.Throwable -> L47
                goto L24
            Lad:
                r7 = move-exception
                goto Lcf
            Laf:
                r7 = move-exception
                goto Lb3
            Lb1:
                goto Ld5
            Lb3:
                ax.Ha.b r8 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r1 = "TEXT EDITOR OOM"
                ax.Ha.b r8 = r8.d(r1)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Lad
                ax.Ha.b r7 = r8.g(r7)     // Catch: java.lang.Throwable -> Lad
                r7.h()     // Catch: java.lang.Throwable -> Lad
                if (r0 == 0) goto Lcd
                r0.close()     // Catch: java.io.IOException -> Lcd
            Lcd:
                r7 = -1
                return r7
            Lcf:
                if (r0 == 0) goto Ld4
                r0.close()     // Catch: java.io.IOException -> Ld4
            Ld4:
                throw r7
            Ld5:
                if (r0 == 0) goto Lda
                r0.close()     // Catch: java.io.IOException -> Lda
            Lda:
                r7 = -10
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.texteditor.TextEditorActivity.m.D(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):int");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (!this.h) {
                TextEditorActivity.this.s.k0(false);
                this.h = true;
            }
            TextEditorActivity.this.e.setVisibility(8);
            if (num.intValue() == 0) {
                TextEditorActivity textEditorActivity = TextEditorActivity.this;
                textEditorActivity.c = textEditorActivity.new i(textEditorActivity.j);
                TextEditorActivity.this.b.setAdapter(TextEditorActivity.this.c);
                TextEditorActivity.this.O0(h.LOADED);
                if (TextEditorActivity.this.A == null || TextEditorActivity.this.B == null) {
                    return;
                }
                ax.Q2.a.i().o("text_editor_open").b("loc", TextEditorActivity.this.A).b("ext", TextEditorActivity.this.B).b("range", a.f.a(TextEditorActivity.this.C)).c();
                return;
            }
            if (num.intValue() == -1) {
                Toast.makeText(TextEditorActivity.this, R.string.error_too_large_to_open, 1).show();
                TextEditorActivity.this.finish();
            } else if (num.intValue() == -3) {
                Toast.makeText(TextEditorActivity.this, R.string.error_not_text_file, 1).show();
                TextEditorActivity.this.finish();
            } else {
                Toast.makeText(TextEditorActivity.this, R.string.error_file_load, 1).show();
                TextEditorActivity.this.finish();
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            super.o();
            if (this.h) {
                return;
            }
            TextEditorActivity.this.s.k0(false);
            this.h = true;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            TextEditorActivity.this.e.setVisibility(0);
            TextEditorActivity.this.s.n0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: IOException -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x008f, blocks: (B:23:0x0069, B:40:0x008c), top: B:3:0x0001 }] */
        /* JADX WARN: Type inference failed for: r0v12, types: [int] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void w(com.voxdon.xplorer.file.C3596o r5, com.voxdon.xplorer.file.AbstractC3595n r6) {
            /*
                r4 = this;
                r0 = 0
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L6d ax.b3.C1495j -> L6f java.nio.charset.IllegalCharsetNameException -> L71 java.nio.charset.UnsupportedCharsetException -> L73 java.io.IOException -> L75
                r2 = 0
                java.io.InputStream r5 = r5.J(r6, r2)     // Catch: java.lang.Throwable -> L6d ax.b3.C1495j -> L6f java.nio.charset.IllegalCharsetNameException -> L71 java.nio.charset.UnsupportedCharsetException -> L73 java.io.IOException -> L75
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L6d ax.b3.C1495j -> L6f java.nio.charset.IllegalCharsetNameException -> L71 java.nio.charset.UnsupportedCharsetException -> L73 java.io.IOException -> L75
                ax.Rd.c r5 = new ax.Rd.c     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                r6 = 4096(0x1000, float:5.74E-42)
                byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
            L15:
                int r0 = r1.read(r6)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                r2 = -1
                if (r0 == r2) goto L34
                r2 = 0
                r5.d(r6, r2, r0)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                java.lang.String r0 = r5.c()     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                if (r0 == 0) goto L15
                goto L34
            L27:
                r5 = move-exception
                r0 = r1
                goto Lb2
            L2b:
                r5 = move-exception
            L2c:
                r0 = r1
                goto L76
            L2e:
                r5 = move-exception
                goto L2c
            L30:
                r5 = move-exception
                goto L2c
            L32:
                r5 = move-exception
                goto L2c
            L34:
                r5.a()     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                java.lang.String r5 = r5.c()     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                if (r5 == 0) goto L58
                java.lang.String r6 = "US-ASCII"
                boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                if (r6 == 0) goto L4f
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                com.voxdon.xplorer.texteditor.TextEditorActivity.U(r5, r6)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                goto L58
            L4f:
                com.voxdon.xplorer.texteditor.TextEditorActivity r6 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
                com.voxdon.xplorer.texteditor.TextEditorActivity.U(r6, r5)     // Catch: java.lang.Throwable -> L27 ax.b3.C1495j -> L2b java.nio.charset.IllegalCharsetNameException -> L2e java.nio.charset.UnsupportedCharsetException -> L30 java.io.IOException -> L32
            L58:
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r5)
                if (r5 != 0) goto L69
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
                com.voxdon.xplorer.texteditor.TextEditorActivity.U(r5, r6)
            L69:
                r1.close()     // Catch: java.io.IOException -> L8f
                goto L8f
            L6d:
                r5 = move-exception
                goto Lb2
            L6f:
                r5 = move-exception
                goto L76
            L71:
                r5 = move-exception
                goto L76
            L73:
                r5 = move-exception
                goto L76
            L75:
                r5 = move-exception
            L76:
                r5.printStackTrace()     // Catch: java.lang.Throwable -> L6d
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r5)
                if (r5 != 0) goto L8a
                com.voxdon.xplorer.texteditor.TextEditorActivity r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
                com.voxdon.xplorer.texteditor.TextEditorActivity.U(r5, r6)
            L8a:
                if (r0 == 0) goto L8f
                r0.close()     // Catch: java.io.IOException -> L8f
            L8f:
                java.util.logging.Logger r5 = com.voxdon.xplorer.texteditor.TextEditorActivity.g0()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "DETECTED ENCODING : "
                r6.append(r0)
                com.voxdon.xplorer.texteditor.TextEditorActivity r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r0)
                java.lang.String r0 = r0.name()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.fine(r6)
                return
            Lb2:
                com.voxdon.xplorer.texteditor.TextEditorActivity r6 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r6 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r6)
                if (r6 != 0) goto Lc3
                com.voxdon.xplorer.texteditor.TextEditorActivity r6 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
                com.voxdon.xplorer.texteditor.TextEditorActivity.U(r6, r1)
            Lc3:
                if (r0 == 0) goto Lc8
                r0.close()     // Catch: java.io.IOException -> Lc8
            Lc8:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.texteditor.TextEditorActivity.m.w(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x005c
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10 */
        void x(com.voxdon.xplorer.file.C3596o r8, com.voxdon.xplorer.file.AbstractC3595n r9) {
            /*
                r7 = this;
                java.lang.String r0 = "\r\n"
                java.lang.String r1 = "\n"
                r2 = 0
                ax.q3.a r3 = new ax.q3.a     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                r5 = 0
                java.io.InputStream r8 = r8.J(r9, r5)     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                java.nio.charset.Charset r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.T(r9)     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                r4.<init>(r8, r9)     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e ax.b3.C1495j -> L60 java.io.IOException -> L62
                r8 = 2048(0x800, float:2.87E-42)
                char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
            L1f:
                int r9 = r3.read(r8)     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                r2 = -1
                if (r9 == r2) goto L3a
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                r4 = 0
                r2.<init>(r8, r4, r9)     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                int r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.F0(r2, r1)     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                int r2 = com.voxdon.xplorer.texteditor.TextEditorActivity.F0(r2, r0)     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                if (r9 == 0) goto L1f
                int r2 = r2 * 2
                if (r9 <= r2) goto L3c
            L3a:
                r8 = r1
                goto L46
            L3c:
                r8 = r0
                goto L46
            L3e:
                r8 = move-exception
                r2 = r3
                goto La2
            L41:
                r8 = move-exception
            L42:
                r2 = r3
                goto L63
            L44:
                r8 = move-exception
                goto L42
            L46:
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                com.voxdon.xplorer.texteditor.TextEditorActivity.S(r9, r8)     // Catch: java.lang.Throwable -> L3e ax.b3.C1495j -> L41 java.io.IOException -> L44
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.lang.String r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.R(r8)
                if (r8 != 0) goto L58
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                com.voxdon.xplorer.texteditor.TextEditorActivity.S(r8, r1)
            L58:
                r3.close()     // Catch: java.io.IOException -> L5c
                goto L78
            L5c:
                goto L78
            L5e:
                r8 = move-exception
                goto La2
            L60:
                r8 = move-exception
                goto L63
            L62:
                r8 = move-exception
            L63:
                r8.printStackTrace()     // Catch: java.lang.Throwable -> L5e
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.lang.String r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.R(r8)
                if (r8 != 0) goto L73
                com.voxdon.xplorer.texteditor.TextEditorActivity r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                com.voxdon.xplorer.texteditor.TextEditorActivity.S(r8, r1)
            L73:
                if (r2 == 0) goto L78
                r2.close()     // Catch: java.io.IOException -> L5c
            L78:
                java.util.logging.Logger r8 = com.voxdon.xplorer.texteditor.TextEditorActivity.g0()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "DETECTED NEWLINE : "
                r9.append(r1)
                com.voxdon.xplorer.texteditor.TextEditorActivity r1 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.lang.String r1 = com.voxdon.xplorer.texteditor.TextEditorActivity.R(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L95
                java.lang.String r0 = "CRLF"
                goto L97
            L95:
                java.lang.String r0 = "LF"
            L97:
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                r8.fine(r9)
                return
            La2:
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                java.lang.String r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.R(r9)
                if (r9 != 0) goto Laf
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this
                com.voxdon.xplorer.texteditor.TextEditorActivity.S(r9, r1)
            Laf:
                if (r2 == 0) goto Lb4
                r2.close()     // Catch: java.io.IOException -> Lb4
            Lb4:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.texteditor.TextEditorActivity.m.x(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            try {
                AbstractC3595n z = TextEditorActivity.this.s.z(TextEditorActivity.this.h);
                if (z(z)) {
                    return -1;
                }
                w(TextEditorActivity.this.s, z);
                x(TextEditorActivity.this.s, z);
                if (TextEditorActivity.E) {
                    TextEditorActivity.this.r = true;
                    return Integer.valueOf(C(TextEditorActivity.this.s, z));
                }
                int D = D(TextEditorActivity.this.s, z);
                TextEditorActivity textEditorActivity = TextEditorActivity.this;
                textEditorActivity.C = textEditorActivity.j.size();
                if (D != 0 || TextEditorActivity.this.j.size() >= 1000) {
                    TextEditorActivity.this.r = false;
                    return Integer.valueOf(D);
                }
                TextEditorActivity.this.r = true;
                return Integer.valueOf(C(TextEditorActivity.this.s, z));
            } catch (C1495j unused) {
                return -10;
            }
        }

        boolean z(AbstractC3595n abstractC3595n) {
            if (abstractC3595n.p() < 102400) {
                return false;
            }
            long p = abstractC3595n.p() / 1048576;
            if (p <= 30 && p <= (((ActivityManager) TextEditorActivity.this.getApplicationContext().getSystemService("activity")).getMemoryClass() * 4) / 10) {
                return p > ((((Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())) - Debug.getNativeHeapAllocatedSize()) / 1048576) * 4) / 10;
            }
            return true;
        }
    }

    class n extends AbstractC3199q<Void, Void, Boolean> {
        private boolean h;
        boolean i;
        boolean j;
        Throwable k;

        class a implements ax.g3.i {
            a() {
            }

            @Override // ax.g3.i
            public void a(long j, long j2) {
            }
        }

        n(boolean z) {
            super(AbstractC3199q.e.HIGHER);
            this.i = z;
        }

        private void A() throws IOException {
            OutputStream outputStream;
            String str;
            BufferedWriter bufferedWriter = null;
            try {
                AbstractC3594m u = TextEditorActivity.this.s.u();
                if (u instanceof C3604x) {
                    outputStream = ((C3604x) u).c(TextEditorActivity.this.h, false);
                } else if (u instanceof C3589h) {
                    outputStream = ((C3589h) u).c(TextEditorActivity.this.h, false);
                } else {
                    C3184b.f();
                    outputStream = null;
                }
                boolean equals = "\r\n".equals(TextEditorActivity.this.l);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(outputStream, TextEditorActivity.this.k));
                try {
                    if (!x()) {
                        for (int i = 0; i < TextEditorActivity.this.j.size(); i++) {
                            j jVar = (j) TextEditorActivity.this.j.get(i);
                            if (!equals || jVar.a == null) {
                                str = jVar.a;
                            } else {
                                if (TextEditorActivity.H == null) {
                                    Pattern unused = TextEditorActivity.H = Pattern.compile("(?<!\r)\n");
                                }
                                str = TextEditorActivity.H.matcher(jVar.a).replaceAll("\r\n");
                            }
                            if (i == TextEditorActivity.this.j.size() - 1) {
                                bufferedWriter2.write(str);
                            } else {
                                bufferedWriter2.write(str + TextEditorActivity.this.l);
                            }
                        }
                    }
                    bufferedWriter2.flush();
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            if (!this.h) {
                TextEditorActivity.this.s.k0(true);
                this.h = true;
            }
            if (this.j) {
                return;
            }
            TextEditorActivity.this.I0();
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            TextEditorActivity.this.s.n0();
            boolean M0 = TextEditorActivity.this.M0();
            this.j = M0;
            if (M0) {
                return;
            }
            TextEditorActivity.this.P0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean g(java.lang.Void... r9) {
            /*
                r8 = this;
                r8.A()     // Catch: java.io.IOException -> L84
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84
                ax.Z2.k r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.J(r9)     // Catch: java.io.IOException -> L84
                if (r9 == 0) goto L94
                boolean r9 = r8.j     // Catch: java.io.IOException -> L84
                if (r9 != 0) goto L94
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                ax.Z2.k r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.J(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                ax.c3.K r9 = r9.d()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.file.o r2 = ax.c3.C1835x.e(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                boolean r9 = r2.a()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                if (r9 != 0) goto L3f
                r0 = 10000(0x2710, double:4.9407E-320)
                boolean r9 = r2.i(r0)     // Catch: java.io.IOException -> L34 ax.b3.C1486a -> L39 ax.b3.C1495j -> L3d
                if (r9 == 0) goto L2c
                goto L3f
            L2c:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> L34 ax.b3.C1486a -> L39 ax.b3.C1495j -> L3d
                java.lang.String r0 = "Not connected to network storage"
                r9.<init>(r0)     // Catch: java.io.IOException -> L34 ax.b3.C1486a -> L39 ax.b3.C1495j -> L3d
                throw r9     // Catch: java.io.IOException -> L34 ax.b3.C1486a -> L39 ax.b3.C1495j -> L3d
            L34:
                r0 = move-exception
                r9 = r0
                r4 = r8
                goto Lb4
            L39:
                r0 = move-exception
            L3a:
                r9 = r0
                r4 = r8
                goto L8c
            L3d:
                r0 = move-exception
                goto L3a
            L3f:
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                ax.Z2.k r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.J(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                java.lang.String r9 = r9.e()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.file.n r3 = r2.z(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.file.o r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.C0(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.texteditor.TextEditorActivity r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                java.lang.String r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.L(r0)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.file.n r1 = r9.z(r0)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                java.io.File r9 = r3.N()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                long r6 = r9.lastModified()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.file.o r0 = com.voxdon.xplorer.texteditor.TextEditorActivity.C0(r9)     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                com.voxdon.xplorer.texteditor.TextEditorActivity$n$a r5 = new com.voxdon.xplorer.texteditor.TextEditorActivity$n$a     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                r5.<init>()     // Catch: java.io.IOException -> L84 ax.b3.C1486a -> L87 ax.b3.C1495j -> L8a
                r4 = r8
                r0.t0(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L7c ax.b3.C1486a -> L7f ax.b3.C1495j -> L82
                ax.o3.e r9 = ax.o3.C2688e.b()     // Catch: java.io.IOException -> L7c ax.b3.C1486a -> L7f ax.b3.C1495j -> L82
                r9.j(r3, r6)     // Catch: java.io.IOException -> L7c ax.b3.C1486a -> L7f ax.b3.C1495j -> L82
                goto L95
            L7c:
                r0 = move-exception
            L7d:
                r9 = r0
                goto Lb4
            L7f:
                r0 = move-exception
            L80:
                r9 = r0
                goto L8c
            L82:
                r0 = move-exception
                goto L80
            L84:
                r0 = move-exception
                r4 = r8
                goto L7d
            L87:
                r0 = move-exception
            L88:
                r4 = r8
                goto L80
            L8a:
                r0 = move-exception
                goto L88
            L8c:
                r4.k = r9     // Catch: java.io.IOException -> L7c
                java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L7c
                r0.<init>(r9)     // Catch: java.io.IOException -> L7c
                throw r0     // Catch: java.io.IOException -> L7c
            L94:
                r4 = r8
            L95:
                boolean r9 = ax.X2.Q.X1()     // Catch: java.io.IOException -> L7c
                if (r9 == 0) goto Lb1
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L7c
                com.voxdon.xplorer.file.o r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.C0(r9)     // Catch: java.io.IOException -> L7c
                boolean r9 = r9.Y()     // Catch: java.io.IOException -> L7c
                if (r9 == 0) goto Lb1
                com.voxdon.xplorer.texteditor.TextEditorActivity r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.this     // Catch: java.io.IOException -> L7c
                com.voxdon.xplorer.file.o r9 = com.voxdon.xplorer.texteditor.TextEditorActivity.C0(r9)     // Catch: java.io.IOException -> L7c
                r0 = 0
                r9.n(r0)     // Catch: java.io.IOException -> L7c
            Lb1:
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.io.IOException -> L7c
                return r9
            Lb4:
                java.lang.Throwable r0 = r4.k
                if (r0 != 0) goto Lba
                r4.k = r9
            Lba:
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.texteditor.TextEditorActivity.n.g(java.lang.Void[]):java.lang.Boolean");
        }

        boolean x() {
            return TextEditorActivity.this.j.size() == 1 && ((j) TextEditorActivity.this.j.get(0)).a.length() == 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            String string;
            if (!this.h) {
                TextEditorActivity.this.s.k0(true);
                this.h = true;
            }
            if (!this.j) {
                TextEditorActivity.this.I0();
            }
            if (bool.booleanValue()) {
                TextEditorActivity.this.O0(h.SAVED);
                if (this.i) {
                    TextEditorActivity.this.finish();
                    return;
                }
                return;
            }
            if (!ax.t3.j.o(TextEditorActivity.this) || this.k == null) {
                string = TextEditorActivity.this.getString(R.string.error_file_save);
            } else {
                string = TextEditorActivity.this.getString(R.string.error_file_save) + " : " + this.k.getMessage();
            }
            z(string);
        }

        void z(String str) {
            C3180B.T(TextEditorActivity.this.findViewById(android.R.id.content), Html.fromHtml("<font color='red'>" + str + "</font>"), 0).a0();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT >= 30 ? 1500 : 2500;
        F = i2;
        G = i2 * 2;
    }

    public static int E0(String str, char c2) {
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(c2, i2);
            if (indexOf == -1) {
                return i3;
            }
            i3++;
            i2 = indexOf + 1;
        }
    }

    public static int F0(String str, String str2) {
        int i2 = 0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i2);
            if (indexOf == -1) {
                return i3;
            }
            i3++;
            i2 = indexOf + str2.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(boolean z) {
        if (n()) {
            return;
        }
        n nVar = new n(z);
        this.y = nVar;
        nVar.h(new Void[0]);
    }

    public static int H0(String str, char c2, int i2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int indexOf = str.indexOf(c2, i3);
            if (indexOf == -1) {
                return -1;
            }
            i4++;
            if (i4 == i2) {
                return indexOf;
            }
            i3 = indexOf + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        try {
            androidx.fragment.app.e eVar = this.z;
            if (eVar == null || !eVar.X0()) {
                return;
            }
            this.z.O2();
        } catch (Exception unused) {
        }
    }

    private void J0() {
        setSupportActionBar(this.a);
        getSupportActionBar().x(true);
        this.a.setNavigationOnClickListener(new f());
    }

    private void L0() {
        this.a = (Toolbar) findViewById(R.id.toolbar);
        this.b = (RecyclerView) findViewById(R.id.recycler);
        this.e = (ProgressBar) findViewById(R.id.progress);
        a aVar = new a(this);
        this.d = aVar;
        this.b.setLayoutManager(aVar);
        this.b.setItemAnimator(null);
        this.b.l(new k());
        K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M0() {
        ax.Z2.k kVar = this.t;
        if (kVar != null) {
            return ax.Q2.f.Y(kVar.b());
        }
        return true;
    }

    private void N0(EditText editText) {
        editText.post(new b(editText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(h hVar) {
        this.g = hVar;
        int ordinal = hVar.ordinal();
        if (ordinal == 2) {
            this.a.setTitle("* " + this.i);
        } else if (ordinal == 3) {
            this.a.setTitle(this.i);
        }
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        this.z = new D();
        C3180B.d0(getSupportFragmentManager(), this.z, "save_progress", true);
    }

    static /* synthetic */ float x0(TextEditorActivity textEditorActivity, float f2) {
        float f3 = textEditorActivity.w * f2;
        textEditorActivity.w = f3;
        return f3;
    }

    void K0() {
        this.q = new C1788s(this, new c());
        this.u = new ScaleGestureDetector(this, new l(this, null));
        d dVar = new d();
        this.v = dVar;
        this.b.setOnTouchListener(dVar);
        this.b.m(new e());
    }

    @Override // ax.a3.C1358n.c
    public void P(C1358n c1358n) {
        ax.Q2.a.i().m("menu_text_editor", "text_save").c("ext", d0.j(this.i)).e();
        G0(true);
    }

    @Override // ax.a3.C1358n.c
    public void Z(C1358n c1358n) {
        finish();
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return z;
    }

    public boolean n() {
        return getSupportFragmentManager().Q0();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        RecyclerView recyclerView;
        if (z || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.setClipToPadding(false);
        this.b.setPadding(0, 0, 0, bVar.d);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (n()) {
            return;
        }
        if (this.g == h.MODIFIED) {
            C1358n.k3(R.string.confirm, R.string.confirm_save, R.string.menu_save, R.string.menu_dontsave).c3(getSupportFragmentManager(), "dialog");
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        long j2;
        ax.Z2.k kVar;
        ax.Q2.b.f(this, true);
        super.onCreate(bundle);
        setContentView(R.layout.activity_texteditor);
        L0();
        J0();
        Uri data = getIntent().getData();
        if (data == null) {
            ax.Ha.c.h().d("TextEditor DataUri == null").h();
            finish();
            return;
        }
        onSetContentView(false);
        this.g = h.UNDEFINED;
        D.fine("TextEditor open : " + data);
        this.f = getIntent().getBooleanExtra("read_only", false);
        String str5 = null;
        if ("file".equals(data.getScheme())) {
            String path = data.getPath();
            this.h = path;
            this.s = C1835x.g(path);
            this.i = d0.h(this.h);
            String stringExtra = getIntent().getStringExtra("original_file_location_uri");
            if (TextUtils.isEmpty(stringExtra)) {
                str2 = null;
            } else {
                try {
                    ax.Z2.k a2 = ax.Z2.k.a(Uri.parse(stringExtra));
                    this.t = a2;
                    K d2 = a2.d();
                    K k2 = K.h;
                    if (d2 == k2) {
                        this.s = C1835x.e(k2);
                    }
                    kVar = this.t;
                } catch (Exception unused) {
                    str4 = null;
                }
                if (kVar != null) {
                    str4 = kVar.b().I();
                    try {
                        str5 = d0.k(this.t.e());
                    } catch (Exception unused2) {
                    }
                    String str6 = str5;
                    str5 = str4;
                    str2 = str6;
                    if (this.t != null && bundle != null) {
                        string = bundle.getString("file_open_path");
                        j2 = bundle.getLong("file_open_last_modified", -1L);
                        if (string != null && string.equals(this.t.e()) && j2 != -1) {
                            C2688e.b().i(this.t.d(), this.t.e(), j2);
                        }
                    }
                } else {
                    str2 = null;
                    if (this.t != null) {
                        string = bundle.getString("file_open_path");
                        j2 = bundle.getLong("file_open_last_modified", -1L);
                        if (string != null) {
                            C2688e.b().i(this.t.d(), this.t.e(), j2);
                        }
                    }
                }
            }
        } else if (!"content".equals(data.getScheme())) {
            try {
                ax.Z2.k a3 = ax.Z2.k.a(data);
                this.h = a3.e();
                K d3 = a3.d();
                this.s = C1835x.e(d3);
                this.i = d0.h(this.h);
                if (d3 == null || this.h == null) {
                    str = null;
                    str2 = null;
                } else {
                    str = d3.d().I();
                    str2 = d0.k(this.h);
                }
                if (!this.s.a()) {
                    if (ax.Q2.f.e0(this.s.S()) || ax.Q2.f.o0(this.s.S())) {
                        this.s.h(null);
                    }
                    if (!this.s.a()) {
                        ax.Ha.c.h().f().d("TextEditor : FileOperator not connected").g("location:" + this.s.S().I()).h();
                        finish();
                        return;
                    }
                }
                str5 = str;
            } catch (IllegalArgumentException unused3) {
                Toast.makeText(this, R.string.error_file_load, 1).show();
                finish();
                return;
            }
        } else {
            if (!MyFileProvider.B(data) && !MyFileProvider.A(data)) {
                Toast.makeText(this, R.string.error_file_load, 1).show();
                finish();
                return;
            }
            ax.Z2.k e2 = MyFileProvider.e(data);
            this.h = e2.e();
            K d4 = e2.d();
            this.s = C1835x.e(d4);
            this.i = d0.h(this.h);
            if (d4 == null || this.h == null) {
                str3 = null;
            } else {
                str5 = d4.d().I();
                str3 = d0.k(this.h);
            }
            str2 = str3;
        }
        if (str5 != null && str2 != null) {
            this.A = str5;
            this.B = str2;
        }
        int m2 = ax.t3.j.m(this);
        this.x = m2;
        this.w = m2 / 14.0f;
        setTitle(this.i);
        new m().i(new Void[0]);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.text_editor, menu);
        return true;
    }

    @Override // ax.R2.c, ax.d3.x0.a
    public void onIMEVisibilityChanged(boolean z) {
        if (z) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                N0((EditText) currentFocus);
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_save) {
            return super.onOptionsItemSelected(menuItem);
        }
        ax.Q2.a.i().m("menu_text_editor", "text_save").c("ext", d0.j(this.i)).e();
        G0(false);
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.x != ax.t3.j.m(this)) {
            ax.t3.j.u(this, this.x);
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_save);
        if (findItem == null) {
            ax.Ha.c.h().f().d("not created options menu!!").j().h();
        } else if (this.f) {
            findItem.setVisible(false);
        } else {
            findItem.setVisible(true);
            if (this.g == h.MODIFIED) {
                findItem.setEnabled(true);
                findItem.getIcon().setAlpha(255);
            } else {
                findItem.setEnabled(false);
                findItem.getIcon().setAlpha(85);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.t != null) {
            long c2 = C2688e.b().c(this.t.d(), this.t.e());
            if (c2 != 0) {
                bundle.putString("file_open_path", this.t.e());
                bundle.putLong("file_open_last_modified", c2);
            }
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        ax.Q2.a.i().q(getClass().getSimpleName());
    }

    @Override // ax.a3.C1358n.c
    public void G(C1358n c1358n) {
    }
}
