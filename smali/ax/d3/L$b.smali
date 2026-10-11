.class Lax/d3/L$b;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/L;->wa(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Lax/d3/L;


# direct methods
.method constructor <init>(Lax/d3/L;Z)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/L$b;->d:Lax/d3/L;

    .line 2
    .line 3
    iput-boolean p2, p0, Lax/d3/L$b;->c:Z

    .line 4
    .line 5
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-boolean p1, p0, Lax/d3/L$b;->c:Z

    .line 2
    .line 3
    if-nez p1, :cond_c

    .line 4
    .line 5
    iget-object p1, p0, Lax/d3/L$b;->d:Lax/d3/L;

    .line 6
    .line 7
    const/16 v0, 0x16

    .line 8
    .line 9
    invoke-static {p1, v0}, Lax/u3/o;->o(Landroidx/fragment/app/Fragment;I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object p1, p0, Lax/d3/L$b;->d:Lax/d3/L;

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    invoke-static {p1, v0}, Lax/u3/o;->m(Landroidx/fragment/app/Fragment;I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method
