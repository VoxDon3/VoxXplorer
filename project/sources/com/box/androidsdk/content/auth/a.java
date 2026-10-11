package com.box.androidsdk.content.auth;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import ax.I3.c;
import com.box.androidsdk.content.auth.AuthenticatedAccountsAdapter;
import com.box.androidsdk.content.auth.BoxAuthentication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends Fragment {
    private ListView a;

    /* renamed from: com.box.androidsdk.content.auth.a$a, reason: collision with other inner class name */
    class C0543a implements AdapterView.OnItemClickListener {
        C0543a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (adapterView.getAdapter() instanceof AuthenticatedAccountsAdapter) {
                BoxAuthentication.BoxAuthenticationInfo item = ((AuthenticatedAccountsAdapter) adapterView.getAdapter()).getItem(i);
                if (item instanceof AuthenticatedAccountsAdapter.DifferentAuthenticationInfo) {
                    if (a.this.getActivity() instanceof b) {
                        ((b) a.this.getActivity()).f();
                    }
                } else if (a.this.getActivity() instanceof b) {
                    ((b) a.this.getActivity()).b(item);
                }
            }
        }
    }

    public interface b {
        void b(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo);

        void f();
    }

    public static a a(Context context) {
        return new a();
    }

    public ArrayList<BoxAuthentication.BoxAuthenticationInfo> b() {
        if (getArguments() == null || getArguments().getCharSequenceArrayList("boxAuthenticationInfos") == null) {
            Map<String, BoxAuthentication.BoxAuthenticationInfo> r = BoxAuthentication.o().r(getActivity());
            if (r == null) {
                return null;
            }
            ArrayList<BoxAuthentication.BoxAuthenticationInfo> arrayList = new ArrayList<>(r.size());
            Iterator<String> it = r.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(r.get(it.next()));
            }
            return arrayList;
        }
        ArrayList<CharSequence> charSequenceArrayList = getArguments().getCharSequenceArrayList("boxAuthenticationInfos");
        ArrayList<BoxAuthentication.BoxAuthenticationInfo> arrayList2 = new ArrayList<>(charSequenceArrayList.size());
        int size = charSequenceArrayList.size();
        int i = 0;
        while (i < size) {
            CharSequence charSequence = charSequenceArrayList.get(i);
            i++;
            BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthentication.BoxAuthenticationInfo();
            boxAuthenticationInfo.k(charSequence.toString());
            arrayList2.add(boxAuthenticationInfo);
        }
        return arrayList2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<BoxAuthentication.BoxAuthenticationInfo> b2 = b();
        View inflate = layoutInflater.inflate(c.e, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(ax.I3.b.f);
        this.a = listView;
        if (b2 == null) {
            getActivity().getFragmentManager().beginTransaction().remove(this).commit();
            return inflate;
        }
        listView.setAdapter((ListAdapter) new AuthenticatedAccountsAdapter(getActivity(), c.f, b2));
        this.a.setOnItemClickListener(new C0543a());
        return inflate;
    }
}
