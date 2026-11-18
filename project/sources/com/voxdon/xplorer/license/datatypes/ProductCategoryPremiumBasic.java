package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
class ProductCategoryPremiumBasic implements Serializable {
    String onetime;
    String onetime_dc;
    String yearly;
    String yearly_dc;

    ProductCategoryPremiumBasic() {
    }

    public String toString() {
        return String.format("ProductCategoryPremiumBasic(yearly=%s yearly_dc=%s onetime=%s onetime_dc=%s)", this.yearly, this.yearly_dc, this.onetime, this.onetime_dc);
    }
}
