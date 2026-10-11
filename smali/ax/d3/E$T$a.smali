.class Lax/d3/E$T$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E$T;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/E$T;


# direct methods
.method constructor <init>(Lax/d3/E$T;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$T$a;->c:Lax/d3/E$T;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/d3/E$T$a;->c:Lax/d3/E$T;

    .line 2
    .line 3
    iget-object p1, p1, Lax/d3/E$T;->d:Lax/d3/E;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_15

    .line 10
    .line 11
    iget-object p1, p0, Lax/d3/E$T$a;->c:Lax/d3/E$T;

    .line 12
    .line 13
    iget-object p1, p1, Lax/d3/E$T;->d:Lax/d3/E;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lax/u3/B;->Y(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method
