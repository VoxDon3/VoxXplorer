/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import ax.M5.p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

public final class a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent a(Account account, ArrayList<Account> arrayList, String[] stringArray, boolean bl, String string, String string2, String[] stringArray2, Bundle bundle) {
        Intent intent = new Intent();
        p.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", stringArray);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", (Parcelable)account);
        intent.putExtra("alwaysPromptForAccount", bl);
        intent.putExtra("descriptionTextOverride", string);
        intent.putExtra("authTokenType", string2);
        intent.putExtra("addAccountRequiredFeatures", stringArray2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", null);
        return intent;
    }
}

