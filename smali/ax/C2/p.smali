.class public final synthetic Lax/C2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lax/C2/r;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lax/C2/r;Ljava/util/ArrayList;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/C2/p;->a:Lax/C2/r;

    iput-object p2, p0, Lax/C2/p;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lax/C2/p;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/C2/p;->a:Lax/C2/r;

    iget-object v1, p0, Lax/C2/p;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Lax/C2/p;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lax/C2/r;->f(Lax/C2/r;Ljava/util/ArrayList;Ljava/lang/String;)Lax/K2/v;

    move-result-object v0

    return-object v0
.end method
