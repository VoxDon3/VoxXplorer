/*
 * Decompiled with CFR 0.152.
 */
package ax.d7;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import ax.d7.b;
import ax.d7.c;
import ax.d7.d;
import ax.i7.l;
import ax.i7.m;
import ax.i7.p;
import ax.i7.r;
import ax.i7.s;
import ax.i7.x;
import ax.m7.v;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.Collection;

public class a
implements r {
    final Context a;
    final String b;
    private final ax.c7.a c;
    private String d;
    private Account e;
    private ax.m7.x f = ax.m7.x.a;

    public a(Context context, String string) {
        this.c = new ax.c7.a(context);
        this.a = context;
        this.b = string;
    }

    public static a e(Context context, Collection<String> collection) {
        boolean bl = collection != null && collection.iterator().hasNext();
        v.a(bl);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("oauth2: ");
        stringBuilder.append(ax.m7.m.b(' ').a(collection));
        return new a(context, stringBuilder.toString());
    }

    public String a() throws IOException, ax.D5.a {
        while (true) {
            try {
                String string = ax.D5.b.d(this.a, this.d, this.b);
                return string;
            }
            catch (IOException iOException) {
                try {
                    throw iOException;
                }
                catch (InterruptedException interruptedException) {
                    continue;
                }
            }
            break;
        }
    }

    @Override
    public void b(p p8) {
        a a8 = new a(this);
        p8.w(a8);
        p8.D(a8);
    }

    public final Intent c() {
        return ax.J5.a.a(this.e, null, new String[]{"com.google"}, true, null, null, null, null);
    }

    public final a d(String string) {
        Account account;
        this.e = account = this.c.a(string);
        if (account == null) {
            string = null;
        }
        this.d = string;
        return this;
    }

    class a
    implements l,
    x {
        boolean a;
        String b;
        final a c;

        a(a a8) {
            this.c = a8;
        }

        @Override
        public void a(p object) throws IOException {
            ax.D5.c c82;
            block5: {
                UserRecoverableAuthException userRecoverableAuthException2;
                block4: {
                    try {
                        this.b = this.c.a();
                        m m8 = ((p)object).f();
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Bearer ");
                        ((StringBuilder)object).append(this.b);
                        m8.D(((StringBuilder)object).toString());
                        return;
                    }
                    catch (ax.D5.a a8) {
                    }
                    catch (UserRecoverableAuthException userRecoverableAuthException2) {
                        break block4;
                    }
                    catch (ax.D5.c c82) {
                        break block5;
                    }
                    throw new b(a8);
                }
                throw new d(userRecoverableAuthException2);
            }
            throw new c(c82);
        }

        @Override
        public boolean b(p p8, s s8, boolean bl) throws IOException {
            ax.D5.a a82;
            block3: {
                try {
                    if (s8.h() == 401 && !this.a) {
                        this.a = true;
                        ax.D5.b.a(this.c.a, this.b);
                        return true;
                    }
                }
                catch (ax.D5.a a82) {
                    break block3;
                }
                return false;
            }
            throw new b(a82);
        }
    }
}

