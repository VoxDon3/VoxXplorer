.class Lax/W2/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/g3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/j;


# direct methods
.method constructor <init>(Lax/W2/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/j$b;->a:Lax/W2/j;

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
.method public a(JJ)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/W2/j$b;->a:Lax/W2/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    long-to-int v1, p1

    .line 8
    long-to-int v2, p3

    .line 9
    invoke-virtual {v0, v1, v2}, Lax/W2/v;->Y(II)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    cmp-long v2, p1, v0

    .line 15
    .line 16
    if-eqz v2, :cond_1d

    .line 17
    .line 18
    cmp-long v0, p1, p3

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_1d

    .line 23
    :cond_16
    iget-object p1, p0, Lax/W2/j$b;->a:Lax/W2/j;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-virtual {p1, p2}, Lax/W2/j;->l0(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    :goto_1d
    iget-object p1, p0, Lax/W2/j$b;->a:Lax/W2/j;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p1, p2}, Lax/W2/j;->l0(Z)V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
