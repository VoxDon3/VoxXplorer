package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import ax.Y.u;
import ax.r2.InterfaceC2941a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC2941a<Boolean> {

    static class a extends e.b {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements e.g {
        private final Context a;

        class a extends e.h {
            final /* synthetic */ e.h a;
            final /* synthetic */ ThreadPoolExecutor b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = hVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(n nVar) {
                try {
                    this.a.b(nVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor c = androidx.emoji2.text.b.c("EmojiCompatInitializer");
            c.execute(new Runnable() { // from class: androidx.emoji2.text.h
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.c(hVar, c);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a2 = androidx.emoji2.text.c.a(this.a);
                if (a2 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a2.c(threadPoolExecutor);
                a2.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                u.b();
            }
        }
    }

    @Override // ax.r2.InterfaceC2941a
    public List<Class<? extends InterfaceC2941a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // ax.r2.InterfaceC2941a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.h(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.d lifecycle = ((ax.G0.h) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new ax.G0.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // ax.G0.c
            public /* synthetic */ void a(ax.G0.h hVar) {
                ax.G0.b.e(this, hVar);
            }

            @Override // ax.G0.c
            public /* synthetic */ void c(ax.G0.h hVar) {
                ax.G0.b.a(this, hVar);
            }

            @Override // ax.G0.c
            public void d(ax.G0.h hVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }

            @Override // ax.G0.c
            public /* synthetic */ void e(ax.G0.h hVar) {
                ax.G0.b.c(this, hVar);
            }

            @Override // ax.G0.c
            public /* synthetic */ void f(ax.G0.h hVar) {
                ax.G0.b.b(this, hVar);
            }

            @Override // ax.G0.c
            public /* synthetic */ void g(ax.G0.h hVar) {
                ax.G0.b.d(this, hVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
