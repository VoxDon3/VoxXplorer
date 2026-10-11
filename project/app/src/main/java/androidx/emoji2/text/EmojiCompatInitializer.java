/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.emoji2.text.h;
import androidx.emoji2.text.k;
import androidx.emoji2.text.n;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.d;
import ax.Y.u;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer
implements ax.r2.a<Boolean> {
    @Override
    public List<Class<? extends ax.r2.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public Boolean c(Context context) {
        e.h(new a(context));
        this.d(context);
        return Boolean.TRUE;
    }

    void d(Context object) {
        object = ((ax.G0.h)androidx.startup.a.e((Context)object).f(ProcessLifecycleInitializer.class)).getLifecycle();
        ((d)object).a(new ax.G0.c(){
            final EmojiCompatInitializer c0;
            final d q;
            {
                this.c0 = emojiCompatInitializer;
                this.q = d8;
            }

            @Override
            public /* synthetic */ void a(ax.G0.h h8) {
                ax.G0.b.e(this, h8);
            }

            @Override
            public /* synthetic */ void c(ax.G0.h h8) {
                ax.G0.b.a(this, h8);
            }

            @Override
            public void d(ax.G0.h h8) {
                this.c0.e();
                this.q.c(this);
            }

            @Override
            public /* synthetic */ void e(ax.G0.h h8) {
                ax.G0.b.c(this, h8);
            }

            @Override
            public /* synthetic */ void f(ax.G0.h h8) {
                ax.G0.b.b(this, h8);
            }

            @Override
            public /* synthetic */ void g(ax.G0.h h8) {
                ax.G0.b.d(this, h8);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed((Runnable)new c(), 500L);
    }

    static class a
    extends e.b {
        protected a(Context context) {
            super(new b(context));
            this.b(1);
        }
    }

    static class b
    implements e.g {
        private final Context a;

        b(Context context) {
            this.a = context.getApplicationContext();
        }

        public static /* synthetic */ void b(b b8, e.h h8, ThreadPoolExecutor threadPoolExecutor) {
            b8.c(h8, threadPoolExecutor);
        }

        @Override
        public void a(e.h h8) {
            ThreadPoolExecutor threadPoolExecutor = androidx.emoji2.text.b.c("EmojiCompatInitializer");
            threadPoolExecutor.execute(new h(this, h8, threadPoolExecutor));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void c(e.h h8, ThreadPoolExecutor threadPoolExecutor) {
            Throwable throwable2;
            block3: {
                Object object;
                try {
                    object = androidx.emoji2.text.c.a(this.a);
                    if (object != null) {
                        ((k)object).c(threadPoolExecutor);
                        object = ((e.b)object).a();
                        e.h h9 = new e.h(this, h8, threadPoolExecutor){
                            final e.h a;
                            final ThreadPoolExecutor b;
                            final b c;
                            {
                                this.c = b8;
                                this.a = h8;
                                this.b = threadPoolExecutor;
                            }

                            @Override
                            public void a(Throwable throwable) {
                                try {
                                    this.a.a(throwable);
                                    return;
                                }
                                finally {
                                    this.b.shutdown();
                                }
                            }

                            @Override
                            public void b(n n8) {
                                try {
                                    this.a.b(n8);
                                    return;
                                }
                                finally {
                                    this.b.shutdown();
                                }
                            }
                        };
                        object.a(h9);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                object = new RuntimeException("EmojiCompat font provider not available on this device.");
                throw object;
            }
            h8.a(throwable2);
            threadPoolExecutor.shutdown();
        }
    }

    static class c
    implements Runnable {
        c() {
        }

        @Override
        public void run() {
            Throwable throwable2;
            block3: {
                block2: {
                    try {
                        u.a("EmojiCompat.EmojiCompatInitializer.run");
                        if (!e.i()) break block2;
                        e.c().l();
                    }
                    catch (Throwable throwable2) {
                        break block3;
                    }
                }
                u.b();
                return;
            }
            u.b();
            throw throwable2;
        }
    }
}

