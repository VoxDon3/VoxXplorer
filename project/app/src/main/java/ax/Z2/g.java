/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.Q2.f;
import ax.Z2.j;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.b;
import ax.u3.q;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.v;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class g {
    private static g g;
    private Map<String, String> a = new HashMap<String, String>();
    private Context b;
    private boolean c;
    private c d;
    BroadcastReceiver e = new BroadcastReceiver(this){
        final g a;
        {
            this.a = g8;
        }

        public void onReceive(Context context, Intent intent) {
            this.a.j();
        }
    };
    BroadcastReceiver f = new BroadcastReceiver(this){
        final g a;
        {
            this.a = g8;
        }

        public void onReceive(Context object, Intent object2) {
            object = object2.getStringArrayListExtra("CHANGED_STORAGES");
            if (object != null) {
                int n8 = ((ArrayList)object).size();
                int n9 = 0;
                while (n9 < n8) {
                    object2 = ((ArrayList)object).get(n9);
                    int n10 = n9 + 1;
                    object2 = K.h((String)object2);
                    n9 = n10;
                    if (object2 == null) continue;
                    n9 = n10;
                    if (!ax.Q2.f.f0(((K)object2).d())) continue;
                    this.a.j();
                    break;
                }
            }
        }
    };

    public static y.b c(String string) {
        if (string == null) {
            return y.b.q;
        }
        if ("S".equals(string)) {
            return y.b.d0;
        }
        if ("L".equals(string)) {
            return y.b.e0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown hiddenType:");
        stringBuilder.append(string);
        ax.u3.b.e(stringBuilder.toString());
        return y.b.q;
    }

    private String d(String string) {
        return d0.Q(string, ".hiddenFiles");
    }

    private BufferedWriter g(K object, String object2) {
        try {
            object2 = ((x)ax.c3.x.e((K)object).u()).c(this.d((String)object2), false);
            object = new OutputStreamWriter((OutputStream)object2);
            object = new BufferedWriter((Writer)object);
            return object;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static g h() {
        if (g == null) {
            g = new g();
        }
        return g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string;
                block4: {
                    try {
                        this.a.clear();
                        string = j.F().O();
                        if (string == null) break block4;
                        this.l(K.e, string);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((string = j.F().T()) != null) {
                    this.l(K.f, string);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(K var1_1, String var2_7) {
        synchronized (this) {
            block35: {
                block33: {
                    block32: {
                        var6_12 /* !! */  = null;
                        var5_13 = null;
                        var4_15 = var7_14 = null;
                        var8_19 = ax.c3.x.e((K)var1_1);
                        var4_15 = var7_14;
                        var10_20 = var8_19.z(this.d((String)var2_7));
                        var4_15 = var7_14;
                        var3_21 = var10_20.n();
                        if (var3_21) break block32;
                        return;
                    }
                    var4_15 = var7_14;
                    var4_15 = var7_14;
                    var4_15 = var7_14;
                    var9_22 = new InputStreamReader(var8_19.J(var10_20, 0L));
                    var4_15 = var7_14;
                    var2_7 = new BufferedReader(var9_22);
                    var4_15 = var2_7.readLine();
                    var2_7.readLine();
                    var3_21 = "HIDDENFILELIST".equals(var4_15);
                    if (var3_21) break block33;
                    try {
                        var2_7.close();
                        ** GOTO lbl95
                    }
                    catch (Throwable var1_2) {
                    }
                }
                while (true) {
                    block34: {
                        var4_15 = var2_7.readLine();
                        if (var4_15 != null) break block34;
                        var2_7.close();
                    }
                    var6_12 /* !! */  = this.p((String)var4_15);
                    if (var6_12 /* !! */  == null || var6_12 /* !! */ .length != 4) continue;
                    var4_15 = var6_12 /* !! */ [0];
                    if (var4_15.length() != 1 || (var5_13 = K.h(var6_12 /* !! */ [1])) == null || (var7_14 = K.h(var6_12 /* !! */ [2])) != var1_1) continue;
                    var7_14 = var7_14.e();
                    if (var7_14 == null) continue;
                    var6_12 /* !! */  = var6_12 /* !! */ [3];
                    try {
                        if (!d0.B((String)var6_12 /* !! */ )) {
                            var5_13 = ax.Ha.c.h().f().b("HIDE MANAGER BROKEN PATH");
                            var4_15 = new StringBuilder();
                            var4_15.append("path:");
                            var4_15.append((String)var6_12 /* !! */ );
                            var5_13.g(var4_15.toString()).h();
                            continue;
                        }
                    }
                    catch (Throwable var1_3) {
                        var4_15 = var2_7;
                        ** GOTO lbl109
                    }
                    catch (Exception var4_16) {
                        var1_1 = var2_7;
                        var2_7 = var4_16;
                        ** GOTO lbl96
                    }
                    catch (ax.b3.j var4_17) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var1_1 = var2_7;
                            var2_7 = var4_15;
                            ** GOTO lbl105
                            break;
                        }
                    }
                    catch (IOException var4_18) {
                        ** continue;
                    }
                    if (!d0.B((String)(var6_12 /* !! */  = d0.P((String)var7_14, (String)var6_12 /* !! */ )))) continue;
                    var5_13 = B.U((K)var5_13, (String)var6_12 /* !! */ );
                    this.a.put((String)var5_13, (String)var4_15);
                }
                catch (Throwable var1_4) {
                    ** GOTO lbl109
                }
                catch (Exception var2_8) {
                    var1_1 = var6_12 /* !! */ ;
                    ** GOTO lbl96
                }
                catch (ax.b3.j var2_9) {
                    var1_1 = var5_13;
                    ** GOTO lbl105
                }
                catch (IOException var2_10) {
                    var1_1 = var5_13;
                    ** GOTO lbl105
                }
                catch (IOException var1_5) {
                    ** GOTO lbl95
                }
                {
                    throw var1_2;
lbl95:
                    // 2 sources

                    return;
lbl96:
                    // 2 sources

                    var4_15 = var1_1;
                    {
                        var2_7.printStackTrace();
                        var4_15 = var1_1;
                        ax.Ha.c.h().f().b("HIDE MANAGER LOAD").l((Throwable)var2_7).h();
                        if (var1_1 == null) return;
                    }
lbl101:
                    // 2 sources

                    while (true) {
                        var1_1.close();
                        break block35;
                        break;
                    }
lbl105:
                    // 3 sources

                    var4_15 = var1_1;
                    {
                        var2_7.printStackTrace();
                        if (var1_1 == null) return;
                        ** continue;
                    }
lbl109:
                    // 2 sources

                    if (var4_15 == null) throw var1_1;
                    try {}
                    catch (IOException var2_11) {
                        throw var1_1;
                    }
                    ** break block36
                    catch (IOException var1_6) {}
                }
                break block35;
lbl-1000:
                // 1 sources

                {
                    var4_15.close();
                    throw var1_1;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o() {
        synchronized (this) {
            this.c = true;
            return;
        }
    }

    private String[] p(String string) {
        this.d.e(string);
        if (this.d.hasNext()) {
            String string2 = this.d.b();
            if (this.d.hasNext()) {
                String string3 = this.d.b();
                if (this.d.hasNext()) {
                    string = this.d.b();
                    if (this.d.hasNext()) {
                        return new String[]{string2, string3, string, this.d.c()};
                    }
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String e(K object, K k8, String string) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    block6: {
                        try {
                            if (this.b == null) return null;
                            if (!this.c) break block5;
                            if ((object = this.a.get(B.U((K)object, string))) == null) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        return object;
                    }
                    if (k8 == null) return object;
                    return this.a.get(B.U(k8, string));
                }
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String f(n object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.b == null) return null;
                    if (this.c) {
                        if (!(object instanceof v)) return this.e(((n)object).R(), null, ((n)object).E());
                        return this.e(((n)object).R(), ((v)object).B0(), ((n)object).E());
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    public void i(Context context) {
        this.b = context;
        this.d = new c('|');
        this.j();
        ax.u3.g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.f);
        ax.u3.g.a().d("local.intent.action.STORAGE_GRANTED", this.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() {
        synchronized (this) {
            d d8 = new d(this);
            d8.i(new Void[0]);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean m(Map<String, String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [16, 15, 14 : 236->244)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean n(n n8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block6: {
                    boolean bl2;
                    Object object;
                    block9: {
                        block11: {
                            block7: {
                                boolean bl3;
                                block8: {
                                    try {
                                        object = this.b;
                                        bl2 = false;
                                        if (object == null) return false;
                                        if (!this.c) break block6;
                                        object = new HashMap(this.a);
                                        bl3 = true;
                                        if (!bl) break block7;
                                        if (!ax.Q2.f.g0(n8.P())) break block8;
                                        object.put(n8.Q(), "L");
                                        bl = bl3;
                                        break block9;
                                    }
                                    catch (Throwable throwable2) {
                                        break block10;
                                    }
                                }
                                object.put(n8.Q(), "S");
                                bl = bl3;
                                break block9;
                            }
                            bl = object.remove(n8.Q()) != null;
                            if (!(n8 instanceof v)) break block9;
                            n8 = object.remove(((v)n8).A1());
                            if (bl) break block11;
                            bl = bl2;
                            if (n8 == null) break block9;
                        }
                        bl = true;
                    }
                    bl2 = bl;
                    if (!bl) return bl2;
                    bl2 = bl = this.m((Map<String, String>)object);
                    if (!bl) return bl2;
                    this.a = object;
                    return bl;
                }
                return false;
            }
            throw throwable2;
        }
    }

    private static class c
    implements Iterator<String> {
        private char c0;
        private int d0;
        private int e0;
        private String q;

        public c(char c8) {
            this.c0 = c8;
        }

        public String b() {
            int n8;
            int n9 = n8 = this.q.indexOf(this.c0, this.d0);
            if (n8 == -1) {
                n9 = this.e0;
            }
            String string = this.q.substring(this.d0, n9);
            this.d0 = n9 + 1;
            return string;
        }

        public String c() {
            int n8 = this.e0;
            String string = this.q.substring(this.d0, n8);
            this.d0 = n8 + 1;
            return string;
        }

        public void e(String string) {
            this.q = string;
            this.d0 = 0;
            this.e0 = string.length();
        }

        @Override
        public boolean hasNext() {
            return this.d0 < this.e0;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class d
    extends q<Void, Void, Integer> {
        final g h;

        d(g g8) {
            this.h = g8;
            super(q.e.d0);
        }

        protected Integer w(Void ... voidArray) {
            try {
                this.h.k();
                this.h.o();
            }
            catch (RuntimeException runtimeException) {
                runtimeException.printStackTrace();
                ax.Ha.c.h().f().b("HIDEMANAGER RUNTIME").l(runtimeException).h();
            }
            return null;
        }
    }
}

