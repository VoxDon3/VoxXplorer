.class Lax/n/E$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/n/h$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/n/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lax/n/E;


# direct methods
.method constructor <init>(Lax/n/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/n/E$e;->a:Lax/n/E;

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
.method public a(I)Z
    .registers 3

    .line 1
    if-nez p1, :cond_12

    .line 2
    .line 3
    iget-object p1, p0, Lax/n/E$e;->a:Lax/n/E;

    .line 4
    .line 5
    iget-boolean v0, p1, Lax/n/E;->d:Z

    .line 6
    .line 7
    if-nez v0, :cond_12

    .line 8
    .line 9
    iget-object p1, p1, Lax/n/E;->a:Lax/u/l;

    .line 10
    .line 11
    invoke-interface {p1}, Lax/u/l;->g()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/n/E$e;->a:Lax/n/E;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p1, Lax/n/E;->d:Z

    .line 18
    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .registers 3

    .line 1
    if-nez p1, :cond_10

    .line 2
    .line 3
    new-instance p1, Landroid/view/View;

    .line 4
    .line 5
    iget-object v0, p0, Lax/n/E$e;->a:Lax/n/E;

    .line 6
    .line 7
    iget-object v0, v0, Lax/n/E;->a:Lax/u/l;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/u/l;->b()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method
