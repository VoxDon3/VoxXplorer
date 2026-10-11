package ax.c7;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import ax.m7.v;

/* renamed from: ax.c7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1846a {
    private final AccountManager a;

    public C1846a(AccountManager accountManager) {
        this.a = (AccountManager) v.d(accountManager);
    }

    public Account a(String str) {
        if (str == null) {
            return null;
        }
        for (Account account : b()) {
            if (str.equals(account.name)) {
                return account;
            }
        }
        return null;
    }

    public Account[] b() {
        return this.a.getAccountsByType("com.google");
    }

    public C1846a(Context context) {
        this(AccountManager.get(context));
    }
}
