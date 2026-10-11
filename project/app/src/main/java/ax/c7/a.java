/*
 * Decompiled with CFR 0.152.
 */
package ax.c7;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import ax.m7.v;

public final class a {
    private final AccountManager a;

    public a(AccountManager accountManager) {
        this.a = v.d(accountManager);
    }

    public a(Context context) {
        this(AccountManager.get((Context)context));
    }

    public Account a(String string) {
        if (string != null) {
            for (Account account : this.b()) {
                if (!string.equals(account.name)) continue;
                return account;
            }
        }
        return null;
    }

    public Account[] b() {
        return this.a.getAccountsByType("com.google");
    }
}

