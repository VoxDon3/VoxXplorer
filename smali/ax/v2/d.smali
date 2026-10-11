.class public final synthetic Lax/v2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Y/d$a;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lax/v2/k;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lax/v2/k;Ljava/lang/Runnable;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/v2/d;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lax/v2/d;->b:Lax/v2/k;

    iput-object p3, p0, Lax/v2/d;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/v2/d;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lax/v2/d;->b:Lax/v2/k;

    iget-object v2, p0, Lax/v2/d;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Lax/v2/e;->v(Ljava/lang/Runnable;Lax/v2/k;Ljava/lang/Runnable;)V

    return-void
.end method
