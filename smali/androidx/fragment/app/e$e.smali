.class Landroidx/fragment/app/e$e;
.super Lax/A0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/e;->b0()Lax/A0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/A0/e;

.field final synthetic b:Landroidx/fragment/app/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/e;Lax/A0/e;)V
    .registers 3

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/e$e;->b:Landroidx/fragment/app/e;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/e$e;->a:Lax/A0/e;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/A0/e;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public c(I)Landroid/view/View;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e$e;->a:Lax/A0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/A0/e;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/e$e;->a:Lax/A0/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/A0/e;->c(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_f
    iget-object v0, p0, Landroidx/fragment/app/e$e;->b:Landroidx/fragment/app/e;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/fragment/app/e;->U2(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public d()Z
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e$e;->a:Lax/A0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/A0/e;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/e$e;->b:Landroidx/fragment/app/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/e;->V2()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    return v0
.end method
