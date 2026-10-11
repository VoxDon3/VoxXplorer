/*
 * Decompiled with CFR 0.152.
 */
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
import java.util.List;
import java.util.Map;

public class a
extends Fragment {
    private ListView a;

    public static a a(Context context) {
        return new a();
    }

    public ArrayList<BoxAuthentication.BoxAuthenticationInfo> b() {
        if (this.getArguments() != null && this.getArguments().getCharSequenceArrayList("boxAuthenticationInfos") != null) {
            ArrayList arrayList = this.getArguments().getCharSequenceArrayList("boxAuthenticationInfos");
            ArrayList<BoxAuthentication.BoxAuthenticationInfo> arrayList2 = new ArrayList<BoxAuthentication.BoxAuthenticationInfo>(arrayList.size());
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = arrayList.get(i8);
                object = (CharSequence)object;
                BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthentication.BoxAuthenticationInfo();
                boxAuthenticationInfo.k(object.toString());
                arrayList2.add(boxAuthenticationInfo);
            }
            return arrayList2;
        }
        Map<String, BoxAuthentication.BoxAuthenticationInfo> map = BoxAuthentication.o().r((Context)this.getActivity());
        if (map != null) {
            ArrayList<BoxAuthentication.BoxAuthenticationInfo> arrayList = new ArrayList<BoxAuthentication.BoxAuthenticationInfo>(map.size());
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                arrayList.add(map.get(iterator.next()));
            }
            return arrayList;
        }
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        object = this.b();
        bundle = layoutInflater.inflate(c.e, null);
        layoutInflater = (ListView)bundle.findViewById(ax.I3.b.f);
        this.a = layoutInflater;
        if (object == null) {
            this.getActivity().getFragmentManager().beginTransaction().remove((Fragment)this).commit();
            return bundle;
        }
        layoutInflater.setAdapter((ListAdapter)new AuthenticatedAccountsAdapter((Context)this.getActivity(), c.f, (List<BoxAuthentication.BoxAuthenticationInfo>)object));
        this.a.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final a a;
            {
                this.a = a8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                if (object.getAdapter() instanceof AuthenticatedAccountsAdapter) {
                    if ((object = ((AuthenticatedAccountsAdapter)object.getAdapter()).a(n8)) instanceof AuthenticatedAccountsAdapter.DifferentAuthenticationInfo) {
                        if (this.a.getActivity() instanceof b) {
                            ((b)this.a.getActivity()).f();
                            return;
                        }
                    } else if (this.a.getActivity() instanceof b) {
                        ((b)this.a.getActivity()).b((BoxAuthentication.BoxAuthenticationInfo)object);
                    }
                }
            }
        });
        return bundle;
    }

    public static interface b {
        public void b(BoxAuthentication.BoxAuthenticationInfo var1);

        public void f();
    }
}

