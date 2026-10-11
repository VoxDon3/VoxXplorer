package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import androidx.emoji2.text.k;
import ax.Y.u;
import ax.Z.k;
import ax.b0.C1446g;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class k extends e.b {
    private static final a k = new a();

    public static class a {
        public Typeface a(Context context, k.b bVar) throws PackageManager.NameNotFoundException {
            return ax.Z.k.a(context, null, new k.b[]{bVar});
        }

        public k.a b(Context context, ax.Z.i iVar) throws PackageManager.NameNotFoundException {
            return ax.Z.k.b(context, null, iVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.g {
        private final Context a;
        private final ax.Z.i b;
        private final a c;
        private final Object d = new Object();
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        e.h h;
        private ContentObserver i;
        private Runnable j;

        b(Context context, ax.Z.i iVar, a aVar) {
            C1446g.h(context, "Context cannot be null");
            C1446g.h(iVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = iVar;
            this.c = aVar;
        }

        private void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private k.b e() {
            try {
                k.a b = this.c.b(this.a, this.b);
                if (b.c() == 0) {
                    k.b[] b2 = b.b();
                    if (b2 == null || b2.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            C1446g.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        k.b e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                        }
                        try {
                            u.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a = this.c.a(this.a, e);
                            ByteBuffer f = ax.T.m.f(this.a, null, e.d());
                            if (f == null || a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n b2 = n.b(a, f);
                            u.b();
                            synchronized (this.d) {
                                try {
                                    e.h hVar = this.h;
                                    if (hVar != null) {
                                        hVar.b(b2);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            u.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                e.h hVar2 = this.h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor c = androidx.emoji2.text.b.c("emojiCompat");
                        this.g = c;
                        this.f = c;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public k(Context context, ax.Z.i iVar) {
        super(new b(context, iVar, k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
