.class Lax/d3/j0$c;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/j0;->a6()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/d3/j0;


# direct methods
.method constructor <init>(Lax/d3/j0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/j0$c;->c:Lax/d3/j0;

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
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/j0$c;->c:Lax/d3/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lax/d3/j0;->W0:Lax/x3/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/x3/d;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object v0, p0, Lax/d3/j0$c;->c:Lax/d3/j0;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, p1, v1, v1}, Lax/d3/j0;->Z4(Lax/d3/j0;IZZ)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
