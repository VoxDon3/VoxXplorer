/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.texteditor;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.Q2.a;
import ax.Q2.f;
import ax.T.b;
import ax.X2.J;
import ax.X2.Q;
import ax.a3.D;
import ax.a3.n;
import ax.c0.s;
import ax.c3.K;
import ax.c3.d0;
import ax.q3.a;
import ax.u3.B;
import ax.u3.q;
import ax.u3.z;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.provider.MyFileProvider;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class TextEditorActivity
extends ax.R2.c
implements n.c {
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
    private int m = -1;
    private int n;
    private int o = -1;
    private int p;
    s q;
    private boolean r;
    private o s;
    private ax.Z2.k t;
    private ScaleGestureDetector u;
    private View.OnTouchListener v;
    private float w;
    private int x;
    private n y;
    private e z;

    static {
        int n8 = Build.VERSION.SDK_INT >= 30 ? 1500 : 2500;
        F = n8;
        G = n8 * 2;
    }

    static /* synthetic */ i B0(TextEditorActivity textEditorActivity, i i8) {
        textEditorActivity.c = i8;
        return i8;
    }

    public static int E0(String string, char c8) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        int n8 = 0;
        if (bl) {
            return 0;
        }
        int n9 = 0;
        while ((n8 = string.indexOf(c8, n8)) != -1) {
            ++n9;
            ++n8;
        }
        return n9;
    }

    public static int F0(String string, String string2) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        int n8 = 0;
        if (!bl && !TextUtils.isEmpty((CharSequence)string2)) {
            int n9 = 0;
            while ((n8 = string.indexOf(string2, n8)) != -1) {
                ++n9;
                n8 += string2.length();
            }
            return n9;
        }
        return 0;
    }

    private void G0(boolean bl) {
        n n8;
        if (this.n()) {
            return;
        }
        this.y = n8 = new n(this, bl);
        n8.h(new Void[0]);
    }

    public static int H0(String string, char c8, int n8) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return -1;
        }
        int n9 = 0;
        int n10 = 0;
        while ((n9 = string.indexOf(c8, n9)) != -1) {
            if (++n10 == n8) {
                return n9;
            }
            ++n9;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void I0() {
        try {
            e e8 = this.z;
            if (e8 == null) return;
            if (!e8.X0()) return;
            this.z.O2();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void J0() {
        this.setSupportActionBar(this.a);
        this.getSupportActionBar().x(true);
        this.a.setNavigationOnClickListener(new ax.g3.c(this){
            final TextEditorActivity c;
            {
                this.c = textEditorActivity;
            }

            @Override
            public void a(View view) {
                this.c.onBackPressed();
            }
        });
    }

    private void L0() {
        this.a = (Toolbar)this.findViewById(2131362981);
        this.b = (RecyclerView)this.findViewById(2131362729);
        this.e = (ProgressBar)this.findViewById(2131362712);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, (Context)this){
            final TextEditorActivity I;
            {
                this.I = textEditorActivity;
                super(context);
            }

            @Override
            public boolean g1(RecyclerView recyclerView, RecyclerView.B b8, View view, View view2) {
                return true;
            }
        };
        this.d = linearLayoutManager;
        this.b.setLayoutManager(linearLayoutManager);
        this.b.setItemAnimator(null);
        this.b.l(new k(this));
        this.K0();
    }

    private boolean M0() {
        ax.Z2.k k8 = this.t;
        if (k8 != null) {
            return ax.Q2.f.Y(k8.b());
        }
        return true;
    }

    private void N0(EditText editText) {
        editText.post(new Runnable(){
            final TextEditorActivity c0;
            final EditText q;
            {
                this.c0 = textEditorActivity;
                this.q = editText;
            }

            @Override
            public void run() {
                if (this.q.hasFocus()) {
                    int n8 = this.q.getSelectionStart();
                    Layout layout = this.q.getLayout();
                    if (layout != null && n8 != -1) {
                        int n9 = layout.getLineForOffset(n8);
                        int n10 = layout.getLineBaseline(n9);
                        n9 = layout.getLineAscent(n9);
                        float f8 = layout.getPrimaryHorizontal(n8);
                        float f9 = n10 + n9;
                        layout = this.q;
                        n8 = (int)f8;
                        n10 = (int)f9;
                        layout.requestRectangleOnScreen(new Rect(n8, n10, n8, n10), false);
                    }
                }
            }
        });
    }

    private void O0(h object) {
        this.g = object;
        int n8 = ((Enum)object).ordinal();
        if (n8 != 2) {
            if (n8 == 3) {
                this.a.setTitle(this.i);
            }
        } else {
            Toolbar toolbar = this.a;
            object = new StringBuilder();
            ((StringBuilder)object).append("* ");
            ((StringBuilder)object).append(this.i);
            toolbar.setTitle(((StringBuilder)object).toString());
        }
        this.invalidateOptionsMenu();
    }

    private void P0() {
        this.z = new D();
        ax.u3.B.d0(this.getSupportFragmentManager(), this.z, "save_progress", true);
    }

    static /* synthetic */ ArrayList Q(TextEditorActivity textEditorActivity, ArrayList arrayList) {
        textEditorActivity.j = arrayList;
        return arrayList;
    }

    static /* synthetic */ String S(TextEditorActivity textEditorActivity, String string) {
        textEditorActivity.l = string;
        return string;
    }

    static /* synthetic */ Charset U(TextEditorActivity textEditorActivity, Charset charset) {
        textEditorActivity.k = charset;
        return charset;
    }

    static /* synthetic */ Pattern W(Pattern pattern) {
        H = pattern;
        return pattern;
    }

    static /* synthetic */ boolean b0(TextEditorActivity textEditorActivity, boolean bl) {
        textEditorActivity.r = bl;
        return bl;
    }

    static /* synthetic */ int d0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.C = n8;
        return n8;
    }

    static /* synthetic */ Logger g0() {
        return D;
    }

    static /* synthetic */ int j0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.m = n8;
        return n8;
    }

    static /* synthetic */ int l0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.n = n8;
        return n8;
    }

    static /* synthetic */ int n0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.o = n8;
        return n8;
    }

    static /* synthetic */ int q0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.p = n8;
        return n8;
    }

    static /* synthetic */ float w0(TextEditorActivity textEditorActivity, float f8) {
        textEditorActivity.w = f8;
        return f8;
    }

    static /* synthetic */ float x0(TextEditorActivity textEditorActivity, float f8) {
        textEditorActivity.w = f8 = textEditorActivity.w * f8;
        return f8;
    }

    static /* synthetic */ int z0(TextEditorActivity textEditorActivity, int n8) {
        textEditorActivity.x = n8;
        return n8;
    }

    @Override
    public void G(ax.a3.n n8) {
    }

    void K0() {
        View.OnTouchListener onTouchListener;
        this.q = new s((Context)this, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            final TextEditorActivity a;
            {
                this.a = textEditorActivity;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (this.a.d.P() > 0) {
                    motionEvent = this.a.d.O(this.a.d.P() - 1);
                    if (!this.a.f) {
                        motionEvent.requestFocus();
                        motionEvent.postDelayed(new Runnable(){
                            final c c0;
                            final View q;
                            {
                                this.c0 = c8;
                                this.q = view;
                            }

                            @Override
                            public void run() {
                                if (!this.c0.a.n()) {
                                    ax.u3.z.E((Context)this.c0.a, this.q);
                                }
                            }
                        }, 100L);
                    }
                }
                return true;
            }
        });
        this.u = new ScaleGestureDetector((Context)this, (ScaleGestureDetector.OnScaleGestureListener)new l(this));
        this.v = onTouchListener = new View.OnTouchListener(this){
            final TextEditorActivity a;
            {
                this.a = textEditorActivity;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                this.a.u.onTouchEvent(motionEvent);
                return false;
            }
        };
        this.b.setOnTouchListener(onTouchListener);
        this.b.m(new RecyclerView.t(this){
            final TextEditorActivity a;
            {
                this.a = textEditorActivity;
            }

            @Override
            public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
                this.a.q.a(motionEvent);
            }

            @Override
            public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
                if (this.a.b.X(motionEvent.getX(), motionEvent.getY()) != null) {
                    return false;
                }
                this.a.q.a(motionEvent);
                return true;
            }

            @Override
            public void e(boolean bl) {
            }
        });
    }

    @Override
    public void P(ax.a3.n n8) {
        ax.Q2.a.i().m("menu_text_editor", "text_save").c("ext", d0.j(this.i)).e();
        this.G0(true);
    }

    @Override
    public void Z(ax.a3.n n8) {
        this.finish();
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return bl;
    }

    public boolean n() {
        return this.getSupportFragmentManager().Q0();
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        RecyclerView recyclerView;
        if (!bl && (recyclerView = this.b) != null) {
            recyclerView.setClipToPadding(false);
            this.b.setPadding(0, 0, 0, b8.d);
        }
    }

    @Override
    public void onBackPressed() {
        if (!this.n()) {
            if (this.g == com.voxdon.xplorer.texteditor.TextEditorActivity$h.d0) {
                ax.a3.n.k3(2131951786, 2131951790, 2131952296, 2131952256).c3(this.getSupportFragmentManager(), "dialog");
                return;
            }
            super.onBackPressed();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle object) {
        int n8;
        Object object2;
        Object object3;
        block27: {
            Object object4;
            block24: {
                Object object5;
                block25: {
                    Object object6;
                    block26: {
                        block22: {
                            block21: {
                                ax.Q2.b.f((Context)this, true);
                                super.onCreate((Bundle)object);
                                this.setContentView(2131558438);
                                this.L0();
                                this.J0();
                                object4 = this.getIntent().getData();
                                if (object4 == null) {
                                    ax.Ha.c.h().d("TextEditor DataUri == null").h();
                                    this.finish();
                                    return;
                                }
                                this.onSetContentView(false);
                                this.g = com.voxdon.xplorer.texteditor.TextEditorActivity$h.q;
                                object3 = D;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("TextEditor open : ");
                                ((StringBuilder)object2).append(object4);
                                ((Logger)object3).fine(((StringBuilder)object2).toString());
                                this.f = this.getIntent().getBooleanExtra("read_only", false);
                                boolean bl = "file".equals(object4.getScheme());
                                object6 = null;
                                object2 = null;
                                object5 = null;
                                object3 = null;
                                if (!bl) break block24;
                                object2 = object4.getPath();
                                this.h = object2;
                                this.s = ax.c3.x.g((String)object2);
                                this.i = d0.h(this.h);
                                object2 = this.getIntent().getStringExtra("original_file_location_uri");
                                if (TextUtils.isEmpty((CharSequence)object2)) break block25;
                                try {
                                    this.t = object2 = ax.Z2.k.a(Uri.parse((String)object2));
                                    object5 = ((ax.Z2.k)object2).d();
                                    object2 = K.h;
                                    if (object5 == object2) {
                                        this.s = ax.c3.x.e((K)object2);
                                    }
                                    if ((object2 = this.t) == null) break block21;
                                    object2 = ((ax.Z2.k)object2).b().I();
                                }
                                catch (Exception exception) {
                                    object2 = null;
                                    break block22;
                                }
                                try {
                                    object3 = object5 = d0.k(this.t.e());
                                }
                                catch (Exception exception) {}
                                break block22;
                            }
                            object5 = null;
                            break block26;
                        }
                        object6 = object2;
                        object5 = object3;
                    }
                    object2 = object5;
                    object3 = object6;
                    if (this.t == null) break block27;
                    object2 = object5;
                    object3 = object6;
                    if (object == null) break block27;
                    object4 = object.getString("file_open_path");
                    long l8 = object.getLong("file_open_last_modified", -1L);
                    object2 = object5;
                    object3 = object6;
                    if (object4 == null) break block27;
                    object2 = object5;
                    object3 = object6;
                    if (((String)object4).equals(this.t.e())) {
                        object2 = object5;
                        object3 = object6;
                        if (l8 != -1L) {
                            ax.o3.e.b().i(this.t.d(), this.t.e(), l8);
                            object2 = object5;
                            object3 = object6;
                        }
                    }
                    break block27;
                }
                object2 = null;
                object3 = object5;
                break block27;
            }
            if ("content".equals(object4.getScheme())) {
                if (!MyFileProvider.B((Uri)object4) && !MyFileProvider.A((Uri)object4)) {
                    Toast.makeText((Context)this, (int)2131951934, (int)1).show();
                    this.finish();
                    return;
                }
                object = MyFileProvider.e((Uri)object4);
                this.h = ((ax.Z2.k)object).e();
                object = ((ax.Z2.k)object).d();
                this.s = ax.c3.x.e((K)object);
                this.i = d0.h(this.h);
                if (object != null && this.h != null) {
                    object3 = ((K)object).d().I();
                    object = d0.k(this.h);
                } else {
                    object = null;
                    object3 = object2;
                }
                object2 = object;
            } else {
                block23: {
                    object = ax.Z2.k.a((Uri)object4);
                    this.h = ((ax.Z2.k)object).e();
                    object = ((ax.Z2.k)object).d();
                    this.s = ax.c3.x.e((K)object);
                    this.i = d0.h(this.h);
                    if (object != null && this.h != null) {
                        object = ((K)object).d().I();
                        object2 = d0.k(this.h);
                        break block23;
                    }
                    object = null;
                    object2 = null;
                }
                if (!this.s.a()) {
                    if (ax.Q2.f.e0(this.s.S()) || ax.Q2.f.o0(this.s.S())) {
                        this.s.h(null);
                    }
                    if (!this.s.a()) {
                        object = ax.Ha.c.h().f().d("TextEditor : FileOperator not connected");
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("location:");
                        ((StringBuilder)object2).append(this.s.S().I());
                        ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                        this.finish();
                        return;
                    }
                }
                object3 = object;
            }
        }
        if (object3 != null && object2 != null) {
            this.A = object3;
            this.B = object2;
        }
        this.x = n8 = ax.t3.j.m((Context)this);
        this.w = (float)n8 / 14.0f;
        this.setTitle(this.i);
        new m(this).i(new Void[0]);
        return;
        catch (IllegalArgumentException illegalArgumentException) {
            Toast.makeText((Context)this, (int)2131951934, (int)1).show();
            this.finish();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131689509, menu);
        return true;
    }

    @Override
    public void onIMEVisibilityChanged(boolean bl) {
        View view;
        if (bl && (view = this.getCurrentFocus()) instanceof EditText) {
            this.N0((EditText)view);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131362536) {
            return super.onOptionsItemSelected(menuItem);
        }
        ax.Q2.a.i().m("menu_text_editor", "text_save").c("ext", d0.j(this.i)).e();
        this.G0(false);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.x != ax.t3.j.m((Context)this)) {
            ax.t3.j.u((Context)this, this.x);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.findItem(2131362536);
        if (menuItem != null) {
            if (this.f) {
                menuItem.setVisible(false);
            } else {
                menuItem.setVisible(true);
                if (this.g == com.voxdon.xplorer.texteditor.TextEditorActivity$h.d0) {
                    menuItem.setEnabled(true);
                    menuItem.getIcon().setAlpha(255);
                } else {
                    menuItem.setEnabled(false);
                    menuItem.getIcon().setAlpha(85);
                }
            }
        } else {
            ax.Ha.c.h().f().d("not created options menu!!").j().h();
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        long l8;
        super.onSaveInstanceState(bundle);
        if (this.t != null && (l8 = ax.o3.e.b().c(this.t.d(), this.t.e())) != 0L) {
            bundle.putString("file_open_path", this.t.e());
            bundle.putLong("file_open_last_modified", l8);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ax.Q2.a.i().q(this.getClass().getSimpleName());
    }

    public static class g
    extends Editable.Factory {
        public Editable newEditable(CharSequence charSequence) {
            return new SpannableStringBuilder(this, charSequence){
                final g q;
                {
                    this.q = g8;
                    super(charSequence);
                }

                public SpannableStringBuilder replace(int n8, int n9, CharSequence charSequence, int n10, int n11) {
                    if (n8 == 0 && n10 == 0 && n9 == n11 && n9 == this.length() && this.length() == charSequence.length() && charSequence.toString().equals(((Object)((Object)this)).toString()) && charSequence instanceof Spanned && ((Spanned)charSequence).nextSpanTransition(n10, n11, SuggestionSpan.class) < n11) {
                        return this;
                    }
                    return super.replace(n8, n9, charSequence, n10, n11);
                }
            };
        }
    }

    static final class h
    extends Enum<h> {
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        public static final /* enum */ h e0;
        private static final h[] f0;
        public static final /* enum */ h q;

        static {
            q = new h();
            c0 = new h();
            d0 = new h();
            e0 = new h();
            f0 = com.voxdon.xplorer.texteditor.TextEditorActivity$h.d();
        }

        private static /* synthetic */ h[] d() {
            return new h[]{q, c0, d0, e0};
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])f0.clone();
        }
    }

    class i
    extends RecyclerView.h<a> {
        private ArrayList<j> d;
        final TextEditorActivity e;

        public i(TextEditorActivity textEditorActivity, ArrayList<j> arrayList) {
            this.e = textEditorActivity;
            this.d = arrayList;
        }

        public void O(a a8, int n8) {
            a8.N(n8);
            a8.O(this.e.x);
        }

        public a P(ViewGroup viewGroup, int n8) {
            viewGroup = this.e.f ? LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131558579, viewGroup, false) : LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131558578, viewGroup, false);
            return new a(this, (View)viewGroup);
        }

        @Override
        public int l() {
            return this.d.size();
        }

        class a
        extends RecyclerView.F {
            public EditText u;
            public boolean v;
            public boolean w;
            public boolean x;
            final i y;

            public a(i i8, View view) {
                this.y = i8;
                super(view);
                this.u = (EditText)view;
                if (J.e()) {
                    this.u.setEditableFactory((Editable.Factory)new g());
                }
                this.u.setOnTouchListener(i8.e.v);
                try {
                    view = ax.S.h.g(view.getContext(), 2131296257);
                    this.u.setTypeface((Typeface)view);
                }
                catch (Exception exception) {
                    ax.Ha.c.h().f().b("FONT LOAD ERROR").l(exception).h();
                }
                if (Q.r()) {
                    this.u.setOnEditorActionListener(new TextView.OnEditorActionListener(){
                        final i a;
                        final a b;
                        {
                            this.b = a8;
                            this.a = i8;
                        }

                        public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                            if ((n8 == 6 || n8 == 5) && keyEvent == null) {
                                int n9 = Math.max(this.b.u.getSelectionStart(), 0);
                                n8 = Math.max(this.b.u.getSelectionEnd(), 0);
                                this.b.u.getText().replace(Math.min(n9, n8), Math.max(n9, n8), (CharSequence)"\n", 0, 1);
                                return true;
                            }
                            return false;
                        }
                    });
                }
                this.u.setOnKeyListener(new View.OnKeyListener(){
                    final i a;
                    final a b;
                    {
                        this.b = a8;
                        this.a = i8;
                    }

                    public boolean onKey(View object, int n8, KeyEvent object2) {
                        int n9;
                        if (n8 == 47 && object2.isCtrlPressed()) {
                            this.b.y.e.G0(false);
                        }
                        if (n8 == 67 && object2.getAction() == 0 && this.b.u.getSelectionStart() == 0) {
                            n8 = this.b.y.e.b.k0((View)this.b.u);
                            if (n8 >= 0 && n8 < this.b.y.d.size() && n8 > 0) {
                                this.b.y.e.O0(com.voxdon.xplorer.texteditor.TextEditorActivity$h.d0);
                                object = this.b.y.e;
                                int n10 = n8 - 1;
                                TextEditorActivity.n0((TextEditorActivity)object, n10);
                                object = this.b.y;
                                TextEditorActivity.q0(((i)object).e, ((j)((i)object).d.get((int)n10)).a.length());
                                object2 = new StringBuilder();
                                object = (j)this.b.y.d.get(n10);
                                ((StringBuilder)object2).append(((j)object).a);
                                ((StringBuilder)object2).append(((j)((i)this.b.y).d.get((int)n8)).a);
                                ((j)object).a = ((StringBuilder)object2).toString();
                                this.b.y.d.remove(n8);
                                this.b.y.e.c.s(n10);
                                this.b.y.e.c.z(n8);
                            }
                            return true;
                        }
                        if (((n8 = n8 == 112 ? 1 : 0) & (n9 = object2.getAction() == 0 ? 1 : 0)) != 0 && this.b.u.getSelectionStart() == this.b.u.length()) {
                            n9 = this.b.y.e.b.k0((View)this.b.u);
                            if (n9 >= 0 && n9 < this.b.y.d.size() && n9 < this.b.y.d.size() - 1) {
                                this.b.y.e.O0(com.voxdon.xplorer.texteditor.TextEditorActivity$h.d0);
                                TextEditorActivity.n0(this.b.y.e, n9);
                                object = this.b.y;
                                TextEditorActivity.q0(((i)object).e, ((j)((i)object).d.get((int)n9)).a.length());
                                object = new StringBuilder();
                                j j8 = (j)this.b.y.d.get(n9);
                                ((StringBuilder)object).append(j8.a);
                                object2 = this.b.y.d;
                                n8 = n9 + 1;
                                ((StringBuilder)object).append(((j)((ArrayList)object2).get((int)n8)).a);
                                j8.a = ((StringBuilder)object).toString();
                                this.b.y.d.remove(n8);
                                this.b.y.e.c.s(n9);
                                this.b.y.e.c.z(n8);
                            }
                            return true;
                        }
                        return false;
                    }
                });
                this.u.addTextChangedListener(new TextWatcher(){
                    final i a;
                    final a b;
                    {
                        this.b = a8;
                        this.a = i8;
                    }

                    public void afterTextChanged(Editable object) {
                        Object object2 = this.b;
                        if (!((a)object2).v && !((a)object2).w) {
                            ((a)object2).y.e.O0(com.voxdon.xplorer.texteditor.TextEditorActivity$h.d0);
                            int n8 = this.b.y.e.d.m0((View)this.b.u);
                            object = object.toString();
                            if (n8 < 0) {
                                ax.Ha.c.h().f().b("TEXTEDITOR IndexOutOfBound -1").h();
                            } else if (n8 < this.b.y.d.size()) {
                                ((j)((i)this.b.y).d.get((int)n8)).a = object;
                            } else {
                                ax.Ha.c.h().f().b("TEXTEDITOR IndexOutOfBound").h();
                            }
                            if (this.b.y.e.r) {
                                if (TextEditorActivity.E0((String)object, '\n') >= G - 1) {
                                    int n9 = this.b.u.getSelectionStart();
                                    int n10 = TextEditorActivity.H0((String)object, '\n', F);
                                    int n11 = n10 > 0 && ((String)object).charAt(n10 - 1) == '\r' ? 1 : 0;
                                    n11 = n11 != 0 ? n10 - 1 : n10;
                                    object2 = ((String)object).substring(0, n11);
                                    object = ((String)object).substring(n10 + 1);
                                    Object object3 = this.b;
                                    if (((a)object3).x) {
                                        ((j)((i)((a)object3).y).d.get((int)n8)).a = object2;
                                        object2 = this.b.y.d;
                                        n11 = n8 + 1;
                                        ((j)((ArrayList)object2).get((int)n11)).a = object;
                                        this.b.y.e.c.s(n8);
                                        this.b.y.e.c.s(n11);
                                        return;
                                    }
                                    ((j)((i)((a)object3).y).d.get((int)n8)).a = object2;
                                    object3 = this.b.y.d;
                                    n11 = n8 + 1;
                                    ((ArrayList)object3).add(n11, new j(this.b.y.e, (String)object));
                                    this.b.y.e.c.s(n8);
                                    this.b.y.e.c.u(n11);
                                    if (n9 > ((String)object2).length()) {
                                        TextEditorActivity.j0(this.b.y.e, n11);
                                        TextEditorActivity.l0(this.b.y.e, n9 - n10 - 1);
                                    }
                                    this.b.y.e.b.B1(0, this.b.u.getLineHeight());
                                    this.b.x = true;
                                    return;
                                }
                            } else if (((String)object).contains("\n")) {
                                int n12 = ((String)object).indexOf("\n");
                                object2 = ((String)object).substring(0, n12);
                                object = ((String)object).substring(n12 + 1);
                                a a8 = this.b;
                                if (a8.x) {
                                    ((j)((i)a8.y).d.get((int)n8)).a = object2;
                                    object2 = this.b.y.d;
                                    n12 = n8 + 1;
                                    ((j)((ArrayList)object2).get((int)n12)).a = object;
                                    this.b.y.e.c.s(n8);
                                    this.b.y.e.c.s(n12);
                                    return;
                                }
                                ((j)((i)a8.y).d.get((int)n8)).a = object2;
                                object2 = this.b.y.d;
                                n12 = n8 + 1;
                                ((ArrayList)object2).add(n12, new j(this.b.y.e, (String)object));
                                this.b.y.e.c.s(n8);
                                this.b.y.e.c.u(n12);
                                TextEditorActivity.j0(this.b.y.e, n12);
                                TextEditorActivity.l0(this.b.y.e, 0);
                                this.b.y.e.b.B1(0, this.b.u.getLineHeight());
                                this.b.x = true;
                            }
                            return;
                        }
                        ((a)object2).v = false;
                        ((a)object2).x = false;
                    }

                    public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                    }

                    public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                    }
                });
            }

            public void N(int n8) {
                this.v = true;
                this.w = true;
                boolean bl = this.x;
                this.u.setTextKeepState((CharSequence)((j)((i)this.y).d.get((int)n8)).a);
                if (!bl) {
                    EditText editText = this.u;
                    editText.setSelection(editText.length());
                }
                this.w = false;
            }

            public void O(float f8) {
                this.u.setTextSize(f8);
            }
        }
    }

    class j {
        String a;
        final TextEditorActivity b;

        j(TextEditorActivity textEditorActivity, String string) {
            this.b = textEditorActivity;
            this.a = string;
        }
    }

    class k
    implements RecyclerView.r {
        final TextEditorActivity a;

        k(TextEditorActivity textEditorActivity) {
            this.a = textEditorActivity;
        }

        @Override
        public void a(View view) {
            if (this.a.o != -1) {
                view = (EditText)this.a.d.I(this.a.o);
                if (view == null) {
                    ax.Ha.c.h().d("INVALID TEXTEDITOR SELECTION NULL").g(this.a.p).h();
                    TextEditorActivity.n0(this.a, -1);
                    return;
                }
                if (!this.a.f) {
                    view.requestFocus();
                    ax.u3.z.E((Context)this.a, view);
                }
                if (this.a.p <= view.getText().length()) {
                    view.setSelection(this.a.p);
                } else {
                    ax.Ha.b b8 = ax.Ha.c.h().d("INVALID TEXTEDITOR SELECTION");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.a.p);
                    stringBuilder.append(" > ");
                    stringBuilder.append(view.getText().length());
                    b8.g(stringBuilder.toString()).h();
                }
                TextEditorActivity.n0(this.a, -1);
            }
        }

        @Override
        public void d(View view) {
            if (view != null && this.a.m == this.a.d.m0(view)) {
                view = (EditText)view;
                if (!this.a.f) {
                    view.requestFocus();
                    ax.u3.z.E((Context)this.a, view);
                }
                if (view.getText().length() > this.a.n) {
                    view.setSelection(this.a.n);
                }
                TextEditorActivity.j0(this.a, -1);
            }
        }
    }

    private class l
    extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        final TextEditorActivity a;

        private l(TextEditorActivity textEditorActivity) {
            this.a = textEditorActivity;
        }

        public boolean onScale(ScaleGestureDetector object) {
            TextEditorActivity.x0(this.a, object.getScaleFactor());
            object = this.a;
            TextEditorActivity.w0((TextEditorActivity)object, Math.max(0.6f, Math.min(((TextEditorActivity)object).w, 4.0f)));
            object = this.a;
            TextEditorActivity.z0((TextEditorActivity)object, (int)(((TextEditorActivity)object).w * 14.0f));
            if (this.a.c != null) {
                this.a.c.r();
            }
            return true;
        }
    }

    class m
    extends q<Void, Void, Integer> {
        private boolean h;
        final TextEditorActivity i;

        m(TextEditorActivity textEditorActivity) {
            this.i = textEditorActivity;
            super(q.e.d0);
        }

        private boolean A(int n8) {
            return n8 == 0;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private int C(o var1_1, com.voxdon.xplorer.file.n var2_13) {
            block33: {
                block31: {
                    block36: {
                        block35: {
                            block37: {
                                block32: {
                                    TextEditorActivity.Q(this.i, new ArrayList<E>());
                                    var12_18 = null;
                                    var13_19 = null;
                                    var14_20 = null;
                                    var11_21 = var14_20;
                                    try {
                                        var11_21 = var14_20;
                                        var11_21 = var14_20;
                                        var15_23 = new InputStreamReader(var1_1.J((com.voxdon.xplorer.file.n)var2_13, 0L), TextEditorActivity.T(this.i));
                                        var11_21 = var14_20;
                                        var10_22 = new a(var15_23);
                                    }
                                    catch (Throwable var1_5) {
                                        break block31;
                                    }
                                    catch (OutOfMemoryError var2_15) {
                                        var1_1 = var12_18;
                                        break block32;
                                    }
                                    catch (ax.b3.j | IOException var1_6) {
                                        var1_4 = var13_19;
                                        break block33;
                                    }
                                    try {
                                        var4_24 = J.h() != false ? 8000 : 0;
                                        var1_1 = new StringBuffer();
                                        var6_25 = 0;
                                        var3_26 = 0;
                                        var5_27 = 0;
                                        var8_28 = false;
lbl29:
                                        // 2 sources

                                        while (true) {
                                            var11_21 = var10_22.e();
                                            if (var11_21 == null) {
                                                if (var6_25 == 0) break;
                                                var11_21 = TextEditorActivity.O(this.i);
                                                var2_13 = new j(this.i, var1_1.toString());
                                                var11_21.add(var2_13);
                                            }
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                    }
                                    catch (Throwable var1_2) {
                                        var11_21 = var10_22;
                                        break block31;
                                    }
                                    catch (OutOfMemoryError var2_14) {
                                        var1_1 = var10_22;
                                        break block32;
                                    }
                                    catch (ax.b3.j | IOException var1_3) {
                                        var1_4 = var10_22;
                                        break block33;
                                    }
                                    if (var8_28) {
                                        var2_13 = TextEditorActivity.O(this.i);
                                        var1_1 = new j(this.i, "");
                                        var2_13.add(var1_1);
                                    }
                                    if (TextEditorActivity.O(this.i).size() == 0) {
                                        var1_1 = TextEditorActivity.O(this.i);
                                        var2_13 = new j(this.i, "");
                                        var1_1.add(var2_13);
                                    }
                                    var10_22.close();
                                    return 0;
lbl-1000:
                                    // 2 sources

                                    {
                                        while (var7_29 < var11_21.length()) {
                                            var9_30 = this.A(var11_21.charAt(var7_29));
                                            var6_25 = var5_27++;
                                            if (!var9_30) break block35;
                                            var6_25 = var5_27;
                                            if (var5_27 < 10) break block35;
                                        }
                                        break block36;
                                    }
                                    {
                                        var10_22.close();
                                        return -3;
                                        break;
                                    }
                                }
                                var11_21 = var1_1;
                                {
                                    ax.Ha.c.h().d("TEXT EDITOR OOM").g(var2_16.getMessage()).h();
                                    if (var1_1 == null) return -1;
                                }
                                try {
                                    var1_1.close();
                                    return -1;
                                }
                                catch (IOException var1_11) {
                                    return -1;
                                }
                                catch (IOException var1_8) {
                                    return 0;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var8_28 = var10_22.a();
                                    var6_25 = var11_21.length();
                                    if (var6_25 <= 200000) break block37;
                                }
                                {
                                    var10_22.close();
                                    return -3;
                                }
                            }
                            var7_29 = 0;
                            ** GOTO lbl-1000
                            catch (IOException var1_10) {
                                return -3;
                            }
                        }
                        ++var7_29;
                        var5_27 = var6_25;
                        ** GOTO lbl-1000
                    }
                    var6_25 = 1;
                    if (var3_26 != 0) ** GOTO lbl105
                    {
                        block38: {
                            var1_1.setLength(0);
                            var1_1.append((String)var11_21);
                            break block38;
lbl105:
                            // 1 sources

                            if (var3_26 < TextEditorActivity.h0() - 1 && (var4_24 == 0 || var1_1.length() + var11_21.length() <= var4_24)) {
                                var1_1.append(TextEditorActivity.R(this.i));
                                var1_1.append((String)var11_21);
                            } else {
                                var12_18 = TextEditorActivity.O(this.i);
                                var2_13 = new j(this.i, var1_1.toString());
                                var12_18.add(var2_13);
                                var1_1.setLength(0);
                                var1_1.append((String)var11_21);
                                var3_26 = 0;
                            }
                        }
                        ++var3_26;
                        ** continue;
                    }
                }
                if (var11_21 == null) throw var1_7;
                try {
                    var11_21.close();
                }
                catch (IOException var2_17) {
                    throw var1_7;
                }
                throw var1_7;
            }
            if (var1_4 == null) return -10;
            try {}
            catch (IOException var1_12) {
                return -10;
            }
            var1_4.close();
            return -10;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private int D(o object, com.voxdon.xplorer.file.n object2) {
            a a8;
            block34: {
                RuntimeException var1_7;
                Object object3;
                block32: {
                    block33: {
                        int n8;
                        boolean bl;
                        a a9;
                        Object object4;
                        TextEditorActivity.Q(this.i, new ArrayList());
                        Object var10_18 = null;
                        a a10 = null;
                        object3 = object4 = null;
                        try {
                            object3 = object4;
                            object3 = object4;
                            InputStreamReader inputStreamReader = new InputStreamReader(((o)object).J((com.voxdon.xplorer.file.n)object2, 0L), this.i.k);
                            object3 = object4;
                            a9 = new a(inputStreamReader);
                            bl = false;
                            n8 = 0;
                        }
                        catch (Throwable throwable) {
                            break block32;
                        }
                        catch (OutOfMemoryError outOfMemoryError) {
                            object = var10_18;
                        }
                        catch (ax.b3.j | IOException exception) {
                            a8 = a10;
                            break block34;
                        }
                        while (true) {
                            int n9;
                            int n10;
                            block35: {
                                block31: {
                                    block29: {
                                        block30: {
                                            object2 = a9.e();
                                            if (object2 != null) break block29;
                                            if (bl) {
                                                object2 = this.i.j;
                                                object = new j(this.i, "");
                                                ((ArrayList)object2).add(object);
                                            }
                                            if (this.i.j.size() != 0) break block30;
                                            object = this.i.j;
                                            object2 = new j(this.i, "");
                                            ((ArrayList)object).add(object2);
                                        }
                                        try {
                                            a9.close();
                                            return 0;
                                        }
                                        catch (IOException iOException) {
                                            return 0;
                                        }
                                    }
                                    bl = a9.a();
                                    n10 = ((String)object2).length();
                                    if (n10 <= 200000) break block31;
                                    try {
                                        a9.close();
                                        return -3;
                                    }
                                    catch (IOException iOException) {
                                        return -3;
                                    }
                                }
                                n9 = n8;
                                break block35;
                                catch (Throwable throwable) {
                                    object3 = a9;
                                    break block32;
                                }
                                catch (OutOfMemoryError outOfMemoryError) {
                                    object = a9;
                                    break block33;
                                }
                                catch (ax.b3.j | IOException exception) {
                                    a8 = a9;
                                    break block34;
                                }
                            }
                            for (n10 = 0; n10 < ((String)object2).length(); ++n10) {
                                boolean bl2 = this.A(((String)object2).charAt(n10));
                                n8 = n9++;
                                if (bl2) {
                                    n8 = n9;
                                    if (n9 >= 10) {
                                        a9.close();
                                        return -3;
                                    }
                                }
                                n9 = n8;
                            }
                            {
                                object3 = this.i.j;
                                object = new j(this.i, (String)object2);
                                ((ArrayList)object3).add(object);
                                n8 = n9;
                                continue;
                            }
                            break;
                        }
                        catch (IOException iOException) {
                            return -3;
                        }
                    }
                    object3 = object;
                    {
                        RuntimeException var2_16;
                        ax.Ha.c.h().d("TEXT EDITOR OOM").g(var2_16.getMessage()).h();
                        if (object == null) return -1;
                    }
                    try {
                        ((a)object).close();
                        return -1;
                    }
                    catch (IOException iOException) {
                        return -1;
                    }
                }
                if (object3 == null) throw var1_7;
                try {
                    ((a)object3).close();
                }
                catch (IOException iOException) {
                    throw var1_7;
                }
                throw var1_7;
            }
            if (a8 == null) return -10;
            try {
                a8.close();
                return -10;
            }
            catch (IOException iOException) {
                return -10;
            }
        }

        protected void B(Integer object) {
            if (!this.h) {
                this.i.s.k0(false);
                this.h = true;
            }
            this.i.e.setVisibility(8);
            if ((Integer)object == 0) {
                object = this.i;
                TextEditorActivity.B0((TextEditorActivity)object, new i((TextEditorActivity)object, ((TextEditorActivity)object).j));
                this.i.b.setAdapter(this.i.c);
                this.i.O0(com.voxdon.xplorer.texteditor.TextEditorActivity$h.c0);
                if (this.i.A != null && this.i.B != null) {
                    ax.Q2.a.i().o("text_editor_open").b("loc", this.i.A).b("ext", this.i.B).b("range", a.f.a(this.i.C)).c();
                }
                return;
            }
            if ((Integer)object == -1) {
                Toast.makeText((Context)this.i, (int)2131951967, (int)1).show();
                this.i.finish();
                return;
            }
            if ((Integer)object == -3) {
                Toast.makeText((Context)this.i, (int)2131951953, (int)1).show();
                this.i.finish();
                return;
            }
            Toast.makeText((Context)this.i, (int)2131951934, (int)1).show();
            this.i.finish();
        }

        @Override
        protected void o() {
            super.o();
            if (!this.h) {
                this.i.s.k0(false);
                this.h = true;
            }
        }

        @Override
        protected void r() {
            this.i.e.setVisibility(0);
            this.i.s.n0();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void w(o var1_1, com.voxdon.xplorer.file.n var2_14) {
            block31: {
                block29: {
                    block30: {
                        var6_16 = null;
                        var7_17 = null;
                        var4_18 = var7_17;
                        var4_18 = var7_17;
                        var5_19 = new BufferedInputStream(var1_1.J((com.voxdon.xplorer.file.n)var2_14, 0L));
                        try {
                            var2_14 = new ax.Rd.c(null);
                            var1_1 = new byte[4096];
                            while ((var3_20 = var5_19.read((byte[])var1_1)) != -1) {
                                var2_14.d((byte[])var1_1, 0, var3_20);
                                if (var2_14.c() == null) continue;
                                break;
                            }
                        }
                        catch (Throwable var1_2) {
                            var4_18 = var5_19;
                            break block29;
                        }
                        catch (ax.b3.j var1_3) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var2_14 = var5_19;
                                break block30;
                                break;
                            }
                        }
                        catch (IllegalCharsetNameException var1_4) {
                            ** GOTO lbl-1000
                        }
                        catch (UnsupportedCharsetException var1_5) {
                            ** GOTO lbl-1000
                        }
                        catch (IOException var1_6) {
                            ** continue;
                        }
                        var2_14.a();
                        var1_1 = var2_14.c();
                        if (var1_1 != null) {
                            if ("US-ASCII".equals(var1_1)) {
                                TextEditorActivity.U(this.i, Charset.defaultCharset());
                            } else {
                                TextEditorActivity.U(this.i, Charset.forName((String)var1_1));
                            }
                        }
                        if (TextEditorActivity.T(this.i) == null) {
                            TextEditorActivity.U(this.i, Charset.defaultCharset());
                        }
                        var5_19.close();
                        catch (Throwable var1_7) {
                            break block29;
                        }
                        catch (ax.b3.j var1_8) {
                            var2_14 = var6_16;
                        }
                        catch (IllegalCharsetNameException var1_9) {
                            var2_14 = var6_16;
                        }
                        catch (UnsupportedCharsetException var1_10) {
                            var2_14 = var6_16;
                        }
                        catch (IOException var1_11) {
                            var2_14 = var6_16;
                        }
                    }
                    var4_18 = var2_14;
                    {
                        var1_1.printStackTrace();
                    }
                    if (TextEditorActivity.T(this.i) == null) {
                        TextEditorActivity.U(this.i, Charset.defaultCharset());
                    }
                    if (var2_14 != null) {
                        var2_14.close();
                    }
lbl66:
                    // 4 sources

                    while (true) {
                        var2_14 = TextEditorActivity.g0();
                        var1_1 = new StringBuilder();
                        var1_1.append("DETECTED ENCODING : ");
                        var1_1.append(TextEditorActivity.T(this.i).name());
                        var2_14.fine(var1_1.toString());
                        return;
                    }
                }
                if (TextEditorActivity.T(this.i) == null) {
                    TextEditorActivity.U(this.i, Charset.defaultCharset());
                }
                if (var4_18 == null) throw var1_12;
                try {}
                catch (IOException var2_15) {
                    throw var1_12;
                }
                break block31;
                catch (IOException var1_13) {}
                ** while (true)
            }
            var4_18.close();
            throw var1_12;
        }

        /*
         * Exception decompiling
         */
        void x(o var1_1, com.voxdon.xplorer.file.n var2_6) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [23, 22, 21 : 148->157)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Integer y(Void ... object) {
            try {
                com.voxdon.xplorer.file.n n8 = this.i.s.z(this.i.h);
                if (this.z(n8)) {
                    return -1;
                }
                this.w(this.i.s, n8);
                this.x(this.i.s, n8);
                if (E) {
                    TextEditorActivity.b0(this.i, true);
                    return this.C(this.i.s, n8);
                }
                int n9 = this.D(this.i.s, n8);
                TextEditorActivity textEditorActivity = this.i;
                TextEditorActivity.d0(textEditorActivity, textEditorActivity.j.size());
                if (n9 == 0 && this.i.j.size() < 1000) {
                    TextEditorActivity.b0(this.i, true);
                    return this.C(this.i.s, n8);
                }
                TextEditorActivity.b0(this.i, false);
                return n9;
            }
            catch (ax.b3.j j8) {
                return -10;
            }
        }

        boolean z(com.voxdon.xplorer.file.n n8) {
            if (n8.p() < 102400L) {
                return false;
            }
            long l8 = n8.p() / 0x100000L;
            if (l8 > 30L) {
                return true;
            }
            if (l8 > (long)(((ActivityManager)this.i.getApplicationContext().getSystemService("activity")).getMemoryClass() * 4 / 10)) {
                return true;
            }
            long l9 = Runtime.getRuntime().totalMemory();
            long l10 = Runtime.getRuntime().freeMemory();
            long l11 = Debug.getNativeHeapAllocatedSize();
            return l8 > (Runtime.getRuntime().maxMemory() - (l9 - l10) - l11) / 0x100000L * 4L / 10L;
        }
    }

    class n
    extends q<Void, Void, Boolean> {
        private boolean h;
        boolean i;
        boolean j;
        Throwable k;
        final TextEditorActivity l;

        n(TextEditorActivity textEditorActivity, boolean bl) {
            this.l = textEditorActivity;
            super(q.e.d0);
            this.i = bl;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void A() throws IOException {
            RuntimeException var3_5;
            BufferedWriter bufferedWriter;
            block20: {
                int n8;
                boolean bl;
                Object object;
                Appendable appendable;
                block19: {
                    block18: {
                        appendable = null;
                        try {
                            object = this.l.s.u();
                            bl = object instanceof x;
                            n8 = 0;
                            if (!bl) break block18;
                            object = ((x)object).c(this.l.h, false);
                            break block19;
                        }
                        catch (Throwable throwable) {
                            bufferedWriter = appendable;
                            break block20;
                        }
                    }
                    if (object instanceof com.voxdon.xplorer.file.h) {
                        object = ((com.voxdon.xplorer.file.h)object).c(this.l.h, false);
                    } else {
                        ax.u3.b.f();
                        object = null;
                    }
                }
                bl = "\r\n".equals(this.l.l);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)object, this.l.k);
                bufferedWriter = new BufferedWriter(outputStreamWriter);
                try {
                    if (!this.x()) {
                        while (n8 < this.l.j.size()) {
                            object = (j)this.l.j.get(n8);
                            if (bl && ((j)object).a != null) {
                                if (H == null) {
                                    TextEditorActivity.W(Pattern.compile("(?<!\r)\n"));
                                }
                                object = H.matcher(((j)object).a).replaceAll("\r\n");
                            } else {
                                object = ((j)object).a;
                            }
                            if (n8 == this.l.j.size() - 1) {
                                bufferedWriter.write((String)object);
                            } else {
                                appendable = new StringBuilder();
                                ((StringBuilder)appendable).append((String)object);
                                ((StringBuilder)appendable).append(this.l.l);
                                bufferedWriter.write(((StringBuilder)appendable).toString());
                            }
                            ++n8;
                        }
                    }
                    bufferedWriter.flush();
                }
                catch (Throwable throwable) {
                    break block20;
                }
                try {
                    bufferedWriter.close();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
            if (bufferedWriter == null) throw var3_5;
            try {
                bufferedWriter.close();
            }
            catch (IOException iOException) {
                throw var3_5;
            }
            throw var3_5;
        }

        @Override
        protected void o() {
            if (!this.h) {
                this.l.s.k0(true);
                this.h = true;
            }
            if (!this.j) {
                this.l.I0();
            }
        }

        @Override
        protected void r() {
            boolean bl;
            this.l.s.n0();
            this.j = bl = this.l.M0();
            if (!bl) {
                this.l.P0();
            }
        }

        /*
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... object) {
            Object var1_7;
            block18: {
                block16: {
                    Throwable var1_4;
                    Object object2;
                    block19: {
                        o o8;
                        block17: {
                            try {
                                boolean bl;
                                this.A();
                                if (this.l.t == null || (bl = this.j)) break block16;
                                o8 = ax.c3.x.e(this.l.t.d());
                                bl = o8.a();
                                if (bl) break block17;
                            }
                            catch (IOException iOException) {
                                break block18;
                            }
                            try {
                                if (!o8.i(10000L)) {
                                    object = new IOException("Not connected to network storage");
                                    throw object;
                                }
                            }
                            catch (IOException iOException) {
                                break block18;
                            }
                            catch (ax.b3.a a8) {
                                break block19;
                            }
                            catch (ax.b3.j j8) {
                                break block19;
                            }
                        }
                        object2 = o8.z(this.l.t.e());
                        com.voxdon.xplorer.file.n n8 = this.l.s.z(this.l.h);
                        long l8 = ((com.voxdon.xplorer.file.n)object2).N().lastModified();
                        object = this.l.s;
                        ax.g3.i i8 = new ax.g3.i(this){
                            final n a;
                            {
                                this.a = n8;
                            }

                            @Override
                            public void a(long l8, long l9) {
                            }
                        };
                        try {
                            ((o)object).t0(n8, o8, (com.voxdon.xplorer.file.n)object2, this, i8);
                            ax.o3.e.b().j((com.voxdon.xplorer.file.n)object2, l8);
                            break block16;
                        }
                        catch (IOException iOException) {
                            break block18;
                        }
                        catch (ax.b3.a a9) {
                            break block19;
                        }
                        catch (ax.b3.j j9) {
                            break block19;
                        }
                        catch (ax.b3.a a10) {
                            break block19;
                        }
                        catch (ax.b3.j j10) {}
                    }
                    this.k = var1_4;
                    object2 = new IOException((Throwable)var1_4);
                    throw object2;
                }
                if (!Q.X1()) return Boolean.TRUE;
                if (!this.l.s.Y()) return Boolean.TRUE;
                this.l.s.n(null);
                return Boolean.TRUE;
            }
            if (this.k != null) return Boolean.FALSE;
            this.k = var1_7;
            return Boolean.FALSE;
        }

        boolean x() {
            return this.l.j.size() == 1 && ((j)((TextEditorActivity)this.l).j.get((int)0)).a.length() == 0;
        }

        protected void y(Boolean object) {
            if (!this.h) {
                this.l.s.k0(true);
                this.h = true;
            }
            if (!this.j) {
                this.l.I0();
            }
            if (((Boolean)object).booleanValue()) {
                this.l.O0(com.voxdon.xplorer.texteditor.TextEditorActivity$h.e0);
                if (this.i) {
                    this.l.finish();
                }
                return;
            }
            if (ax.t3.j.o((Context)this.l) && this.k != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.l.getString(2131951936));
                ((StringBuilder)object).append(" : ");
                ((StringBuilder)object).append(this.k.getMessage());
                object = ((StringBuilder)object).toString();
            } else {
                object = this.l.getString(2131951936);
            }
            this.z((String)object);
        }

        void z(String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<font color='red'>");
            stringBuilder.append(string);
            stringBuilder.append("</font>");
            string = Html.fromHtml((String)stringBuilder.toString());
            ax.u3.B.T(this.l.findViewById(0x1020002), string, 0).a0();
        }
    }
}

