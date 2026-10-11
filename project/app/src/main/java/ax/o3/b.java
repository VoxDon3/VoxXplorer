/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.content.Intent;
import android.os.FileObserver;
import ax.u3.B;
import ax.u3.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

public class b {
    private static final Logger b = Logger.getLogger("FileManager.FileObserverManager");
    private static b c;
    private HashMap<String, c> a = new HashMap();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f(c c8, boolean bl) {
        if (c8.i == 1) {
            return;
        }
        Comparable<File> comparable = new File(c8.a);
        long l8 = ((File)comparable).lastModified();
        long l9 = ((File)comparable).length();
        if (c8.b == l8 && c8.d == l9) {
            if (!c8.c || c8.i != 0) return;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("update : file modified. ");
            ((StringBuilder)comparable).append(bl);
            ((StringBuilder)comparable).append(",");
            ((StringBuilder)comparable).append(l8);
            ((StringBuilder)comparable).append(",");
            ((StringBuilder)comparable).append(l9);
            this.h(((StringBuilder)comparable).toString());
        } else {
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("update : file date changed. ");
            ((StringBuilder)comparable).append(bl);
            ((StringBuilder)comparable).append(",");
            ((StringBuilder)comparable).append(l8);
            ((StringBuilder)comparable).append(",");
            ((StringBuilder)comparable).append(l9);
            this.h(((StringBuilder)comparable).toString());
        }
        ax.o3.b$c.l(c8, l8);
        ax.o3.b$c.n(c8, l9);
        ax.o3.b$c.p(c8, false);
        ax.o3.b.q(c8.a, c8.e, true);
    }

    private void g(c c8) {
        if (c8 != null) {
            ax.o3.b$c.c(c8, true);
            this.s(c8);
        }
    }

    private void h(String string) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - bad return control flow
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c i(File object222222) {
        synchronized (this) {
            block6: {
                int n8 = this.a.size();
                if (n8 > 0) break block6;
                return null;
            }
            try {
                String string = ((File)object222222).getAbsolutePath();
                for (Object object222222 : this.a.values()) {
                    boolean bl;
                    if (((c)object222222).a == null || !(bl = ((c)object222222).a.equals(string))) continue;
                }
            }
            catch (Throwable throwable) {}
            return object222222;
            return null;
            throw throwable;
        }
    }

    public static b j() {
        if (c == null) {
            c = new b();
        }
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o(c c8) {
        synchronized (this) {
            this.r(c8);
            return;
        }
    }

    public static void q(String string, String string2, boolean bl) {
        Intent intent = new Intent("check_file_update");
        intent.putExtra("location_uri", string2);
        intent.putExtra("filepath", string);
        if (bl && B.H()) {
            g.a().g(intent);
            return;
        }
        g.a().e(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r(c c8) {
        synchronized (this) {
            this.s(c8);
            Object object = new FileObserver(this, c8.a, c8){
                final c a;
                final b b;
                {
                    this.b = b8;
                    this.a = c8;
                    super(string);
                }

                public void onEvent(int n8, String string) {
                    if (!this.a.h && !this.a.j) {
                        if (n8 == 32) {
                            this.b.h("observer : open");
                            ax.o3.b$c.g(this.a, 0);
                            return;
                        }
                        if (n8 == 8) {
                            this.b.h("observer : close write");
                            this.b.f(this.a, false);
                            return;
                        }
                        if (n8 == 1024) {
                            this.b.h("observer : delete_self");
                            this.b.f(this.a, false);
                            this.b.o(this.a);
                            return;
                        }
                        if (n8 == 2) {
                            this.b.h("observer : modify");
                            ax.o3.b$c.p(this.a, true);
                            return;
                        }
                        if (n8 == 32768) {
                            this.b.h("observer : ignored");
                            if (this.a.g <= 0) {
                                ax.o3.b$c.h(this.a);
                                this.b.o(this.a);
                            }
                        }
                    }
                }
            };
            ax.o3.b$c.e(c8, (FileObserver)object);
            c8.f.startWatching();
            object = new StringBuilder();
            ((StringBuilder)object).append("observer started : ");
            ((StringBuilder)object).append(c8.e);
            this.h(((StringBuilder)object).toString());
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s(c c8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (c8.f == null) break block4;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("stop observer : ");
                        stringBuilder.append(c8.e);
                        this.h(stringBuilder.toString());
                        c8.f.stopWatching();
                        ax.o3.b$c.e(c8, null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(String object, String string) {
        synchronized (this) {
            Comparable<StringBuilder> comparable = new StringBuilder();
            comparable.append("file added :");
            comparable.append(string);
            this.h(comparable.toString());
            comparable = new File((String)object);
            object = new c((File)comparable, string);
            this.a.put(string, (c)object);
            this.r((c)object);
            return;
        }
    }

    public d k() {
        return new d(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(File object, IOException iOException) {
                this.a.h("file descriptor closed");
                object = this.a.i((File)object);
                if (object != null) {
                    ax.o3.b$c.j((c)object, 2);
                    this.a.f((c)object, true);
                }
            }

            @Override
            public void b(File object) {
                this.a.h("file descriptor opened");
                object = this.a.i((File)object);
                if (object != null) {
                    ax.o3.b$c.j((c)object, 1);
                }
            }
        };
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = this.a.get(object);
                        if (object == null) break block4;
                        ax.o3.b$c.s((c)object, true);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
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
    public void m(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = this.a.get(object);
                        if (object == null) break block4;
                        ax.o3.b$c.s((c)object, false);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
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
    public void n() {
        synchronized (this) {
            try {
                ArrayList<c> arrayList = new ArrayList<c>(this.a.values());
                this.a.clear();
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    c c8 = arrayList.get(i8);
                    this.g(c8);
                }
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = this.a.get(object);
                        if (object == null) break block4;
                        this.o((c)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t(String string, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    block3: {
                        try {
                            object = this.a.get(string);
                            if (object == null) break block3;
                            ax.o3.b$c.l((c)object, l8);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    Logger logger = b;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Observer update failed : not found ");
                    ((StringBuilder)object).append(string);
                    logger.severe(((StringBuilder)object).toString());
                }
                return;
            }
            throw throwable2;
        }
    }

    static class c {
        private String a;
        private long b;
        private boolean c;
        private long d;
        private String e;
        private FileObserver f;
        private int g;
        private boolean h;
        private int i;
        private boolean j;

        c(File file, String string) {
            this.a = file.getAbsolutePath();
            this.b = file.lastModified();
            this.d = file.length();
            this.c = false;
            this.e = string;
            this.h = false;
            this.i = 0;
        }

        static /* synthetic */ boolean c(c c8, boolean bl) {
            c8.j = bl;
            return bl;
        }

        static /* synthetic */ FileObserver e(c c8, FileObserver fileObserver) {
            c8.f = fileObserver;
            return fileObserver;
        }

        static /* synthetic */ int g(c c8, int n8) {
            c8.g = n8;
            return n8;
        }

        static /* synthetic */ int h(c c8) {
            int n8 = c8.g;
            c8.g = n8 + 1;
            return n8;
        }

        static /* synthetic */ int j(c c8, int n8) {
            c8.i = n8;
            return n8;
        }

        static /* synthetic */ long l(c c8, long l8) {
            c8.b = l8;
            return l8;
        }

        static /* synthetic */ long n(c c8, long l8) {
            c8.d = l8;
            return l8;
        }

        static /* synthetic */ boolean p(c c8, boolean bl) {
            c8.c = bl;
            return bl;
        }

        static /* synthetic */ boolean s(c c8, boolean bl) {
            c8.h = bl;
            return bl;
        }
    }

    public static interface d {
        public void a(File var1, IOException var2);

        public void b(File var1);
    }
}

