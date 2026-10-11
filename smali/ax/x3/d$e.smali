.class Lax/x3/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/u/w$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/d;->e()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/x3/d;


# direct methods
.method constructor <init>(Lax/x3/d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/x3/d$e;->a:Lax/x3/d;

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
.method public a(Lax/u/w;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/x3/d$e;->a:Lax/x3/d;

    .line 2
    .line 3
    invoke-static {p1}, Lax/x3/d;->c(Lax/x3/d;)Lax/x3/d$g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_12

    .line 8
    .line 9
    iget-object p1, p0, Lax/x3/d$e;->a:Lax/x3/d;

    .line 10
    .line 11
    invoke-static {p1}, Lax/x3/d;->c(Lax/x3/d;)Lax/x3/d$g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-interface {p1, v0}, Lax/x3/d$g;->b(Z)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
.end method
