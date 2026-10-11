package ax.t3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import com.voxdon.xplorer.R;
import java.util.UnknownFormatConversionException;

/* loaded from: classes.dex */
public class b extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    private void a(String str) {
        ListPreference listPreference = (ListPreference) getPreferenceScreen().findPreference(str);
        try {
            listPreference.setSummary(listPreference.getEntry());
            listPreference.getSummary();
        } catch (UnknownFormatConversionException unused) {
            listPreference.setSummary("%s");
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("USER_SETTINGS");
        addPreferencesFromResource(R.xml.dev_settings);
        a("navigation_type");
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        k.a();
        if (str == null || !str.equals("navigation_type")) {
            return;
        }
        a(str);
    }
}
