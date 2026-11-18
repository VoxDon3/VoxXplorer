/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ax.Q2.f;
import ax.W2.t;
import ax.a3.L;
import ax.b3.j;
import ax.b3.s;
import ax.c3.K;
import ax.c3.u;
import ax.c3.x;
import ax.d3.E;
import ax.d3.k;
import ax.u3.o;
import ax.u3.q;
import com.voxdon.xplorer.file.b;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.provider.MyFileProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class l
extends E {
    private static final Logger F2 = Logger.getLogger("FileManager.ArchiveFileHelper");
    private t.a A2;
    private int B2;
    private c C2 = c.q;
    private boolean D2;
    private Uri E2;
    ProgressDialog s2;
    private com.voxdon.xplorer.file.o t2;
    private boolean u2;
    private String v2;
    private String w2;
    private y x2;
    private int y2;
    private Uri z2;

    private void Aa(String string) {
        if (this.E2 != null) {
            u.d0((Context)this.f0(), this.E2);
            this.E2 = null;
        }
        super.i3(string);
    }

    private void Da(List<n> list) {
        Object object;
        Object object2;
        ParcelFileDescriptor parcelFileDescriptor;
        String string;
        block11: {
            block12: {
                block10: {
                    if (this.f0() == null) {
                        return;
                    }
                    if (!o.e((Context)this.f0())) {
                        this.F2(u.G((Context)this.f0()));
                        return;
                    }
                    int n8 = this.y2;
                    string = null;
                    if (n8 != 0) {
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.fromFd((int)n8);
                        }
                        catch (IOException iOException) {
                            ax.Ha.b b8 = ax.Ha.c.h().f().b("ARCHIVE GET FD ERROR").l(iOException);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("haspath:");
                            boolean bl = this.w2 != null;
                            stringBuilder.append(bl);
                            b8.g(stringBuilder.toString()).h();
                            this.E4(2131951927, 1);
                            return;
                        }
                    } else {
                        parcelFileDescriptor = null;
                    }
                    if (this.B2 != 1 || (object2 = this.x2) == null) break block10;
                    object2 = ((y)object2).B0();
                    break block11;
                }
                if (MyFileProvider.B(this.z2)) break block12;
                object2 = string;
                if (!MyFileProvider.A(this.z2)) break block11;
            }
            object = MyFileProvider.e(this.z2);
            object2 = string;
            if (object != null) {
                object2 = ((ax.Z2.k)object).d();
            }
        }
        t.a a8 = this.A2;
        string = this.v2;
        object = this.x2;
        this.q8((K)object2, a8, string, parcelFileDescriptor, (n)object, (ax.c3.k)object, list);
    }

    private void Fa() {
        this.s7().o(2131361930, false);
        this.s7().o(2131361931, false);
        this.s7().o(2131361943, false);
    }

    private boolean Ga() {
        com.voxdon.xplorer.file.o o8 = this.t2;
        if (o8 == null) {
            return false;
        }
        return ((com.voxdon.xplorer.file.b)o8.u()).c1();
    }

    private void Ha(com.voxdon.xplorer.file.b b8, String string) {
        String string2;
        if (this.b() == null) {
            return;
        }
        String string3 = string2 = b8.W0();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string3 = this.b().getString(2131951846);
        }
        this.A(L.n3(string3, string, new L.c(){
            final com.voxdon.xplorer.file.b a;
            final l b;
            {
                this.b = l8;
                this.a = b8;
            }

            public static /* synthetic */ void b(a a8, com.voxdon.xplorer.file.b b8, String string, b.e e8) {
                a8.getClass();
                if (e8 == b.e.q) {
                    b8.n1(string);
                    a8.b.h9();
                    return;
                }
                if (e8 == b.e.c0) {
                    new Handler().postDelayed(new Runnable(){
                        final a c0;
                        final com.voxdon.xplorer.file.b q;
                        {
                            this.c0 = a8;
                            this.q = b8;
                        }

                        @Override
                        public void run() {
                            String string = this.c0.b.M0(2131951971);
                            this.c0.b.Ha(this.q, string);
                        }
                    }, 500L);
                    return;
                }
                a8.b.i3("archive_password_input");
            }

            @Override
            public void X(String string) {
                if (this.b.b() == null) {
                    return;
                }
                com.voxdon.xplorer.file.b b8 = this.a;
                b8.r1(string, new k(this, b8, string));
            }

            @Override
            public void a() {
                this.b.i3("archive_password_input");
            }
        }), "password", true);
    }

    private void Ia(boolean bl) {
        if (this.f0() != null) {
            ProgressDialog progressDialog;
            this.s2 = progressDialog = new ProgressDialog((Context)this.f0());
            progressDialog.setMessage((CharSequence)this.N0(2131951904, this.v2));
            this.s2.setProgressStyle(1);
            this.s2.setCancelable(false);
            this.s2.setCanceledOnTouchOutside(false);
            if (bl) {
                this.s2.setIndeterminate(bl);
            }
            this.s2.show();
        }
    }

    static /* synthetic */ c xa(l l8, c c8) {
        l8.C2 = c8;
        return c8;
    }

    static /* synthetic */ com.voxdon.xplorer.file.o ya(l l8) {
        return l8.t2;
    }

    private void za() {
        try {
            this.s2.dismiss();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ax.Ha.c.h().f().d("ILLEGAL STATUS ARCHIVE LIST").l(illegalArgumentException).h();
            return;
        }
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131362513) {
            return super.B1(menuItem);
        }
        ax.Q2.a.i().m("menu_folder", "extract_all").c("loc", this.z3().I()).e();
        this.Da(null);
        return true;
    }

    @Override
    protected String B7() {
        return this.v2;
    }

    protected void Ba(String string) {
        if (this.Ga()) {
            if (!this.D2) {
                this.D2 = true;
                new b(this, string).i(new Void[0]);
            }
            return;
        }
        this.Aa(string);
    }

    @Override
    protected boolean C7() {
        return false;
    }

    boolean Ca() {
        com.voxdon.xplorer.file.o o8 = this.t2;
        if (o8 == null) {
            return false;
        }
        return ((com.voxdon.xplorer.file.b)o8.u()).b1();
    }

    public void Ea(com.voxdon.xplorer.file.o o8) {
        this.t2 = o8;
        o8.n0();
    }

    @Override
    protected boolean K7(int n8, List<n> list, boolean bl) {
        if (n8 != 2131362512) {
            return super.K7(n8, list, bl);
        }
        ax.Q2.a.i().m("menu_folder", "extract").c("loc", this.z3().I()).e();
        this.Da(new ArrayList<n>(list));
        this.h3();
        return true;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.W0.setIsArchiveFile(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void P8(Uri uri) {
        if (this.f0() == null) {
            return;
        }
        try {
            ax.Z2.k k8 = ax.Z2.k.a(uri);
            if (k8.d() == this.A3()) {
                this.Z3(k8.e());
                return;
            }
            this.E2 = uri;
            this.i3("return_uri");
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    @Override
    public boolean V2() {
        if (!super.V2()) {
            this.i3("hw_back");
        }
        return true;
    }

    @Override
    public boolean Y7() {
        return false;
    }

    @Override
    protected boolean e7() {
        return false;
    }

    @Override
    protected void h9() {
        com.voxdon.xplorer.file.b b8;
        if (this.T7() && (b8 = (com.voxdon.xplorer.file.b)this.w7().u()).c1() && !b8.f1()) {
            this.Ha(b8, null);
            return;
        }
        super.h9();
    }

    @Override
    protected void i3(String string) {
        Object object = this.C2;
        if (object == c.q) {
            if (this.Ca()) {
                new d(this).i(new Long[0]);
                return;
            }
            this.Ba(string);
            return;
        }
        if (object == c.d0 && this.f0() != null && !this.f0().isFinishing()) {
            ax.Ha.b b8 = ax.Ha.c.h().d("!! ARCHIVE FINISH !!").j();
            object = new StringBuilder();
            ((StringBuilder)object).append("from : ");
            ((StringBuilder)object).append(string);
            b8.g(((StringBuilder)object).toString()).h();
            this.Ba(string);
        }
    }

    @Override
    protected void ia(Menu menu) {
        menu.findItem(2131362513).setShowAsActionFlags(8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j1(Activity activity) {
        block10: {
            this.A2 = t.a.q;
            this.z2 = (Uri)this.j0().getParcelable("archive_uri");
            Object object = this.j0();
            boolean bl = false;
            this.B2 = object.getInt("archive_file_type", 0);
            object = (Uri)this.j0().getParcelable("open_uri");
            if (this.B2 == 4) {
                if (object != null) {
                    bl = true;
                }
                ax.u3.b.c(bl);
                if (this.t2 == null) {
                    object = x.d(f.X0, this.x3());
                    this.t2 = object;
                    ((com.voxdon.xplorer.file.o)object).n0();
                }
                object = (com.voxdon.xplorer.file.b)this.t2.u();
                this.z2 = ((com.voxdon.xplorer.file.b)object).O0();
                this.B2 = ((com.voxdon.xplorer.file.b)object).N0();
                this.y2 = ((com.voxdon.xplorer.file.b)object).T0();
                this.v2 = ((com.voxdon.xplorer.file.b)object).W0();
            } else {
                this.y2 = this.j0().getInt("file_descriptor", 0);
                this.v2 = this.j0().getString("archive_name");
            }
            int n8 = this.B2;
            if (n8 != 1 && n8 != 2) {
                if (n8 != 3) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unknown archive file type : ");
                    ((StringBuilder)object).append(this.B2);
                    ax.u3.b.g(((StringBuilder)object).toString());
                }
            } else {
                this.w2 = object = this.z2.getPath();
                if (object != null) {
                    this.x2 = y.I0((String)object);
                }
                ax.u3.b.f();
            }
            break block10;
            catch (j j8) {}
        }
        super.j1(activity);
    }

    @Override
    protected void k8(List<n> list) {
        if (!this.a8()) {
            this.Fa();
        } else {
            this.s7().o(2131361943, false);
        }
        this.s7().l(2131689503);
    }

    @Override
    protected void l8(n n8) {
        if (n8 == null) {
            return;
        }
        if (!this.a8()) {
            this.Fa();
        } else {
            this.s7().o(2131361943, true);
        }
        this.s7().l(2131689504);
        if (n8.isDirectory()) {
            this.s7().t(2131362545, false);
            return;
        }
        this.s7().t(2131362545, true);
    }

    @Override
    protected void m8(boolean bl, Object object) {
        if (!this.X0()) {
            return;
        }
        if (bl) {
            object = (com.voxdon.xplorer.file.b)this.w7().u();
            if (((com.voxdon.xplorer.file.b)object).c1()) {
                this.Ha((com.voxdon.xplorer.file.b)object, null);
                return;
            }
            this.h9();
            return;
        }
        if (object instanceof IOException) {
            IOException iOException = (IOException)object;
            iOException.printStackTrace();
            CharSequence charSequence = iOException.getMessage();
            object = charSequence;
            if (charSequence != null) {
                object = charSequence;
                if (((String)charSequence).startsWith("Error on ZipFile")) {
                    object = charSequence;
                    if (iOException.getCause() != null) {
                        object = charSequence;
                        if (!TextUtils.isEmpty((CharSequence)iOException.getCause().getMessage())) {
                            object = iOException.getCause().getMessage();
                        }
                    }
                }
            }
            if (this.u2 && this.w2 == null && this.y2 != 0) {
                F2.severe("ArchiveViewer restored from saved state!");
            } else if (object != null && ((String)object).toLowerCase().startsWith("archive is not a zip archive")) {
                this.A4(2131951676, 1);
            } else if (object != null && (((String)object).contains("ENOENT") || ((String)object).contains("No such file")) || "NoSuchFileException".equals(iOException.getClass().getSimpleName())) {
                this.J4(2131951935, 1);
            } else {
                if (this.x2 != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(iOException.getClass().getSimpleName());
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(this.x2.n());
                    object = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(iOException.getClass().getSimpleName());
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(":ParcelFileDescriptor");
                    object = ((StringBuilder)charSequence).toString();
                }
                this.J4(2131951945, 1);
                ax.Ha.c.h().f().d("ARCHIVE LOADING").g(object).h();
            }
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("archive error : ");
            ((StringBuilder)object).append((Object)this.A2);
            ax.u3.b.g(((StringBuilder)object).toString());
            this.J4(2131951945, 1);
        }
        this.i3("archive_get_operator");
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle != null) {
            this.u2 = true;
            return;
        }
        this.u2 = false;
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689495);
        this.O7(menu);
        this.ia(menu);
    }

    @Override
    public void s1() {
        com.voxdon.xplorer.file.o o8 = this.t2;
        if (o8 != null) {
            o8.k0(false);
            this.t2 = null;
        }
        super.s1();
    }

    @Override
    public com.voxdon.xplorer.file.o w7() {
        if (this.t2 == null) {
            int n8 = this.B2;
            if (n8 != 1 && n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        ax.u3.b.f();
                    } else {
                        ax.u3.b.f();
                    }
                } else {
                    if (this.y2 == 0) {
                        ax.u3.b.f();
                    }
                    this.t2 = x.b(this.A3(), this.z2, this.v2, this.y2, this.B2);
                }
            } else {
                if (this.x2 == null) {
                    ax.u3.b.f();
                }
                this.t2 = x.a(this.A3(), this.z2, this.x2, this.B2);
            }
            if (this.t2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("archive file operator == null :");
                stringBuilder.append(this.B2);
                ax.u3.b.g(stringBuilder.toString());
            }
            this.t2.n0();
        }
        return this.t2;
    }

    @Override
    public f z3() {
        return f.X0;
    }

    private class b
    extends q<Void, Void, Boolean> {
        private final File h;
        private final String i;
        final l j;

        b(l l8, String string) {
            this.j = l8;
            super(q.e.d0);
            this.i = string;
            this.h = ax.Z2.a.i(l8.o3(), l8.z3(), l8.x3());
        }

        @Override
        protected void r() {
            super.r();
            this.j.Ia(true);
        }

        protected Boolean w(Void ... voidArray) {
            boolean bl;
            try {
                if (!this.h.exists()) {
                    return Boolean.TRUE;
                }
                bl = ax.Z2.a.f(this.h, true);
            }
            catch (RuntimeException runtimeException) {
                return Boolean.FALSE;
            }
            return bl;
        }

        protected void x(Boolean bl) {
            this.j.za();
            this.j.Aa(this.i);
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }

    class d
    extends q<Long, Integer, Integer> {
        Throwable h;
        final l i;

        public d(l l8) {
            this.i = l8;
            super(q.e.d0);
        }

        @Override
        protected void r() {
            l.xa(this.i, c.c0);
            this.i.Ia(false);
        }

        /*
         * Exception decompiling
         */
        protected Integer x(Long ... var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [5 : 253->326)] java.lang.Throwable
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

        protected void y(Integer n8) {
            if (n8 != 0) {
                this.i.o3();
                if (this.h instanceof s) {
                    this.i.J4(2131952035, 1);
                    this.i.J4(2131951952, 0);
                } else {
                    this.i.J4(2131952035, 1);
                }
            }
            this.i.za();
            if (n8 != 2) {
                l.xa(this.i, c.d0);
                this.i.Ba("archive_update");
                return;
            }
            l.xa(this.i, c.q);
        }

        protected void z(Integer ... integerArray) {
            if (this.i.s2.getMax() != integerArray[1].intValue()) {
                this.i.s2.setMax(integerArray[1].intValue());
            }
            this.i.s2.setProgress(integerArray[0].intValue());
        }
    }
}

