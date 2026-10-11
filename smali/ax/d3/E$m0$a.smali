.class Lax/d3/E$m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/E$m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/d3/E$m0;


# direct methods
.method constructor <init>(Lax/d3/E$m0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$m0$a;->q:Lax/d3/E$m0;

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
.method public run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/E$m0$a;->q:Lax/d3/E$m0;

    .line 2
    .line 3
    iget v1, v0, Lax/d3/E$m0;->b:I

    .line 4
    .line 5
    if-nez v1, :cond_c

    .line 6
    .line 7
    iget-object v0, v0, Lax/d3/E$m0;->a:Landroid/widget/AbsListView;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setFastScrollEnabled(Z)V

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
