/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import ax.t3.k;
import java.util.UnknownFormatConversionException;

public class b
extends PreferenceFragment
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private void a(String string) {
        ListPreference listPreference = (ListPreference)this.getPreferenceScreen().findPreference((CharSequence)string);
        try {
            listPreference.setSummary(listPreference.getEntry());
            listPreference.getSummary();
            return;
        }
        catch (UnknownFormatConversionException unknownFormatConversionException) {
            listPreference.setSummary((CharSequence)"%s");
            return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.getPreferenceManager().setSharedPreferencesName("USER_SETTINGS");
        this.addPreferencesFromResource(2132148228);
        this.a("navigation_type");
    }

    public void onPause() {
        super.onPause();
        this.getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    public void onResume() {
        super.onResume();
        this.getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        k.a();
        if (string != null && string.equals("navigation_type")) {
            this.a(string);
        }
    }
}

