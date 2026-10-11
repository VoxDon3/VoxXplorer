.class final Landroidx/activity/OnBackPressedDispatcher$a;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;Lax/b0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/l<",
        "Lax/i/b;",
        "Lax/sb/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic q:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method constructor <init>(Landroidx/activity/OnBackPressedDispatcher;)V
    .registers 2

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$a;->q:Landroidx/activity/OnBackPressedDispatcher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lax/Gb/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lax/i/b;)V
    .registers 3

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$a;->q:Landroidx/activity/OnBackPressedDispatcher;

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroidx/activity/OnBackPressedDispatcher;->e(Landroidx/activity/OnBackPressedDispatcher;Lax/i/b;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Lax/i/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher$a;->a(Lax/i/b;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 7
    .line 8
    return-object p1
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
