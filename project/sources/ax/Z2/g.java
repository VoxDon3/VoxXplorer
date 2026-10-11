package ax.Z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3189g;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3602v;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    private static g g;
    private Context b;
    private boolean c;
    private c d;
    private Map<String, String> a = new HashMap();
    BroadcastReceiver e = new a();
    BroadcastReceiver f = new b();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            g.this.j();
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CHANGED_STORAGES");
            if (stringArrayListExtra == null) {
                return;
            }
            int size = stringArrayListExtra.size();
            int i = 0;
            while (i < size) {
                String str = stringArrayListExtra.get(i);
                i++;
                K h = K.h(str);
                if (h != null && ax.Q2.f.f0(h.d())) {
                    g.this.j();
                    return;
                }
            }
        }
    }

    private static class c implements Iterator<String> {
        private char c0;
        private int d0;
        private int e0;
        private String q;

        public c(char c) {
            this.c0 = c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            int indexOf = this.q.indexOf(this.c0, this.d0);
            if (indexOf == -1) {
                indexOf = this.e0;
            }
            String substring = this.q.substring(this.d0, indexOf);
            this.d0 = indexOf + 1;
            return substring;
        }

        public String c() {
            int i = this.e0;
            String substring = this.q.substring(this.d0, i);
            this.d0 = i + 1;
            return substring;
        }

        public void e(String str) {
            this.q = str;
            this.d0 = 0;
            this.e0 = str.length();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d0 < this.e0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class d extends AbstractC3199q<Void, Void, Integer> {
        d() {
            super(AbstractC3199q.e.HIGHER);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            try {
                g.this.k();
                g.this.o();
                return null;
            } catch (RuntimeException e) {
                e.printStackTrace();
                ax.Ha.c.h().f().b("HIDEMANAGER RUNTIME").l(e).h();
                return null;
            }
        }
    }

    public static C3605y.b c(String str) {
        if (str == null) {
            return C3605y.b.VISIBLE;
        }
        if ("S".equals(str)) {
            return C3605y.b.HIDDEN_DOTHIDDEN;
        }
        if ("L".equals(str)) {
            return C3605y.b.HIDDEN_LIBRARY;
        }
        C3184b.e("Unknown hiddenType:" + str);
        return C3605y.b.VISIBLE;
    }

    private String d(String str) {
        return d0.Q(str, ".hiddenFiles");
    }

    private BufferedWriter g(K k, String str) {
        try {
            return new BufferedWriter(new OutputStreamWriter(((C3604x) C1835x.e(k).u()).c(d(str), false)));
        } catch (IOException unused) {
            return null;
        }
    }

    public static g h() {
        if (g == null) {
            g = new g();
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        try {
            this.a.clear();
            String O = j.F().O();
            if (O != null) {
                l(K.e, O);
            }
            String T = j.F().T();
            if (T != null) {
                l(K.f, T);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r0 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00eb, code lost:
    
        r0.close();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e9, code lost:
    
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ax.Ha.b] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void l(ax.c3.K r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z2.g.l(ax.c3.K, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        this.c = true;
    }

    private String[] p(String str) {
        this.d.e(str);
        if (this.d.hasNext()) {
            String next = this.d.next();
            if (this.d.hasNext()) {
                String next2 = this.d.next();
                if (this.d.hasNext()) {
                    String next3 = this.d.next();
                    if (this.d.hasNext()) {
                        return new String[]{next, next2, next3, this.d.c()};
                    }
                }
            }
        }
        return null;
    }

    public synchronized String e(K k, K k2, String str) {
        if (this.b != null && this.c) {
            String str2 = this.a.get(C1809B.U(k, str));
            if (str2 != null) {
                return str2;
            }
            if (k2 != null) {
                str2 = this.a.get(C1809B.U(k2, str));
            }
            return str2;
        }
        return null;
    }

    public synchronized String f(AbstractC3595n abstractC3595n) {
        if (this.b != null && this.c) {
            if (abstractC3595n instanceof C3602v) {
                return e(abstractC3595n.R(), ((C3602v) abstractC3595n).B0(), abstractC3595n.E());
            }
            return e(abstractC3595n.R(), null, abstractC3595n.E());
        }
        return null;
    }

    public void i(Context context) {
        this.b = context;
        this.d = new c('|');
        j();
        C3189g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.f);
        C3189g.a().d("local.intent.action.STORAGE_GRANTED", this.e);
    }

    public synchronized void j() {
        new d().i(new Void[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[Catch: all -> 0x012f, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #8 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000c, B:83:0x012b, B:79:0x0134, B:132:0x0189, B:125:0x0190, B:126:0x0193, B:116:0x0153, B:112:0x015a, B:100:0x017b, B:96:0x0182), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean m(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z2.g.m(java.util.Map):boolean");
    }

    public synchronized boolean n(AbstractC3595n abstractC3595n, boolean z) {
        try {
            if (this.b != null && this.c) {
                HashMap hashMap = new HashMap(this.a);
                boolean z2 = true;
                if (!z) {
                    boolean z3 = hashMap.remove(abstractC3595n.Q()) != null;
                    if (abstractC3595n instanceof C3602v) {
                        z2 = z3 || hashMap.remove(((C3602v) abstractC3595n).A1()) != null;
                    } else {
                        z2 = z3;
                    }
                } else if (ax.Q2.f.g0(abstractC3595n.P())) {
                    hashMap.put(abstractC3595n.Q(), "L");
                } else {
                    hashMap.put(abstractC3595n.Q(), "S");
                }
                if (z2 && (z2 = m(hashMap))) {
                    this.a = hashMap;
                }
                return z2;
            }
            return false;
        } finally {
        }
    }
}
