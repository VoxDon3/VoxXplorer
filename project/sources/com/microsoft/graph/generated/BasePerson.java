package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Location;
import com.microsoft.graph.extensions.PersonType;
import java.util.List;

/* loaded from: classes3.dex */
public class BasePerson extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("givenName")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("surname")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("birthday")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("personNotes")
    public String j;

    @InterfaceC3059a
    @InterfaceC3061c("isFavorite")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("scoredEmailAddresses")
    public List<Object> l;

    @InterfaceC3059a
    @InterfaceC3061c("phones")
    public List<Object> m;

    @InterfaceC3059a
    @InterfaceC3061c("postalAddresses")
    public List<Location> n;

    @InterfaceC3059a
    @InterfaceC3061c("websites")
    public List<Object> o;

    @InterfaceC3059a
    @InterfaceC3061c("jobTitle")
    public String p;

    @InterfaceC3059a
    @InterfaceC3061c("companyName")
    public String q;

    @InterfaceC3059a
    @InterfaceC3061c("yomiCompany")
    public String r;

    @InterfaceC3059a
    @InterfaceC3061c("department")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("officeLocation")
    public String t;

    @InterfaceC3059a
    @InterfaceC3061c("profession")
    public String u;

    @InterfaceC3059a
    @InterfaceC3061c("personType")
    public PersonType v;

    @InterfaceC3059a
    @InterfaceC3061c("userPrincipalName")
    public String w;

    @InterfaceC3059a
    @InterfaceC3061c("imAddress")
    public String x;
    private transient C3003l y;
    private transient e z;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.z = eVar;
        this.y = c3003l;
    }
}
