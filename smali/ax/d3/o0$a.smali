.class Lax/d3/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/preference/Preference$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/o0;->T2(Landroid/os/Bundle;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/o0;


# direct methods
.method constructor <init>(Lax/d3/o0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/o0$a;->a:Lax/d3/o0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public a(Landroidx/preference/Preference;)Z
    .registers 5

    .line 1
    iget-object p1, p0, Lax/d3/o0$a;->a:Lax/d3/o0;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/X;->i3(Landroidx/fragment/app/Fragment;)Lax/a3/X;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lax/d3/o0$a;->a:Lax/d3/o0;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->A0()Landroidx/fragment/app/FragmentManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "subtitle"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-static {v0, p1, v1, v2}, Lax/u3/B;->d0(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/e;Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    return v2
    .line 20
    .line 21
    .line 22
.end method
