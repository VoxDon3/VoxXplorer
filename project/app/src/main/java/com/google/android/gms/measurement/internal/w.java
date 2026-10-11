/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import ax.Q.b;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f3;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class w
extends e3 {
    private long c;
    private String d;
    private AccountManager e;
    private Boolean f;
    private long g;

    w(E2 e22) {
        super(e22);
    }

    @Override
    protected final boolean t() {
        Object object = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(((Calendar)object).get(15) + ((Calendar)object).get(16), TimeUnit.MILLISECONDS);
        Serializable serializable = Locale.getDefault();
        object = ((Locale)serializable).getLanguage();
        Object object2 = Locale.ENGLISH;
        object = ((String)object).toLowerCase((Locale)object2);
        object2 = ((Locale)serializable).getCountry().toLowerCase((Locale)object2);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append("-");
        ((StringBuilder)serializable).append((String)object2);
        this.d = ((StringBuilder)serializable).toString();
        return false;
    }

    final long u() {
        ((f3)this).n();
        return this.g;
    }

    public final long v() {
        this.p();
        return this.c;
    }

    public final String w() {
        this.p();
        return this.d;
    }

    final void x() {
        ((f3)this).n();
        this.f = null;
        this.g = 0L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean y() {
        long l8;
        block11: {
            Object var3_6;
            block10: {
                Account[] accountArray;
                ((f3)this).n();
                l8 = ((f3)this).b().a();
                if (l8 - this.g > 86400000L) {
                    this.f = null;
                }
                if ((accountArray = this.f) != null) {
                    return accountArray.booleanValue();
                }
                if (b.a(((f3)this).a(), "android.permission.GET_ACCOUNTS") != 0) {
                    ((f3)this).k().N().a("Permission error checking for dasher/unicorn accounts");
                    this.g = l8;
                    this.f = Boolean.FALSE;
                    return false;
                }
                if (this.e == null) {
                    this.e = AccountManager.get((Context)((f3)this).a());
                }
                try {
                    accountArray = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (accountArray != null && accountArray.length > 0) {
                        this.f = Boolean.TRUE;
                        this.g = l8;
                        return true;
                    }
                }
                catch (OperationCanceledException operationCanceledException) {
                    break block10;
                }
                catch (IOException iOException) {
                    break block10;
                }
                catch (AuthenticatorException authenticatorException) {
                    break block10;
                }
                accountArray = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (accountArray != null && accountArray.length > 0) {
                    this.f = Boolean.TRUE;
                    this.g = l8;
                    return true;
                }
                break block11;
            }
            ((f3)this).k().I().b("Exception checking account types", var3_6);
        }
        this.g = l8;
        this.f = Boolean.FALSE;
        return false;
    }
}

