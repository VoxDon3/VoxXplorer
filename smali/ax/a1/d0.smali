.class public final synthetic Lax/a1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/a1/f0;


# direct methods
.method public synthetic constructor <init>(Lax/a1/f0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/d0;->q:Lax/a1/f0;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/d0;->q:Lax/a1/f0;

    invoke-static {v0}, Lax/a1/f0;->G(Lax/a1/f0;)V

    return-void
.end method
