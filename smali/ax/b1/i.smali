.class public final synthetic Lax/b1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/b1/h$f;


# direct methods
.method public synthetic constructor <init>(Lax/b1/h$f;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/i;->q:Lax/b1/h$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b1/i;->q:Lax/b1/h$f;

    invoke-static {v0}, Lax/b1/h$f;->b(Lax/b1/h$f;)V

    return-void
.end method
