.class Lax/u/t$f;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/u/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lax/u/t;


# direct methods
.method constructor <init>(Lax/u/t;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/u/t$f;->a:Lax/u/t;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

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
.method public onChanged()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u/t$f;->a:Lax/u/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/u/t;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lax/u/t$f;->a:Lax/u/t;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/u/t;->c()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onInvalidated()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u/t$f;->a:Lax/u/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/u/t;->dismiss()V

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
.end method
