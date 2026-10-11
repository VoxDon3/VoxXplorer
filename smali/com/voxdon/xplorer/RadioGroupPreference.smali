.class public Lcom/voxdon/xplorer/RadioGroupPreference;
.super Landroidx/preference/Preference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/RadioGroupPreference$a;
    }
.end annotation


# instance fields
.field private R0:Landroid/widget/RadioGroup;

.field private S0:Lcom/voxdon/xplorer/RadioGroupPreference$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public T0()Landroid/widget/RadioGroup;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/RadioGroupPreference;->R0:Landroid/widget/RadioGroup;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public U0(Lcom/voxdon/xplorer/RadioGroupPreference$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/RadioGroupPreference;->S0:Lcom/voxdon/xplorer/RadioGroupPreference$a;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public c0(Landroidx/preference/h;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->c0(Landroidx/preference/h;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0a03a5

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/preference/h;->N(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/RadioGroup;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/RadioGroupPreference;->R0:Landroid/widget/RadioGroup;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/RadioGroupPreference;->S0:Lcom/voxdon/xplorer/RadioGroupPreference$a;

    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/RadioGroupPreference$a;->a(Landroidx/preference/h;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method
