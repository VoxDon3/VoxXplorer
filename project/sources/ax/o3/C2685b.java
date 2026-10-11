package ax.o3;

import android.content.Intent;
import android.os.FileObserver;
import ax.u3.C3180B;
import ax.u3.C3189g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

/* renamed from: ax.o3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2685b {
    private static final Logger b = Logger.getLogger("FileManager.FileObserverManager");
    private static C2685b c;
    private HashMap<String, c> a = new HashMap<>();

    /* renamed from: ax.o3.b$a */
    class a implements d {
        a() {
        }

        @Override // ax.o3.C2685b.d
        public void a(File file, IOException iOException) {
            C2685b.this.h("file descriptor closed");
            c i = C2685b.this.i(file);
            if (i != null) {
                i.i = 2;
                C2685b.this.f(i, true);
            }
        }

        @Override // ax.o3.C2685b.d
        public void b(File file) {
            C2685b.this.h("file descriptor opened");
            c i = C2685b.this.i(file);
            if (i != null) {
                i.i = 1;
            }
        }
    }

    /* renamed from: ax.o3.b$b, reason: collision with other inner class name */
    class FileObserverC0395b extends FileObserver {
        final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        FileObserverC0395b(String str, c cVar) {
            super(str);
            this.a = cVar;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (this.a.h || this.a.j) {
                return;
            }
            if (i == 32) {
                C2685b.this.h("observer : open");
                this.a.g = 0;
                return;
            }
            if (i == 8) {
                C2685b.this.h("observer : close write");
                C2685b.this.f(this.a, false);
                return;
            }
            if (i == 1024) {
                C2685b.this.h("observer : delete_self");
                C2685b.this.f(this.a, false);
                C2685b.this.o(this.a);
            } else if (i == 2) {
                C2685b.this.h("observer : modify");
                this.a.c = true;
            } else if (i == 32768) {
                C2685b.this.h("observer : ignored");
                if (this.a.g <= 0) {
                    c.h(this.a);
                    C2685b.this.o(this.a);
                }
            }
        }
    }

    /* renamed from: ax.o3.b$c */
    static class c {
        private String a;
        private long b;
        private long d;
        private String e;
        private FileObserver f;
        private int g;
        private boolean j;
        private boolean c = false;
        private boolean h = false;
        private int i = 0;

        c(File file, String str) {
            this.a = file.getAbsolutePath();
            this.b = file.lastModified();
            this.d = file.length();
            this.e = str;
        }

        static /* synthetic */ int h(c cVar) {
            int i = cVar.g;
            cVar.g = i + 1;
            return i;
        }
    }

    /* renamed from: ax.o3.b$d */
    public interface d {
        void a(File file, IOException iOException);

        void b(File file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(c cVar, boolean z) {
        if (cVar.i == 1) {
            return;
        }
        File file = new File(cVar.a);
        long lastModified = file.lastModified();
        long length = file.length();
        if (cVar.b != lastModified || cVar.d != length) {
            h("update : file date changed. " + z + "," + lastModified + "," + length);
        } else {
            if (!cVar.c || cVar.i != 0) {
                return;
            }
            h("update : file modified. " + z + "," + lastModified + "," + length);
        }
        cVar.b = lastModified;
        cVar.d = length;
        cVar.c = false;
        q(cVar.a, cVar.e, true);
    }

    private void g(c cVar) {
        if (cVar != null) {
            cVar.j = true;
            s(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c i(File file) {
        if (this.a.size() <= 0) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        for (c cVar : this.a.values()) {
            if (cVar.a != null && cVar.a.equals(absolutePath)) {
                return cVar;
            }
        }
        return null;
    }

    public static C2685b j() {
        if (c == null) {
            c = new C2685b();
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(c cVar) {
        r(cVar);
    }

    public static void q(String str, String str2, boolean z) {
        Intent intent = new Intent("check_file_update");
        intent.putExtra("location_uri", str2);
        intent.putExtra("filepath", str);
        if (z && C3180B.H()) {
            C3189g.a().g(intent);
        } else {
            C3189g.a().e(intent);
        }
    }

    private synchronized void r(c cVar) {
        s(cVar);
        cVar.f = new FileObserverC0395b(cVar.a, cVar);
        cVar.f.startWatching();
        h("observer started : " + cVar.e);
    }

    private synchronized void s(c cVar) {
        if (cVar.f != null) {
            h("stop observer : " + cVar.e);
            cVar.f.stopWatching();
            cVar.f = null;
        }
    }

    public synchronized void e(String str, String str2) {
        h("file added :" + str2);
        c cVar = new c(new File(str), str2);
        this.a.put(str2, cVar);
        r(cVar);
    }

    public d k() {
        return new a();
    }

    public synchronized void l(String str) {
        c cVar = this.a.get(str);
        if (cVar != null) {
            cVar.h = true;
        }
    }

    public synchronized void m(String str) {
        c cVar = this.a.get(str);
        if (cVar != null) {
            cVar.h = false;
        }
    }

    public synchronized void n() {
        ArrayList arrayList = new ArrayList(this.a.values());
        this.a.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g((c) obj);
        }
    }

    public synchronized void p(String str) {
        c cVar = this.a.get(str);
        if (cVar != null) {
            o(cVar);
        }
    }

    public synchronized void t(String str, long j) {
        try {
            c cVar = this.a.get(str);
            if (cVar != null) {
                cVar.b = j;
            } else {
                b.severe("Observer update failed : not found " + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
    }
}
