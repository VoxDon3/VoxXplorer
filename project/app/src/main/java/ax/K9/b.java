/*
 * Decompiled with CFR 0.152.
 */
package ax.K9;

import android.app.Activity;
import android.content.Context;
import ax.K9.a;
import ax.K9.c;
import ax.M9.d;
import ax.P9.o;
import ax.U9.e;
import ax.U9.f;
import ax.U9.g;
import ax.U9.h;
import ax.U9.j;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b
implements a {
    private ax.Q9.b a = new ax.Q9.a();
    private final e b;

    public b(Context context) {
        this.b = new e(context.getApplicationContext(), this.e(), Arrays.asList(this.g()), c.e());
    }

    private boolean h() {
        return this.b.g() != null && this.b.g().b() != null;
    }

    private Void k() throws d {
        ax.L9.f f8 = new ax.L9.f();
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.j(new ax.L9.c<Void>(){
            final AtomicReference a;
            final ax.L9.f b;
            final AtomicReference c;
            final b d;
            {
                this.d = b8;
                this.a = atomicReference;
                this.b = f8;
                this.c = atomicReference2;
            }

            @Override
            public void b(d d8) {
                this.c.set(d8);
                this.b.a();
            }

            public void d(Void void_) {
                this.a.set(void_);
                this.b.a();
            }
        });
        f8.b();
        if (atomicReference2.get() == null) {
            return (Void)atomicReference.get();
        }
        throw (d)atomicReference2.get();
    }

    @Override
    public void a(o o8) {
        Object object = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Authenticating request, ");
        stringBuilder.append(o8.d());
        object.a(stringBuilder.toString());
        object = o8.a().iterator();
        while (object.hasNext()) {
            if (!((ax.S9.b)object.next()).a().equals("Authorization")) continue;
            this.a.a("Found an existing authorization header!");
            return;
        }
        try {
            object = this.d();
            stringBuilder = new StringBuilder();
            stringBuilder.append("bearer ");
            stringBuilder.append((String)object);
            o8.k("Authorization", stringBuilder.toString());
            return;
        }
        catch (d d8) {
            d d9 = new d("Unable to authenticate request, No active account found", d8, ax.M9.e.g0);
            this.a.b("Unable to authenticate request, No active account found", d9);
            throw d9;
        }
    }

    public String d() throws d {
        if (this.h()) {
            this.a.a("Found account information");
            if (this.b.g().d()) {
                this.a.a("Account access token is expired, refreshing");
                this.k();
            }
            return this.b.g().b();
        }
        d d8 = new d("Unable to get access token, No active account found", null, ax.M9.e.g0);
        this.a.b("Unable to get access token, No active account found", d8);
        throw d8;
    }

    public abstract String e();

    public String f() throws d {
        if (this.h()) {
            this.a.a("Found account information");
            if (this.b.g().d()) {
                this.a.a("Account access token is expired, refreshing");
                this.k();
            }
            return this.b.g().c();
        }
        d d8 = new d("Unable to get access token, No active account found", null, ax.M9.e.g0);
        this.a.b("Unable to get access token, No active account found", d8);
        throw d8;
    }

    public abstract String[] g();

    public void i(Activity activity, String string, ax.L9.c<Void> c8) {
        this.a.a("Login started");
        if (c8 != null) {
            if (this.h()) {
                this.a.a("Already logged in");
                c8.c(null);
                return;
            }
            activity.runOnUiThread(new Runnable(){
                final String c0;
                final g d0;
                final b e0;
                final Activity q;
                {
                    this.e0 = b8;
                    this.q = activity;
                    this.c0 = string;
                    this.d0 = g8;
                }

                @Override
                public void run() {
                    this.e0.b.i(this.q, null, null, this.c0, this.d0);
                }
            });
            return;
        }
        throw new IllegalArgumentException("callback");
    }

    public void j(ax.L9.c<Void> object) {
        this.a.a("Login silent started");
        if (object != null) {
            object = new g(){
                final ax.L9.c a;
                final b b;
                {
                    this.b = b8;
                    this.a = c8;
                }

                @Override
                public void a(j object, h h8, Object object2) {
                    ax.Q9.b b8 = this.b.a;
                    boolean bl = h8 != null;
                    b8.a(String.format("LiveStatus: %s, LiveConnectSession good?: %s, UserState %s", object, bl, object2));
                    if (object == j.c0) {
                        this.b.a.a("Login completed");
                        this.a.c(null);
                        return;
                    }
                    object = new d("Unable to login silently", null, ax.M9.e.g0);
                    this.b.a.b(((Throwable)object).getMessage(), (Throwable)object);
                    this.a.b((d)object);
                }

                @Override
                public void b(f runtimeException, Object object) {
                    runtimeException = new d("Unable to login silently", null, ax.M9.e.g0);
                    this.b.a.b(runtimeException.getMessage(), runtimeException);
                    this.a.b((d)runtimeException);
                }
            };
            this.b.j((g)object);
            return;
        }
        throw new IllegalArgumentException("callback");
    }

    public void l(ax.L9.c<Void> c8) {
        this.a.a("Logout started");
        if (c8 != null) {
            this.b.l(new g(){
                final ax.L9.c a;
                final b b;
                {
                    this.b = b8;
                    this.a = c8;
                }

                @Override
                public void a(j j8, h h8, Object object) {
                    this.b.a.a("Logout complete");
                    this.a.c(null);
                }

                @Override
                public void b(f runtimeException, Object object) {
                    runtimeException = new d("Logout failure", runtimeException, ax.M9.e.g0);
                    this.b.a.b(runtimeException.getMessage(), runtimeException);
                    this.a.b((d)runtimeException);
                }
            });
            return;
        }
        throw new IllegalArgumentException("callback");
    }
}

