.class public final synthetic Lax/b1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/P0/v;

.field public final synthetic q:Lax/b1/h$f;


# direct methods
.method public synthetic constructor <init>(Lax/b1/h$f;Lax/P0/v;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/j;->q:Lax/b1/h$f;

    iput-object p2, p0, Lax/b1/j;->c0:Lax/P0/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b1/j;->q:Lax/b1/h$f;

    iget-object v1, p0, Lax/b1/j;->c0:Lax/P0/v;

    invoke-static {v0, v1}, Lax/b1/h$f;->a(Lax/b1/h$f;Lax/P0/v;)V

    return-void
.end method
