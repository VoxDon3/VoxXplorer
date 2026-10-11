package ax.d7;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import ax.J5.C0740a;
import ax.c7.C1846a;
import ax.i7.l;
import ax.i7.p;
import ax.i7.r;
import ax.i7.s;
import ax.m7.m;
import ax.m7.v;
import ax.m7.x;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.Collection;

/* renamed from: ax.d7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1943a implements r {
    final Context a;
    final String b;
    private final C1846a c;
    private String d;
    private Account e;
    private x f = x.a;

    /* renamed from: ax.d7.a$a, reason: collision with other inner class name */
    class C0287a implements l, ax.i7.x {
        boolean a;
        String b;

        C0287a() {
        }

        @Override // ax.i7.l
        public void a(p pVar) throws IOException {
            try {
                this.b = C1943a.this.a();
                pVar.f().D("Bearer " + this.b);
            } catch (ax.D5.c e) {
                throw new C1945c(e);
            } catch (UserRecoverableAuthException e2) {
                throw new C1946d(e2);
            } catch (ax.D5.a e3) {
                throw new C1944b(e3);
            }
        }

        @Override // ax.i7.x
        public boolean b(p pVar, s sVar, boolean z) throws IOException {
            try {
                if (sVar.h() != 401 || this.a) {
                    return false;
                }
                this.a = true;
                ax.D5.b.a(C1943a.this.a, this.b);
                return true;
            } catch (ax.D5.a e) {
                throw new C1944b(e);
            }
        }
    }

    public C1943a(Context context, String str) {
        this.c = new C1846a(context);
        this.a = context;
        this.b = str;
    }

    public static C1943a e(Context context, Collection<String> collection) {
        v.a(collection != null && collection.iterator().hasNext());
        return new C1943a(context, "oauth2: " + m.b(' ').a(collection));
    }

    public String a() throws IOException, ax.D5.a {
        while (true) {
            try {
                return ax.D5.b.d(this.a, this.d, this.b);
            } catch (IOException e) {
                try {
                    throw e;
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // ax.i7.r
    public void b(p pVar) {
        C0287a c0287a = new C0287a();
        pVar.w(c0287a);
        pVar.D(c0287a);
    }

    public final Intent c() {
        return C0740a.a(this.e, null, new String[]{"com.google"}, true, null, null, null, null);
    }

    public final C1943a d(String str) {
        Account a = this.c.a(str);
        this.e = a;
        if (a == null) {
            str = null;
        }
        this.d = str;
        return this;
    }
}
